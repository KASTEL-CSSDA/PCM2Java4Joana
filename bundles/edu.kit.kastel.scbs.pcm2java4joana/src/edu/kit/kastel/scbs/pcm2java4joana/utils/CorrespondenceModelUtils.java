package edu.kit.kastel.scbs.pcm2java4joana.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Trace;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEDataSet;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.DataSet2SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;

/**
 * This class is responsible for all interactions with the structural and security correspondence models.
 * 
 * @author Johannes
 *
 */
public final class CorrespondenceModelUtils {
	private CorrespondenceModelUtils() {
	}

	public static List<SecurityLevel> getSecurityLevels(SecurityCorrespondenceModel correspondenceModel) {
		List<SecurityLevel> securityLevels = new ArrayList<SecurityLevel>();

		for (DataSet2SecurityLevel correspondence : correspondenceModel.getDataset2securitylevel()) {
			securityLevels.add(correspondence.getSecurityLevels().get(0));
		}

		return securityLevels;
	}

	public static List<Integer> findPublicMethodPositions(StructuralCorrespondenceModel structuralCorrespondenceModel,
			Trace trace) {
		List<Integer> publicMethodPositions = new ArrayList<Integer>();

		for (int i = 0; i < trace.getTracestate().size(); i++) {
			TraceState traceState = trace.getTracestate().get(i);
			if (getComponentClassCorrespondence(structuralCorrespondenceModel, traceState) != null) {
				publicMethodPositions.add(i);
			}
		}

		return publicMethodPositions;
	}

	public static Component2Class getComponentClassCorrespondence(
			StructuralCorrespondenceModel structuralCorrespondenceModel, TraceState state) {
		for (Component2Class component2Class : structuralCorrespondenceModel.getComponent2class()) {
			Class component = component2Class.getJavaClass();
			if (component.getName().equals(state.getTraceClassName())
					&& SourceCodeModelUtils.hasMethodSignature(component, state.getResultmethod())) {
				return component2Class;
			}
		}
		return null;
	}

	public static Interface getInterfaceForTraceState(StructuralCorrespondenceModel structuralCorrespondenceModel,
			TraceState state) {
		Component2Class component2Class = getComponentClassCorrespondence(structuralCorrespondenceModel, state);
		for (Interface inter : component2Class.getJavaClass().getImplements()) {
			if (SourceCodeModelUtils.hasMethodSignature(inter, state.getResultmethod())) {
				return inter;
			}
		}
		return null;
	}

	public static Interface2Interface getInterfaceCorrespondence(Component2Class component2Class,
			Interface javaInterface) {
		for (Interface2Interface interface2Interface : component2Class.getInterface2interface()) {
			if (interface2Interface.getJavaInterface().equals(javaInterface)) {
				return interface2Interface;
			}
		}
		return null;
	}

	public static ParametersAndDataPair2Annotation getParamtersAndDataPairAnnotationCorrespondence(
			SecurityCorrespondenceModel securityCorrespondenceModel, TraceState state) {
		for (ParametersAndDataPair2Annotation pair2Annotation : securityCorrespondenceModel
				.getParametersanddatapair2annotation()) {
			Annotation joanaAnnotation = pair2Annotation.getJoanaAnnotation();
			if (joanaAnnotation.getAnnotatedClass().getName().equals(state.getTraceClassName()) && SourceCodeModelUtils
					.haveSameSignature(joanaAnnotation.getAnnotatedMethod(), state.getResultmethod())) {
				return pair2Annotation;
			}
		}
		return null;
	}

	public static Collection<DataSet> resolveSecurityLevelToAdversary(
			SecurityCorrespondenceModel securityCorrespondenceModel, ConfidentialitySpecification adversaries,
			String securityLevel) {
		List<SecurityLevel> levels = getSecurityLevels(securityCorrespondenceModel);
		List<List<SecurityLevel>> allLevels = SetOperations.generatePowerSet(levels);
		List<SecurityLevel> usedLevels = JoanaModelUtils.resolveToSecurityLevels(securityLevel, allLevels);
		return resolveSecurityLevelToDataSets(securityCorrespondenceModel, adversaries, usedLevels);
	}

	public static Collection<DataSet> resolveSecurityLevelToDataSets(
			SecurityCorrespondenceModel securityCorrespondenceModel, ConfidentialitySpecification specification,
			List<SecurityLevel> securityLevel) {
		Collection<DataSet> correspondingDataSets= new ArrayList<DataSet>();
		for (DataSet2SecurityLevel dataSet2SecurityLevel : securityCorrespondenceModel.getDataset2securitylevel()) {
			if (securityLevel.contains(dataSet2SecurityLevel.getSecurityLevels().get(0))) {
				for (Conf4CBSEDataSet conf4cbseDataSet: dataSet2SecurityLevel.getConf4cbsedataset()) {
					DataSet dataSet = ConfidentialityModelUtils.getDataset(specification, conf4cbseDataSet.getId());
					if (dataSet != null) {
						correspondingDataSets.add(dataSet);
					} else {
						System.err.print("No adversary found for " + conf4cbseDataSet.getId());
					}
				}
			}
		}
		return correspondingDataSets;
	}

	public static DataSet2SecurityLevel getDataSet2SecurityLevel(SecurityCorrespondenceModel correspondenceModel,
			SecurityLevel level) {
		for (DataSet2SecurityLevel dataSet2SecurityLevel : correspondenceModel.getDataset2securitylevel()) {
			if (dataSet2SecurityLevel.getSecurityLevels().size() == 1
					&& dataSet2SecurityLevel.getSecurityLevels().contains(level)) {
				return dataSet2SecurityLevel;
			}
		}
		return null;
	}
}
