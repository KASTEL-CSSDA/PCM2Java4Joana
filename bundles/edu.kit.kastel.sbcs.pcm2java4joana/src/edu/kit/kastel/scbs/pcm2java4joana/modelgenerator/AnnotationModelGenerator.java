package edu.kit.kastel.scbs.pcm2java4joana.modelgenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.modelversioning.emfprofileapplication.StereotypeApplication;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;

import edu.kit.ipd.sdq.commons.util.org.palladiosimulator.mdsdprofiles.api.StereotypeAPIUtil;
import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.adversary.Adversaries;
import edu.kit.kastel.scbs.confidentiality.adversary.Adversary;
import edu.kit.kastel.scbs.confidentiality.data.DataIdentifying;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.EntryPoint;
import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowRelation;
import edu.kit.kastel.scbs.pcm2java4joana.joana.FlowSpecification;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JoanaFactory;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Lattice;
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.joana.Source;
import edu.kit.kastel.scbs.pcm2java4joana.models.ClientAnalysisModel;
import edu.kit.kastel.scbs.pcm2java4joana.models.SupplierAnalysisModel;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Class;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Method;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Parameter;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot;
import edu.kit.kastel.scbs.pcm2java4joana.utils.SetOperations;
import edu.kit.kastel.scbs.pcm2java4joana.utils.SourceCodeModelUtils;

public class AnnotationModelGenerator {
	private SupplierAnalysisModel supplierAnalysisModel;
	private ClientAnalysisModel clientAnalysisModel;

	public AnnotationModelGenerator(ClientAnalysisModel clientAnalysisModel,
			SupplierAnalysisModel supplierAnalysisModel) {
		this.supplierAnalysisModel = supplierAnalysisModel;
		this.clientAnalysisModel = clientAnalysisModel;
	}

	public SupplierAnalysisModel generateJoanaModel() {
		ConfidentialitySpecification confidentiality = this.clientAnalysisModel.getConfidentiality();
		Adversaries adversaries = this.clientAnalysisModel.getAdversary();
		List<SecurityLevel> levels = this.generateLevels(adversaries);
		Map<SecurityLevel, List<DataIdentifying>> levelToDatasetsMapping = this
				.generateSecurityLevelToDatasetMapping(adversaries);
		Lattice lattice = this.generateLattice(levels);
		List<Annotation> annotations = this.generateAnnotations(confidentiality, levelToDatasetsMapping,
				confidentiality.getParametersAndDataPairs(),
				(SourceCodeRoot) this.supplierAnalysisModel.getSourceCodeModel().getContents().get(0),
				this.clientAnalysisModel);
		List<FlowSpecification> flowSpecifications = this.generateFlowSpecifications(annotations, lattice);

		JoanaFactory factory = JoanaFactory.eINSTANCE;
		JOANARoot root = factory.createJOANARoot();
		root.getFlowspecification().addAll(flowSpecifications);
		this.supplierAnalysisModel.setJoanaModel(root);

		return this.supplierAnalysisModel;
	}

	private List<FlowSpecification> generateFlowSpecifications(List<Annotation> annotations, Lattice lattice) {
		List<FlowSpecification> flowSpefications = new ArrayList<FlowSpecification>();

		for (int i = 0; i < annotations.size(); i++) {
			flowSpefications.add(this.generateFlowSpecification(i, annotations, lattice));
		}

		return flowSpefications;
	}

	private FlowSpecification generateFlowSpecification(int tag, List<Annotation> annotations, Lattice lattice) {
		JoanaFactory factory = JoanaFactory.eINSTANCE;
		FlowSpecification flow = factory.createFlowSpecification();
		EntryPoint entryPoint = this.generateEntryPoint(Integer.toString(tag), annotations.get(tag), lattice);
		List<Annotation> flowAnnotations = new ArrayList<Annotation>();
		for (int i = 0; i < annotations.size(); i++) {
			if (i != tag) {
				flowAnnotations.add(this.generateSource(Integer.toString(tag), annotations.get(i)));
			}
		}

		flow.setEntrypoint(entryPoint);
		flow.getAnnotation().addAll(flowAnnotations);

		return flow;
	}

