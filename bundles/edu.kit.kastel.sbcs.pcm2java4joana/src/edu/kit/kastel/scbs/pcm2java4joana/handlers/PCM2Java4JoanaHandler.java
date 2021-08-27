package edu.kit.kastel.scbs.pcm2java4joana.handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
import org.eclipse.internal.xtend.util.Triplet;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import edu.kit.kastel.scbs.pcm2java4joana.modelgenerator.SupplierAnalysisModelGenerator;
import edu.kit.kastel.scbs.pcm2java4joana.models.AnnotatedSourceCode;
import edu.kit.kastel.scbs.pcm2java4joana.models.ClientAnalysisModel;
import edu.kit.kastel.scbs.pcm2java4joana.models.SupplierAnalysisModel;
import edu.kit.kastel.scbs.pcm2java4joana.sourcecodegenerator.SupplierAnalysisModel2AnnotatedCodeGenerator;

public class PCM2Java4JoanaHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		List<IFile> list = getFilteredList(selection);

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
		}

		ClientAnalysisModel models = ClientAnalysisModel.createModelsFromFiles(list);

		IPath basePath;
		if (!savingPath.equals("")) {
			basePath = new Path(savingPath);
		} else {
			basePath = models.getBaseFolder();
		}

		SupplierAnalysisModelGenerator generator = new SupplierAnalysisModelGenerator(models, basePath);
		SupplierAnalysisModel supplierAnalysisModel = generator.generate();

		List<Triplet<String, String, String>> generatedAnnotatedSourceCode = SupplierAnalysisModel2AnnotatedCodeGenerator
				.generateAnnotatedCode(supplierAnalysisModel.getSourceCodeModel(),
						supplierAnalysisModel.getJoanaModel());
		AnnotatedSourceCode annotatedSourceCode = new AnnotatedSourceCode(basePath, generatedAnnotatedSourceCode);

		supplierAnalysisModel.save();
		annotatedSourceCode.save();
		this.refreshProject(models.getBaseFolder());

		MessageDialog.openInformation(window.getShell(), "Information",
				"Die Generation der Modelle und des Quellcodes war erfolgreich. \n " + "Speicherort Modelle: "
						+ supplierAnalysisModel.getDestinationPath().toString() + "\n" + "Speicherort Quellcode: "
						+ annotatedSourceCode.getDestinationPath().toString());

		return list;
	}

	@SuppressWarnings("unchecked")
	private List<IFile> getFilteredList(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;

			return (List<IFile>) structuredSelection.toList().stream().filter(file -> file instanceof IFile)
					.map(IFile.class::cast).collect(Collectors.toList());
		}
		return new ArrayList<IFile>();
	}

	private void refreshProject(IPath projectPath) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		try {
			IProjectDescription description = workspace.loadProjectDescription(projectPath.append(".project"));
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
			project.open(null);
			project.refreshLocal(1, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}