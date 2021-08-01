package edu.kit.kastel.scbs.pcm2java4joana.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CorrespondenceModel {
	private List<String[]> corresponds;
	private Map<String, CorrespondenceModel> children;
	private String key;

	public CorrespondenceModel(String key) {
		this.key = key;
		this.corresponds = new ArrayList<String[]>();
		this.children = new HashMap<String, CorrespondenceModel>();
	}

	public String getKey() {
		return this.key;
	}

	public List<String[]> getCorresponds() {
		return this.corresponds;
	}

	public Map<String, CorrespondenceModel> getChildren() {
		return this.children;
	}

	public void addCorrespondingSet(String[] correspondingSet) {
		this.corresponds.add(correspondingSet);
	}

	public void addChild(CorrespondenceModel child) {
		this.children.put(child.getKey(), child);
	}
}
