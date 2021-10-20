package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.util.List;

import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;

public class EquationTraceState {
	private AggregatedTraceState baseState;
	private boolean isPublic;
	private List<SecurityLevel> securityLevel;
	private List<EquationTraceState> predecessors;
	private List<EquationTraceState> successors;

	public EquationTraceState(AggregatedTraceState baseState, List<SecurityLevel> securityLevel) {
		this.baseState = baseState;
		this.isPublic = baseState.isPublicMethod();
	}

	public EquationTraceState(AggregatedTraceState baseState, List<SecurityLevel> securityLevel,
			List<EquationTraceState> predecessors, List<EquationTraceState> successors) {
		this(baseState, securityLevel);
		this.predecessors = predecessors;
		this.successors = successors;
	}

	public List<SecurityLevel> getSecurityLevel() {
		return this.securityLevel;
	}
}
