package edu.kit.kastel.scbs.pcm2java4joana.backprojection;

import java.util.Collection;

import edu.kit.kastel.scbs.confidentiality.data.DataSet;
import edu.kit.kastel.scbs.confidentiality.repository.ParametersAndDataPair;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.models.ClientAnalysisModel;
import edu.kit.kastel.scbs.pcm2java4joana.models.EquationSystem;
import edu.kit.kastel.scbs.pcm2java4joana.models.SecurityLevelEquation;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.ParametersAndDataPair2Annotation;
import edu.kit.kastel.scbs.pcm2java4joana.securitycorrespondencemodel.SecurityCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.utils.ConfidentialityModelUtils;
import edu.kit.kastel.scbs.pcm2java4joana.utils.CorrespondenceModelUtils;

/** 
 * This class is used to update the client analysis model with the solved equation system. 
 * First, the ParametersAndDataPairs corresponding to the trace state are determined.
 * Second, the determined security levels saved in the equations of the equation system are resolved to conf4cbse datasets.
 * Third, the conf4cbse datasets are set to be tbe data targets of the corresponding ParametersAndDataPair
 * 
 * @author Johannes
 */
public final class ClientAnalysisModelUpdater {
	private ClientAnalysisModelUpdater() {

	}

	/** Updates the client analysis model based on the solved equation system
	 * 
	 * @param clientAnalysisModel
	 * @param structuralCorrespondenceModel
	 * @param securityCorrespondenceModel
	 * @param solvedEquationSystem has to be solved
	 */
	public static void adaptClientAnalysisModel(ClientAnalysisModel clientAnalysisModel,
			StructuralCorrespondenceModel structuralCorrespondenceModel,
			SecurityCorrespondenceModel securityCorrespondenceModel, EquationSystem solvedEquationSystem) {

		for (SecurityLevelEquation equation : solvedEquationSystem.getEquations()) {
			ParametersAndDataPair2Annotation pair2Annotation = CorrespondenceModelUtils
					.getParamtersAndDataPairAnnotationCorrespondence(securityCorrespondenceModel,
							equation.getOwner().getBaseState());
			Collection<DataSet> datasets = CorrespondenceModelUtils.resolveSecurityLevelToDataSets(
					securityCorrespondenceModel, clientAnalysisModel.getConfidentiality(),
					equation.getCorrectSecurityLevel());
			if (pair2Annotation == null || datasets.size() == 0) {
				continue;
			}
			ParametersAndDataPair parametersAndDataPairs = ConfidentialityModelUtils.getParamersAndDataPair(
					clientAnalysisModel.getConfidentiality(),
					pair2Annotation.getConf4cbseparametersanddatapair().getId());
			parametersAndDataPairs.getDataTargets().clear();
			parametersAndDataPairs.getDataTargets().addAll(datasets);
		}
	}
}
