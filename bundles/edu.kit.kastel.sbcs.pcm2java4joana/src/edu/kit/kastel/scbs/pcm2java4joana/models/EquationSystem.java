package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.util.ArrayList;
import java.util.Collection;

import edu.kit.kastel.scbs.pcm2java4joana.utils.TraceStateUtils;

public class EquationSystem {
	private Collection<SecurityLevelEquation> equations;

	public EquationSystem() {
		this.equations = new ArrayList<SecurityLevelEquation>();
	}

	public void addEquation(SecurityLevelEquation equation) {
		SecurityLevelEquation existingEquation = TraceStateUtils.getEquationByOwner(this.equations,
				equation.getOwner());
		if (existingEquation == null) {
			equations.add(equation);
		} else {
			existingEquation.addPredecessors(equation.getPredecessors());
			existingEquation.addSuccessors(equation.getSuccessors());
		}
	}

	public Collection<SecurityLevelEquation> getEquations() {
		return this.equations;
	}

	public void solve() {
	}
}