	private Source generateSource(String tag, Annotation annotation) {
		JoanaFactory factory = JoanaFactory.eINSTANCE;
		Source source = factory.createSource();
		source.setTag(tag);
		source.setAnnotatedClass(annotation.getAnnotatedClass());
		source.setAnnotatedMethod(annotation.getAnnotatedMethod());
		source.setAnnotatedParameter(annotation.getAnnotatedParameter());

		return source;
	}

	private EntryPoint generateEntryPoint(String tag, Annotation annotation, Lattice lattice) {
		JoanaFactory factory = JoanaFactory.eINSTANCE;
		EntryPoint entryPoint = factory.createEntryPoint();
		entryPoint.setTag(tag);
		entryPoint.setAnnotatedClass(annotation.getAnnotatedClass());
		entryPoint.setAnnotatedMethod(annotation.getAnnotatedMethod());

		return entryPoint;
	}

	private List<Annotation> generateAnnotations(ConfidentialitySpecification confidentiality,
			Map<SecurityLevel, List<DataIdentifying>> levelToDatasetsMapping,
			List<ParametersAndDataPair> parametersAndDataPair, SourceCodeRoot sourceCode,
			ClientAnalysisModel clientAnalysisModel) {
		List<Annotation> annotations = new ArrayList<Annotation>();
		ProfileApplication profile = clientAnalysisModel.getProfile();

		for (StereotypeApplication application : profile.getStereotypeApplications()) {
			var stereotype = application.getStereotype();
			if (stereotype.getName().equals("InformationFlow")) {
				List<Annotation> annotation = this.generateAnnotation(confidentiality, levelToDatasetsMapping,
						application, sourceCode);
				if (annotation != null) {
					annotations.addAll(annotation);
				}
			}
		}

		return annotations;
	}

	private List<Annotation> generateAnnotation(ConfidentialitySpecification confidentiality,
			Map<SecurityLevel, List<DataIdentifying>> levelToDatasetsMapping,
			StereotypeApplication stereotypeApplication, SourceCodeRoot sourceCode) {
		JoanaFactory factory = JoanaFactory.eINSTANCE;

		List<StereotypeApplication> iter = new ArrayList<StereotypeApplication>();
		iter.add(stereotypeApplication);
		ParametersAndDataPair appliedPair = StereotypeAPIUtil
				.getTaggedValues(iter, "parametersAndDataPairs", ParametersAndDataPair.class).get(0);
		List<SecurityLevel> securityLevels = this.getSecurityLevel(appliedPair, levelToDatasetsMapping);

		OperationSignature pcmSignature = (OperationSignature) stereotypeApplication.getAppliedTo();
		OperationInterface pcmInter = pcmSignature.getInterface__OperationSignature();

		Interface inter = SourceCodeModelUtils.getInterface(sourceCode, pcmInter.getEntityName());
		if (inter == null) {
			return null;
		}
		List<Method> methods = SourceCodeModelUtils.getMethod(inter, pcmSignature.getEntityName());
		List<Method> toRemove = new ArrayList<Method>();
		if (appliedPair.getParameterSources().get(0) != "\return") {
			for (Method method : methods) {
				List<String> parameterNames = new ArrayList<String>();
				for (Parameter parameter : method.getParameter()) {
					parameterNames.add(parameter.getName());
				}
				if (!SetOperations.isIn(appliedPair.getParameterSources(), parameterNames)) {
					toRemove.add(method);
				}
			}
			methods.removeAll(toRemove);
		}
		Map<Method, List<Parameter>> methodToParameterMap = new HashMap<Method, List<Parameter>>();
		for (Method method : methods) {
			List<Parameter> parameters = new ArrayList<Parameter>();
			for (String parameterName : appliedPair.getParameterSources()) {
				Parameter parameter = SourceCodeModelUtils.getParameter(method, parameterName);
				parameters.add(parameter);
			}
			methodToParameterMap.put(method, parameters);
		}

		List<Class> components = SourceCodeModelUtils.getComponents(sourceCode, inter);

		List<Annotation> annotations = new ArrayList<Annotation>();
		for (Class component : components) {
			for (Method method : methods) {
				for (Parameter parameter : methodToParameterMap.get(method)) {
					Annotation annotation = factory.createAnnotation();
					annotation.getSecuritylevel().addAll(securityLevels);
					// TODO: Diese Conversion geht nicht!
					// annotation.setAnnotatedClass((sourcecode.Class) component);
					// annotation.setAnnotatedMethod((sourcecode.Method) method);
					// annotation.setAnnotatedParameter((sourcecode.Parameter) parameter);
					annotation.setAnnotatedClassName(component.getName());
					annotation.setAnnotatedMethodName(method.getName());
					annotation.setAnnotatedParameterName(parameter.getName());
					annotations.add(annotation);
				}
				Annotation annotation = factory.createAnnotation();
				annotation.getSecuritylevel().addAll(securityLevels);
				// TODO: Diese Conversion geht nicht!
				// annotation.setAnnotatedClass((sourcecode.Class) component);
				// annotation.setAnnotatedMethod((sourcecode.Method) method);
				annotation.setAnnotatedClassName(component.getName());
				annotation.setAnnotatedMethodName(method.getName());
				annotations.add(annotation);
			}
		}

		return annotations;
	}

