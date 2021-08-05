package edu.kit.kastel.scbs.pcm2java4joana.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification;
import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaFactory;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Lattice;
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;

public class JoanaModelUtils {
	public static List<FlowSpecificationElement> getJoanaFlowSpecificationElementsFor(JOANARoot joanaModel,
			String className, String methodName) {
		List<FlowSpecificationElement> elements = new ArrayList<FlowSpecificationElement>();

		if (joanaModel == null) {
			return elements;
		}

		for (FlowSpecification flow : joanaModel.getFlowspecification()) {
			if (flow.getEntrypoint().getAnnotatedClassName().equals(className)
					&& flow.getEntrypoint().getAnnotatedMethodName().equals(methodName)) {
				elements.add(flow.getEntrypoint());
			}
			for (Annotation specificationElement : flow.getAnnotation()) {
				if (specificationElement.getAnnotatedClassName().equals(className)
						&& specificationElement.getAnnotatedMethodName().equals(methodName)
						&& specificationElement.getAnnotatedParameterName().equals("")) {
					elements.add(specificationElement);
				}
			}
		}

		return elements;
	}

	public static List<FlowSpecificationElement> getJoanaFlowSpecificationElementsFor(JOANARoot joanaModel,
			String className, String methodName, String paramterName) {
		List<FlowSpecificationElement> elements = new ArrayList<FlowSpecificationElement>();

		if (joanaModel == null) {
			return elements;
		}

		for (FlowSpecification flow : joanaModel.getFlowspecification()) {
			for (Annotation specificationElement : flow.getAnnotation()) {
				if (specificationElement.getAnnotatedClassName().equals(className)
						&& specificationElement.getAnnotatedMethodName().equals(methodName)
						&& specificationElement.getAnnotatedParameterName().equals(paramterName)) {
					elements.add(specificationElement);
				}
			}
		}

		return elements;
	}

	public static List<SecurityLevel> sortSecurityLevels(List<SecurityLevel> unsorted) {
		return unsorted.stream().sorted((object1, object2) -> object1.getName().compareTo(object2.getName()))
				.collect(Collectors.toList());
	}

	public static String combineIntoOneSecurityLevel(List<SecurityLevel> levels) {
		List<SecurityLevel> sorted = JoanaModelUtils.sortSecurityLevels(levels);
		String combined = "";
		for (SecurityLevel level : sorted) {
			combined += level.getName();
		}

		return combined;
	}

	public static Lattice copyLattice(Lattice lattice) {
		JoanaFactory factory = JoanaFactory.eINSTANCE;
		Lattice copiedLattice = factory.createLattice();
		for (FlowRelation relation : lattice.getFlowrelation()) {
			copiedLattice.getFlowrelation().add(JoanaModelUtils.copyFlowRelation(relation));
		}
		return copiedLattice;
	}

	public static FlowRelation copyFlowRelation(FlowRelation relation) {
		JoanaFactory factory = JoanaFactory.eINSTANCE;
		FlowRelation flowRelation = factory.createFlowRelation();
		flowRelation.getTo().addAll(JoanaModelUtils.copySecurityLevels(relation.getTo()));
		flowRelation.getFrom().addAll(JoanaModelUtils.copySecurityLevels(relation.getFrom()));

		return flowRelation;
	}

	public static List<SecurityLevel> copySecurityLevels(List<SecurityLevel> levels) {
		List<SecurityLevel> copiedlLevels = new ArrayList<SecurityLevel>();
		for (SecurityLevel level : levels) {
			copiedlLevels.add(JoanaModelUtils.copySecurityLevel(level));
		}
		return copiedlLevels;
	}

	public static SecurityLevel copySecurityLevel(SecurityLevel level) {
		JoanaFactory factory = JoanaFactory.eINSTANCE;
		SecurityLevel copiedLevel = factory.createSecurityLevel();
		copiedLevel.setName(level.getName());
		return copiedLevel;
	}
}
