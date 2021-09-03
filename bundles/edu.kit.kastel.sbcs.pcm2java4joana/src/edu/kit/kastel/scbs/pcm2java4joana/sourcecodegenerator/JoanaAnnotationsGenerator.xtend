package edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator

import edu.kit.kastel.scbs.pcm2java4joana.utils.JoanaModelUtils
import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method
import java.util.ArrayList
import edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint
import edu.kit.kastel.scbs.pcm2java4joana.joana.Lattice
import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation
import java.util.List
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel
import edu.kit.kastel.scbs.pcm2java4joana.utils.SetOperations
import edu.kit.kastel.scbs.pcm2java4joana.joana.Source
import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation
import edu.kit.kastel.scbs.pcm2java4joana.joana.Sink
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter
import edu.kit.ipd.sdq.activextendannotations.Utility
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.TopLevelType
import java.io.BufferedWriter

@Utility
class JoanaAnnotationsGenerator {
	static def void generateJoanaAnnotation(TopLevelType parent, Method method, JOANARoot joanaModel, BufferedWriter writer) {
		if (joanaModel === null) {
			return
		}

		generateEntryPoints(parent, method, joanaModel, writer)
		generateSources(parent, method, joanaModel, writer)
		generateSinks(parent, method, joanaModel, writer)
	}
	
	static def void generateJoanaAnnotation(TopLevelType parent, Method method, Parameter parameter, JOANARoot joanaModel, BufferedWriter writer) {
		if (joanaModel === null) {
			return
		}
		generateSources(parent, method, parameter, joanaModel, writer)
		generateSinks(parent, method, parameter, joanaModel, writer)
	}
	
	static def void generateEntryPoints(TopLevelType parent, Method method, JOANARoot joanaModel, BufferedWriter writer) {
		val entryPoints = JoanaModelUtils.getEntryPoints(joanaModel, parent.name, method.name)
		for (entryPoint : entryPoints) {
			generateEntryPointAnnotation(entryPoint, writer)
		}
	}
	
	static def void generateSources(TopLevelType parent, Method method, JOANARoot joanaModel, BufferedWriter writer) {
		val sources = JoanaModelUtils.getSourcesFor(joanaModel, parent.name, method.name)
		val tags = new ArrayList<String>()
		for(source : sources) {
			tags.addAll(source.tag)
		}
		if (sources.size == 0) {
			return
		} else {
			val content = '''@Source«generateAnnotation(sources.get(0), tags)»'''
			writer.write(content)
			writer.flush()
		}
	}
	
	static def void generateSinks(TopLevelType parent, Method method, Parameter parameter, JOANARoot joanaModel, BufferedWriter writer) {
		val sinks = JoanaModelUtils.getSinksFor(joanaModel, parent.name, method.name, parameter.name)
		val tags = new ArrayList<String>()
		for(sink : sinks) {
			tags.addAll(sink.tag)
		}
		if (sinks.size == 0) {
			return
		} else {
			val content =  '''@Sink«generateAnnotation(sinks.get(0), tags)»'''
			writer.write(content)
			writer.flush()
		}
	}
	
	static def void generateSources(TopLevelType parent, Method method, Parameter parameter, JOANARoot joanaModel, BufferedWriter writer) {
		val sources = JoanaModelUtils.getSourcesFor(joanaModel, parent.name, method.name, parameter.name)
		val tags = new ArrayList<String>()
		for(source : sources) {
			tags.addAll(source.tag)
		}
		if (sources.size == 0) {
			return
		} else {
			val content = '''@Source«generateAnnotation(sources.get(0), tags)»'''
			writer.write(content)
			writer.flush()
		}
	}
	
	static def void generateSinks(TopLevelType parent, Method method, JOANARoot joanaModel, BufferedWriter writer) {
		val sinks = JoanaModelUtils.getSinksFor(joanaModel, parent.name, method.name)
		val tags = new ArrayList<String>()
		for(sink : sinks) {
			tags.addAll(sink.tag)
		}
		if (sinks.size == 0) {
			return
		} else {
			val content = '''@Sink«generateAnnotation(sinks.get(0), tags)»'''
			writer.write(content)
			writer.flush()
		}
	}
	
	static def void generateEntryPointAnnotation(EntryPoint element, BufferedWriter writer) {
		val content = '''
		@EntryPoint(tag = "«element.tag.get(0)»",
			levels = «generateLevelsAnnotation(element.securitylevels)»,
			lattice = «generateLattice(element.lattice)»
		)
		'''
		writer.write(content)
		writer.flush()
	}
	
	static def String generateLattice(Lattice lattice) {		
		return '''{«FOR relation : lattice.flowrelation»«generateMayFlowRelation(relation)»«IF lattice.flowrelation.indexOf(relation) != lattice.flowrelation.length - 1»,«ENDIF»«ENDFOR»}'''
	}
	
	static def String generateMayFlowRelation(FlowRelation relation) {
		val to = JoanaModelUtils.combineIntoOneSecurityLevel(relation.to)
		val from = JoanaModelUtils.combineIntoOneSecurityLevel(relation.from)
		
		return '''@MayFlow(from ="«from»", to = "«to»")'''
	}
	
	static def String generateLevelsAnnotation(List<SecurityLevel> levels) {
		val powerSet = SetOperations.generatePowerSet(levels)
		return '''{«FOR levelSet : powerSet»«IF levelSet.size > 0»"«JoanaModelUtils.combineIntoOneSecurityLevel(levelSet)»"«IF powerSet.indexOf(levelSet) != powerSet.length - 1»,«ENDIF»«ENDIF»«ENDFOR»}'''
	}
	
	static def String generateSource(Source element) {
		return '''@Source«generateAnnotation(element)» '''
	}
	
	static def String generateSink(Sink element) {
		return '''@Sink«generateAnnotation(element)» '''
	}
	
	static def String generateAnnotation(Annotation annotation) {
		return '''(tags = "«annotation.tag»", level = "«JoanaModelUtils.combineIntoOneSecurityLevel(annotation.securitylevel)»")'''
	}
	
	static def String generateAnnotation(Annotation annotation, List<String> tags) {
		return '''(tags = {«FOR tag : tags»"«tag»"«IF tags.indexOf(tag) != tags.length - 1», «ENDIF»«ENDFOR»}, level = "«JoanaModelUtils.combineIntoOneSecurityLevel(annotation.securitylevel)»")'''
	}
}