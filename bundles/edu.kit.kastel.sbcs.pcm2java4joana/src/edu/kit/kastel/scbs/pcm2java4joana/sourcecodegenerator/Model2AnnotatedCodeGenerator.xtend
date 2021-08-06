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
import edu.kit.kastel.scbs.pcm2java4joana.utils.JoanaModelUtils
import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecificationElement
import edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint
import edu.kit.kastel.scbs.pcm2java4joana.joana.Source
import edu.kit.kastel.scbs.pcm2java4joana.joana.Sink
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel
import edu.kit.kastel.scbs.pcm2java4joana.joana.Lattice
import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation

import edu.kit.kastel.scbs.pcm2java4joana.utils.SetOperations
import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation

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
		
		import edu.kit.joana.ui.annotations.*;
		«FOR toImport : sourceCodeClass.implements»
			«generateImport(toImport)»
		«ENDFOR»
		«generateImports(sourceCodeClass.fields)»
		
		public class «sourceCodeClass.name» «IF sourceCodeClass.implements.size > 0»implements «generateImplements(sourceCodeClass.implements)»«ENDIF»{
			«generateFields(sourceCodeClass.fields, sourceCodeClass, joanaModel)»
			
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
		«FOR element : JoanaModelUtils.getJoanaFlowSpecificationElementsFor(joanaModel, scClass.name, method.name)»
		«generateJoanaAnnotation(element)»
		«ENDFOR»
		@Override
		public «generateDataType(method.type)» «method.name»(«FOR parameter : method.parameter»«FOR element : JoanaModelUtils.getJoanaFlowSpecificationElementsFor(joanaModel, scClass.name, method.name, parameter.name)»«generateJoanaAnnotation(element)»«ENDFOR»«generateParameter(parameter, null)»«IF method.parameter.indexOf(parameter) != method.parameter.length - 1», «ENDIF»«ENDFOR») {
			// TODO: Implement me!
			«IF method.type !== null»return null;«ENDIF»
		}
		'''	
	}
	
	def String generateJoanaAnnotation(FlowSpecificationElement element) {
		switch element {
			EntryPoint: return generateEntryPointAnnotation(element)
			Source: return generateSource(element)
			Sink: return generateSink(element)
		}
		return ""
	}
	
	def String generateEntryPointAnnotation(EntryPoint element) {
		return '''
		@EntryPoint(tag = "«element.tag»",
			levels = «generateLevelsAnnotation(element.securitylevels)»,
			lattice = «generateLattice(element.lattice)»
		)
		'''
	}
	
	def String generateLattice(Lattice lattice) {		
		return '''{«FOR relation : lattice.flowrelation»«generateMayFlowRelation(relation)»«IF lattice.flowrelation.indexOf(relation) != lattice.flowrelation.length - 1»,«ENDIF»«ENDFOR»}'''
	}
	
	def String generateMayFlowRelation(FlowRelation relation) {
		val to = JoanaModelUtils.combineIntoOneSecurityLevel(relation.to)
		val from = JoanaModelUtils.combineIntoOneSecurityLevel(relation.from)
		
		return '''@MayFlow(from ="«from»", to = "«to»")'''
	}
	
	def String generateLevelsAnnotation(List<SecurityLevel> levels) {
		val powerSet = SetOperations.generatePowerSet(levels)
		return '''{«FOR levelSet : powerSet»«IF levelSet.size > 0»"«JoanaModelUtils.combineIntoOneSecurityLevel(levelSet)»"«IF powerSet.indexOf(levelSet) != powerSet.length - 1»,«ENDIF»«ENDIF»«ENDFOR»}'''
	}
	
	def String generateSource(Source element) {
		return '''@Source«generateAnnotation(element)» '''
	}
	
	def String generateSink(Sink element) {
		return '''@Sink«generateAnnotation(element)» '''
	}
	
	def String generateAnnotation(Annotation annotation) {
		return '''(tags = "«annotation.tag»", level = "«JoanaModelUtils.combineIntoOneSecurityLevel(annotation.securitylevel)»")'''
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
		«FOR referenceType : getReferenceTypes(fields)»
			import generated.code.«referenceType»;
		«ENDFOR»
		«IF hasCollectionType(fields)»
			import java.util.Collection;
		«ENDIF»
		'''
	}
	
	def boolean hasCollectionType(List<Field> fields) {
		var returnValue = false
		for(field : fields) {
			switch field {
				Variable: returnValue = returnValue || hasVariableCollectionType(field)
				Method: returnValue = returnValue || hasMethodCollectionType(field)
			}
		}	
		
		return returnValue
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
		var returnValue = false
		switch variable.type {
			CollectionType: returnValue = true
			BuiltInType, ReferenceType: returnValue = false
		}
		return returnValue
	}
	
	def List<String> getReferenceTypes(List<Field> fields) {
		val referenceTypes = new ArrayList<String>();
		for(field : fields) {
			val addTypes = getReferenceTypes(field)
			referenceTypes.addAll(addTypes)
		}
		return SetOperations.removeDuplicates(referenceTypes)
	}
	
	def List<String> getReferenceTypes(Field field) {
		var returnValue = new ArrayList<String>() 
		switch field {
			Variable: returnValue.addAll(getReferenceTypeForVariable(field))
			Method: returnValue.addAll(getReferenceTypeForMethod(field))
		}
		return returnValue
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
				referenceTypes.add(paramterType)
			}
		}
		
		return referenceTypes
	}
	
	def String getReferenceTypeForParameter(Parameter parameter) {
		var returnValue = ""
		switch parameter.type {
			ReferenceType: returnValue = getReferenceTypeName(parameter.type as ReferenceType)
			CollectionType: returnValue = getReferenceTypeForCollectionType(parameter.type as CollectionType)
		}
		return returnValue
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
		var returnValue = ""
		switch innerType {
			ReferenceType: returnValue = getReferenceTypeName(innerType)
			CollectionType: returnValue = getReferenceTypeForCollectionType(innerType)			
		}
		return returnValue;
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