package edu.kit.kastel.scbs.pcm2java4joana.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class is responsible to provide set operations.
 * 
 * @author Johannes
 *
 */
public final class SetOperations {
	private SetOperations() {

	}

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

	public static <T> boolean isIn(List<T> set1, List<T> set2) {
		if (set1 == null || set2 == null) {
			return false;
		}
		
		for (T o : set1) {
			if (!set2.contains(o)) {
				return false;
			}
		}

		return true;
	}

	public static <T> boolean sameElements(List<T> set1, List<T> set2) {
		if (set1.size() != set2.size()) {
			return false;
		}
		return SetOperations.isIn(set1, set2);
	}

	public static <T> List<T> removeDuplicates(List<T> set) {
		return set.stream().distinct().collect(Collectors.toList());
	}

	public static <T> List<T> without(List<T> set1, List<T> set2) {
		List<T> without = new ArrayList<T>();
		for (T o : set1) {
			if (!set2.contains(o)) {
				without.add(o);
			}
		}
		return without;
	}

	public static <T> List<T> merge(List<T> set1, List<T> set2) {
		set1.addAll(set2);
		return removeDuplicates(set1);
	}
}