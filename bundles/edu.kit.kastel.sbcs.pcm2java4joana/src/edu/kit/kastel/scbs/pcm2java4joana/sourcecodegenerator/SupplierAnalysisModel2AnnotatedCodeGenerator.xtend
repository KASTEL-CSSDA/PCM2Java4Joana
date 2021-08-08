package edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator

import org.eclipse.internal.xtend.util.Triplet
import java.util.List
import java.util.ArrayList

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Type
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.BuiltInType
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.ReferenceType
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.CollectionType
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Field
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Variable

import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot

import static extension edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator.GenerateJoanaAnnotations.*
import edu.kit.kastel.scbs.pcm2java4joana.utils.JoanaModelUtils
import edu.kit.kastel.scbs.pcm2java4joana.utils.SourceCodeModelUtils

class SupplierAnalysisModel2AnnotatedCodeGenerator {
	
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
		
		import edu.kit.joana.ui.annotations.*;
		«FOR toImport : sourceCodeClass.implements»
			«generateImport(toImport)»
		«ENDFOR»
		«generateImports(sourceCodeClass.fields)»
		
		public class «sourceCodeClass.name» «IF sourceCodeClass.implements.size > 0»implements «generateImplements(sourceCodeClass.implements)»«ENDIF»{
			«generateFields(sourceCodeClass.fields, sourceCodeClass, joanaModel)»
			
			«generateConstructor(sourceCodeClass)»
		}
		'''
	}
	
	def String generateConstructor(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass) {
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
		«generateDataType(method.type)» «method.name»(«FOR parameter : method.parameter»«generateParameter(parameter, null)»«IF method.parameter.indexOf(parameter) != method.parameter.length - 1», «ENDIF»«ENDFOR»);
		'''
	}
	
	def String generateFields(List<Field> fields, edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class sourceCodeClass, JOANARoot joanaModel) {
		return '''
			«FOR field : fields»
				«generateField(field, sourceCodeClass, joanaModel)»
			«ENDFOR»
		'''
	}
	
	def String generateField(Field field, edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class sourceCodeClass, JOANARoot joanaModel) {
		switch field {
			Variable: generateVariable(field)
			Method: generateMethod(sourceCodeClass, field, joanaModel)
		}
	}
	
	def String generateVariable(Variable variable) {
		return '''
		private «generateDataType(variable.type)» «variable.name»;
		
		«generateGetter(variable)»
		«generateSetter(variable)»
		'''
	}
	
	def String generateGetter(Variable variable) {
		return '''
		public «generateDataType(variable.type)» get«variable.name»() {
			return this.«variable.name»;
		}'''
	}
	
	def String generateSetter(Variable variable) {
		return '''
		public void set«variable.name»(«generateDataType(variable.type)» «variable.name») {
			this.«variable.name» = «variable.name»;
		}
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
			case BOOLEAN: return '''Boolean'''
			case BYTE: return '''Byte'''
			case CHAR: return '''Char'''
			case SHORT: return '''Short'''
			case INT: return '''Integer'''
			case FLOAT: return '''Float'''
			case DOUBLE: return '''Double'''
			case STRING: return '''String'''
			case LONG: return '''Long'''
		}
		return '''void'''
	}
	
	def String generateMethod(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, Method method, JOANARoot joanaModel) {
		return '''
		«generateJoanaAnnotation(scClass, method, joanaModel)»
		@Override
		public «generateDataType(method.type)» «method.name»(«FOR parameter : method.parameter»«IF JoanaModelUtils.getJoanaFlowSpecificationElementsFor(joanaModel, scClass.name, method.name, parameter.name).size != 0»«generateJoanaAnnotation(scClass, method, parameter, joanaModel)» «generateParameter(parameter, null)»«IF method.parameter.indexOf(parameter) != method.parameter.length - 1», «ENDIF»«ENDIF»«ENDFOR») {
			// TODO: Implement me!
			«IF method.type !== null»return null;«ENDIF»
		}
		'''	
	}
	
	def String generateParameter(Parameter parameter, JOANARoot joanaModel) {
		return '''«generateDataType(parameter.type)» «parameter.name»'''
	}
	
	def String generateImplements(List<Interface> interfaces) {
		return '''«FOR inter : interfaces»«inter.name»«IF interfaces.indexOf(inter) != interfaces.length - 1», «ENDIF»«ENDFOR»'''
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
		«FOR referenceType : SourceCodeModelUtils.getReferenceTypes(fields)»
			import generated.code.«referenceType»;
		«ENDFOR»
		«IF SourceCodeModelUtils.hasCollectionType(fields)»
			import java.util.Collection;
		«ENDIF»
		'''
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