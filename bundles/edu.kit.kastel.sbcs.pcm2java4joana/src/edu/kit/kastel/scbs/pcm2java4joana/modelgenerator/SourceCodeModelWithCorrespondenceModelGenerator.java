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

import edu.kit.kastel.scbs.pcm2java4joana.models.CorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.models.SourceCodeElementWithCorrespondenceModel;
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
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Type;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Variable;

public class SourceCodeModelWithCorrespondenceModelGenerator {
	private Repository sourceRepository;
	private List<String> unusedCompositeClasses;
	private Resource sourceCodeModel;
	private Map<String, SourceCodeElementWithCorrespondenceModel<TopLevelType>> compositeClasses;

	public SourceCodeModelWithCorrespondenceModelGenerator(Repository repository, IPath destinationFolder) {
		this.sourceRepository = repository;
		this.unusedCompositeClasses = new ArrayList<String>();
		this.compositeClasses = new HashMap<String, SourceCodeElementWithCorrespondenceModel<TopLevelType>>();
		this.sourceCodeModel = new XMLResourceImpl(URI.createFileURI(destinationFolder.toString() + IPath.SEPARATOR
				+ "GeneratedModels" + IPath.SEPARATOR + repository.getEntityName() + ".ecore"));
	}

	public SourceCodeElementWithCorrespondenceModel<Resource> generateSourceCodeModelWithCorrespondenceModel() {
		return this.generateSourceCodeModel(this.sourceRepository, sourceCodeModel);
	}

	private SourceCodeElementWithCorrespondenceModel<Resource> generateSourceCodeModel(Repository rep,
			Resource sourceCodeModel) {
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		SourceCodeRoot root = factory.createSourceCodeRoot();
		root.setName(rep.getEntityName());
		CorrespondenceModel correspondenceModel = new CorrespondenceModel(root.getName());
		correspondenceModel.addCorrespondingSet(new String[] { rep.getEntityName() });

		this.generateBasicElements(rep);

		for (EObject object : rep.eContents()) {
			if (object.getClass() == BasicComponentImpl.class) {
				SourceCodeElementWithCorrespondenceModel<edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class> newClass = this
						.generateBasicComponent((BasicComponentImpl) object);
				root.getTopleveltype().add(newClass.getSourceCodeElement());
			}
		}

		for (String unusedInterfaceName : this.unusedCompositeClasses) {
			SourceCodeElementWithCorrespondenceModel<TopLevelType> unusedInterface = this.compositeClasses
					.get(unusedInterfaceName);
			root.getTopleveltype().add(unusedInterface.getSourceCodeElement());
			correspondenceModel.addChild(unusedInterface.getCorrespondenceModel());
		}
		sourceCodeModel.getContents().add(root);

		return new SourceCodeElementWithCorrespondenceModel<Resource>(sourceCodeModel, correspondenceModel);
	}

