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
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class

import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot

import static extension edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator.JoanaAnnotationsGenerator.*
import static extension edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator.SourceCodeElementGenerator.*
import edu.kit.ipd.sdq.activextendannotations.Utility
import edu.kit.kastel.scbs.pcm2java4joana.models.CodeWithFile

@Utility
class SupplierAnalysisModel2AnnotatedCodeGenerator {
	
	static def List<CodeWithFile> generateAnnotatedCode(SourceCodeRoot sourceCodeModel, JOANARoot joanaModel) {
		val contentsForFiles = new ArrayList<CodeWithFile>()
		for (topLevelType : sourceCodeModel.topleveltype) {
			val content = generateTopLevelType(topLevelType, joanaModel)
			val newTuple = new CodeWithFile(content, topLevelType.name + ".java")
			contentsForFiles.add(newTuple)
		}
		return contentsForFiles;	
	}
	
	static def String generateTopLevelType(TopLevelType topLevelType, JOANARoot joanaModel) {
		switch topLevelType {
			Class: generateClass(topLevelType, joanaModel)
			Interface: generateInterface(topLevelType)
		}
	}
	
	static def String generateInterface(Interface inter) {
		return '''
		«generatePackage()»
		
		«generateImportsInterface(inter.methods)»
		
		public interface «inter.name» {
			«FOR method : inter.methods»
				«generateMethod(inter, method, false, null)»
			«ENDFOR»
		}
		'''
	}
	
	static def String generateClass(Class sourceCodeClass, JOANARoot joanaModel) {
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
	
	static def String generateFields(List<Field> fields, Class sourceCodeClass, JOANARoot joanaModel) {
		return '''
			«FOR field : fields»
				«generateField(field, sourceCodeClass, joanaModel)»
			«ENDFOR»
		'''
	}
	
	static def String generateField(Field field, Class sourceCodeClass, JOANARoot joanaModel) {
		switch field {
			Variable: generateVariable(field)
			Method: generateMethod(sourceCodeClass, field, true, joanaModel)
		}
	}
			
	static def String generateMethod(TopLevelType parent, Method method, boolean isOverride, JOANARoot joanaModel) {
		
		return '''
		«generateJoanaAnnotation(parent, method, joanaModel)»
		«IF isOverride»@Override«ENDIF»
		public «generateDataType(method.type)» «method.name»(«FOR parameter : method.parameter»«generateParameter(parent, method, parameter, joanaModel)»«IF method.parameter.indexOf(parameter) != method.parameter.length - 1», «ENDIF»«ENDFOR»
			// TODO: Implement me!
			«IF method.type !== null»return null;«ENDIF»
		}
		'''
	}
	
	static def String generateParameter(TopLevelType parent, Method method, Parameter parameter, JOANARoot joanaModel) {
		return '''«generateJoanaAnnotation(parent, method, parameter, joanaModel)» «generateDataType(parameter.type)» «parameter.name»'''
	}
}