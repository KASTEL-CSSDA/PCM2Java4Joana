package edu.kit.kastel.scbs.pcm2java4joana.utils;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.data.DataIdentifying;
import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;

public final class ConfidentialityModelUtils {
	private ConfidentialityModelUtils() {

	}

	public static DataSet getDataset(ConfidentialitySpecification specification, String datasetId) {
		for (DataIdentifying adversary : specification.getDataIdentifier()) {
			if (adversary.getId().equals(datasetId)) {
				return (DataSet) adversary;
			}
		}

		return null;
	}

	public static ParametersAndDataPair getParamersAndDataPair(ConfidentialitySpecification confidentiality,
			String id) {
		for (ParametersAndDataPair parametersAndDataPair : confidentiality.getParametersAndDataPairs()) {
			if (parametersAndDataPair.getId().equals(id)) {
				return parametersAndDataPair;
			}
		}

		return null;
	}
}
