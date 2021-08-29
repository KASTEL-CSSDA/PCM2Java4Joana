package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.utils.TraceStateUtils;

public class SecurityLevelEquation {
	private Collection<AggregatedTraceState> predecessors;
	private Collection<AggregatedTraceState> successors;
	private final AggregatedTraceState ownTraceState;
	private List<SecurityLevel> correctSecurityLevel;

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

	// Basic case means if it has no public successors or predecessors
	public boolean isBasicCase() {
		for (AggregatedTraceState predecessor : predecessors) {
			if (predecessor.isPublicMethod()) {
				return false;
			}
		}
		for (AggregatedTraceState successor : successors) {
			if (successor.isPublicMethod()) {
				return false;
			}
		}
		return true;
	}

	public List<SecurityLevel> getSecurityLevel() {
		return this.correctSecurityLevel;
	}

	public void setCorrectSecurityLevel(List<SecurityLevel> correctSecurityLevel) {
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

	public int howManySolved(List<SecurityLevel> level) {
		int solved = 0;

		for (AggregatedTraceState state : predecessors) {
			if (state.getSecurityLevel().containsAll(level)) {
				solved += 1;
			}
		}

		for (AggregatedTraceState state : successors) {
			if (level.containsAll(state.getSecurityLevel())) {
				solved += 1;
			}
		}

		return solved;
	}
}
