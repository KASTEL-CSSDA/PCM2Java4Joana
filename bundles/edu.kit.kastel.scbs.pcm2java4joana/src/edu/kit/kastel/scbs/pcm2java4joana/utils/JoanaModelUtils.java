package edu.kit.kastel.scbs.pcm2java4joana.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import edu.kit.kastel.scbs.confidentiality.ConfidentialityFactory;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint;
import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification;
import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaFactory;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Lattice;
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Sink;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Source;
import edu.kit.kastel.scbs.pcm2java4joana.joana.impl.SinkImpl;

/**
 * This class provides methods to interact with the generated joana model.
 * It provides the possibility to search the joana model for specific elements.
 * @author Johannes
 *
 */
public final class JoanaModelUtils {
	private JoanaModelUtils() {

	}

	public static List<FlowSpecificationElement> getJoanaFlowSpecificationElementsFor(JOANARoot joanaModel,
			String className, String methodName) {
		return JoanaModelUtils.getJoanaFlowSpecificationElementsFor(joanaModel, className, methodName, "");
	}

	public static List<FlowSpecificationElement> getJoanaFlowSpecificationElementsFor(JOANARoot joanaModel,
			String className, String methodName, String parameterName) {
		List<FlowSpecificationElement> elements = new ArrayList<FlowSpecificationElement>();

		if (joanaModel == null) {
			return elements;
		}

		for (FlowSpecification flow : joanaModel.getFlowspecification()) {
			for (Annotation specificationElement : flow.getAnnotation()) {
				if (specificationElement.getAnnotatedClass().getName().equals(className)
						&& specificationElement.getAnnotatedMethod().getName().equals(methodName)
						&& ((specificationElement.getAnnotatedParameter() == null && parameterName.equals(""))
								|| (specificationElement.getAnnotatedParameter() != null && specificationElement
										.getAnnotatedParameter().getName().equals(parameterName)))) {
					elements.add(specificationElement);
				}
			}
		}

		return elements;
	}

	public static List<EntryPoint> getEntryPoints(JOANARoot root, String className, String methodName) {
		List<EntryPoint> entries = new ArrayList<EntryPoint>();

		for (FlowSpecification element : root.getFlowspecification()) {
			if (element.getEntrypoint().getAnnotatedClass().getName().equals(className)
					&& element.getEntrypoint().getAnnotatedMethod().getName().equals(methodName)) {
				entries.add(element.getEntrypoint());
			}
		}

		return entries;
	}

	public static List<Source> getSourcesFor(JOANARoot root, String className, String methodName) {
		return JoanaModelUtils.getSourcesFor(root, className, methodName, "");
	}

	public static List<Source> getSourcesFor(JOANARoot root, String className, String methodName,
			String parameterName) {
		List<Source> sources = new ArrayList<Source>();
		List<Annotation> annotations = getAnnotationsFor(root, className, methodName, parameterName);

		for (Annotation element : annotations) {
			if (element instanceof Source) {
				sources.add((Source) element);
			}
		}

		return sources;
	}
	
	public static List<Annotation> getAnnotationsFor(JOANARoot root, String className, String methodName, String parameterName) {
		List<Annotation> annotations = root.getAnnotation();
		
		List<Annotation> foundAnnotations = new ArrayList<Annotation>();
		for (Annotation annotation : annotations) {
			if (annotation.getAnnotatedClass().getName().equals(className)
					&& annotation.getAnnotatedMethod().getName().equals(methodName)
					&& ((annotation.getAnnotatedParameter() == null && parameterName.equals(""))
							|| (annotation.getAnnotatedParameter() != null && annotation
									.getAnnotatedParameter().getName().equals(parameterName)))) {
				foundAnnotations.add(annotation);
			}
		}
		
		return foundAnnotations;
	}

	public static List<Sink> getSinksFor(JOANARoot root, String className, String methodName) {
		return JoanaModelUtils.getSinksFor(root, className, methodName, "");
	}

	public static List<Sink> getSinksFor(JOANARoot root, String className, String methodName, String parameterName) {
		List<Sink> sinks = new ArrayList<Sink>();
		List<Annotation> annotations = getAnnotationsFor(root, className, methodName, parameterName);

		for (Annotation element : annotations) {
			if (element instanceof Sink) {
				sinks.add((Sink) element);
			}
		}

		return sinks;
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
	
	public static SecurityLevel combineIntoOneSecurityLevelElement(List<SecurityLevel> levels) {
		String combinedLevelName = JoanaModelUtils.combineIntoOneSecurityLevel(levels);
		
		SecurityLevel level = JoanaFactory.eINSTANCE.createSecurityLevel();
		
		level.setName(combinedLevelName);
		
		return level;
	}
	
	public static List<SecurityLevel> generateSuperSetLevelsFromBasicSet(List<SecurityLevel> levels){
		
		List<List<SecurityLevel>> powerSetLevels = SetOperations.generatePowerSet(levels);
		List<SecurityLevel> foldedPowerSetLevels = new ArrayList<SecurityLevel>();
		
		powerSetLevels.forEach(levelList -> foldedPowerSetLevels.add(JoanaModelUtils.combineIntoOneSecurityLevelElement(levelList)));
		
		return foldedPowerSetLevels;
		
	}

	public static List<SecurityLevel> resolveToSecurityLevels(String securityLevel,
			List<List<SecurityLevel>> allLevels) {
		for (List<SecurityLevel> level : allLevels) {
			if (securityLevel.equals(combineIntoOneSecurityLevel(level))) {
				return level;
			}
		}
		return null;
	}

	public static Annotation copyAnnotation(Annotation annotation) {
		JoanaFactory factory = JoanaFactory.eINSTANCE;
		Annotation copiedAnnotation = factory.createAnnotation();
		copiedAnnotation.setAnnotatedClass(annotation.getAnnotatedClass());
		copiedAnnotation.setAnnotatedMethod(annotation.getAnnotatedMethod());
		copiedAnnotation.setAnnotatedParameter(annotation.getAnnotatedParameter());
		copiedAnnotation.getSecuritylevel().addAll(annotation.getSecuritylevel());
		return copiedAnnotation;
	}
	
	public static boolean isLevelEqualToLevels(SecurityLevel level, List<SecurityLevel> levels) {
		SecurityLevel levelsCombinedName = JoanaModelUtils.combineIntoOneSecurityLevelElement(levels);
		
		return level.getName().equals(levelsCombinedName.getName());
	}
	
	public static SecurityLevel findExistingSecurityLevel(List<SecurityLevel> toSearch, List<SecurityLevel> levelsToSearchFor) {
		
		for(SecurityLevel level : toSearch) {
			if(JoanaModelUtils.isLevelEqualToLevels(level, levelsToSearchFor)) {
				return level;
			}
		}
		
		return null;
	}
}
