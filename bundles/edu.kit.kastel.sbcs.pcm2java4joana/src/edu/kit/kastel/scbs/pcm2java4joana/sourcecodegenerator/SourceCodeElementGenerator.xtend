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

@Utility
class SourceCodeElementGenerator {

	static def String generateVariable(Variable variable) {
		return '''
		private «generateDataType(variable.type)» «variable.name»;
		
		«generateGetter(variable)»
		«generateSetter(variable)»
		'''
	}
	
	static def String generateConstructor(Class scClass) {
		val variables = SourceCodeModelUtils.getVariables(scClass)
		return '''
		public «scClass.name»(«FOR variable : variables»«generateDataType(variable.type)» «variable.name»«IF variables.indexOf(variable) != variables.size - 1», «ENDIF»«ENDFOR») {
			// TODO: Implement me!
			«FOR variable : variables»
			this.«variable.name» = «variable.name»;
			«ENDFOR»
		}
		'''
	}
	
	static def String generateGetter(Variable variable) {
		return '''
		public «generateDataType(variable.type)» get«variable.name»() {
			return this.«variable.name»;
		}'''
	}
	
	static def String generateSetter(Variable variable) {
		return '''
		public void set«variable.name»(«generateDataType(variable.type)» «variable.name») {
			this.«variable.name» = «variable.name»;
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
		return '''Collection<«generateDataType(type.type)»>'''
	}
	
	static def String generateReferenceType(ReferenceType type) {
		return '''«type.topleveltype.name»'''
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
		return '''«FOR inter : interfaces»«inter.name»«IF interfaces.indexOf(inter) != interfaces.length - 1», «ENDIF»«ENDFOR»'''
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
			import java.util.Collection;
		«ENDIF»
		'''
	}
	
	static def String generateImport(TopLevelType toImport){
		return '''
		import generated.code.«toImport.name»;
		'''
	}
	
	static def generatePackage() {
		return '''package generated.code;'''
	}
}