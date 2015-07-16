/**
 * 
 */
package com.bakka.poc.util;
import org.springframework.jms.core.JmsTemplate;

/**
 * @author sbakka
 *
 */
public class MessageSender {
	
	private JmsTemplate jmsTemplate;

	 public void setJmsTemplate(JmsTemplate jmsTemplate) {
	  this.jmsTemplate = jmsTemplate;
	 }

	 public void send(final Object Object) {
	  jmsTemplate.convertAndSend(Object);
	 }

}
