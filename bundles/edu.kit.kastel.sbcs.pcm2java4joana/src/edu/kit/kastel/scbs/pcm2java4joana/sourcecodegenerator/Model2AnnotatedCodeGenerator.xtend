package edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator

import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface
import java.util.ArrayList
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType
import org.eclipse.internal.xtend.util.Triplet
import java.util.List
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Type
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInType
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.ReferenceType
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.CollectionType
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Field
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Variable

class Model2AnnotatedCodeGenerator {
	
	def List<Triplet<String, String, String>> generateAnnotatedCode(SourceCodeRoot sourceCodeModel, JOANARoot joanaModel) {
		val contentsForFiles = new ArrayList<Triplet<String, String, String>>()
		for (topLevelType : sourceCodeModel.topleveltype) {
			val content = generateTopLevelType(topLevelType, joanaModel)
			val newTuple = new Triplet<String, String, String>(content, topLevelType.name + ".java", "")
			contentsForFiles.add(newTuple)
		}
		return contentsForFiles;	
	}
	
	def String generateTopLevelType(TopLevelType topLevelType, JOANARoot joanaModel) {
		switch topLevelType {
			edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class: generateClass(topLevelType, joanaModel)
			Interface: generateInterface(topLevelType)
		}
	}
	
	def String generateClass(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class sourceCodeClass, JOANARoot joanaModel) {
		return '''
		«generatePackage()»
		
		«FOR toImport : sourceCodeClass.implements»
			«generateImport(toImport)»
		«ENDFOR»
		«generateImports(sourceCodeClass.fields)»
		
		public class «sourceCodeClass.name» implements «generateImplements(sourceCodeClass.implements)»{
			«generateFields(sourceCodeClass.fields)»
			
			public «sourceCodeClass.name»() {
				// TODO: Implement me!
			}
		}
		'''
	}
	
	def String generateInterface(Interface inter) {
		return '''
		«generatePackage()»
		
		«generateImportsInterface(inter.methods)»
		
		public interface «inter.name» {
			«FOR method : inter.methods»
				«generateInterfaceMethod(method)»
			«ENDFOR»
		}
		'''
	}
	
	def String generateInterfaceMethod(Method method) {
		return '''
		«generateDataType(method.type)» «method.name» («FOR parameter : method.parameter»
			«generateParameter(parameter, null)» «IF method.parameter.indexOf(parameter) != method.parameter.length - 1»,«ENDIF»
		«ENDFOR»);
		'''
	}
	
	def String generateFields(List<Field> fields) {
		return '''
			«FOR field : fields»
				«generateField(field)»
			«ENDFOR»
		'''
	}
	
	def String generateField(Field field) {
		switch field {
			Variable: generateVariable(field)
			Method: generateMethod(field, null)
		}
	}
	
	def String generateVariable(Variable variable) {
		return '''
			«generateDataType(variable.type)» «variable.name»;
		'''
	}
	
	def String generateDataType(Type type) {
		if (type === null) {
			return '''void''';
		}
		switch type {
			BuiltInType: return generateBuiltInType(type)
			ReferenceType: return generateReferenceType(type)
			CollectionType: return generateCollectionType(type)
		}
	}
	
	def String generateCollectionType(CollectionType type) {
		return '''Collection<«generateDataType(type.type)»>'''
	}
	
	def String generateReferenceType(ReferenceType type) {
		return '''«type.topleveltype.name»'''
	}
	
	def String generateBuiltInType(BuiltInType type) {
		switch type.builtInType {
			case BOOLEAN: return '''boolean'''
			case BYTE: return '''byte'''
			case CHAR: return '''char'''
			case SHORT: return '''short'''
			case INT: return '''int'''
			case FLOAT: return '''float'''
			case DOUBLE: return '''double'''
			case STRING: return '''String'''
			case LONG: return '''long'''
		}
		return '''void'''
	}
	
	def String generateMethod(Method method, JOANARoot joanaModel) {
		return '''
		@Override
		public «generateDataType(method.type)» «method.name» («FOR parameter : method.parameter»
			«generateParameter(parameter, null)» «IF method.parameter.indexOf(parameter) != method.parameter.length - 1»,«ENDIF»
		«ENDFOR») {
			// TODO: Implement me!
		}
		'''	
	}
	
