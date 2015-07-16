/**
 * 
 */
package com.bakka.poc.web;

/**
 * @author sbakka
 *
 */

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bakka.poc.model.MailMe;
import com.bakka.poc.model.MailXMl;
import com.bakka.poc.util.MessageSender;

@Controller
@RequestMapping(value = "/showInfo.html")
public class SendMailController {

	@Autowired
	private ApplicationContext appContext;
	
	 private static List<String> contacts = new ArrayList<String>();
	 
	static {
		for( int i=0;i<5;i++){
			contacts.add("");
		}
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewMailInfo(Map<String, Object> model) {
		System.out.println("I'm here in get method");
		MailMe mailMe = new MailMe();
		
		mailMe.setRecipients(contacts);
		model.put("mailMe", mailMe);
		System.out.println(mailMe);
		return "showInfo";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processEmailService(@ModelAttribute("mailMe") MailMe mailInfo, 
			Map<String, Object> model) throws JAXBException {
		List <String> contacts =  mailInfo.getRecipients();
		if(null != contacts && contacts.size() > 0) {
            SendMailController.contacts = contacts;
            for (String contact : contacts) {
                System.out.printf( contact);
            }
        }
		// implement your own logic here to send message to Active MQ
		
		 // MessageSender messageSender = (MessageSender) appContext.getBean("messageSender");
		  //JSON Object VIA Active MQ
		  /*Map<String,String> message = new HashMap<String,String>();
		  message.put("Body",  mailInfo.getBody());
		  message.put("Subject", mailInfo.getSubject());
		  message.put("Email1", mailInfo.getEmail1());
		  message.put("Email2", mailInfo.getEmail2());
		  messageSender.send(message);*/

		  //XML VIA Active MQ
		  MailXMl mXml= generateXMlMessage(mailInfo);
		  JAXBContext jaxbContext = JAXBContext.newInstance(MailXMl.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		    java.io.StringWriter sw = new StringWriter();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	 
			jaxbMarshaller.marshal(mXml, System.out);
			jaxbMarshaller.marshal(mXml, sw);

			
		  
		// for testing purpose:
/*		System.out.println("Body: " + mailInfo.getBody());
		System.out.println("Subject: " + mailInfo.getSubject());
		System.out.println("Email1:: " + mailInfo.getEmail1());
		System.out.println("Email2: " + mailInfo.getEmail2());
*/		MessageSender messageSender = (MessageSender) appContext.getBean("messageSender");
		// messageSender.send(mpp.getMyMessg());
		 messageSender.send(sw.toString());
		return "mailSuccess";
	}
	
	private MailXMl generateXMlMessage(MailMe mailInfo) {
		MailXMl mXml= new MailXMl(mailInfo.getBody(), mailInfo.getSubject(), mailInfo.getRecipients());
		System.out.println("Generated Email  Message: " + mXml.toString());
       return  mXml;
	}
}
