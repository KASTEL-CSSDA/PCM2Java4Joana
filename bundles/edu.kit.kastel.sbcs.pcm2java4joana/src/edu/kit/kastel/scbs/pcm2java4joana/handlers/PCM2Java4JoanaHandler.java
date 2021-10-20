package edu.kit.kastel.scbs.pcm2java4joana.handlers;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import edu.kit.kastel.scbs.pcm2java4joana.exceptions.CodeSaveException;
import edu.kit.kastel.scbs.pcm2java4joana.exceptions.InputException;
import edu.kit.kastel.scbs.pcm2java4joana.exceptions.ModelSaveException;
import edu.kit.kastel.scbs.pcm2java4joana.exceptions.RefreshException;
import edu.kit.kastel.scbs.pcm2java4joana.modelgenerator.SupplierAnalysisModelGenerator;
import edu.kit.kastel.scbs.pcm2java4joana.models.AnnotatedSourceCode;
import edu.kit.kastel.scbs.pcm2java4joana.models.ClientAnalysisModel;
import edu.kit.kastel.scbs.pcm2java4joana.models.CodeWithFile;
import edu.kit.kastel.scbs.pcm2java4joana.models.SupplierAnalysisModel;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator.SupplierAnalysisModel2AnnotatedCodeGenerator;
import edu.kit.kastel.scbs.pcm2java4joana.utils.InputUtils;

/**
 * This class is the handler for the plugin which is used to trigger the supplier analysis model generation.
 * 
 * @author Johannes
 *
 */
public class PCM2Java4JoanaHandler extends AbstractHandler {

	/**
	 * This method is the entry point for the generation handler.
	 * To use the handler, the adversary, confidentiality, and repository files have to be selected.
	 */
	@Override
	public Object execute(ExecutionEvent event) {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		Collection<IFile> list = InputUtils.getFilteredList(selection);

		if (!ClientAnalysisModel.containsNecessaryFiles(list)) {
			MessageDialog.openInformation(window.getShell(), "Information",
					"Es wurden nicht alle Dateien angegeben. *.adversary, *.confidentiality und *.repository werden benötigt");
			return null;
		}

		String savingPath = "";
		InputDialog dlg = new InputDialog(window.getShell(), "Choose saving location",
				"Geben Sie den Speicherort für das generierte Modell und den Quellcode an. Wenn Sie keinen Pfad angeben, wird der aktuelle Projektstandort verwendet.",
				"", null);
		if (dlg.open() == Window.OK) {
			savingPath = dlg.getValue().trim();
		} else {
			MessageDialog.openInformation(window.getShell(), "Information",
					"Der Generations-Prozess wurde abgebrochen.");
			return null;
		}

		ClientAnalysisModel models;
		try {
			models = ClientAnalysisModel.createModelsFromFiles(list);
		} catch (InputException e1) {
			MessageDialog.openError(window.getShell(), "Error",
					"Die drei Modelle adversary, confidentiality und repository konnten nicht eingelesen werden.");
			return null;
		}

		IPath basePath;
		if (!savingPath.equals("")) {
			basePath = new Path(savingPath);
		} else {
			basePath = models.getBaseFolder();
		}

		SupplierAnalysisModelGenerator generator = new SupplierAnalysisModelGenerator(models, basePath);
		SupplierAnalysisModel supplierAnalysisModel = generator.generate();

		List<CodeWithFile> generatedAnnotatedSourceCode = SupplierAnalysisModel2AnnotatedCodeGenerator
				.generateAnnotatedCode(supplierAnalysisModel.getSourceCodeModel(),
						supplierAnalysisModel.getJoanaModel(), basePath);
		AnnotatedSourceCode annotatedSourceCode = new AnnotatedSourceCode(basePath, generatedAnnotatedSourceCode);

		try {
			supplierAnalysisModel.save();
		} catch (ModelSaveException e1) {
			MessageDialog.openError(window.getShell(), "Error",
					"Die generierten Modelle, Source Code Modell, Joana Modell, Struktur-Korrespondenzenmodell und Sicherheits-Korrespondenzenmodell konnten nicht gespeichert werden.");
			return null;
		}
		try {
			annotatedSourceCode.save();
		} catch (CodeSaveException e1) {
			MessageDialog.openError(window.getShell(), "Error",
					"Der generierte Quellcode konnte nicht gespeichert werden.");
			return null;
		}
		try {
			this.refreshProject(models.getBaseFolder());
		} catch (RefreshException e) {
			MessageDialog.openWarning(window.getShell(), "Warning",
					"Das Projekt konnte nicht automatisch aktuallisiert werden. Bitte aktualisieren Sie das Projekt noch einmal manuell.");
		}
		MessageDialog.openInformation(window.getShell(), "Information",
				"Die Generation der Modelle und des Quellcodes war erfolgreich. \n " + "Speicherort Modelle: \n"
						+ supplierAnalysisModel.getDestinationPath().toString() + "\n" + "Speicherort Quellcode: \n"
						+ annotatedSourceCode.getDestinationPath().toString());

		return list;
	}

	private void refreshProject(IPath projectPath) throws RefreshException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		try {
			IProjectDescription description = workspace.loadProjectDescription(projectPath.append(".project"));
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
			project.open(null);
			project.refreshLocal(1, null);
		} catch (CoreException e) {
			e.printStackTrace();
			throw new RefreshException(e.getMessage());
		}
	}
}