	def String generateParameter(Parameter parameter, JOANARoot joanaModel) {
		return '''
		«generateDataType(parameter.type)» «parameter.name»
		'''
	}
	
	def String generateImplements(List<Interface> interfaces) {
		return '''
		«FOR inter : interfaces»
			«inter.name»«IF interfaces.indexOf(inter) != interfaces.length - 1»,«ENDIF»
		«ENDFOR»
		'''
	}
	
	def String generateImportsInterface(List<Method> methods)  {
		val fields = new ArrayList<Field>();
		for (method : methods) {
			fields.add(method);
		}
		return generateImports(fields);
	}
	
	def String generateImports(List<Field> fields) {
		return '''
		«FOR referenceType : getReferenceTypes(fields)»
			import generated.code.«referenceType»
		«ENDFOR»
		«IF hasCollectionType(fields)»
			import java.util.Collection
		«ENDIF»
		'''
	}
	
	def boolean hasCollectionType(List<Field> fields) {
		for(field : fields) {
			switch field {
				Variable: return hasVariableCollectionType(field)
				Method: return hasMethodCollectionType(field)
			}
		}	
		
		return false
	}
	
	def boolean hasMethodCollectionType(Method method) {
		if (method.type instanceof CollectionType) {
			return true
		}
		
		for(parameter : method.parameter) {
			if (parameter.type instanceof CollectionType) {
				return true
			}
		}
		
		return false
	}
	
	def boolean hasVariableCollectionType(Variable variable) {
		switch variable.type {
			CollectionType: return true
			BuiltInType, ReferenceType: return false
		}
		return false
	}
	
	def List<String> getReferenceTypes(List<Field> fields) {
		val referenceTypes = new ArrayList<String>();
		for(field : fields) {
			referenceTypes.addAll(getReferenceTypes(field))
		}
		return referenceTypes
	}
	
	def List<String> getReferenceTypes(Field field) {
		switch field {
			Variable: return getReferenceTypeForVariable(field)
			Method: return getReferenceTypeForMethod(field)
		}
		return new ArrayList<String>()
	}
	
	def List<String> getReferenceTypeForMethod(Method method) {
		var methodType = ""
		val referenceTypes = new ArrayList<String>();
		
		switch method.type {
			ReferenceType: methodType = getReferenceTypeName(method.type as ReferenceType)
			CollectionType: methodType = getReferenceTypeForCollectionType(method.type as CollectionType)
		}
		if (!methodType.equals("")) {
			referenceTypes.add(methodType)
		}
		
		for(parameter : method.parameter) {
			val paramterType = getReferenceTypeForParameter(parameter)
			if (!paramterType.equals("")) {
				referenceTypes.add(methodType)
			}
		}
		
		return referenceTypes
	}
	
	def String getReferenceTypeForParameter(Parameter parameter) {
		switch parameter.type {
			ReferenceType: return getReferenceTypeName(parameter.type as ReferenceType)
			CollectionType: return getReferenceTypeForCollectionType(parameter.type as CollectionType)
		}
		return ""
	}
	
	def List<String> getReferenceTypeForVariable(Variable variable) {		
		val referenceTypes = new ArrayList<String>();
		var referenceType = ""
		switch variable.type {
			ReferenceType: referenceType = getReferenceTypeName(variable.type as ReferenceType)
			CollectionType: referenceType = getReferenceTypeForCollectionType(variable.type as CollectionType)
		}
		if (!referenceType.equals("")) {
			referenceTypes.add(referenceType);
		} 
		return referenceTypes
	}
	
	def String getReferenceTypeName(ReferenceType type) {
		return type.topleveltype.name
	} 
	
	def String getReferenceTypeForCollectionType(CollectionType type) {
		val innerType = type.type
		switch innerType {
			ReferenceType: return getReferenceTypeName(innerType)
			CollectionType: return getReferenceTypeForCollectionType(innerType)
			BuiltInType: return ""
		}
		return "";
	}
	
	def String generateImport(TopLevelType toImport){
		return '''
		import generated.code.«toImport.name»;
		'''
	}
	
	def generatePackage() {
		return '''package generated.code;'''
	}
}