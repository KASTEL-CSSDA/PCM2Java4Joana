package edu.kit.kastel.scbs.pcm2java4joana.generator;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.resource.Resource;

import edu.kit.kastel.scbs.pcm2java4joana.models.ClientAnalysisModel;
import edu.kit.kastel.scbs.pcm2java4joana.models.SourceCodeElementWithCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.models.SupplierAnalysisModel;

public class SupplierAnalysisModelGenerator {
	private ClientAnalysisModel models;
	private IPath destinationFolder;

	public SupplierAnalysisModelGenerator(ClientAnalysisModel models, IPath destinationFolder) {
		this.models = models;
		this.destinationFolder = destinationFolder;
	}

	public SupplierAnalysisModel generate() {
		SourceCodeModelWithCorrespondenceModelGenerator sourceCodeGenerator = new SourceCodeModelWithCorrespondenceModelGenerator(
				models.getRepository(), this.destinationFolder);

		SourceCodeElementWithCorrespondenceModel<Resource> sourceCodeModel = sourceCodeGenerator
				.generateSourceCodeModelWithCorrespondenceModel();

		SupplierAnalysisModel supplierAnalysisModel = new SupplierAnalysisModel(sourceCodeModel.getSourceCodeElement(),
				sourceCodeModel.getCorrespondenceModel(), this.destinationFolder);

		SourceCodeAnnotationsGenerator sourceCodeAnnotationsGenerator = new SourceCodeAnnotationsGenerator(this.models,
				supplierAnalysisModel);
		supplierAnalysisModel = sourceCodeAnnotationsGenerator.annotateSourceWithJoana();

		return supplierAnalysisModel;
	}
}
