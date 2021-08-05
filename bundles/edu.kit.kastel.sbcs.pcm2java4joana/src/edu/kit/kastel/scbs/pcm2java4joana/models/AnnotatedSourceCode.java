package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.internal.xtend.util.Triplet;

public class AnnotatedSourceCode {
	private IPath destinationFolder;
	private List<Triplet<String, String, String>> contentForFiles;

	public AnnotatedSourceCode(IPath destinatioFolder, List<Triplet<String, String, String>> contentForFiles) {
		this.destinationFolder = destinatioFolder;
		this.contentForFiles = contentForFiles;
	}

	public List<Triplet<String, String, String>> getContentForFiles() {
		return contentForFiles;
	}

	public void save() {
		String folder = this.destinationFolder.toString() + IPath.SEPARATOR + "GeneratedModels" + IPath.SEPARATOR
				+ "GeneratedCode" + IPath.SEPARATOR;
		(new File(folder)).mkdirs();

		for (Triplet<String, String, String> contentForFile : this.contentForFiles) {
			String filePath = folder + contentForFile.getSecond();
			File file = new File(filePath);
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			try {
				PrintWriter writer = new PrintWriter(file);
				writer.print(contentForFile.getFirst());
				writer.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}
