/**
 * All rights reserved to JUTILS TEAM
 */
package com.bakki.jutil;

/**
 * @author prakash
 *
 */
public class GreetingUtils {
	
	public static String wishUser(String name){
		return "Welcome Mr."+name;
	}
	
	public String greetTheUser(String uName){
		return GreetingUtils.wishUser(uName);
	}

}
