package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.io.IOException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot;

public class SupplierAnalysisModel {
	private final Resource sourceCodeModel;
	private Resource joanaModel;
	private final Resource structuralCorrespondenceModel;
	private Resource securityCorrespondenceModel;
	private final IPath destinationFolder;
	private final SourceCodeRoot sourceCodeRoot;
	private JOANARoot joanaRoot;

	public SupplierAnalysisModel(Resource sourceCodeModel, Resource structuralCorrespondenceModel,
			IPath destinationFolder) {
		this.sourceCodeModel = sourceCodeModel;
		this.structuralCorrespondenceModel = structuralCorrespondenceModel;
		this.sourceCodeModel.getContents().add(structuralCorrespondenceModel.getContents().get(0));
		this.sourceCodeRoot = (SourceCodeRoot) sourceCodeModel.getContents().get(0);
		this.destinationFolder = destinationFolder;
	}

	public Resource getSourceCodeModel() {
		return this.sourceCodeModel;
	}

	public Resource getJoanaModel() {
		return this.joanaModel;
	}

	public SourceCodeRoot getSourceCodeRoot() {
		return this.sourceCodeRoot;
	}

	public JOANARoot getJoanaRoot() {
		return this.joanaRoot;
	}

	public void setJoanaModel(JOANARoot joanaModel) {
		Resource joanaResource = new XMLResourceImpl(URI.createFileURI(
				destinationFolder.toString() + IPath.SEPARATOR + "GeneratedModels" + IPath.SEPARATOR + "joana.ecore"));
		sourceCodeModel.getContents().add(joanaModel);
		this.joanaRoot = joanaModel;
		this.joanaModel = joanaResource;
	}

	public void setSecurityCorrespondendenceModel(SecurityCorrespondenceModel securityCorrespondenceModel) {
		Resource securityCorrespondenceModelResource = new XMLResourceImpl(
				URI.createFileURI(destinationFolder.toString() + IPath.SEPARATOR + "GeneratedModels" + IPath.SEPARATOR
						+ "securitycorrespondencemodel.ecore"));
		securityCorrespondenceModelResource.getContents().add(securityCorrespondenceModel);
		this.securityCorrespondenceModel = securityCorrespondenceModelResource;
		this.sourceCodeModel.getContents().add(securityCorrespondenceModel);
	}

	public void saveSourceCodeModel() {
		try {
			this.sourceCodeModel.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void saveJoanaModel() {
		try {
			this.joanaModel.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void saveCorrespondenceModel() {
		try {
			this.structuralCorrespondenceModel.save(null);
			this.securityCorrespondenceModel.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
