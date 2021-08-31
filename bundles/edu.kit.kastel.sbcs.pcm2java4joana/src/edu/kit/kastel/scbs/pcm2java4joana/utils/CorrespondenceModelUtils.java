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
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Adversary2SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Conf4CBSEAdversary;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;

public final class CorrespondenceModelUtils {
	private CorrespondenceModelUtils() {
	}

	public static List<SecurityLevel> getSecurityLevels(SecurityCorrespondenceModel correspondenceModel) {
		List<SecurityLevel> securityLevels = new ArrayList<SecurityLevel>();

		for (Adversary2SecurityLevel correspondence : correspondenceModel.getAdversary2securitylevel()) {
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
		return reolveSecurityLevelToAdversary(securityCorrespondenceModel, adversaries, usedLevels);
	}

	public static Collection<DataSet> reolveSecurityLevelToAdversary(
			SecurityCorrespondenceModel securityCorrespondenceModel, ConfidentialitySpecification specification,
			List<SecurityLevel> securityLevel) {
		Collection<DataSet> correspondingAdversaries = new ArrayList<DataSet>();
		for (Adversary2SecurityLevel adversary2SecurityLevel : securityCorrespondenceModel
				.getAdversary2securitylevel()) {
			if (securityLevel.contains(adversary2SecurityLevel.getSecurityLevels().get(0))) {
				for (Conf4CBSEAdversary conf4cbseAdversary : adversary2SecurityLevel.getConf4cbseadversary()) {
					DataSet adversary = ConfidentialityModelUtils.getDataset(specification, conf4cbseAdversary.getId());
					if (adversary != null) {
						correspondingAdversaries.add(adversary);
					} else {
						System.err.print("No adversary found for " + conf4cbseAdversary.getId());
					}
				}
			}
		}
		return correspondingAdversaries;
	}

	public static Adversary2SecurityLevel getAdversary2SecurityLevel(SecurityCorrespondenceModel correspondenceModel,
			SecurityLevel level) {
		for (Adversary2SecurityLevel adversary2SecurityLevel : correspondenceModel.getAdversary2securitylevel()) {
			if (adversary2SecurityLevel.getSecurityLevels().size() == 1
					&& adversary2SecurityLevel.getSecurityLevels().contains(level)) {
				return adversary2SecurityLevel;
			}
		}
		return null;
	}
}
