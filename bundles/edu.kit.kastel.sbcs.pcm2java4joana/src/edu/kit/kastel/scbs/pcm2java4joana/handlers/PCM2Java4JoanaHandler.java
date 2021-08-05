package edu.kit.kastel.scbs.pcm2java4joana.handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import edu.kit.kastel.scbs.pcm2java4joana.modelgenerator.SupplierAnalysisModelGenerator;
import edu.kit.kastel.scbs.pcm2java4joana.models.ClientAnalysisModel;
import edu.kit.kastel.scbs.pcm2java4joana.models.SupplierAnalysisModel;

public class PCM2Java4JoanaHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		Optional<List<IFile>> list = getFilteredList(selection);

		if (!list.isPresent()) {
			return null;
		}
		if (!ClientAnalysisModel.containsNecessaryFiles(list.get())) {

			MessageDialog.openInformation(window.getShell(), "Information", "Not the necessary files");
			return null;
		}

		ClientAnalysisModel models = ClientAnalysisModel.createModelsFromFiles(list.get());
		SupplierAnalysisModelGenerator generator = new SupplierAnalysisModelGenerator(models, models.getBaseFolder());
		SupplierAnalysisModel supplierAnalysisModel = generator.generate();
		supplierAnalysisModel.saveSourceCodeModel();
		supplierAnalysisModel.saveCorrespondenceModel();
		supplierAnalysisModel.saveJoanaModel();

		MessageDialog.openInformation(window.getShell(), "Information", "All files provided");

		return list;
	}

	private Optional<List<IFile>> getFilteredList(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;

			Object[] filesTmp = structuredSelection.toArray();
			List<IFile> files = new ArrayList<IFile>();

			for (int i = 0; i < filesTmp.length; i++) {
				if (filesTmp[i] instanceof IFile) {
					files.add((IFile) filesTmp[i]);
				}
			}

			if (files.size() > 0) {
				return Optional.ofNullable(files);
			}
		}

		return Optional.empty();
	}
}