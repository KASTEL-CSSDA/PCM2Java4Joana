package edu.kit.kastel.scbs.pcm2java4joana.modelgenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.PrimitiveTypeEnum;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.impl.BasicComponentImpl;
import org.palladiosimulator.pcm.repository.impl.CollectionDataTypeImpl;
import org.palladiosimulator.pcm.repository.impl.CompositeDataTypeImpl;
import org.palladiosimulator.pcm.repository.impl.InnerDeclarationImpl;
import org.palladiosimulator.pcm.repository.impl.OperationInterfaceImpl;
import org.palladiosimulator.pcm.repository.impl.OperationProvidedRoleImpl;
import org.palladiosimulator.pcm.repository.impl.OperationRequiredRoleImpl;
import org.palladiosimulator.pcm.repository.impl.OperationSignatureImpl;
import org.palladiosimulator.pcm.repository.impl.ParameterImpl;
import org.palladiosimulator.pcm.repository.impl.PrimitiveDataTypeImpl;

import correspondences.ComponentCorrespondence;
import correspondences.CorrespondenceModel;
import correspondences.CorrespondencesFactory;
import correspondences.InterfaceCorrespondence;
import correspondences.MethodCorrespondence;
import correspondences.ParameterCorrespondence;
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
import edu.kit.kastel.scbs.pcm2java4joana.utils.Tuple;

public class SourceCodeModelWithCorrespondenceModelGenerator {
	private Repository sourceRepository;
	private List<String> compositeClassNames;
	private List<String> providedInterfaceNames;
	private Resource sourceCodeModel;
	private Resource correspondenceModel;
	private Map<String, Tuple<Interface, InterfaceCorrespondence>> providedInterfaces;
	private Map<String, Class> compositeClasses;

	public SourceCodeModelWithCorrespondenceModelGenerator(Repository repository, IPath destinationFolder) {
		this.sourceRepository = repository;
		this.compositeClassNames = new ArrayList<String>();
		this.providedInterfaceNames = new ArrayList<String>();
		this.providedInterfaces = new HashMap<String, Tuple<Interface, InterfaceCorrespondence>>();
		this.compositeClasses = new HashMap<String, Class>();
		this.sourceCodeModel = new XMLResourceImpl(URI.createFileURI(destinationFolder.toString() + IPath.SEPARATOR
				+ "GeneratedModels" + IPath.SEPARATOR + repository.getEntityName() + ".ecore"));
		this.correspondenceModel = new XMLResourceImpl(URI.createFileURI(destinationFolder.toString() + IPath.SEPARATOR
				+ "GeneratedModels" + IPath.SEPARATOR + "correspondenceModel" + repository.getEntityName() + ".ecore"));
	}

	public Tuple<Resource, Resource> generateSourceCodeModelWithCorrespondenceModel() {
		return this.generateSourceCodeModel(this.sourceRepository, this.sourceCodeModel, this.correspondenceModel);
	}

	private Tuple<Resource, Resource> generateSourceCodeModel(Repository rep, Resource sourceCodeModel,
			Resource correspondenceModel) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		SourceCodeRoot root = sourceCodeFactory.createSourceCodeRoot();
		root.setName(rep.getEntityName());
		CorrespondenceModel correspondenceModelRoot = CorrespondencesFactory.eINSTANCE.createCorrespondenceModel();

		this.generateBasicElements(rep);

		for (EObject object : rep.eContents()) {
			if (object.getClass() == BasicComponentImpl.class) {
				Tuple<Class, ComponentCorrespondence> newClass = this
						.generateBasicComponent((BasicComponentImpl) object);
				root.getTopleveltype().add(newClass.getFirst());
				correspondenceModelRoot.getComponentcorrespondence().add(newClass.getSecond());
			}
		}

		for (String interName : this.providedInterfaceNames) {
			Tuple<Interface, InterfaceCorrespondence> inter = this.providedInterfaces.get(interName);
			root.getTopleveltype().add(inter.getFirst());
			correspondenceModelRoot.getInterfacecorrespondence().add(inter.getSecond());
		}
		for (String compositeClassName : this.compositeClassNames) {
			Class compositeClass = this.compositeClasses.get(compositeClassName);
			root.getTopleveltype().add(compositeClass);
		}
		sourceCodeModel.getContents().add(root);
		correspondenceModel.getContents().add(correspondenceModelRoot);

