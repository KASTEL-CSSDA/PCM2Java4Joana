package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.util.List;

import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;
import edu.kit.kastel.scbs.pcm2java4joana.utils.SourceCodeModelUtils;

public class AggregatedTraceState {
	private final TraceState baseState;
	private final Interface javaInterface;
	private final boolean isPublicMethod;
	private List<SecurityLevel> securityLevel;

	public AggregatedTraceState(TraceState state, Interface javaInterface, boolean isPublicMethod,
			List<SecurityLevel> securityLevel) {
		this.baseState = state;
		this.javaInterface = javaInterface;
		this.isPublicMethod = isPublicMethod;
		this.securityLevel = securityLevel;
	}

	public TraceState getBaseState() {
		return this.baseState;
	}

	public Interface getInterface() {
		return this.javaInterface;
	}

	public boolean isPublicMethod() {
		return this.isPublicMethod;
	}

	public List<SecurityLevel> getSecurityLevel() {
		return this.securityLevel;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		if (!(obj instanceof AggregatedTraceState)) {
			return false;
		}

		AggregatedTraceState toCompare = (AggregatedTraceState) obj;
		if (this.isPublicMethod != toCompare.isPublicMethod && !this.javaInterface.equals(toCompare.getInterface())
				&& !SourceCodeModelUtils.haveSameSignature(toCompare.getBaseState().getResultmethod(),
						toCompare.getBaseState().getResultmethod())) {
			return false;
		}

		return this.baseState.equals(toCompare.getBaseState());
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
