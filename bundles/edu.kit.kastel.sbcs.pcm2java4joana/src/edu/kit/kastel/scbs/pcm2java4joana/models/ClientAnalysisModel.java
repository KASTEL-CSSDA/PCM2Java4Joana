package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.modelversioning.emfprofileapplication.ProfileApplication;
import org.palladiosimulator.pcm.repository.Repository;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.adversary.Adversaries;
import edu.kit.kastel.scbs.pcm2java4joana.exceptions.InputException;
import edu.kit.kastel.scbs.pcm2java4joana.exceptions.ModelSaveException;

public class ClientAnalysisModel {
	private static final String PCM_REPOSITORY_FILE_ENDING = "repository";
	private static final String ACCESS_ANALYSIS_CONFIDENTIALITY_FILE_ENDING = "confidentiality";
	private static final String ACCESS_ANALYSIS_ADVESARY_FILE_ENDING = "adversary";

	private final Repository repository;
	private final ProfileApplication profile;
	private final ConfidentialitySpecification confidentiality;
	private final Adversaries adversaries;

	private final IPath confidentialityPath;
	private final IPath baseFolder;

	public ClientAnalysisModel(Repository repository, ProfileApplication profile,
			ConfidentialitySpecification confidentiality, Adversaries adversaries, IPath baseFolder,
			IPath confidentialityPath) {
		this.repository = repository;
		this.profile = profile;
		this.confidentiality = confidentiality;
		this.adversaries = adversaries;
		this.baseFolder = baseFolder;
		this.confidentialityPath = confidentialityPath;
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

	public static boolean containsNecessaryFiles(Collection<IFile> files) {
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

	public void updateConfidentialityModel() throws ModelSaveException {
		EcoreResourceFactoryImpl fac = new EcoreResourceFactoryImpl();
		Resource res = fac.createResource(URI.createFileURI(this.confidentialityPath.toString()));
		res.getContents().add(confidentiality);
		saveResource(res);
	}

	private void saveResource(Resource resource) throws ModelSaveException {
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
			throw new ModelSaveException(e.getMessage());
		}
	}

	public static ClientAnalysisModel createModelsFromFiles(Collection<IFile> files) throws InputException {
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
			e.printStackTrace();
			throw new InputException(e.getMessage());
		}

		Repository repository = (Repository) resourceRepository.getContents().get(0);
		ProfileApplication profile = (ProfileApplication) resourceRepository.getContents().get(1);
		ConfidentialitySpecification confidentiality = (ConfidentialitySpecification) resourceConfidentiality
				.getContents().get(0);
		Adversaries adversary = (Adversaries) resourceAdversary.getContents().get(0);

		IPath basePath = repositoryPath.removeLastSegments(1);
		return new ClientAnalysisModel(repository, profile, confidentiality, adversary, basePath, confidentialityPath);
	}
}