		return new Tuple<Resource, Resource>(sourceCodeModel, correspondenceModel);
	}

	private void generateBasicElements(Repository rep) {
		for (EObject object : rep.eContents()) {
			if (object.getClass() == OperationInterfaceImpl.class) {
				Tuple<Interface, InterfaceCorrespondence> interfaceWithCorrespondence = this
						.generateInterfaceContainer((OperationInterfaceImpl) object);
				this.providedInterfaces.put(interfaceWithCorrespondence.getFirst().getName(),
						interfaceWithCorrespondence);
				this.providedInterfaceNames.add(interfaceWithCorrespondence.getFirst().getName());
			}
			if (object.getClass() == CompositeDataTypeImpl.class) {
				Class newClass = this.generateClassContainer((CompositeDataTypeImpl) object);
				this.compositeClasses.put(newClass.getName(), newClass);
				this.compositeClassNames.add(newClass.getName());
			}
		}

		for (EObject object : rep.eContents()) {
			if (object.getClass() == CompositeDataTypeImpl.class) {
				this.fillClassContainer((CompositeDataTypeImpl) object);
			}
			if (object.getClass() == OperationInterfaceImpl.class) {
				this.fillInterfaceContainer((OperationInterfaceImpl) object);
			}
		}
	}

	private void fillClassContainer(CompositeDataTypeImpl pcmClass) {
		Class newClass = (Class) this.compositeClasses.get(pcmClass.getEntityName());
		for (EObject object : pcmClass.getInnerDeclaration_CompositeDataType()) {
			if (object.getClass() == InnerDeclarationImpl.class) {
				newClass.getFields().add(this.generateInnerDeclaration((InnerDeclarationImpl) object));
			}
		}
	}

	private Variable generateInnerDeclaration(InnerDeclarationImpl innerDeclaration) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		Variable variable = sourceCodeFactory.createVariable();
		variable.setName(innerDeclaration.getEntityName());
		variable.setType(this.generateType(innerDeclaration.getDatatype_InnerDeclaration()));
		return variable;
	}

	private Class generateClassContainer(CompositeDataTypeImpl pcmClass) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		Class newClass = sourceCodeFactory.createClass();
		newClass.setName(pcmClass.getEntityName());

		return newClass;
	}

	private Tuple<Interface, InterfaceCorrespondence> generateInterfaceContainer(OperationInterfaceImpl pcmInterface) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		Interface inter = sourceCodeFactory.createInterface();
		inter.setName(pcmInterface.getEntityName());
		InterfaceCorrespondence interfaceCorrespondence = CorrespondenceModelElementsGenerator
				.generateInterfaceCorrespondence(pcmInterface, inter);

		return new Tuple<Interface, InterfaceCorrespondence>(inter, interfaceCorrespondence);
	}

	private void fillInterfaceContainer(OperationInterfaceImpl pcmInterface) {
		Interface inter = this.providedInterfaces.get(pcmInterface.getEntityName()).getFirst();
		InterfaceCorrespondence entry = this.providedInterfaces.get(pcmInterface.getEntityName()).getSecond();

		EList<EObject> contents = pcmInterface.eContents();
		for (EObject object : contents) {
			if (object.getClass() == OperationSignatureImpl.class) {
				Tuple<Method, MethodCorrespondence> operation = this.generateOperation((OperationSignatureImpl) object);
				inter.getMethods().add(operation.getFirst());
				entry.getMethodcorrespondence().add(operation.getSecond());
			}
		}
	}

	private Tuple<Method, MethodCorrespondence> generateOperation(OperationSignatureImpl pcmOperation) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		Method method = sourceCodeFactory.createMethod();
		method.setName(pcmOperation.getEntityName());
		MethodCorrespondence methodCorrespondence = CorrespondenceModelElementsGenerator
				.generateMethodCorrespondence(pcmOperation, method);

		if (pcmOperation.getReturnType__OperationSignature() != null) {
			method.setType(this.generateType(pcmOperation.getReturnType__OperationSignature()));
		}
		EList<EObject> contents = pcmOperation.eContents();
		for (EObject object : contents) {
			if (object.getClass() == ParameterImpl.class) {
				ParameterImpl pcmParameter = (ParameterImpl) object;
				Tuple<Parameter, ParameterCorrespondence> parameter = this.generateParameter(pcmParameter);
				method.getParameter().add(parameter.getFirst());
				methodCorrespondence.getParametercorrespondence().add(parameter.getSecond());
			}
		}

		return new Tuple<Method, MethodCorrespondence>(method, methodCorrespondence);
	}

	private Tuple<Parameter, ParameterCorrespondence> generateParameter(ParameterImpl pcmParameter) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		Parameter parameter = sourceCodeFactory.createParameter();
		parameter.setName(pcmParameter.getParameterName());
		parameter.setType(this.generateType(pcmParameter.getDataType__Parameter()));
		ParameterCorrespondence parameterCorrespondence = CorrespondenceModelElementsGenerator
				.generateParameterCorrespondence(pcmParameter, parameter);

		return new Tuple<Parameter, ParameterCorrespondence>(parameter, parameterCorrespondence);
	}

	private Type generateType(DataType pcmType) {
		if (pcmType.getClass() == PrimitiveDataTypeImpl.class) {
			return this.generateBuiltInType((PrimitiveDataTypeImpl) pcmType);
		}
		if (pcmType.getClass() == CollectionDataTypeImpl.class) {
			return this.generateCollectionType((CollectionDataTypeImpl) pcmType);
		}
		if (pcmType.getClass() == CompositeDataTypeImpl.class) {
			return this.generateReferenceType((CompositeDataTypeImpl) pcmType);
		}

		return null;
	}

	private Type generateReferenceType(CompositeDataTypeImpl pcmType) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		ReferenceType type = sourceCodeFactory.createReferenceType();
		type.setTopleveltype(this.compositeClasses.get(pcmType.getEntityName()));
		return type;
	}

	private Type generateCollectionType(CollectionDataTypeImpl pcmType) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		CollectionType type = sourceCodeFactory.createCollectionType();

		DataType pcmInnerType = pcmType.getInnerType_CollectionDataType();
		if (pcmInnerType != null) {
			Type innerType = this.generateType(pcmInnerType);
			type.setType(innerType);
		}

		return type;
	}

	private Type generateBuiltInType(PrimitiveDataTypeImpl pcmType) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		BuiltInType type = sourceCodeFactory.createBuiltInType();
		pcmType.getType();
		switch (pcmType.getType().getValue()) {
		case PrimitiveTypeEnum.BOOL_VALUE:
			type.setBuiltInType(BuiltInTypes.BOOLEAN);
			break;
		case PrimitiveTypeEnum.BYTE_VALUE:
			type.setBuiltInType(BuiltInTypes.BYTE);
			break;
		case PrimitiveTypeEnum.CHAR_VALUE:
			type.setBuiltInType(BuiltInTypes.CHAR);
			break;
		case PrimitiveTypeEnum.DOUBLE_VALUE:
			type.setBuiltInType(BuiltInTypes.DOUBLE);
			break;
		case PrimitiveTypeEnum.INT_VALUE:
			type.setBuiltInType(BuiltInTypes.INT);
			break;
		case PrimitiveTypeEnum.LONG_VALUE:
			type.setBuiltInType(BuiltInTypes.LONG);
			break;
		case PrimitiveTypeEnum.STRING_VALUE:
			type.setBuiltInType(BuiltInTypes.STRING);
			break;
		default:
			type.setBuiltInType(BuiltInTypes.BOOLEAN);
		}

		return type;
	}

	private Tuple<Class, ComponentCorrespondence> generateBasicComponent(BasicComponentImpl component) {
		SourcecodeFactory sourceCodeFactory = SourcecodeFactory.eINSTANCE;
		Class newClass = sourceCodeFactory.createClass();
		newClass.setName(component.getEntityName() + "Component"); // TODO: Remove
		ComponentCorrespondence componentCorrespondence = CorrespondenceModelElementsGenerator
				.generateComponentCorrespondence(component, newClass);

		for (EObject object : component.eContents()) {
			String interfaceName = "";
			if (object.getClass() == OperationProvidedRoleImpl.class) {
				interfaceName = ((OperationProvidedRoleImpl) object).basicGetProvidedInterface__OperationProvidedRole()
						.getEntityName();
				Tuple<Interface, InterfaceCorrespondence> child = this.providedInterfaces.get(interfaceName);
				Interface inter = (Interface) child.getFirst();
				newClass.getImplements().add(inter);
				componentCorrespondence.getMethodcorrespondence().addAll(child.getSecond().getMethodcorrespondence());
				newClass.getFields().addAll(inter.getMethods());

			}
			if (object.getClass() == OperationRequiredRoleImpl.class) {
				interfaceName = ((OperationRequiredRoleImpl) object).basicGetRequiredInterface__OperationRequiredRole()
						.getEntityName();
				Interface requires = this.providedInterfaces.get(interfaceName).getFirst();
				ReferenceType referenceType = sourceCodeFactory.createReferenceType();
				referenceType.setTopleveltype(requires);
				Variable variable = sourceCodeFactory.createVariable();
				variable.setType(referenceType);
				variable.setName(((OperationRequiredRoleImpl) object).getEntityName());
				newClass.getFields().add(variable);
			}
		}

		return new Tuple<Class, ComponentCorrespondence>(newClass, componentCorrespondence);
	}
}
