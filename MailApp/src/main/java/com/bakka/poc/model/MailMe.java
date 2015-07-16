/**
 * 
 */
package com.bakka.poc.model;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections.FactoryUtils;
import org.apache.commons.collections.list.LazyList;
/**
 * @author sbakka
 *
 */
public class MailMe {
	
	private String body;
	private String subject;
	private String email1;
	private String email2;
	private List<String> recipients = LazyList.decorate(new ArrayList<String>(),
		      FactoryUtils.instantiateFactory(MailMe.class));
	
	
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSubject() {
		return subject;
	}
	
	@Override
	public String toString() {
		return "MailMe [body=" + body + ", subject=" + subject + ", email1="
				+ email1 + ", email2=" + email2 + ", recipients=" + recipients
				+ "]";
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public List<String> getRecipients() {
		return recipients;
	}
	public void setRecipients(List<String> recipients) {
		this.recipients = recipients;
	}

}