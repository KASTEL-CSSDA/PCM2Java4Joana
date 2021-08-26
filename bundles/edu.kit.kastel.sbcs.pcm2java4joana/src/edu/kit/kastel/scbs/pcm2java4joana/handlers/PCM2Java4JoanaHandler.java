package edu.kit.kastel.scbs.pcm2java4joana.handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.internal.xtend.util.Triplet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
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
			MessageDialog.openInformation(window.getShell(), "Information", "Not the necessary files");
			return null;
		}

		ClientAnalysisModel models = ClientAnalysisModel.createModelsFromFiles(list);
		SupplierAnalysisModelGenerator generator = new SupplierAnalysisModelGenerator(models, models.getBaseFolder());
		SupplierAnalysisModel supplierAnalysisModel = generator.generate();

		List<Triplet<String, String, String>> generatedAnnotatedSourceCode = SupplierAnalysisModel2AnnotatedCodeGenerator
				.generateAnnotatedCode(supplierAnalysisModel.getSourceCodeRoot(), supplierAnalysisModel.getJoanaRoot());
		AnnotatedSourceCode annotatedSourceCode = new AnnotatedSourceCode(models.getBaseFolder(),
				generatedAnnotatedSourceCode);

		supplierAnalysisModel.saveSourceCodeModel();
//		supplierAnalysisModel.saveCorrespondenceModel();
//		supplierAnalysisModel.saveJoanaModel();
		annotatedSourceCode.save();

		MessageDialog.openInformation(window.getShell(), "Information",
				"Generation of annotated Source Code was successful!");

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
}