package edu.kit.kastel.scbs.pcm2java4joana.utils;

import edu.kit.kastel.scbs.confidentiality.ConfidentialitySpecification;
import edu.kit.kastel.scbs.confidentiality.adversary.Adversaries;
import edu.kit.kastel.scbs.confidentiality.adversary.Adversary;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;

public final class ConfidentialityModelUtils {
	private ConfidentialityModelUtils() {

	}

	public static Adversary getAdversary(Adversaries adversaries, String adversaryId) {
		for (Adversary adversary : adversaries.getAdversaries()) {
			if (adversary.getId().equals(adversaryId)) {
				return adversary;
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
