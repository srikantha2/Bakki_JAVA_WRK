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
@XmlRootElement(name = "email")
@XmlAccessorType(XmlAccessType.FIELD)
public class MailXMl  {
	
	
	  public MailXMl() {
			super();
			
		}
	
    public MailXMl(String body, String subject,  List<String> recips) {
		super();
		this.ErrorsTo="errors@test.com";
		this.fromEmail="subsriptions@test.com";
		this.fromName="Test Inc";

		this.body = body;
		this.subject = subject;
	/*	this.email1 = email1;
		this.email2 = email2;
	*/	
		List<String> l = new ArrayList<String>();

		for(String s: recips){
		if(s!=null && s.trim().length()>0)
			l.add(s);
		}
		this.recipients= new Recipients(l);
	}

	
	@XmlElement(required = true)
    private String body;

	@XmlElement(required = true, name="recipients")
    private Recipients recipients;
	
    @XmlElement(name = "subject")
    private String subject;

    
   /* private String email1;

    
    private String email2;*/

    @XmlElement(name = "from_name")
    private String fromName;

    @XmlElement(name = "from_email")
    private String fromEmail;
    
    @XmlElement(name = "errors_to")
    private String ErrorsTo;
    
    
     

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSubject() {
		return subject;
	}

	public Recipients getRecipients() {
		return recipients;
	}

	public void setRecipients(Recipients recipients) {
		this.recipients = recipients;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	

	public String getFromName() {
		return fromName;
	}

	@Override
	public String toString() {
		return "MailXMl [body=" + body + ", recipients=" + recipients
				+ ", subject=" + subject + ", fromName=" + fromName
				+ ", fromEmail=" + fromEmail + ", ErrorsTo=" + ErrorsTo + "]";
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getErrorsTo() {
		return ErrorsTo;
	}

	public void setErrorsTo(String errorsTo) {
		ErrorsTo = errorsTo;
	}


	

}
		
