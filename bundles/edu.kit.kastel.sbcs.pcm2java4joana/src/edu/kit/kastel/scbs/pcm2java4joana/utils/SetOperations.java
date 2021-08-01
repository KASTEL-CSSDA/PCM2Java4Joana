package edu.kit.kastel.scbs.pcm2java4joana.utils;

import java.util.ArrayList;
import java.util.List;

public class SetOperations {
	public static <T> List<List<T>> generatePowerSet(List<T> set) {
		List<List<T>> powerSet = new ArrayList<List<T>>();
		SetOperations.generatePowerSet(set, 0, new ArrayList<T>(), powerSet);
		return powerSet;
	}

	private static <T> void generatePowerSet(List<T> set, int index, List<T> taken, List<List<T>> result) {
		if (index == set.size()) {
			result.add(taken);
		} else {
			SetOperations.generatePowerSet(set, index + 1, taken, result);
			List<T> copy = new ArrayList<T>(taken);
			copy.add(set.get(index));
			SetOperations.generatePowerSet(set, index + 1, copy, result);
		}
	}
}
