package edu.kit.kastel.scbs.pcm2java4joana.modelgenerator;

import org.eclipse.core.runtime.IPath;

import edu.kit.kastel.scbs.pcm2java4joana.models.ClientAnalysisModel;
import edu.kit.kastel.scbs.pcm2java4joana.models.SourceCodeWithCorrespondences;
import edu.kit.kastel.scbs.pcm2java4joana.models.SupplierAnalysisModel;

/**
 * This class first generates the source code and second the joana model which are combined the supplier analysis model.
 * 
 * @author Johannes
 *
 */
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

		SourceCodeWithCorrespondences sourceCodeModel = sourceCodeGenerator
				.generateSourceCodeModelWithCorrespondenceModel();

		SupplierAnalysisModel supplierAnalysisModel = new SupplierAnalysisModel(sourceCodeModel.getSourceCodeModel(),
				sourceCodeModel.getStructuralCorrespondenceModel(), this.destinationFolder);

		AnnotationModelGenerator annotationsModelGenerator = new AnnotationModelGenerator(this.models,
				supplierAnalysisModel);
		supplierAnalysisModel = annotationsModelGenerator.generateJoanaModel();

		return supplierAnalysisModel;
	}
}
