package edu.kit.kastel.scbs.pcm2java4joana.generator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataIdentifying;
import edu.kit.kastel.scbs.confidentiality.data.impl.DataSetImpl;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.scbs.pcm2java4joana.models.ClientAnalysisModel;
import edu.kit.kastel.scbs.pcm2java4joana.models.FlowRelation;
import edu.kit.kastel.scbs.pcm2java4joana.models.SupplierAnalysisModel;
import edu.kit.kastel.scbs.pcm2java4joana.utils.SetOperations;

public class SourceCodeAnnotationsGenerator {
	private SupplierAnalysisModel supplierAnalysisModel;
	private ClientAnalysisModel clientAnalysisModel;

	public SourceCodeAnnotationsGenerator(ClientAnalysisModel clientAnalysisModel,
			SupplierAnalysisModel supplierAnalysisModel) {
		this.supplierAnalysisModel = supplierAnalysisModel;
		this.clientAnalysisModel = clientAnalysisModel;
	}

	public SupplierAnalysisModel annotateSourceWithJoana() {
		ConfidentialitySpecification confidentiality = this.clientAnalysisModel.getConfidentiality();
		List<List<String>> levels = this.generateLevels(confidentiality.getDataIdentifier());
		List<FlowRelation> lattice = this.generateLattice(confidentiality.getParametersAndDataPairs(), levels);
		return this.supplierAnalysisModel;
	}

	private List<List<String>> generateLevels(EList<DataIdentifying> dataset) {
		List<String> levels = new ArrayList<String>();
		for (DataIdentifying level : dataset) {
			if (level.getClass() == DataSetImpl.class) {
				levels.add(((DataSetImpl) level).getName());
			}
		}

		List<List<String>> factorLevels = SetOperations.generatePowerSet(levels);

		return factorLevels;
	}

	private List<FlowRelation> generateLattice(EList<ParametersAndDataPair> parametersAndDataPair,
			List<List<String>> factorLevels) {
		List<FlowRelation> lattice = new ArrayList<FlowRelation>();

		return lattice;
	}
}
