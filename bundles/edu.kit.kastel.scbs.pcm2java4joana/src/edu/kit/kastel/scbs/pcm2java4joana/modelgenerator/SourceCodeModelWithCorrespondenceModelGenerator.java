package edu.kit.kastel.scbs.pcm2java4joana.modelgenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.InnerDeclaration;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.PrimitiveDataType;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelFactory;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.models.SourceCodeWithCorrespondences;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInTypes;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.CollectionType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.ReferenceType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourcecodeFactory;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Type;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Variable;
import edu.kit.kastel.scbs.pcm2java4joana.utils.SourceCodeModelUtils;
import edu.kit.kastel.scbs.pcm2java4joana.utils.Tuple;

/**
 * This class is concerned with generating the source code model with the correspondence model.
 * @author Johannes
 *
 */
public class SourceCodeModelWithCorrespondenceModelGenerator {
	private Repository sourceRepository;
	private List<String> compositeClassNames;
	private List<String> providedInterfaceNames;
	private Map<String, Tuple<Interface, Interface2Interface>> providedInterfaces;
	private Map<String, Class> compositeClasses;

	public SourceCodeModelWithCorrespondenceModelGenerator(Repository repository, IPath destinationFolder) {
		this.sourceRepository = repository;
		this.compositeClassNames = new ArrayList<String>();
		this.providedInterfaceNames = new ArrayList<String>();
		this.providedInterfaces = new HashMap<String, Tuple<Interface, Interface2Interface>>();
		this.compositeClasses = new HashMap<String, Class>();
	}

	public SourceCodeWithCorrespondences generateSourceCodeModelWithCorrespondenceModel() {
		return this.generateSourceCodeModel(this.sourceRepository);
	}

	private SourceCodeWithCorrespondences generateSourceCodeModel(Repository rep) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		SourceCodeRoot root = sourceCodeFactory.createSourceCodeRoot();
		root.setEntityName(rep.getEntityName());
		StructuralCorrespondenceModel correspondenceModelRoot = CorrespondencemodelFactory.eINSTANCE
				.createStructuralCorrespondenceModel();

		this.generateBasicElements(rep);
		this.generateBasicComponents(root, correspondenceModelRoot, rep);

		for (String interName : this.providedInterfaceNames) {
			Tuple<Interface, Interface2Interface> inter = this.providedInterfaces.get(interName);
			root.getTopleveltype().add(inter.getFirst());
		}
		for (String compositeClassName : this.compositeClassNames) {
			Class compositeClass = this.compositeClasses.get(compositeClassName);
			root.getTopleveltype().add(compositeClass);
		}

