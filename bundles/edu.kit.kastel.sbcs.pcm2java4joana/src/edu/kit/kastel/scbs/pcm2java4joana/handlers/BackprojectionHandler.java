package edu.kit.kastel.scbs.pcm2java4joana.handlers;

import java.util.Collection;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import edu.kit.kastel.scbs.pcm2java4joana.backprojection.ClientAnalysisModelUpdater;
import edu.kit.kastel.scbs.pcm2java4joana.backprojection.CorrectSecurityLevelFinder;
import edu.kit.kastel.scbs.pcm2java4joana.exceptions.InputException;
import edu.kit.kastel.scbs.pcm2java4joana.exceptions.ModelSaveException;
import edu.kit.kastel.scbs.pcm2java4joana.exceptions.RefreshException;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Result;
import edu.kit.kastel.scbs.pcm2java4joana.models.ClientAnalysisModel;
import edu.kit.kastel.scbs.pcm2java4joana.models.CorrespondenceModels;
import edu.kit.kastel.scbs.pcm2java4joana.models.EquationSystem;
import edu.kit.kastel.scbs.pcm2java4joana.models.JoanaResults;
import edu.kit.kastel.scbs.pcm2java4joana.utils.InputUtils;

public class BackprojectionHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		Collection<IFile> list = InputUtils.getFilteredList(selection);

		if (!ClientAnalysisModel.containsNecessaryFiles(list) || !JoanaResults.containsNecessaryFiles(list)
				|| !CorrespondenceModels.containsNecessaryFiles(list)) {
			MessageDialog.openError(window.getShell(), "Error",
					"Es wurden nicht alle Dateien angegeben. *.adversary, *.confidentiality und *.repository, *.joanaresults und model.ecore werden benötigt");
			return null;
		}

		Result result;
		ClientAnalysisModel clientAnalysisModel;
		CorrespondenceModels correspondenceModels;

		try {
			result = JoanaResults.createJoanaResultsFromFiles(list);
			clientAnalysisModel = ClientAnalysisModel.createModelsFromFiles(list);
			correspondenceModels = CorrespondenceModels.createCorrespondenceModelsFromFile(list);
		} catch (InputException e) {
			MessageDialog.openError(window.getShell(), "Error",
					"Die JOANA Ergebnisse, das Client Analyse Modell und die Korrespondenzenmodelle konnten nicht eingelesen werden");
			return null;
		}

		EquationSystem equationSystem;

		try {
			equationSystem = CorrectSecurityLevelFinder.findCorrectSecurityLevel(
					correspondenceModels.getStructuralCorrespondenceModel(),
					correspondenceModels.getSecurityCorrespondenceModel(), result);
		} catch (InputException e) {
			MessageDialog.openError(window.getShell(), "Error",
					"Es gab Probleme beim Bestimmen des richtigen Sicherheitslevels.");
			return null;
		}

		ClientAnalysisModelUpdater.adaptClientAnalysisModel(clientAnalysisModel,
				correspondenceModels.getStructuralCorrespondenceModel(),
				correspondenceModels.getSecurityCorrespondenceModel(), equationSystem);

		try {
			clientAnalysisModel.updateConfidentialityModel();
		} catch (ModelSaveException e) {
			MessageDialog.openError(window.getShell(), "Error",
					"Das geupdatete Confidentiality Model konnte nicht gespeichert werden.");
		}

		try {
			this.refreshProject(clientAnalysisModel.getBaseFolder());
		} catch (RefreshException e) {
			MessageDialog.openWarning(window.getShell(), "Warning",
					"Das Projekt konnte nicht automatisch aktuallisiert werden. Bitte aktualisieren Sie das Projekt noch einmal manuell.");
		}
		MessageDialog.openInformation(window.getShell(), "Information",
				"Das Client Analyse Modell wurde erfolgreich mit korrekteren Security Levels angepasst! \n Für das Gleichungssystem wurde ein Score von "
						+ equationSystem.getScore() + "erreicht.");

		return null;
	}

	private void refreshProject(IPath projectPath) throws RefreshException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		try {
			IProjectDescription description = workspace.loadProjectDescription(projectPath.append(".project"));
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
			project.open(null);
			project.refreshLocal(3, null);
		} catch (CoreException e) {
			e.printStackTrace();
			throw new RefreshException(e.getMessage());
		}
	}
}