	private void generateBasicElements(Repository rep) {
		for (EObject object : rep.eContents()) {
			if (object.getClass() == OperationInterfaceImpl.class) {
				var inter = this.generateInterfaceContainer((OperationInterfaceImpl) object);
				this.compositeClasses.put(inter.getSourceCodeElement().getName(), inter);
				this.unusedCompositeClasses.add(inter.getSourceCodeElement().getName());
			}
			if (object.getClass() == CompositeDataTypeImpl.class) {
				SourceCodeElementWithCorrespondenceModel<TopLevelType> newClass = this
						.generateClassContainer((CompositeDataTypeImpl) object);
				this.compositeClasses.put(newClass.getSourceCodeElement().getName(), newClass);
				this.unusedCompositeClasses.add(newClass.getSourceCodeElement().getName());
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
		Class newClass = (Class) this.compositeClasses.get(pcmClass.getEntityName()).getSourceCodeElement();
		for (EObject object : pcmClass.getInnerDeclaration_CompositeDataType()) {
			if (object.getClass() == InnerDeclarationImpl.class) {
				newClass.getFields().add(this.generateInnerDeclaration((InnerDeclarationImpl) object));
			}
		}
	}

	private Variable generateInnerDeclaration(InnerDeclarationImpl innerDeclaration) {
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		Variable variable = factory.createVariable();
		variable.setName(innerDeclaration.getEntityName());
		variable.setType(this.generateType(innerDeclaration.getDatatype_InnerDeclaration()));
		return variable;
	}

	private SourceCodeElementWithCorrespondenceModel<TopLevelType> generateClassContainer(
			CompositeDataTypeImpl pcmClass) {
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class newClass = factory.createClass();
		newClass.setName(pcmClass.getEntityName());
		CorrespondenceModel entry = new CorrespondenceModel(newClass.getName());
		entry.addCorrespondingSet(new String[] { pcmClass.getEntityName() });

		return new SourceCodeElementWithCorrespondenceModel<TopLevelType>(newClass, entry);
	}

	private SourceCodeElementWithCorrespondenceModel<TopLevelType> generateInterfaceContainer(
			OperationInterfaceImpl pcmInterface) {
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		Interface inter = factory.createInterface();
		var n1 = inter.getName();

		inter.setName(pcmInterface.getEntityName());

		CorrespondenceModel entry = new CorrespondenceModel(inter.getName());
		entry.addCorrespondingSet(new String[] { pcmInterface.getEntityName() });

		var newElement = new SourceCodeElementWithCorrespondenceModel<TopLevelType>(inter, entry);
		var n = inter.getName();

		return newElement;
	}

	private void fillInterfaceContainer(OperationInterfaceImpl pcmInterface) {
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		Interface inter = (Interface) this.compositeClasses.get(pcmInterface.getEntityName()).getSourceCodeElement();
		CorrespondenceModel entry = this.compositeClasses.get(pcmInterface.getEntityName()).getCorrespondenceModel();

		EList<EObject> contents = pcmInterface.eContents();
		for (EObject object : contents) {
			if (object.getClass() == OperationSignatureImpl.class) {
				SourceCodeElementWithCorrespondenceModel<Method> operation = this
						.generateOperation((OperationSignatureImpl) object);
				EList<Method> operations = inter.getMethods();
				operations.add(operation.getSourceCodeElement());
				entry.addChild(operation.getCorrespondenceModel());
			}
		}
	}

	private SourceCodeElementWithCorrespondenceModel<Method> generateOperation(OperationSignatureImpl pcmOperation) {
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		Method method = factory.createMethod();
		method.setName(pcmOperation.getEntityName());
		if (pcmOperation.getReturnType__OperationSignature() != null) {
			method.setType(this.generateType(pcmOperation.getReturnType__OperationSignature()));
		}
		EList<EObject> contents = pcmOperation.eContents();
		for (EObject object : contents) {
			if (object.getClass() == ParameterImpl.class) {
				ParameterImpl pcmParameter = (ParameterImpl) object;
				Parameter parameter = this.generateParameter(pcmParameter);
				method.getParameter().add(parameter);
			}
		}
		CorrespondenceModel entry = new CorrespondenceModel(method.getName());
		entry.addCorrespondingSet(new String[] { pcmOperation.getEntityName() });
		return new SourceCodeElementWithCorrespondenceModel<Method>(method, entry);
	}

	private Parameter generateParameter(ParameterImpl pcmParameter) {
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		Parameter parameter = factory.createParameter();
		parameter.setName(pcmParameter.getParameterName());
		parameter.setType(this.generateType(pcmParameter.getDataType__Parameter()));
		return parameter;
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
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		ReferenceType type = factory.createReferenceType();
		type.setTopleveltype(this.compositeClasses.get(pcmType.getEntityName()).getSourceCodeElement());
		return type;
	}

	private Type generateCollectionType(CollectionDataTypeImpl pcmType) {
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		CollectionType type = factory.createCollectionType();

		DataType pcmInnerType = pcmType.getInnerType_CollectionDataType();
		if (pcmInnerType != null) {
			Type innerType = this.generateType(pcmInnerType);
			type.setType(innerType);
		}

		return type;
	}

	private Type generateBuiltInType(PrimitiveDataTypeImpl pcmType) {
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		BuiltInType type = factory.createBuiltInType();
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

	private SourceCodeElementWithCorrespondenceModel<Class> generateBasicComponent(BasicComponentImpl component) {
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		Class newClass = factory.createClass();
		newClass.setName(component.getEntityName() + "Component");
		CorrespondenceModel entry = new CorrespondenceModel(newClass.getName());
		entry.addCorrespondingSet(new String[] { component.getEntityName() });

		for (EObject object : component.eContents()) {
			String interfaceName = "";
			if (object.getClass() == OperationProvidedRoleImpl.class) {
				interfaceName = ((OperationProvidedRoleImpl) object).basicGetProvidedInterface__OperationProvidedRole()
						.getEntityName();
				SourceCodeElementWithCorrespondenceModel<TopLevelType> child = this.compositeClasses.get(interfaceName);
				Interface inter = (Interface) child.getSourceCodeElement();
				newClass.getImplements().add(inter);
				entry.addChild(child.getCorrespondenceModel());
				newClass.getFields().addAll(inter.getMethods());
			}
			if (object.getClass() == OperationRequiredRoleImpl.class) {
				interfaceName = ((OperationRequiredRoleImpl) object).basicGetRequiredInterface__OperationRequiredRole()
						.getEntityName();
				Interface requires = (Interface) this.compositeClasses.get(interfaceName).getSourceCodeElement();
				ReferenceType referenceType = factory.createReferenceType();
				referenceType.setTopleveltype(requires);
				Variable variable = factory.createVariable();
				variable.setType(referenceType);
				variable.setName(((OperationRequiredRoleImpl) object).getEntityName());
				newClass.getFields().add(variable);
			}
		}

		return new SourceCodeElementWithCorrespondenceModel<Class>(newClass, entry);
	}
}
