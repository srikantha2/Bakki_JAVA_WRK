package com.bakka.form;

import java.util.HashMap;
import java.util.Map;

public class ReloadPropVO {

	private Map<String, String> propMap = new HashMap<String, String>();
	private String attribute;
	

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public Map<String, String> getPropMap() {
		return propMap;
	}

	public void setPropMap(Map<String, String> propMap) {
		this.propMap = propMap;
	}

}
