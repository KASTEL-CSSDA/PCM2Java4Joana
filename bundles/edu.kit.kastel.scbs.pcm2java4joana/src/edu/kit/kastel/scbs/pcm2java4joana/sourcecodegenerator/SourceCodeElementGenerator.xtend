package edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType
import edu.kit.kastel.scbs.pcm2java4joana.utils.SourceCodeModelUtils
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Field
import java.util.List
import java.util.ArrayList
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Variable
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Type
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInType
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.ReferenceType
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.CollectionType
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class
import edu.kit.ipd.sdq.activextendannotations.Utility
import java.io.BufferedWriter

/**
 * This class is responsible to generate all source code elements that are not annotated.
 */
@Utility
class SourceCodeElementGenerator {

	static def void generateVariable(Variable variable, BufferedWriter writer) {
		val content =  '''
		private «generateDataType(variable.type)» «variable.entityName»;
		
		«generateGetter(variable)»
		«generateSetter(variable)»
		'''
		
		writer.write(content)
		writer.flush()
	}
	
	static def String generateConstructor(Class scClass) {
		val variables = SourceCodeModelUtils.getVariables(scClass)
		return '''
		public «scClass.entityName»(«FOR variable : variables»«generateDataType(variable.type)» «variable.entityName»«IF variables.indexOf(variable) != variables.size - 1», «ENDIF»«ENDFOR») {
			// TODO: Implement me!
			«FOR variable : variables»
			this.«variable.entityName» = «variable.entityName»;
			«ENDFOR»
		}
		'''
	}
	
	static def String generateGetter(Variable variable) {
		return '''
		public «generateDataType(variable.type)» get«variable.entityName»() {
			return this.«variable.entityName»;
		}'''
	}
	
	static def String generateSetter(Variable variable) {
		return '''
		public void set«variable.entityName»(«generateDataType(variable.type)» «variable.entityName») {
			this.«variable.entityName» = «variable.entityName»;
		}
		'''
	}
	
	static def String generateDataType(Type type) {
		if (type === null) {
			return '''void''';
		}
		switch type {
			BuiltInType: return generateBuiltInType(type)
			ReferenceType: return generateReferenceType(type)
			CollectionType: return generateCollectionType(type)
		}
	}
	
	static def String generateCollectionType(CollectionType type) {
		return '''Iterable<«generateDataType(type.type)»>'''
	}
	
	static def String generateReferenceType(ReferenceType type) {
		return '''«type.topleveltype.entityName»'''
	}
	
	static def String generateBuiltInType(BuiltInType type) {
		switch type.builtInType {
			case BOOLEAN: return '''Boolean'''
			case BYTE: return '''Byte'''
			case CHAR: return '''Character'''
			case SHORT: return '''Short'''
			case INT: return '''Integer'''
			case FLOAT: return '''Float'''
			case DOUBLE: return '''Double'''
			case STRING: return '''String'''
			case LONG: return '''Long'''
		}
		return '''void'''
	}
	
	static def String generateImplements(List<Interface> interfaces) {
		return '''«FOR inter : interfaces»«inter.entityName»«IF interfaces.indexOf(inter) != interfaces.length - 1», «ENDIF»«ENDFOR»'''
	}
	
	static def String generateImportsInterface(List<Method> methods)  {
		val fields = new ArrayList<Field>();
		for (method : methods) {
			fields.add(method);
		}
		return generateImports(fields);
	}
	
	static def String generateImports(List<Field> fields) {
		return '''
		«FOR referenceType : SourceCodeModelUtils.getReferenceTypes(fields)»
			import generated.code.«referenceType»;
		«ENDFOR»
		«IF SourceCodeModelUtils.hasCollectionType(fields)»
			import java.lang.Iterable;
		«ENDIF»
		'''
	}
	
	static def String generateImport(TopLevelType toImport){
		return '''
		import generated.code.«toImport.entityName»;
		'''
	}
	
	static def generatePackage() {
		return '''package generated.code;'''
	}
}