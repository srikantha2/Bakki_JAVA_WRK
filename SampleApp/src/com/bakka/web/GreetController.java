package com.bakka.web;
 
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bakka.temp.Test;

 
/*
 * author: SB
 * 
 */
 
@Controller
public class GreetController {
	static final Logger logger = Logger.getLogger(GreetController.class.getName());

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		Test t = new Test();
		t.printing();
		String message = "<br><div style='text-align:center;'>"
				+ "<h2>Welcome, </h2>This message is coming from GreetController.java </div><br><br>";
		logger.debug(message);
		return new ModelAndView("welcome", "message", message);
	}
}