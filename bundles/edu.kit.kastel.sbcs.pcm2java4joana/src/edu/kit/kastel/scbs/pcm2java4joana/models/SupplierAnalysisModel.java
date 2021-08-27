package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.io.IOException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot;

public class SupplierAnalysisModel {
	private final IPath modelPath;
	private final StructuralCorrespondenceModel structuralCorrespondenceModel;
	private final SourceCodeRoot sourceCodeRoot;
	private JOANARoot joanaRoot;
	private SecurityCorrespondenceModel securityCorrespondenceModel;

	public SupplierAnalysisModel(SourceCodeRoot sourceCodeModel,
			StructuralCorrespondenceModel structuralCorrespondenceModel, IPath destinationFolder) {
		this.structuralCorrespondenceModel = structuralCorrespondenceModel;
		this.sourceCodeRoot = sourceCodeModel;
		this.modelPath = destinationFolder.append(IPath.SEPARATOR + "model-gen/models.ecore");
	}

	public SourceCodeRoot getSourceCodeModel() {
		return this.sourceCodeRoot;
	}

	public JOANARoot getJoanaModel() {
		return this.joanaRoot;
	}

	public SecurityCorrespondenceModel getSecurityCorrespondenceModel() {
		return this.securityCorrespondenceModel;
	}

	public StructuralCorrespondenceModel getCorrespondenceModel() {
		return this.structuralCorrespondenceModel;
	}

	public IPath getDestinationPath() {
		return this.modelPath;
	}

	public void setJoanaModel(JOANARoot joanaModel) {
		this.joanaRoot = joanaModel;
	}

	public void setSecurityCorrespondendenceModel(SecurityCorrespondenceModel securityCorrespondenceModel) {
		this.securityCorrespondenceModel = securityCorrespondenceModel;
	}

	public void save() {
		EcoreResourceFactoryImpl fac = new EcoreResourceFactoryImpl();
		Resource res = fac.createResource(URI.createFileURI(this.modelPath.toString()));
		res.getContents().add(sourceCodeRoot);
		res.getContents().add(joanaRoot);
		res.getContents().add(structuralCorrespondenceModel);
		res.getContents().add(securityCorrespondenceModel);
		saveResource(res);
	}

	private void saveResource(Resource resource) {
		try {
			resource.save(null);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
