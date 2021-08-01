package edu.kit.kastel.scbs.pcm2java4joana.models;

import org.eclipse.emf.ecore.EClassifier;

public class SourceCodeElementWithCorrespondenceModel<T> {
	private T sourceCodeModelElement;
	private CorrespondenceModel correspondenceModel;

	public SourceCodeElementWithCorrespondenceModel(T element, CorrespondenceModel correspondenceModel) {
		this.sourceCodeModelElement = element;
		this.correspondenceModel = correspondenceModel;
	}

	public T getSourceCodeElement() {
		return this.sourceCodeModelElement;
	}

	public CorrespondenceModel getCorrespondenceModel() {
		return this.correspondenceModel;
	}
}
