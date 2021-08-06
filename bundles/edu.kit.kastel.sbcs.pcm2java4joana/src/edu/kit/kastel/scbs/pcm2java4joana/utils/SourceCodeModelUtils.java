package edu.kit.kastel.scbs.pcm2java4joana.utils;

import java.util.ArrayList;
import java.util.List;

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.CollectionType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Field;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.ReferenceType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Type;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Variable;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.ClassImpl;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.impl.InterfaceImpl;

public class SourceCodeModelUtils {
	public static Interface getInterface(SourceCodeRoot sourceCodeModel, String entityName) {
		for (TopLevelType topLevelType : sourceCodeModel.getTopleveltype()) {
			if (topLevelType.getClass() == InterfaceImpl.class) {
				String name = topLevelType.getName();
				if (topLevelType.getName().equals(entityName)) {
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
			if (method.getName().equals(methodName)) {
				methods.add(method);
			}
		}
		return methods;
	}

	public static Parameter getParameter(Method method, String parameterName) {
		for (Parameter parameter : method.getParameter()) {
			if (parameter.getName().equals(parameterName)) {
				return parameter;
			}
		}
		return null;
	}

	public static boolean hasCollectionType(List<Field> fields) {
		boolean returnValue = false;
		for (Field field : fields) {
			if (field.getClass() == Variable.class) {
				returnValue = returnValue || SourceCodeModelUtils.hasVariableCollectionType((Variable) field);
			}
			if (field.getClass() == Method.class) {
				returnValue = returnValue || SourceCodeModelUtils.hasMethodCollectionType((Method) field);
			}
		}
		return returnValue;
	}

	public static boolean hasMethodCollectionType(Method method) {
		if (method.getType().getClass() == CollectionType.class) {
			return true;
		}

		for (Parameter parameter : method.getParameter()) {
			if (parameter.getType().getClass() == CollectionType.class) {
				return true;
			}
		}

		return false;
	}

	public static boolean hasVariableCollectionType(Variable variable) {
		if (variable.getType().getClass() == CollectionType.class) {
			return true;
		}
		return false;
	}

	public static List<String> getReferenceTypes(List<Field> fields) {
		List<String> referenceTypes = new ArrayList<String>();
		for (Field field : fields) {
			List<String> addTypes = SourceCodeModelUtils.getReferenceTypes(field);
			referenceTypes.addAll(addTypes);
		}
		return SetOperations.removeDuplicates(referenceTypes);
	}

	public static List<String> getReferenceTypes(Field field) {
		List<String> returnValue = new ArrayList<String>();
		if (field.getClass() == Variable.class) {
			returnValue.addAll(SourceCodeModelUtils.getReferenceTypeForVariable((Variable) field));
		}
		if (field.getClass() == Method.class) {
			returnValue.addAll(SourceCodeModelUtils.getReferenceTypeForMethod((Method) field));
		}
		return returnValue;
	}

	public static List<String> getReferenceTypeForMethod(Method method) {
		String methodType = "";
		var referenceTypes = new ArrayList<String>();

		if (method.getType().getClass() == ReferenceType.class) {
			methodType = SourceCodeModelUtils.getReferenceTypeName((ReferenceType) method.getType());
		}
		if (method.getType().getClass() == CollectionType.class) {
			methodType = SourceCodeModelUtils.getReferenceTypeForCollectionType((CollectionType) method.getType());
		}
		if (!methodType.equals("")) {
			referenceTypes.add(methodType);
		}

		for (Parameter parameter : method.getParameter()) {
			var paramterType = SourceCodeModelUtils.getReferenceTypeForParameter(parameter);
			if (!paramterType.equals("")) {
				referenceTypes.add(paramterType);
			}
		}

		return referenceTypes;
	}

	public static String getReferenceTypeForParameter(Parameter parameter) {
		String returnValue = "";
		if (parameter.getType().getClass() == ReferenceType.class) {
			returnValue = SourceCodeModelUtils.getReferenceTypeName((ReferenceType) parameter.getType());
			returnValue = SourceCodeModelUtils.getReferenceTypeForCollectionType((CollectionType) parameter.getType());
		}
		return returnValue;
	}

	public static List<String> getReferenceTypeForVariable(Variable variable) {
		List<String> referenceTypes = new ArrayList<String>();
		String referenceType = "";
		if (variable.getType().getClass() == ReferenceType.class) {
			referenceType = SourceCodeModelUtils.getReferenceTypeName((ReferenceType) variable.getType());
		}
		if (variable.getType().getClass() == CollectionType.class) {
			referenceType = SourceCodeModelUtils.getReferenceTypeForCollectionType((CollectionType) variable.getType());
		}
		if (!referenceType.equals("")) {
			referenceTypes.add(referenceType);
		}
		return referenceTypes;
	}

	public static String getReferenceTypeName(ReferenceType type) {
		return type.getTopleveltype().getName();
	}

	public static String getReferenceTypeForCollectionType(CollectionType type) {
		Type innerType = type.getType();
		String returnValue = "";
		if (innerType.getClass() == ReferenceType.class) {
			returnValue = SourceCodeModelUtils.getReferenceTypeName((ReferenceType) innerType);
		}
		if (innerType.getClass() == CollectionType.class) {
			returnValue = SourceCodeModelUtils.getReferenceTypeForCollectionType((CollectionType) innerType);
		}
		return returnValue;
	}
}
