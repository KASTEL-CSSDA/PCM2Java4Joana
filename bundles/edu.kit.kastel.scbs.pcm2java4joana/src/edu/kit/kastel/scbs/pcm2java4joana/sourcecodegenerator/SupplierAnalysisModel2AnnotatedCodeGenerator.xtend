package edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator

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
import org.eclipse.core.runtime.IPath
import java.io.File
import java.io.IOException
import edu.kit.kastel.scbs.pcm2java4joana.exceptions.CodeSaveException
import java.io.BufferedWriter
import java.io.FileWriter


/**
 * This class is responsible to generate the annotated source code based on a source code and joana model.
 */
@Utility
class SupplierAnalysisModel2AnnotatedCodeGenerator {
	
	/**
	 * This method iterates over the source code top level types to generate annotated source code for the source code model elements.
	 * The annotated source code is written to files. 
	 * The source code is directly written to the disk because otherwise the file size could exceed the available ram.
	 * The file name is the name of the top level type. 
	 */
	static def List<CodeWithFile> generateAnnotatedCode(SourceCodeRoot sourceCodeModel, JOANARoot joanaModel, IPath baseFolder) {
		val contentsForFiles = new ArrayList<CodeWithFile>()
		val destinationFolder = baseFolder.append("src-gen");
		val folder = destinationFolder.toString() + IPath.SEPARATOR;
		(new File(folder)).mkdirs();
		
		for (topLevelType : sourceCodeModel.topleveltype) {
			val filePath = folder + topLevelType.entityName + ".java";
			val file = new File(filePath);
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
					throw new CodeSaveException(e.getMessage());
				}
			}
			val fw = new FileWriter(file);
			val writer = new BufferedWriter(fw);
			
			generateTopLevelType(topLevelType, joanaModel, writer)
			
			writer.close();
			fw.close();
		}
		return contentsForFiles;	
	}
	
	static def void generateTopLevelType(TopLevelType topLevelType, JOANARoot joanaModel, BufferedWriter writer) {
		switch topLevelType {
			Class: generateClass(topLevelType, joanaModel, writer)
			Interface: generateInterface(topLevelType, writer)
		}
	}
	
	static def void generateInterface(Interface inter, BufferedWriter writer) {
		val content = '''
		«generatePackage()»
		
		«generateImportsInterface(inter.methods)»
		
		public interface «inter.entityName» {
			«FOR method : inter.methods»
				«generateInterfaceMethod(method)»
			«ENDFOR»
		}
		'''
		writer.write(content);
	}
	
	static def String generateInterfaceMethod(Method method) {
		return '''«generateDataType(method.type)» «method.entityName»(«FOR parameter : method.parameter»«generateDataType(parameter.type)» «parameter.entityName»«IF method.parameter.indexOf(parameter) != method.parameter.length - 1», «ENDIF»«ENDFOR»);'''
	}
	
	static def void generateClass(Class sourceCodeClass, JOANARoot joanaModel, BufferedWriter writer) {
		val packageAndImports =  '''
		«generatePackage()»
		
		import edu.kit.joana.ui.annotations.*;
		«FOR toImport : sourceCodeClass.implements»
			«generateImport(toImport)»
		«ENDFOR»
		«generateImports(sourceCodeClass.fields)»'''
		writer.write(packageAndImports)
		writer.flush()
		
		
		val classDefinition = '''public class «sourceCodeClass.entityName» «IF sourceCodeClass.implements.size > 0»implements «generateImplements(sourceCodeClass.implements)»«ENDIF»{ '''
		writer.write(classDefinition)
		writer.write("\n")
		writer.flush()
		
		generateFields(sourceCodeClass.fields, sourceCodeClass, joanaModel, writer)			
		val constructor =  '''«generateConstructor(sourceCodeClass)»
		}'''
		
		writer.write(constructor)
		writer.flush()
	}
	
	static def void generateFields(List<Field> fields, Class sourceCodeClass, JOANARoot joanaModel, BufferedWriter writer) {
		for(field : fields) {
			generateField(field, sourceCodeClass, joanaModel, writer)
		}
	}
	
	static def void generateField(Field field, Class sourceCodeClass, JOANARoot joanaModel, BufferedWriter writer) {
		switch field {
			Variable: generateVariable(field, writer)
			Method: generateMethod(sourceCodeClass, field, true, joanaModel, writer)
		}
	}
			
	static def void generateMethod(TopLevelType parent, Method method, boolean isOverride, JOANARoot joanaModel, BufferedWriter writer) {
		generateJoanaAnnotation(parent, method, joanaModel, writer)
		if (isOverride) {
			writer.write("@Override \n")
		}
		val content = '''public «generateDataType(method.type)» «method.entityName»('''
		writer.write(content)
		writer.flush()
		
		for(parameter : method.parameter) {
			generateParameter(parent, method, parameter, joanaModel, writer)
			if(method.parameter.indexOf(parameter) != method.parameter.length - 1) {
				writer.write(",")
			}
		}
		writer.write(") { \n")		
		if (method.type !== null) {
			writer.write("return null; \n")
		}
		writer.write("} \n")
		writer.flush()
	}
	
	static def void generateParameter(TopLevelType parent, Method method, Parameter parameter, JOANARoot joanaModel, BufferedWriter writer) {
		generateJoanaAnnotation(parent, method, parameter, joanaModel, writer)
		val content = '''«generateDataType(parameter.type)» «parameter.entityName»'''
		writer.write(content)
		writer.flush()
	}
}