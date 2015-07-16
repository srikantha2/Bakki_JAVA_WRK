/**
 * 
 */
package com.bakka.poc.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author sbakka
 *
 */
@XmlRootElement(name = "recipients")
@XmlAccessorType(XmlAccessType.FIELD)
public class Recipients {

	
	@XmlElement(required = true, name="recipient")
    private List<Recipient> recps;

	public Recipients(List<String> recps) {
		super();
		this.recps = new ArrayList<Recipient>();
		for(String s: recps){
			this.recps.add(new Recipient(s));
		}
	}
	
	@Override
	public String toString() {
		return "Recipients [recps=" + recps + "]";
	}

	public Recipients() {
		super();
	}

	public List<Recipient> getRecps() {
		return recps;
	}

	public void setRecps(List<Recipient> recps) {
		this.recps = recps;
	}
	
	
	
}
