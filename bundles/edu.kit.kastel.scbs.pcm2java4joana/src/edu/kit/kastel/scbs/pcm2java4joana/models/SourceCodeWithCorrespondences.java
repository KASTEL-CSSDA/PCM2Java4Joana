package edu.kit.kastel.scbs.pcm2java4joana.models;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.SourceCodeRoot;

public class SourceCodeWithCorrespondences {
	private final SourceCodeRoot sourceCodeModel;
	private final StructuralCorrespondenceModel structuralCorrespondenceModel;

	public SourceCodeWithCorrespondences(SourceCodeRoot root, StructuralCorrespondenceModel correspondenceModel) {
		this.sourceCodeModel = root;
		this.structuralCorrespondenceModel = correspondenceModel;
	}

	public SourceCodeRoot getSourceCodeModel() {
		return this.sourceCodeModel;
	}

	public StructuralCorrespondenceModel getStructuralCorrespondenceModel() {
		return this.structuralCorrespondenceModel;
	}
}
