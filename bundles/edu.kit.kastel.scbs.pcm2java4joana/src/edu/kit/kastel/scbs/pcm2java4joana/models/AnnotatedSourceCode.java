package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.eclipse.core.runtime.IPath;

import edu.kit.kastel.scbs.pcm2java4joana.exceptions.CodeSaveException;

public class AnnotatedSourceCode {
	private IPath destinationFolder;
	private List<CodeWithFile> contentForFiles;

	public AnnotatedSourceCode(IPath destinatioFolder, List<CodeWithFile> contentForFiles) {
		this.destinationFolder = destinatioFolder.append("src-gen");
		this.contentForFiles = contentForFiles;
	}

	public IPath getDestinationPath() {
		return this.destinationFolder;
	}

	public List<CodeWithFile> getContentForFiles() {
		return contentForFiles;
	}

	public void save() throws CodeSaveException {
		String folder = this.destinationFolder.toString() + IPath.SEPARATOR;
		(new File(folder)).mkdirs();

		for (CodeWithFile contentForFile : this.contentForFiles) {
			String filePath = folder + contentForFile.getFile();
			File file = new File(filePath);
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
					throw new CodeSaveException(e.getMessage());
				}
			}

			try {
				PrintWriter writer = new PrintWriter(file);
				writer.print(contentForFile.getSourceCode());
				writer.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				throw new CodeSaveException(e.getMessage());
			}
		}
	}
}
