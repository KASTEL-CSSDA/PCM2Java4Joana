package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.adversary.Adversaries;

public class ClientAnalysisModel {
	private static final String PCM_REPOSITORY_FILE_ENDING = "repository";
	private static final String ACCESS_ANALYSIS_CONFIDENTIALITY_FILE_ENDING = "confidentiality";
	private static final String ACCESS_ANALYSIS_ADVESARY_FILE_ENDING = "adversary";

	private Repository repository;
	private ProfileApplication profile;
	private ConfidentialitySpecification confidentiality;
	private Adversaries adversaries;

	private IPath baseFolder;

	public ClientAnalysisModel(Repository repository, ProfileApplication profile,
			ConfidentialitySpecification confidentiality, Adversaries adversaries, IPath baseFolder) {
		this.repository = repository;
		this.profile = profile;
		this.confidentiality = confidentiality;
		this.adversaries = adversaries;
		this.baseFolder = baseFolder;
	}

	public Repository getRepository() {
		return this.repository;
	}

	public ProfileApplication getProfile() {
		return this.profile;
	}

	public ConfidentialitySpecification getConfidentiality() {
		return this.confidentiality;
	}

	public Adversaries getAdversary() {
		return this.adversaries;
	}

	public IPath getBaseFolder() {
		return this.baseFolder;
	}

	public static boolean containsNecessaryFiles(List<IFile> files) {
		boolean hasRepository = false;
		boolean hasAdversary = false;
		boolean hasConfidentiality = false;

		for (IFile file : files) {
			switch (file.getFileExtension()) {
			case PCM_REPOSITORY_FILE_ENDING:
				hasRepository = true;
				break;
			case ACCESS_ANALYSIS_ADVESARY_FILE_ENDING:
				hasAdversary = true;
				break;
			case ACCESS_ANALYSIS_CONFIDENTIALITY_FILE_ENDING:
				hasConfidentiality = true;
				break;
			}
		}

		return hasRepository && hasConfidentiality && hasAdversary;
	}

	public static ClientAnalysisModel createModelsFromFiles(List<IFile> files) {
		IPath repositoryPath = null;
		IPath confidentialityPath = null;
		IPath adversaryPath = null;

		for (IFile file : files) {
			switch (file.getFileExtension()) {
			case PCM_REPOSITORY_FILE_ENDING:
				repositoryPath = file.getLocation();
				break;
			case ACCESS_ANALYSIS_ADVESARY_FILE_ENDING:
				adversaryPath = file.getLocation();
				break;
			case ACCESS_ANALYSIS_CONFIDENTIALITY_FILE_ENDING:
				confidentialityPath = file.getLocation();
				break;
			}
		}

		IPath basePath = repositoryPath.removeLastSegments(2);

		Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();

		PcmPackage.eINSTANCE.eClass();

		map.put("repository", new XMIResourceFactoryImpl());
		map.put("pcmconfidentialityprofile", new XMIResourceFactoryImpl());
		map.put("confidentiality", new XMIResourceFactoryImpl());
		map.put("adversary", new XMIResourceFactoryImpl());

		ResourceSetImpl resSet = new ResourceSetImpl();

		URI repositoryUri = URI.createFileURI(repositoryPath.toString());
		URI confidentialityUri = URI.createFileURI(confidentialityPath.toString());
		URI adversaryUri = URI.createFileURI(adversaryPath.toString());

		Resource resourceRepository = resSet.getResource(repositoryUri, true);
		Resource resourceConfidentiality = resSet.getResource(confidentialityUri, true);
		Resource resourceAdversary = resSet.getResource(adversaryUri, true);

		EcoreUtil.resolveAll(resourceRepository);
		EcoreUtil.resolveAll(resourceConfidentiality);
		EcoreUtil.resolveAll(resourceAdversary);

		try {
			resourceRepository.load(null);
			resourceConfidentiality.load(null);
			resourceAdversary.load(null);
		} catch (IOException e) {
			return null;
		}

		Repository repository = (Repository) resourceRepository.getContents().get(0);
		ProfileApplication profile = (ProfileApplication) resourceRepository.getContents().get(1);
		ConfidentialitySpecification confidentiality = (ConfidentialitySpecification) resourceConfidentiality
				.getContents().get(0);
		Adversaries adversary = (Adversaries) resourceAdversary.getContents().get(0);

		return new ClientAnalysisModel(repository, profile, confidentiality, adversary, basePath);
	}

}
