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

class JoanaAnnotationsGenerator {
	static def String generateJoanaAnnotation(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, Method method, JOANARoot joanaModel) {
		return '''
		«generateEntryPoints(scClass, method, joanaModel)»
		«generateSources(scClass, method, joanaModel)»
		«generateSinks(scClass, method, joanaModel)»'''
	}
	
	static def String generateJoanaAnnotation(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, Method method, Parameter parameter, JOANARoot joanaModel) {
		return '''«generateSources(scClass, method, parameter, joanaModel)» «generateSinks(scClass, method, parameter, joanaModel)»'''
	}
	
	static def String generateEntryPoints(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, Method method, JOANARoot joanaModel) {
		val entryPoints = JoanaModelUtils.getEntryPoints(joanaModel, scClass.name, method.name)
		return '''
		«FOR entryPoint : entryPoints»«generateEntryPointAnnotation(entryPoint)»«ENDFOR»
		'''
	}
	
	static def String generateSources(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, Method method, JOANARoot joanaModel) {
		val sources = JoanaModelUtils.getSourcesFor(joanaModel, scClass.name, method.name)
		val tags = new ArrayList<String>()
		for(source : sources) {
			tags.add(source.tag)
		}
		if (sources.size == 0) {
			return ''''''
		} else {
			return '''@Source«generateAnnotation(sources.get(0), tags)»'''
		}
	}
	
	static def String generateSinks(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, Method method, Parameter parameter, JOANARoot joanaModel) {
		val sinks = JoanaModelUtils.getSinksFor(joanaModel, scClass.name, method.name, parameter.name)
		val tags = new ArrayList<String>()
		for(sink : sinks) {
			tags.add(sink.tag)
		}
		if (sinks.size == 0) {
			return ''''''
		} else {
			return '''@Sink«generateAnnotation(sinks.get(0), tags)»'''
		}
	}
	
	static def String generateSources(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, Method method, Parameter parameter, JOANARoot joanaModel) {
		val sources = JoanaModelUtils.getSourcesFor(joanaModel, scClass.name, method.name, parameter.name)
		val tags = new ArrayList<String>()
		for(source : sources) {
			tags.add(source.tag)
		}
		if (sources.size == 0) {
			return ''''''
		} else {
			return '''@Source«generateAnnotation(sources.get(0), tags)»'''
		}
	}
	
	static def String generateSinks(edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class scClass, Method method, JOANARoot joanaModel) {
		val sinks = JoanaModelUtils.getSinksFor(joanaModel, scClass.name, method.name)
		val tags = new ArrayList<String>()
		for(sink : sinks) {
			tags.add(sink.tag)
		}
		if (sinks.size == 0) {
			return ''''''
		} else {
			return '''@Sink«generateAnnotation(sinks.get(0), tags)»'''
		}
	}
	
	static def String generateEntryPointAnnotation(EntryPoint element) {
		return '''
		@EntryPoint(tag = "«element.tag»",
			levels = «generateLevelsAnnotation(element.securitylevels)»,
			lattice = «generateLattice(element.lattice)»
		)
		'''
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