		return new SourceCodeWithCorrespondences(root, correspondenceModelRoot);
	}

	private void generateBasicComponents(SourceCodeRoot sourceCodeRoot,
			StructuralCorrespondenceModel correspondenceRoot, Repository repository) {
		for (RepositoryComponent component : repository.getComponents__Repository()) {
			if (component instanceof BasicComponent) {
				Tuple<Class, Component2Class> javaClass = this.generateBasicComponent((BasicComponent) component);
				sourceCodeRoot.getTopleveltype().add(javaClass.getFirst());
				correspondenceRoot.getComponent2class().add(javaClass.getSecond());
			}
		}
	}

	private void generateBasicElements(Repository rep) {
		for (org.palladiosimulator.pcm.repository.Interface object : rep.getInterfaces__Repository()) {
			if (object instanceof OperationInterface) {
				Tuple<Interface, Interface2Interface> interfaceWithCorrespondence = this
						.generateInterfaceContainer((OperationInterface) object);
				this.providedInterfaces.put(interfaceWithCorrespondence.getFirst().getEntityName(),
						interfaceWithCorrespondence);
				this.providedInterfaceNames.add(interfaceWithCorrespondence.getFirst().getEntityName());
			}

		}

		for (DataType type : rep.getDataTypes__Repository()) {
			if (type instanceof CompositeDataType) {
				Class newClass = this.generateClassContainer((CompositeDataType) type);
				this.compositeClasses.put(newClass.getEntityName(), newClass);
				this.compositeClassNames.add(newClass.getEntityName());
			}
		}

		for (org.palladiosimulator.pcm.repository.Interface object : rep.getInterfaces__Repository()) {
			if (object instanceof OperationInterface) {
				this.fillInterfaceContainer((OperationInterface) object);
			}

		}

		for (DataType type : rep.getDataTypes__Repository()) {
			if (type instanceof CompositeDataType) {
				this.fillClassContainer((CompositeDataType) type);
			}
		}
	}

	private void fillClassContainer(CompositeDataType pcmClass) {
		Class newClass = this.compositeClasses.get(pcmClass.getEntityName());
		for (InnerDeclaration innerDeclaration : pcmClass.getInnerDeclaration_CompositeDataType()) {
			newClass.getFields().add(this.generateInnerDeclaration(innerDeclaration));
		}
	}

	private Variable generateInnerDeclaration(InnerDeclaration innerDeclaration) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		Variable variable = sourceCodeFactory.createVariable();
		variable.setEntityName(innerDeclaration.getEntityName());
		variable.setType(this.generateType(innerDeclaration.getDatatype_InnerDeclaration()));
		return variable;
	}

	private Class generateClassContainer(CompositeDataType pcmClass) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		Class newClass = sourceCodeFactory.createClass();
		newClass.setEntityName(pcmClass.getEntityName());

		return newClass;
	}

	private Tuple<Interface, Interface2Interface> generateInterfaceContainer(OperationInterface pcmInterface) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		Interface javaInterface = sourceCodeFactory.createInterface();
		javaInterface.setEntityName(pcmInterface.getEntityName());
		Interface2Interface interfaceCorrespondence = CorrespondenceModelElementsGenerator
				.generateInterfaceCorrespondence(pcmInterface, javaInterface);

		return new Tuple<Interface, Interface2Interface>(javaInterface, interfaceCorrespondence);
	}

	private void fillInterfaceContainer(OperationInterface pcmInterface) {
		Interface inter = this.providedInterfaces.get(pcmInterface.getEntityName()).getFirst();
		Interface2Interface entry = this.providedInterfaces.get(pcmInterface.getEntityName()).getSecond();

		for (OperationSignature pcmMethod : pcmInterface.getSignatures__OperationInterface()) {
			Tuple<Method, Operation2Method> operation = this.generateOperation(pcmMethod);
			inter.getMethods().add(operation.getFirst());
			entry.getOperation2method().add(operation.getSecond());
		}
	}

	private Tuple<Method, Operation2Method> generateOperation(OperationSignature pcmOperation) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		Method method = sourceCodeFactory.createMethod();
		method.setEntityName(pcmOperation.getEntityName());
		Operation2Method methodCorrespondence = CorrespondenceModelElementsGenerator
				.generateMethodCorrespondence(pcmOperation, method);

		if (pcmOperation.getReturnType__OperationSignature() != null) {
			method.setType(this.generateType(pcmOperation.getReturnType__OperationSignature()));
		}
		for (org.palladiosimulator.pcm.repository.Parameter pcmParameter : pcmOperation
				.getParameters__OperationSignature()) {
			Tuple<Parameter, Parameter2Parameter> parameter = this.generateParameter(pcmParameter);
			method.getParameter().add(parameter.getFirst());
			methodCorrespondence.getParameter2parameter().add(parameter.getSecond());
		}

		return new Tuple<Method, Operation2Method>(method, methodCorrespondence);
	}

	private Tuple<Parameter, Parameter2Parameter> generateParameter(
			org.palladiosimulator.pcm.repository.Parameter pcmParameter) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		Parameter parameter = sourceCodeFactory.createParameter();
		parameter.setEntityName(pcmParameter.getParameterName());
		parameter.setType(this.generateType(pcmParameter.getDataType__Parameter()));
		Parameter2Parameter parameterCorrespondence = CorrespondenceModelElementsGenerator
				.generateParameterCorrespondence(pcmParameter, parameter);

		return new Tuple<Parameter, Parameter2Parameter>(parameter, parameterCorrespondence);
	}

	private Type generateType(DataType pcmType) {
		if (pcmType instanceof PrimitiveDataType) {
			return this.generateBuiltInType((PrimitiveDataType) pcmType);
		}
		if (pcmType instanceof CollectionDataType) {
			return this.generateCollectionType((CollectionDataType) pcmType);
		}
		if (pcmType instanceof CompositeDataType) {
			return this.generateReferenceType((CompositeDataType) pcmType);
		}

		return null;
	}

	private Type generateReferenceType(CompositeDataType pcmType) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		ReferenceType type = sourceCodeFactory.createReferenceType();
		type.setTopleveltype(this.compositeClasses.get(pcmType.getEntityName()));
		return type;
	}

	private Type generateCollectionType(CollectionDataType pcmType) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		CollectionType type = sourceCodeFactory.createCollectionType();

		DataType pcmInnerType = pcmType.getInnerType_CollectionDataType();
		if (pcmInnerType != null) {
			Type innerType = this.generateType(pcmInnerType);
			type.setType(innerType);
		}

		return type;
	}

	private Type generateBuiltInType(PrimitiveDataType pcmType) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		BuiltInType type = sourceCodeFactory.createBuiltInType();
		type.setBuiltInType(BuiltInTypes.getByName(pcmType.getType().getName()));
		return type;
	}

	private Tuple<Class, Component2Class> generateBasicComponent(BasicComponent component) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		Class javaClass = sourceCodeFactory.createClass();
		javaClass.setEntityName(component.getEntityName());
		Component2Class componentCorrespondence = CorrespondenceModelElementsGenerator
				.generateComponentCorrespondence(component, javaClass);

		for (ProvidedRole providedRole : component.getProvidedRoles_InterfaceProvidingEntity()) {
			if (providedRole instanceof OperationProvidedRole) {
				String interfaceName = ((OperationProvidedRole) providedRole)
						.getProvidedInterface__OperationProvidedRole().getEntityName();
				Tuple<Interface, Interface2Interface> child = this.providedInterfaces.get(interfaceName);
				Interface inter = (Interface) child.getFirst();
				javaClass.getImplements().add(inter);
				javaClass.getFields().addAll(SourceCodeModelUtils.copyMethods(inter.getMethods()));
				componentCorrespondence.getInterface2interface().add(child.getSecond());
			}
		}

		for (RequiredRole requiredRole : component.getRequiredRoles_InterfaceRequiringEntity()) {
			if (requiredRole instanceof OperationRequiredRole) {
				String interfaceName = ((OperationRequiredRole) requiredRole)
						.getRequiredInterface__OperationRequiredRole().getEntityName();
				Interface requires = this.providedInterfaces.get(interfaceName).getFirst();
				ReferenceType referenceType = sourceCodeFactory.createReferenceType();
				referenceType.setTopleveltype(requires);
				Variable variable = sourceCodeFactory.createVariable();
				variable.setType(referenceType);
				variable.setEntityName(interfaceName);
				javaClass.getFields().add(variable);
			}
		}

		return new Tuple<Class, Component2Class>(javaClass, componentCorrespondence);
	}
}
