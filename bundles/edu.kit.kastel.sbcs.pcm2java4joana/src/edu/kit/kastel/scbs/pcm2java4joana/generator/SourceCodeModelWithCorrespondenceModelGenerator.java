package edu.kit.kastel.scbs.pcm2java4joana.generator;

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
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.impl.BasicComponentImpl;
import org.palladiosimulator.pcm.repository.impl.OperationInterfaceImpl;
import org.palladiosimulator.pcm.repository.impl.OperationProvidedRoleImpl;
import org.palladiosimulator.pcm.repository.impl.OperationRequiredRoleImpl;
import org.palladiosimulator.pcm.repository.impl.OperationSignatureImpl;
import org.palladiosimulator.pcm.repository.impl.ParameterImpl;

import edu.kit.kastel.scbs.pcm2java4joana.models.CorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.models.SourceCodeElementWithCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.ReferenceType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourcecodeFactory;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Type;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Variable;

public class SourceCodeModelWithCorrespondenceModelGenerator {
	private Repository sourceRepository;
	private List<String> unusedInterfaces;
	private Resource sourceCodeModel;

	public SourceCodeModelWithCorrespondenceModelGenerator(Repository repository, IPath destinationFolder) {
		this.sourceRepository = repository;
		this.unusedInterfaces = new ArrayList<String>();
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
		root.eClass().setName(rep.getEntityName());
		CorrespondenceModel correspondenceModel = new CorrespondenceModel(root.eClass().getName());
		correspondenceModel.addCorrespondingSet(new String[] { rep.getEntityName() });

		Map<String, SourceCodeElementWithCorrespondenceModel<Interface>> interfaceMap = this.generateInterfaces(rep);

		for (EObject object : rep.eContents()) {
			if (object.getClass() == BasicComponentImpl.class) {
				SourceCodeElementWithCorrespondenceModel<edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class> newClass = this
						.generateBasicComponent((BasicComponentImpl) object, interfaceMap);
				root.getTopleveltype().add(newClass.getSourceCodeElement());
			}
		}

		for (String unusedInterfaceName : this.unusedInterfaces) {
			SourceCodeElementWithCorrespondenceModel<Interface> unusedInterface = interfaceMap.get(unusedInterfaceName);
			root.getTopleveltype().add(unusedInterface.getSourceCodeElement());
			correspondenceModel.addChild(unusedInterface.getCorrespondenceModel());
			// TODO: Dupletten
		}
		sourceCodeModel.getContents().add(root);

		return new SourceCodeElementWithCorrespondenceModel<Resource>(sourceCodeModel, correspondenceModel);
	}

	private Map<String, SourceCodeElementWithCorrespondenceModel<Interface>> generateInterfaces(Repository rep) {
		Map<String, SourceCodeElementWithCorrespondenceModel<Interface>> interfacesInRep = new HashMap<String, SourceCodeElementWithCorrespondenceModel<Interface>>();
		for (EObject object : rep.eContents()) {
			if (object.getClass() == OperationInterfaceImpl.class) {
				SourceCodeElementWithCorrespondenceModel<Interface> newInterface = this
						.generateInterface((OperationInterfaceImpl) object);
				interfacesInRep.put(newInterface.getSourceCodeElement().eClass().getName(), newInterface);
				this.unusedInterfaces.add(newInterface.getSourceCodeElement().eClass().getName());
			}
		}
		return interfacesInRep;
	}

	private SourceCodeElementWithCorrespondenceModel<Interface> generateInterface(OperationInterfaceImpl pcmInterface) {
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		Interface inter = factory.createInterface();
		inter.eClass().setName(pcmInterface.getEntityName());

		CorrespondenceModel entry = new CorrespondenceModel(inter.eClass().getName());
		entry.addCorrespondingSet(new String[] { pcmInterface.getEntityName() });

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

		return new SourceCodeElementWithCorrespondenceModel<Interface>(inter, entry);
	}

	private SourceCodeElementWithCorrespondenceModel<Method> generateOperation(OperationSignatureImpl pcmOperation) {
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		Method method = factory.createMethod();
		method.eClass().setName(pcmOperation.getEntityName());
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
		CorrespondenceModel entry = new CorrespondenceModel(method.eClass().getName());
		entry.addCorrespondingSet(new String[] { pcmOperation.getEntityName() });
		return new SourceCodeElementWithCorrespondenceModel<Method>(method, entry);
	}

	private Parameter generateParameter(ParameterImpl pcmParameter) {
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		Parameter parameter = factory.createParameter();
		parameter.eClass().setName(pcmParameter.getParameterName());
		parameter.setType(this.generateType(pcmParameter.getDataType__Parameter()));
		return parameter;
	}

	private Type generateType(DataType pcmType) {
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		Type type = factory.createType();

		// TODO: implement me

		return type;
	}

	private SourceCodeElementWithCorrespondenceModel<edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class> generateBasicComponent(
			BasicComponentImpl component,
			Map<String, SourceCodeElementWithCorrespondenceModel<Interface>> possibleInterfaces) {
		SourcecodeFactory factory = SourcecodeFactory.eINSTANCE;
		edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class newClass = factory.createClass();
		newClass.eClass().setName(component.getEntityName());
		CorrespondenceModel entry = new CorrespondenceModel(newClass.eClass().getName());
		entry.addCorrespondingSet(new String[] { component.getEntityName() });

		for (EObject object : component.eContents()) {
			String interfaceName = "";
			if (object.getClass() == OperationProvidedRoleImpl.class) {
				interfaceName = ((OperationProvidedRoleImpl) object).basicGetProvidedInterface__OperationProvidedRole()
						.getEntityName();
				SourceCodeElementWithCorrespondenceModel<Interface> child = possibleInterfaces.get(interfaceName);
				newClass.getImplements().add(child.getSourceCodeElement());
				entry.addChild(child.getCorrespondenceModel());

				// TODO: add methods to class
			}
			if (object.getClass() == OperationRequiredRoleImpl.class) {
				interfaceName = ((OperationRequiredRoleImpl) object).basicGetRequiredInterface__OperationRequiredRole()
						.getEntityName();
				Interface requires = possibleInterfaces.get(interfaceName).getSourceCodeElement();
				ReferenceType referenceType = factory.createReferenceType();
				referenceType.setTopleveltype(requires);
				Variable variable = factory.createVariable();
				variable.setType(referenceType);
				variable.eClass().setName(((OperationRequiredRoleImpl) object).getEntityName());
				newClass.getFields().add(variable);
			}
		}

		return new SourceCodeElementWithCorrespondenceModel<edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class>(
				newClass, entry);
	}
}
