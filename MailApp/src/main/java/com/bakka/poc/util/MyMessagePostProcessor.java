/**
 * 
 */
package com.bakka.poc.util;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.Message;

import org.springframework.jms.core.MessagePostProcessor;

/**
 * @author sbakka
 *
 */
public class MyMessagePostProcessor implements MessagePostProcessor {
	
	private String myMessg="";

	/* (non-Javadoc)
	 * @see org.springframework.jms.core.MessagePostProcessor#postProcessMessage(javax.jms.Message)
	 */
	@Override
	public Message postProcessMessage(Message message)
			throws JMSException {
		if (message instanceof BytesMessage) {
			BytesMessage messageBody = (BytesMessage) message;
			// message is in write mode, close & reset to start of byte
			// stream
			messageBody.reset();
			Long length = messageBody.getBodyLength();
			System.out.println("***** MESSAGE LENGTH is {} bytes"
					+ length);
			byte[] byteMyMessage = new byte[length.intValue()];
			int red = messageBody.readBytes(byteMyMessage);
			System.out
					.println("***** SENDING MESSAGE - \n<!-- MSG START -->\n{}\n<!-- MSG END -->"
							+ new String(byteMyMessage));
			myMessg= new String(byteMyMessage);
		}
		
		return message;
	}

	public String getMyMessg() {
		return myMessg;
	}

	public void setMyMessg(String myMessg) {
		this.myMessg = myMessg;
	}

}
