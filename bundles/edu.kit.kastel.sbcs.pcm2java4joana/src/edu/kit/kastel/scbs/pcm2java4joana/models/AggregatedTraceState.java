package edu.kit.kastel.scbs.pcm2java4joana.models;

import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.TraceState;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecode.Interface;
import edu.kit.kastel.scbs.pcm2java4joana.utils.SourceCodeModelUtils;

public class AggregatedTraceState {
	private final TraceState baseState;
	private final Interface javaInterface;
	private final boolean isPublicMethod;

	public AggregatedTraceState(TraceState state, Interface javaInterface, boolean isPublicMethod) {
		this.baseState = state;
		this.javaInterface = javaInterface;
		this.isPublicMethod = isPublicMethod;
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
				&& !SourceCodeModelUtils.haveSameSignature(toCompare.getBaseState().getTraceMethod(),
						toCompare.getBaseState().getTraceMethod())) {
			return false;
		}

		return this.baseState.equals(toCompare.getBaseState());
	}
}
