package com.bakka.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet to handle dynamic logging functions.
 * @author 
 */
public class UpdateLogger extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Serve up the jsp file that does all the work to change the Log4J settings
	 * such as modify the logging level for each logger or create a new logger.
	 */
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException{
		Logger logger = Logger.getLogger(UpdateLogger.class); // use default/root logger

		try {
			RequestDispatcher rd = getServletContext().getRequestDispatcher(
					"/WEB-INF/jsp/log4j.jsp");
			rd.forward(req, res);
			return;
		} catch (FileNotFoundException fnfe) {
			logger.error("Cannot find log4j.jsp", fnfe);
			return;
		} catch (IOException e) {
			logger.error("Error opening log4j.jsp", e);
			return;
		}
	}

}