	private List<SecurityLevel> getSecurityLevel(ParametersAndDataPair pair,
			Map<SecurityLevel, List<DataIdentifying>> levelToDatasetsMapping) {
		List<SecurityLevel> levels = new ArrayList<SecurityLevel>();
		List<DataIdentifying> targets = pair.getDataTargets();

		var it = levelToDatasetsMapping.entrySet().iterator();
		while (it.hasNext()) {
			var entry = (Entry<SecurityLevel, List<DataIdentifying>>) it.next();
			if (SetOperations.isIn(targets, entry.getValue())) {
				levels.add(entry.getKey());
			}
		}

		return levels;
	}

	private Map<SecurityLevel, List<DataIdentifying>> generateSecurityLevelToDatasetMapping(Adversaries adversaries) {
		JoanaFactory factory = JoanaFactory.eINSTANCE;
		Map<SecurityLevel, List<DataIdentifying>> levelToDataset = new HashMap<SecurityLevel, List<DataIdentifying>>();

		for (Adversary adversary : adversaries.getAdversaries()) {
			SecurityLevel level = factory.createSecurityLevel();
			level.setName(adversary.getName());
			List<DataIdentifying> castedList = new ArrayList<DataIdentifying>();
			for (DataIdentifying data : adversary.getMayKnowData()) {
				castedList.add(data);
			}
			levelToDataset.put(level, castedList);
		}

		return levelToDataset;
	}

	private List<SecurityLevel> generateLevels(Adversaries adversaries) {
		JoanaFactory factory = JoanaFactory.eINSTANCE;
		List<SecurityLevel> levels = new ArrayList<SecurityLevel>();

		for (Adversary adversary : adversaries.getAdversaries()) {
			SecurityLevel level = factory.createSecurityLevel();
			level.eClass().setName(adversary.getName());
		}

		return levels;
	}

	private Lattice generateLattice(List<SecurityLevel> levels) {
		JoanaFactory factory = JoanaFactory.eINSTANCE;
		Lattice lattice = factory.createLattice();

		List<List<SecurityLevel>> powerSetLevels = SetOperations.generatePowerSet(levels);

		for (List<SecurityLevel> from : powerSetLevels) {
			for (List<SecurityLevel> to : powerSetLevels) {
				if (SetOperations.isIn(from, to)) {
					FlowRelation relation = factory.createFlowRelation();
					relation.getFrom().addAll(from);
					relation.getTo().addAll(to);
					lattice.getFlowrelation().add(relation);
				}
			}
		}

		return lattice;
	}
}
