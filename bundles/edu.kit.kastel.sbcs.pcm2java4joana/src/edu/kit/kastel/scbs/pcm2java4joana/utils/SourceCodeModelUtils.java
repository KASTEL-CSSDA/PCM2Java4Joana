package edu.kit.kastel.scbs.pcm2java4joana.utils;

import java.util.ArrayList;
import java.util.List;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ClassImpl;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.InterfaceImpl;

public class SourceCodeModelUtils {
	public static Interface getInterface(SourceCodeRoot sourceCodeModel, String entityName) {
		for (TopLevelType topLevelType : sourceCodeModel.getTopleveltype()) {
			if (topLevelType.getClass() == InterfaceImpl.class) {
				String name = topLevelType.eClass().getName();
				if (topLevelType.eClass().getName().equals(entityName)) {
					return (Interface) topLevelType;
				}
			}
		}
		return null;
	}

	public static List<Class> getComponents(SourceCodeRoot sourceCodeModel, Interface implemented) {
		List<Class> components = new ArrayList<Class>();
		for (TopLevelType topLevelType : sourceCodeModel.getTopleveltype()) {
			if (topLevelType.getClass() == ClassImpl.class) {
				Class component = (Class) topLevelType;
				if (component.getImplements().contains(implemented)) {
					components.add(component);
				}
			}
		}

		return components;
	}

	public static List<Method> getMethod(Interface inter, String methodName) {
		List<Method> methods = new ArrayList<Method>();
		for (Method method : inter.getMethods()) {
			if (method.eClass().getName().equals(methodName)) {
				methods.add(method);
			}
		}
		return methods;
	}

	public static Parameter getParameter(Method method, String parameterName) {
		for (Parameter parameter : method.getParameter()) {
			if (parameter.eClass().getName().equals(parameterName)) {
				return parameter;
			}
		}
		return null;
	}
}
