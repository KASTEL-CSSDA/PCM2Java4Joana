package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import edu.kit.kastel.scbs.pcm2java4joana.joana.JOANARoot;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot;

public class SupplierAnalysisModel {
	private Resource sourceCodeModel;
	private Resource joanaModel;
	private Resource correspondenceModel;
	private IPath destinationFolder;
	private SourceCodeRoot sourceCodeRoot;
	private JOANARoot joanaRoot;

	public SupplierAnalysisModel(Resource sourceCodeModel, Resource correspondenceModel, IPath destinationFolder) {
		this.sourceCodeModel = sourceCodeModel;
		this.correspondenceModel = correspondenceModel;
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
		joanaResource.getContents().add(joanaModel);
		this.joanaRoot = joanaModel;
		this.joanaModel = joanaResource;
	}

	public void saveSourceCodeModel() {
		Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
		try {
			this.sourceCodeModel.save(saveOptions);
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
			this.correspondenceModel.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
