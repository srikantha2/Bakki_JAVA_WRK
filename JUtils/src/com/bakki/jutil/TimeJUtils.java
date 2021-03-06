/**
 * 
 */
package com.bakki.jutil;

import java.util.Date;

import org.apache.log4j.Logger;

/**
 * @author prakash
 *
 */
public class TimeJUtils {
	
	static final Logger logger = Logger.getLogger(TimeJUtils.class.getName());

	@SuppressWarnings("deprecation")
	public static String getDayMode(){
		
		Date date= new Date();
		logger.info("Today is "+date);
		if(date.getHours()>=17)
			return "Good Evening,";
		else if(date.getHours()>=12)
			return "Good Afternoon,";
		else if(date.getHours()<12)
			return "Good Morning,";
		else
			return "";
	}
	
	public String presentMode(){
		return TimeJUtils.getDayMode();
	}

}
