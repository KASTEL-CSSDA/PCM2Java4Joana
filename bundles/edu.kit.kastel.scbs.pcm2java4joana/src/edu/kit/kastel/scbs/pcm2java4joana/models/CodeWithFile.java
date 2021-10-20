package edu.kit.kastel.scbs.pcm2java4joana.models;

public class CodeWithFile {
	private final String sourceCode;
	private final String file;

	public CodeWithFile(String sourceCode, String file) {
		this.sourceCode = sourceCode;
		this.file = file;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public String getFile() {
		return this.file;
	}
}
