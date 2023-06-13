package edu.kit.kastel.scbs.pcm2java4joana.modelgenerator;

import java.util.List;

import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;

import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.CorrespondencemodelFactory;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Operation2Method;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Parameter2Parameter;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.DataSet2SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecuritycorrespondencemodelFactory;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;
import edu.kit.kastel.scbs.pcm2java4joana.utils.CorrespondenceModelUtils;
import edu.kit.kastel.scbs.pcm2java4joana.utils.JoanaModelUtils;

/**
 * This class bundles all methods concerning the generation correspondence model elements.
 * 
 * @author Johannes
 *
 */
public final class CorrespondenceModelElementsGenerator {
	private CorrespondenceModelElementsGenerator() {

	}

	public static Component2Class generateComponentCorrespondence(BasicComponent pcmComponent, Class javaClass) {
		CorrespondencemodelFactory correspondenceFactory = CorrespondencemodelFactory.eINSTANCE;
		Component2Class componentCorrespondence = correspondenceFactory.createComponent2Class();
		componentCorrespondence.setPcmcomponent(pcmComponent);
		componentCorrespondence.setJavaClass(javaClass);
		return componentCorrespondence;
	}

	public static Interface2Interface generateInterfaceCorrespondence(OperationInterface pcmInterface,
			Interface javaInterface) {
		CorrespondencemodelFactory correspondenceFactory = CorrespondencemodelFactory.eINSTANCE;
		Interface2Interface interfaceCorrespondence = correspondenceFactory.createInterface2Interface();
		interfaceCorrespondence.setPcminterface(pcmInterface);
		interfaceCorrespondence.setJavaInterface(javaInterface);

		return interfaceCorrespondence;
	}

	public static Operation2Method generateMethodCorrespondence(OperationSignature pcmOperation, Method javaMethod) {
		CorrespondencemodelFactory correspondencesFactory = CorrespondencemodelFactory.eINSTANCE;
		Operation2Method methodCorrespondence = correspondencesFactory.createOperation2Method();
		
		methodCorrespondence.setJavaMethod(javaMethod);
		methodCorrespondence.setPcmoperation(pcmOperation);

		return methodCorrespondence;
	}

	public static Parameter2Parameter generateParameterCorrespondence(
			org.palladiosimulator.pcm.repository.Parameter pcmParameter, Parameter javaParameter) {
		CorrespondencemodelFactory correspondencesFactory = CorrespondencemodelFactory.eINSTANCE;
		Parameter2Parameter parameterCorrespondence = correspondencesFactory.createParameter2Parameter();

		parameterCorrespondence.setJavaParameter(javaParameter);
		parameterCorrespondence.setPcmparameter(pcmParameter);

		return parameterCorrespondence;
	}

	public static DataSet2SecurityLevel generateDatasetCorrespondence(DataSet dataset, SecurityLevel securityLevel) {
		SecuritycorrespondencemodelFactory correspondenceFactory = SecuritycorrespondencemodelFactory.eINSTANCE;
		DataSet2SecurityLevel correspondence = correspondenceFactory.createDataSet2SecurityLevel();
		correspondence.getSecurityLevels().add(securityLevel);
		correspondence.getConf4cbsedataset().add(dataset);

		return correspondence;
	}

	public static DataSet2SecurityLevel generateDataSet2SecurityLevel(List<SecurityLevel> levels,
			SecurityCorrespondenceModel correspondenceModel) {
		SecuritycorrespondencemodelFactory factory = SecuritycorrespondencemodelFactory.eINSTANCE;
		DataSet2SecurityLevel datatSet2SecurityLevel = factory.createDataSet2SecurityLevel();

		for (SecurityLevel level : levels) {
			DataSet dataset = CorrespondenceModelUtils.getDataSet2SecurityLevel(correspondenceModel, level)
					.getConf4cbsedataset().get(0);
			datatSet2SecurityLevel.getConf4cbsedataset().add(dataset);
			datatSet2SecurityLevel.getSecurityLevels().add(level);
		}

		return datatSet2SecurityLevel;
	}

	public static ParametersAndDataPair2Annotation generateParametersAndDataPair2Annotation(
			ParametersAndDataPair dataPair, Annotation annotation) {
		SecuritycorrespondencemodelFactory factory = SecuritycorrespondencemodelFactory.eINSTANCE;
		ParametersAndDataPair2Annotation dataPair2Annotation = factory.createParametersAndDataPair2Annotation();
		
		dataPair2Annotation.setJoanaAnnotation(JoanaModelUtils.copyAnnotation(annotation));
		dataPair2Annotation.setConf4cbseparametersanddatapair(dataPair);

		return dataPair2Annotation;
	}
}
