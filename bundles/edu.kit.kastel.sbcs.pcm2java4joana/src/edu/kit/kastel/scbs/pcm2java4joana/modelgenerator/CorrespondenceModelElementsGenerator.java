package edu.kit.kastel.scbs.pcm2java4joana.modelgenerator;

import java.util.List;

import org.palladiosimulator.pcm.repository.impl.BasicComponentImpl;
import org.palladiosimulator.pcm.repository.impl.OperationInterfaceImpl;
import org.palladiosimulator.pcm.repository.impl.OperationSignatureImpl;
import org.palladiosimulator.pcm.repository.impl.ParameterImpl;

import correspondences.ComponentCorrespondence;
import correspondences.CorrespondencesFactory;
import correspondences.InterfaceCorrespondence;
import correspondences.MethodCorrespondence;
import correspondences.PCMComponent;
import correspondences.PCMMethod;
import correspondences.PCMParameter;
import correspondences.PCMProvidedInterface;
import correspondences.ParameterCorrespondence;
import correspondences.SourceCodeClass;
import correspondences.SourceCodeInterface;
import correspondences.SourceCodeMethod;
import correspondences.SourceCodeParameter;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;

public class CorrespondenceModelElementsGenerator {
	public static ComponentCorrespondence generateComponentCorrespondence(BasicComponentImpl component,
			Class newClass) {
		CorrespondencesFactory correspondenceFactory = CorrespondencesFactory.eINSTANCE;
		ComponentCorrespondence componentCorrespondence = correspondenceFactory.createComponentCorrespondence();
		PCMComponent pcmComponent = correspondenceFactory.createPCMComponent();
		SourceCodeClass sourceCodeClass = correspondenceFactory.createSourceCodeClass();
		componentCorrespondence.setPcmcomponent(pcmComponent);
		componentCorrespondence.setSourcecodeclass(sourceCodeClass);
		pcmComponent.setName(component.getEntityName());
		sourceCodeClass.setName(newClass.getName());
		return componentCorrespondence;
	}

	public static InterfaceCorrespondence generateInterfaceCorrespondence(OperationInterfaceImpl pcmInterface,
			Interface inter) {
		CorrespondencesFactory correspondenceFactory = CorrespondencesFactory.eINSTANCE;
		InterfaceCorrespondence interfaceCorrespondence = correspondenceFactory.createInterfaceCorrespondence();
		PCMProvidedInterface pcmProvidedInterface = correspondenceFactory.createPCMProvidedInterface();
		SourceCodeInterface sourceCodeInterface = correspondenceFactory.createSourceCodeInterface();
		pcmProvidedInterface.setName(pcmInterface.getEntityName());
		sourceCodeInterface.setName(inter.getName());

		return interfaceCorrespondence;
	}

	public static MethodCorrespondence generateMethodCorrespondence(OperationSignatureImpl pcmOperation,
			Method method) {
		CorrespondencesFactory correspondencesFactory = CorrespondencesFactory.eINSTANCE;
		MethodCorrespondence methodCorrespondence = correspondencesFactory.createMethodCorrespondence();
		PCMMethod pcmMethod = correspondencesFactory.createPCMMethod();
		SourceCodeMethod sourceCodeMethod = correspondencesFactory.createSourceCodeMethod();
		methodCorrespondence.setPcmmethod(pcmMethod);
		methodCorrespondence.setSourcecodemethod(sourceCodeMethod);
		pcmMethod.setName(pcmOperation.getEntityName());
		sourceCodeMethod.setName(method.getName());

		return methodCorrespondence;
	}

	public static ParameterCorrespondence generateParameterCorrespondence(ParameterImpl pcmParameter,
			Parameter parameter) {
		CorrespondencesFactory correspondencesFactory = CorrespondencesFactory.eINSTANCE;
		ParameterCorrespondence parameterCorrespondence = correspondencesFactory.createParameterCorrespondence();
		PCMParameter pcmParameter2 = correspondencesFactory.createPCMParameter();
		SourceCodeParameter sourceCodeParameter = correspondencesFactory.createSourceCodeParameter();
		parameterCorrespondence.setPcmparameter(pcmParameter2);
		parameterCorrespondence.setSourcecodeparamter(sourceCodeParameter);
		pcmParameter2.setName(pcmParameter.getParameterName());
		sourceCodeParameter.setName(parameter.getName());

		return parameterCorrespondence;
	}

	public static void addMethodCorrespondences(ComponentCorrespondence componentCorrespondences,
			List<MethodCorrespondence> methodCorrespondences) {
		for (MethodCorrespondence correspondence : methodCorrespondences) {
			componentCorrespondences.getMethodcorrespondence()
					.add(CorrespondenceModelElementsGenerator.copyMethodCorrespondence(correspondence));
		}
	}

	public static void addParameterCorrespondences(MethodCorrespondence correspondence,
			List<ParameterCorrespondence> parameterCorrespondences) {
		for (ParameterCorrespondence parameterCorrespondence : parameterCorrespondences) {
			correspondence.getParametercorrespondence()
					.add(CorrespondenceModelElementsGenerator.copyParameterCorrespondence(parameterCorrespondence));
		}
	}

	private static MethodCorrespondence copyMethodCorrespondence(MethodCorrespondence correspondence) {
		CorrespondencesFactory correspondencesFactory = CorrespondencesFactory.eINSTANCE;
		MethodCorrespondence copied = CorrespondencesFactory.eINSTANCE.createMethodCorrespondence();
		PCMMethod pcmMethod = correspondencesFactory.createPCMMethod();
		SourceCodeMethod sourceCodeMethod = correspondencesFactory.createSourceCodeMethod();
		copied.setName(correspondence.getName());
		copied.setPcmmethod(pcmMethod);
		copied.setSourcecodemethod(sourceCodeMethod);
		pcmMethod.setName(correspondence.getPcmmethod().getName());
		sourceCodeMethod.setName(correspondence.getSourcecodemethod().getName());

		CorrespondenceModelElementsGenerator.addParameterCorrespondences(copied,
				correspondence.getParametercorrespondence());
		return copied;
	}

	private static ParameterCorrespondence copyParameterCorrespondence(ParameterCorrespondence correspondence) {
		CorrespondencesFactory correspondencesFactory = CorrespondencesFactory.eINSTANCE;
		ParameterCorrespondence copied = correspondencesFactory.createParameterCorrespondence();
		PCMParameter pcmParameter = correspondencesFactory.createPCMParameter();
		SourceCodeParameter sourceCodeParameter = correspondencesFactory.createSourceCodeParameter();
		copied.setPcmparameter(pcmParameter);
		copied.setSourcecodeparamter(sourceCodeParameter);
		copied.setName(correspondence.getName());
		pcmParameter.setName(correspondence.getPcmparameter().getName());
		sourceCodeParameter.setName(correspondence.getSourcecodeparamter().getName());

		return copied;
	}
}
