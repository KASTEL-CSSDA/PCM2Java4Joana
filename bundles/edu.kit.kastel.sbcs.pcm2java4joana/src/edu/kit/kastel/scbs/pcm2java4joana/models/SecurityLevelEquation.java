package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.util.ArrayList;
import java.util.Collection;

import edu.kit.kastel.scbs.pcm2java4joana.utils.TraceStateUtils;

public class SecurityLevelEquation {
	private Collection<AggregatedTraceState> predecessors;
	private Collection<AggregatedTraceState> successors;
	private final AggregatedTraceState ownTraceState;
	private String correctSecurityLevel;

	public SecurityLevelEquation(AggregatedTraceState ownTraceState) {
		this.ownTraceState = ownTraceState;
		this.predecessors = new ArrayList<AggregatedTraceState>();
		this.successors = new ArrayList<AggregatedTraceState>();
	}

	public AggregatedTraceState getOwner() {
		return this.ownTraceState;
	}

	public Collection<AggregatedTraceState> getPredecessors() {
		return this.predecessors;
	}

	public Collection<AggregatedTraceState> getSuccessors() {
		return this.successors;
	}

	public String getSecurityLevel() {
		return this.correctSecurityLevel;
	}

	public void setCorrectSecurityLevel(String correctSecurityLevel) {
		this.correctSecurityLevel = correctSecurityLevel;
	}

	public void addPredecessors(Collection<AggregatedTraceState> states) {
		for (AggregatedTraceState state : states) {
			this.addPredecessor(state);
		}
	}

	public void addPredecessor(AggregatedTraceState traceState) {
		if (!TraceStateUtils.containsTraceState(this.predecessors, traceState)) {
			this.predecessors.add(traceState);
		}
	}

	public void addSuccessors(Collection<AggregatedTraceState> states) {
		for (AggregatedTraceState state : states) {
			this.addSuccessor(state);
		}
	}

	public void addSuccessor(AggregatedTraceState traceState) {
		if (!TraceStateUtils.containsTraceState(this.successors, traceState)) {
			this.successors.add(traceState);
		}
	}
}
