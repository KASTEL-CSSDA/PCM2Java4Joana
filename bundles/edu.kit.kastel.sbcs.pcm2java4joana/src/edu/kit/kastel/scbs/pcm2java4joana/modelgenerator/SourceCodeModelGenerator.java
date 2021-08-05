package edu.kit.kastel.scbs.pcm2java4joana.modelgenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;
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

public class SourceCodeModelGenerator {
	private Repository sourceRepository;
	private List<String> unusedInterfaces;
	private Resource sourceCodeModel;

	public SourceCodeModelGenerator(Repository repository, String destinationPath) {
		this.sourceRepository = repository;
		this.unusedInterfaces = new ArrayList<String>();
		this.sourceCodeModel = new XMLResourceImpl(URI.createFileURI(destinationPath));
	}

	public Resource generateSourceCodeModel() {
		return this.generateSourceCodeModel(this.sourceRepository, this.sourceCodeModel);
	}

	private Resource generateSourceCodeModel(Repository rep, Resource sourceCodeModel) {
		EPackage basePackage = EcoreFactory.eINSTANCE.createEPackage();
		basePackage.setName(rep.getEntityName());
		Map<String, EClass> interfaceMap = this.generateInterfaces(rep);

		for (EObject object : rep.eContents()) {
			if (object.getClass() == BasicComponentImpl.class) {
				EPackage newPackage = this.generateBasicComponent((BasicComponentImpl) object, interfaceMap);
				basePackage.getESubpackages().add(newPackage);
			}
		}

		for (String unusedInterface : this.unusedInterfaces) {
			basePackage.getEClassifiers().add(interfaceMap.get(unusedInterface));
		}
		sourceCodeModel.getContents().add(basePackage);

		return sourceCodeModel;
	}

	private Map<String, EClass> generateInterfaces(Repository rep) {
		Map<String, EClass> interfacesInRep = new HashMap<String, EClass>();
		for (EObject object : rep.eContents()) {
			if (object.getClass() == OperationInterfaceImpl.class) {
				EClass newInterface = this.generateInterface((OperationInterfaceImpl) object);
				interfacesInRep.put(newInterface.getName(), newInterface);
				this.unusedInterfaces.add(newInterface.getName());
			}
		}
		return interfacesInRep;
	}

	private EClass generateInterface(OperationInterfaceImpl pcmInterface) {
		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
		EClass newInterface = ecoreFactory.createEClass();
		newInterface.setName(pcmInterface.getEntityName());
		newInterface.setInterface(true);

		EList<EObject> contents = pcmInterface.eContents();
		for (EObject object : contents) {
			if (object.getClass() == OperationSignatureImpl.class) {
				EOperation operation = this.generateOperation((OperationSignatureImpl) object);
				EList<EOperation> operations = newInterface.getEOperations();
				operations.add(operation);
			}
		}

		return newInterface;
	}

	private EOperation generateOperation(OperationSignatureImpl pcmOperation) {
		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
		EOperation operation = ecoreFactory.createEOperation();
		operation.setName(pcmOperation.getEntityName());

		EList<EObject> contents = pcmOperation.eContents();
		for (EObject object : contents) {
			if (object.getClass() == ParameterImpl.class) {
				operation.getEParameters().add(generateParameter((ParameterImpl) object));
			}
		}

		return operation;
	}

	private EParameter generateParameter(ParameterImpl pcmParameter) {
		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
		EParameter parameter = ecoreFactory.createEParameter();
		parameter.setName(pcmParameter.getParameterName());
		DataType type = pcmParameter.getDataType__Parameter();
		parameter.setEType(type.eClass());

		return parameter;
	}

	private EPackage generateBasicComponent(BasicComponentImpl component, Map<String, EClass> possibleInterfaces) {
		EcoreFactory ecoreFactory = EcoreFactory.eINSTANCE;
		EPackage newPackage = ecoreFactory.createEPackage();
		newPackage.setName(component.getEntityName());
		for (EObject object : component.eContents()) {
			if (object.getClass() == OperationProvidedRoleImpl.class) {
				String providedInterfaceName = ((OperationProvidedRoleImpl) object)
						.basicGetProvidedInterface__OperationProvidedRole().getEntityName();
				newPackage.getEClassifiers().add(possibleInterfaces.get(providedInterfaceName));
				this.unusedInterfaces.remove(providedInterfaceName);
			}
			if (object.getClass() == OperationRequiredRoleImpl.class) {
				String requiredInterfaceName = ((OperationRequiredRoleImpl) object)
						.basicGetRequiredInterface__OperationRequiredRole().getEntityName();
				newPackage.getEClassifiers().add(possibleInterfaces.get(requiredInterfaceName));
				this.unusedInterfaces.remove(requiredInterfaceName);
			}
		}

		return newPackage;
	}
};