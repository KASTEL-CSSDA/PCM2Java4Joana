package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.io.IOException;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.exceptions.InputException;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel;

public class CorrespondenceModels {
	private final static String FILE_NAME = "models.ecore";

	private final StructuralCorrespondenceModel structuralCorrespondenceModel;
	private final SecurityCorrespondenceModel securityCorrespondenceModel;

	public CorrespondenceModels(StructuralCorrespondenceModel structuralCorrespondenceModel,
			SecurityCorrespondenceModel securityCorrespondenceModel) {
		this.structuralCorrespondenceModel = structuralCorrespondenceModel;
		this.securityCorrespondenceModel = securityCorrespondenceModel;
	}

	public StructuralCorrespondenceModel getStructuralCorrespondenceModel() {
		return this.structuralCorrespondenceModel;
	}

	public SecurityCorrespondenceModel getSecurityCorrespondenceModel() {
		return this.securityCorrespondenceModel;
	}

	public static CorrespondenceModels createCorrespondenceModelsFromFile(Collection<IFile> files)
			throws InputException {
		IPath modelsPath = null;

		for (IFile file : files) {
			if (file.getName().equals(FILE_NAME)) {
				modelsPath = file.getLocation();
				break;
			}
		}

		ResourceSetImpl resSet = new ResourceSetImpl();
		URI modelsUri = URI.createFileURI(modelsPath.toString());
		Resource modelsResource = resSet.getResource(modelsUri, true);
		EcoreUtil.resolveAll(modelsResource);

		try {
			modelsResource.load(null);
		} catch (IOException e) {
			e.printStackTrace();
			throw new InputException("Correspondence models could not be loaded");
		}

		StructuralCorrespondenceModel structuralCorrespondenceModel = (StructuralCorrespondenceModel) modelsResource
				.getContents().get(2);
		SecurityCorrespondenceModel securityCorrespondenceModel = (SecurityCorrespondenceModel) modelsResource
				.getContents().get(3);

		return new CorrespondenceModels(structuralCorrespondenceModel, securityCorrespondenceModel);
	}

	public static boolean containsNecessaryFiles(Collection<IFile> files) {
		for (IFile file : files) {
			if (file.getName().equals(FILE_NAME)) {
				return true;
			}
		}

		return false;
	}

}
