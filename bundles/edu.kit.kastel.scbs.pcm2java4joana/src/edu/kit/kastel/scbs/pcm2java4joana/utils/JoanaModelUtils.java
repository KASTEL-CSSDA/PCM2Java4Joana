package edu.kit.kastel.scbs.pcm2java4joana.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
				if (specificationElement.getAnnotatedClass().getEntityName().equals(className)
						&& specificationElement.getAnnotatedMethod().getEntityName().equals(methodName)
						&& ((specificationElement.getAnnotatedParameter() == null && parameterName.equals(""))
								|| (specificationElement.getAnnotatedParameter() != null && specificationElement
										.getAnnotatedParameter().getEntityName().equals(parameterName)))) {
					elements.add(specificationElement);
				}
			}
		}

		return elements;
	}

	public static List<EntryPoint> getEntryPoints(JOANARoot root, String className, String methodName) {
		List<EntryPoint> entries = new ArrayList<EntryPoint>();

		for (FlowSpecification element : root.getFlowspecification()) {
			if (element.getEntrypoint().getAnnotatedClass().getEntityName().equals(className)
					&& element.getEntrypoint().getAnnotatedMethod().getEntityName().equals(methodName)) {
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
			if (annotation.getAnnotatedClass().getEntityName().equals(className)
					&& annotation.getAnnotatedMethod().getEntityName().equals(methodName)
					&& ((annotation.getAnnotatedParameter() == null && parameterName.equals(""))
							|| (annotation.getAnnotatedParameter() != null && annotation
									.getAnnotatedParameter().getEntityName().equals(parameterName)))) {
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
		return unsorted.stream().sorted((object1, object2) -> object1.getEntityName().compareTo(object2.getEntityName()))
				.collect(Collectors.toList());
	}

	public static String combineIntoOneSecurityLevel(List<SecurityLevel> levels) {
		List<SecurityLevel> sorted = JoanaModelUtils.sortSecurityLevels(levels);
		String combined = "";
		for (SecurityLevel level : sorted) {
			combined += level.getEntityName();
		}

		return combined;
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
}
