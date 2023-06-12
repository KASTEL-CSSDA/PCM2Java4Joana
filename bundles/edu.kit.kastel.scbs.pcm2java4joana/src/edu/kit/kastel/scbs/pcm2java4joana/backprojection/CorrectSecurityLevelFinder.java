package edu.kit.kastel.scbs.pcm2java4joana.backprojection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.exceptions.InputException;
import edu.kit.kastel.scbs.pcm2java4joana.joana.SecurityLevel;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Result;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Trace;
import edu.kit.kastel.scbs.pcm2java4joana.models.AggregatedTraceState;
import edu.kit.kastel.scbs.pcm2java4joana.models.EquationSystem;
import edu.kit.kastel.scbs.pcm2java4joana.models.SecurityLevelEquation;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.utils.CorrespondenceModelUtils;
import edu.kit.kastel.scbs.pcm2java4joana.utils.JoanaModelUtils;
import edu.kit.kastel.scbs.pcm2java4joana.utils.SetOperations;

/**
 * This class is used to determine the new security levels based on the joana results.
 * 
 * @author Johannes
 *
 */
public final class CorrectSecurityLevelFinder {
	private CorrectSecurityLevelFinder() {

	}

	/**
	 * The joana results are transformed into an equation system. 
	 * Each trace state with an method which is in the structural correspondence model is the base of a security level equation.
	 * The methods are compared based on the name, parameters, return type and the interface not the component.
	 * An equation consists of the public trace state as the base and the neighbor trace states as successors and predecessors.
	 * If a predecessor or successor is also a public trace state, a reference to it is used.
	 * The advantage is that if in the solver algorithm the security level of a trace state is changed, it is changed in all equations.
	 * The new security levels are determined with the solver method of the equation system.
	 * 
	 * @param structuralCorrespondenceModel
	 * @param securityCorrespondenceModel
	 * @param result
	 * @return
	 * @throws InputException
	 */
	public static EquationSystem findCorrectSecurityLevel(StructuralCorrespondenceModel structuralCorrespondenceModel,
			SecurityCorrespondenceModel securityCorrespondenceModel, Result result) throws InputException {
		boolean invalidFlowsWithoutPublicAction = false;
		EquationSystem equationSystem = new EquationSystem();

		List<SecurityLevel> securityLevels = CorrespondenceModelUtils.getSecurityLevels(securityCorrespondenceModel);
		List<List<SecurityLevel>> allSecurityLevels = SetOperations.generatePowerSet(securityLevels);

		List<AggregatedTraceState> publicStates = new ArrayList<AggregatedTraceState>();
		for (Trace trace : result.getTrace()) {

			List<Integer> publicMethodsPositions = CorrespondenceModelUtils
					.findPublicMethodPositions(structuralCorrespondenceModel, trace);
			if (publicMethodsPositions.size() == 0) {
				invalidFlowsWithoutPublicAction = true;
				break;
			}

			for (Integer position : publicMethodsPositions) {
				List<SecurityLevel> level = JoanaModelUtils.resolveToSecurityLevels(
						trace.getTracestate().get(position).getSecurityLevelName(), allSecurityLevels);
				AggregatedTraceState aggregatedTraceState = new AggregatedTraceState(
						trace.getTracestate().get(position), CorrespondenceModelUtils.getInterfaceForTraceState(
								structuralCorrespondenceModel, trace.getTracestate().get(position)),
						true, level);
				if (!publicStates.contains(aggregatedTraceState)) {
					publicStates.add(aggregatedTraceState);
				}
			}
		}

		if (invalidFlowsWithoutPublicAction) {
			throw new InputException("Die Ergebnisse enthalten Methoden die zu keiner Komponentenschnittstelle gehört");
		}

		for (Trace trace : result.getTrace()) {
			Collection<Integer> publicMethodsPositions = CorrespondenceModelUtils
					.findPublicMethodPositions(structuralCorrespondenceModel, trace);
			for (Integer position : publicMethodsPositions) {
				List<SecurityLevel> level = JoanaModelUtils.resolveToSecurityLevels(
						trace.getTracestate().get(position).getSecurityLevelName(), allSecurityLevels);				
				AggregatedTraceState aggregatedTraceState = new AggregatedTraceState(
						trace.getTracestate().get(position), CorrespondenceModelUtils.getInterfaceForTraceState(
								structuralCorrespondenceModel, trace.getTracestate().get(position)),
						true, level);
				SecurityLevelEquation equation = new SecurityLevelEquation(
						getState(aggregatedTraceState, publicStates));
				if (position > 0) {
					boolean isPredecessorPublic = publicMethodsPositions.contains(position - 1);
					List<SecurityLevel> predecessorLevel = JoanaModelUtils.resolveToSecurityLevels(
							trace.getTracestate().get(position - 1).getSecurityLevelName(), allSecurityLevels);
					AggregatedTraceState predecessor = new AggregatedTraceState(trace.getTracestate().get(position - 1),
							CorrespondenceModelUtils.getInterfaceForTraceState(structuralCorrespondenceModel,
									trace.getTracestate().get(position - 1)),
							isPredecessorPublic, predecessorLevel);
					equation.addPredecessor(getState(predecessor, publicStates));
				}
				if (position < trace.getTracestate().size() - 1) {
					boolean isSuccessorPublic = publicMethodsPositions.contains(position + 1);
					List<SecurityLevel> successorLevel = JoanaModelUtils.resolveToSecurityLevels(
							trace.getTracestate().get(position + 1).getSecurityLevelName(), allSecurityLevels);
					AggregatedTraceState successor;
					if (isSuccessorPublic) {
						successor = new AggregatedTraceState(trace.getTracestate().get(position + 1),
								CorrespondenceModelUtils.getInterfaceForTraceState(structuralCorrespondenceModel,
										trace.getTracestate().get(position + 1)),
								isSuccessorPublic, successorLevel);
					} else {
						successor = new AggregatedTraceState(trace.getTracestate().get(position + 1), null,
								isSuccessorPublic, successorLevel);
					}

					equation.addSuccessor(getState(successor, publicStates));
				}
				equationSystem.addEquation(equation);
			}
		}
		
		equationSystem.solve(allSecurityLevels);

		return equationSystem;
	}
	
	private static AggregatedTraceState getState(AggregatedTraceState state, List<AggregatedTraceState> states) {
		for (AggregatedTraceState publicState : states) {
			if (publicState.equals(state)) {
				return publicState;
			}
		}
		return state;
	}
}
