package edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator

import org.eclipse.internal.xtend.util.Triplet
import java.util.List
import java.util.ArrayList

import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Field
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Variable

import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot

import static extension edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator.JoanaAnnotationsGenerator.*
import static extension edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator.SourceCodeElementGenerator.*
import edu.kit.kastel.scbs.pcm2java4joana.utils.JoanaModelUtils

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
}