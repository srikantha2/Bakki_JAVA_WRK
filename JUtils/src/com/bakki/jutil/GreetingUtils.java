/**
 * All rights reserved to JUTILS TEAM
 */
package com.bakki.jutil;

import org.apache.log4j.Logger;

/**
 * @author prakash
 *
 */
public class GreetingUtils {
	static final Logger logger = Logger.getLogger(GreetingUtils.class.getName());
	
	public static String wishUser(String name){
		logger.debug("Welcome to Mr."+name);
		return "Welcome Mr."+name;
	}
	
	public String greetTheUser(String uName){
		return TimeUtils.getDayMode()+GreetingUtils.wishUser(uName);
	}

}
