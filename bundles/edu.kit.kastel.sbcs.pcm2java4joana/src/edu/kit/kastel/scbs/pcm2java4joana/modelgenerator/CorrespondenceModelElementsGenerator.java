package edu.kit.kastel.scbs.pcm2java4joana.modelgenerator;

import java.util.List;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;

import edu.kit.kastel.scbs.confidentiality.adversary.Adversary;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelFactory;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.models.CorrespondenceModelUtils;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Adversary2SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelFactory;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;

public final class CorrespondenceModelElementsGenerator {
	private CorrespondenceModelElementsGenerator() {

	}

	public static Component2Class generateComponentCorrespondence(BasicComponent pcmComponent, Class javaClass) {
		CorrespondencemodelFactory correspondenceFactory = CorrespondencemodelFactory.eINSTANCE;
		Component2Class componentCorrespondence = correspondenceFactory.createComponent2Class();
		componentCorrespondence.setJavaClass(javaClass);
		componentCorrespondence.setPcmComponent(pcmComponent);
		return componentCorrespondence;
	}

	public static Interface2Interface generateInterfaceCorrespondence(OperationInterface pcmInterface,
			Interface javaInterface) {
		CorrespondencemodelFactory correspondenceFactory = CorrespondencemodelFactory.eINSTANCE;
		Interface2Interface interfaceCorrespondence = correspondenceFactory.createInterface2Interface();
		interfaceCorrespondence.setJavaInterface(javaInterface);
		interfaceCorrespondence.setPcmInterface(pcmInterface);

		return interfaceCorrespondence;
	}

	public static Operation2Method generateMethodCorrespondence(OperationSignature pcmOperation, Method javaMethod) {
		CorrespondencemodelFactory correspondencesFactory = CorrespondencemodelFactory.eINSTANCE;
		Operation2Method methodCorrespondence = correspondencesFactory.createOperation2Method();
		methodCorrespondence.setJavaMethod(javaMethod);
		methodCorrespondence.setPcmOperation(pcmOperation);

		return methodCorrespondence;
	}

	public static Parameter2Parameter generateParameterCorrespondence(
			org.palladiosimulator.pcm.repository.Parameter pcmParameter, Parameter javaParameter) {
		CorrespondencemodelFactory correspondencesFactory = CorrespondencemodelFactory.eINSTANCE;
		Parameter2Parameter parameterCorrespondence = correspondencesFactory.createParameter2Parameter();
		parameterCorrespondence.setJavaParameter(javaParameter);
		parameterCorrespondence.setPcmParameter(pcmParameter);

		return parameterCorrespondence;
	}

	public static Adversary2SecurityLevel generateAdversaryCorrespondence(Adversary adversary,
			SecurityLevel securityLevel) {
		SecuritycorrespondencemodelFactory correspondenceFactory = SecuritycorrespondencemodelFactory.eINSTANCE;
		Adversary2SecurityLevel correspondence = correspondenceFactory.createAdversary2SecurityLevel();
		correspondence.getSecurityLevels().add(securityLevel);
		correspondence.getAdversaries().add(adversary);

		return correspondence;
	}

	public static Adversary2SecurityLevel generateAdversary2SecurityLevel(List<SecurityLevel> levels,
			SecurityCorrespondenceModel correspondenceModel) {
		SecuritycorrespondencemodelFactory factory = SecuritycorrespondencemodelFactory.eINSTANCE;
		Adversary2SecurityLevel adversary2SecurityLevel = factory.createAdversary2SecurityLevel();

		for (SecurityLevel level : levels) {
			Adversary adversary = CorrespondenceModelUtils.getAdversary2SecurityLevel(correspondenceModel, level)
					.getAdversaries().get(0);
			adversary2SecurityLevel.getAdversaries().add(adversary);
			adversary2SecurityLevel.getSecurityLevels().add(level);
		}

		return adversary2SecurityLevel;
	}

	public static ParametersAndDataPair2Annotation generateParametersAndDataPair2Annotation(
			ParametersAndDataPair dataPair, Annotation annotation) {
		SecuritycorrespondencemodelFactory factory = SecuritycorrespondencemodelFactory.eINSTANCE;
		ParametersAndDataPair2Annotation dataPair2Annotation = factory.createParametersAndDataPair2Annotation();
		dataPair2Annotation.setJoanaAnnotation(annotation);
		dataPair2Annotation.setParametersAndDataPair(dataPair);

		return dataPair2Annotation;
	}

//	public static void addMethodCorrespondences(Component2Class componentCorrespondences,
//			List<Operation2Method> methodCorrespondences) {
//		for (Operation2Method correspondence : methodCorrespondences) {
//			componentCorrespondences.get()
//					.add(CorrespondenceModelElementsGenerator.copyMethodCorrespondence(correspondence));
//		}
//	}

//	public static void addParameterCorrespondences(MethodCorrespondence correspondence,
//			List<ParameterCorrespondence> parameterCorrespondences) {
//		for (ParameterCorrespondence parameterCorrespondence : parameterCorrespondences) {
//			correspondence.getParametercorrespondence()
//					.add(CorrespondenceModelElementsGenerator.copyParameterCorrespondence(parameterCorrespondence));
//		}
//	}
//
//	private static MethodCorrespondence copyMethodCorrespondence(MethodCorrespondence correspondence) {
//		CorrespondencemodelFactory correspondencesFactory = CorrespondencemodelFactory.eINSTANCE;
//		MethodCorrespondence copied = CorrespondencemodelFactory.eINSTANCE.createMethodCorrespondence();
//		PCMMethod pcmMethod = correspondencesFactory.createPCMMethod();
//		SourceCodeMethod sourceCodeMethod = correspondencesFactory.createSourceCodeMethod();
//		copied.setName(correspondence.getName());
//		copied.setPcmmethod(pcmMethod);
//		copied.setSourcecodemethod(sourceCodeMethod);
//		pcmMethod.setName(correspondence.getPcmmethod().getName());
//		sourceCodeMethod.setName(correspondence.getSourcecodemethod().getName());
//
//		CorrespondenceModelElementsGenerator.addParameterCorrespondences(copied,
//				correspondence.getParametercorrespondence());
//		return copied;
//	}
//
//	private static ParameterCorrespondence copyParameterCorrespondence(ParameterCorrespondence correspondence) {
//		CorrespondencemodelFactory correspondencesFactory = CorrespondencemodelFactory.eINSTANCE;
//		ParameterCorrespondence copied = correspondencesFactory.createParameterCorrespondence();
//		PCMParameter pcmParameter = correspondencesFactory.createPCMParameter();
//		SourceCodeParameter sourceCodeParameter = correspondencesFactory.createSourceCodeParameter();
//		copied.setPcmparameter(pcmParameter);
//		copied.setSourcecodeparamter(sourceCodeParameter);
//		copied.setName(correspondence.getName());
//		pcmParameter.setName(correspondence.getPcmparameter().getName());
//		sourceCodeParameter.setName(correspondence.getSourcecodeparamter().getName());
//
//		return copied;
//	}
}
