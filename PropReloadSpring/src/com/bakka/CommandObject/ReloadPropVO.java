/**
 * 
 */
package com.bakka.CommandObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sbakka
 *
 */
public class ReloadPropVO {
	
	private Map<String,String> propMap= new HashMap<String, String>();

	/**
	 * @return the propMap
	 */
	public Map<String, String> getPropMap() {
		return propMap;
	}

	/**
	 * @param propMap the propMap to set
	 */
	public void setPropMap(Map<String, String> propMap) {
		this.propMap = propMap;
	}

}
