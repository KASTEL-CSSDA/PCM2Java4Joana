package edu.kit.kastel.scbs.pcm2java4joana.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import edu.kit.kastel.scbs.confidentiality.adversary.Adversary;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Component2Class;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.Interface2Interface;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Trace;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.Adversary2SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;

public final class CorrespondenceModelUtils {
	private CorrespondenceModelUtils() {
	}

	public static Collection<Integer> findPublicMethodPositions(
			StructuralCorrespondenceModel structuralCorrespondenceModel, Trace trace) {
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
					&& SourceCodeModelUtils.hasMethodSignature(component, state.getTraceMethod())) {
				return component2Class;
			}
		}
		return null;
	}

	public static Interface getInterfaceForTraceState(StructuralCorrespondenceModel structuralCorrespondenceModel,
			TraceState state) {
		Component2Class component2Class = getComponentClassCorrespondence(structuralCorrespondenceModel, state);
		for (Interface inter : component2Class.getJavaClass().getImplements()) {
			if (SourceCodeModelUtils.hasMethodSignature(inter, state.getTraceMethod())) {
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
					.haveSameSignature(joanaAnnotation.getAnnotatedMethod(), state.getTraceMethod())) {
				return pair2Annotation;
			}
		}
		return null;
	}

	public static Collection<Adversary> reolveSecurityLevelToAdversary(
			SecurityCorrespondenceModel securityCorrespondenceModel, String securityLevel) {
		for (Adversary2SecurityLevel adversary2SecurityLevel : securityCorrespondenceModel
				.getAdversary2securitylevel()) {
			if (JoanaModelUtils.combineIntoOneSecurityLevel(adversary2SecurityLevel.getSecurityLevels())
					.equals(securityLevel)) {
//				return adversary2SecurityLevel.getAdversaries(); // TODO: Rework for new correspondence model
			}
		}
		return null;
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
