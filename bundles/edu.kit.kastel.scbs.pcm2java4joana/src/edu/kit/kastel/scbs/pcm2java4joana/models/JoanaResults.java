package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.Collection;

import org.eclipse.core.resources.IFile;

import edu.kit.kastel.scbs.pcm2java4joana.backprojection.JoanaResultsParser;
import edu.kit.kastel.scbs.pcm2java4joana.correspondencemodel.StructuralCorrespondenceModel;
import edu.kit.kastel.scbs.pcm2java4joana.exceptions.InputException;
import edu.kit.kastel.scbs.pcm2java4joana.joanasimplifiedresult.Result;

public class JoanaResults {
	private static final String JOANA_RESULT_FILE_ENDING = "joanaresults";

	public static Result createJoanaResultsFromFiles(Collection<IFile> files, StructuralCorrespondenceModel correspondenceModel) throws InputException {
		URI joanaResultsPath = null;

		for (IFile file : files) {
			if (file.getFileExtension().equals(JOANA_RESULT_FILE_ENDING)) {
				joanaResultsPath = file.getLocationURI();
			}
		}

		FileReader fileReader;
		try {
			fileReader = new FileReader(joanaResultsPath.getPath());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new InputException(e.getMessage());
		}

		BufferedReader reader = new BufferedReader(fileReader);
		Result joanaResult;
		try {
			joanaResult = JoanaResultsParser.parseJoanaResults(reader, correspondenceModel);
		} catch (IOException e) {
			e.printStackTrace();
			throw new InputException(e.getMessage());
		}

		return joanaResult;
	}

	public static boolean containsNecessaryFiles(Collection<IFile> files) {
		for (IFile file : files) {
			if (file.getFileExtension().equals(JOANA_RESULT_FILE_ENDING)) {
				return true;
			}
		}

		return false;
	}
}
