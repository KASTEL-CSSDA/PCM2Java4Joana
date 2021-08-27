package edu.kit.kastel.scbs.pcm2java4joana.backprojection;

import java.util.Collection;

import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Result;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Trace;
import edu.kit.kastel.scbs.pcm2java4joana.models.AggregatedTraceState;
import edu.kit.kastel.scbs.pcm2java4joana.models.EquationSystem;
import edu.kit.kastel.scbs.pcm2java4joana.models.SecurityLevelEquation;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.utils.CorrespondenceModelUtils;

public class CorrectSecurityLevelFinder {
	public void findCorrectSecurityLevel(StructuralCorrespondenceModel structuralCorrespondenceModel,
			SecurityCorrespondenceModel securityCorrespondenceModel, Result result) {
		boolean invalidFlowsWithoutPublicAction = false;
		EquationSystem equationSystem = new EquationSystem();

		for (Trace trace : result.getTrace()) {
			Collection<Integer> publicMethodsPositions = CorrespondenceModelUtils
					.findPublicMethodPositions(structuralCorrespondenceModel, trace);
			if (publicMethodsPositions.size() == 0) {
				invalidFlowsWithoutPublicAction = true;
				break;
			}

			for (Integer position : publicMethodsPositions) {
				AggregatedTraceState aggregatedTraceState = new AggregatedTraceState(
						trace.getTracestate().get(position), CorrespondenceModelUtils.getInterfaceForTraceState(
								structuralCorrespondenceModel, trace.getTracestate().get(position)),
						true);
				SecurityLevelEquation equation = new SecurityLevelEquation(aggregatedTraceState);
				if (position > 0) {
					boolean isPredecessorPublic = publicMethodsPositions.contains(position - 1);
					AggregatedTraceState predecessor = new AggregatedTraceState(trace.getTracestate().get(position - 1),
							CorrespondenceModelUtils.getInterfaceForTraceState(structuralCorrespondenceModel,
									trace.getTracestate().get(position - 1)),
							isPredecessorPublic);
					equation.addPredecessor(predecessor);
				}
				if (position < trace.getTracestate().size() - 1) {
					boolean isSuccessorPublic = publicMethodsPositions.contains(position + 1);
					AggregatedTraceState successor = new AggregatedTraceState(trace.getTracestate().get(position + 1),
							CorrespondenceModelUtils.getInterfaceForTraceState(structuralCorrespondenceModel,
									trace.getTracestate().get(position + 1)),
							isSuccessorPublic);
					equation.addPredecessor(successor);
				}
				equationSystem.addEquation(equation);
			}
		}

		if (invalidFlowsWithoutPublicAction) {
			return; // TODO: Do some crazy stuff here
		}

		equationSystem.solve();
	}

}
