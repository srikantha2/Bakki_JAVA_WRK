/**
 * 
 */
package com.bakka.poc.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author sbakka
 *
 */
@XmlRootElement(name = "recipient")
@XmlAccessorType(XmlAccessType.FIELD)
public class Recipient {
	
	@XmlElement(name = "email")
	private String email;

	 public Recipient() {
			super();
		}
	
    public Recipient(String email) {
		super();
		this.email = email;
	}

	@Override
	public String toString() {
		return "Recipient [email=" + email + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
