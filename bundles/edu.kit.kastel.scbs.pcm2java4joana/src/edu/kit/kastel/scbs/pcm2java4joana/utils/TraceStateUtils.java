package edu.kit.kastel.scbs.pcm2java4joana.utils;

import java.util.Collection;

import edu.kit.kastel.scbs.pcm2java4joana.models.AggregatedTraceState;
import edu.kit.kastel.scbs.pcm2java4joana.models.SecurityLevelEquation;

public final class TraceStateUtils {
	private TraceStateUtils() {

	}

	public static boolean containsTraceState(Collection<AggregatedTraceState> states, AggregatedTraceState state) {
		for (AggregatedTraceState existingState : states) {
			if (existingState.equals(state)) {
				return true;
			}
		}
		return false;
	}

	public static SecurityLevelEquation getEquationByOwner(Collection<SecurityLevelEquation> equations,
			AggregatedTraceState state) {
		for (SecurityLevelEquation equation : equations) {
			if (equation.getOwner().equals(state)) {
				return equation;
			}
		}
		return null;
	}
}
