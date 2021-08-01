package edu.kit.kastel.scbs.pcm2java4joana.models;

public class FlowRelation {
	private String from;
	private String to;

	public FlowRelation(String from, String to) {
		this.from = from;
		this.to = to;
	}

	public String getFrom() {
		return this.from;
	}

	public String getTo() {
		return this.to;
	}
}
