/**
 * Re-loadable Logging which goes with SPring time-scheduler-to load log4j properties
 * this will reset if any dynamic changes in log levels
 */
package com.bakka.util;

import java.io.File;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import javax.xml.parsers.FactoryConfigurationError;
import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.RollingFileAppender;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.stereotype.Component;

/**
 * @author Prakash
 *
 */
@Component("reloadableLogging")
public class ReloadableLogging {

	/**
	 * 
	 */
	public AtomicInteger i = new AtomicInteger(0);

	public ReloadableLogging() {
		System.out.println("Inside ReloadableLogging Constructor");
	}

	public static final String NEW_LINE = "\n";

	public synchronized void configure() throws FactoryConfigurationError {

		System.out.println("Inside config" + i.addAndGet(1));
		StringBuffer sbTrace = new StringBuffer();

		sbTrace.append("Initializing log4j logging.");

		try {
			initialize(sbTrace);
			URL baseConfigUrl = this.getClass().getClassLoader()
					.getResource("log4j-base.xml");
			DOMConfigurator.configure(baseConfigUrl);
			HashSet appenders = new HashSet();
			HashMap cachedAppenders = new HashMap();
			// root logger
			updateAppenders(LogManager.getRootLogger(), true, appenders,
					cachedAppenders, sbTrace);
			// user defined loggers
			Enumeration e2 = LogManager.getLoggerRepository()
					.getCurrentLoggers();
			while (e2.hasMoreElements()) {
				Logger l = (Logger) e2.nextElement();
				updateAppenders(l, false, appenders, cachedAppenders, sbTrace);
			}

			closeAllOldAppenders(appenders);
		} catch (Throwable e) {
			System.out.println("log4j refresh resulted in the message : "
					+ sbTrace.toString());
			throw new RuntimeException(e);
		}
	}

	private void initialize(StringBuffer sbTrace) {

		sbTrace.append(NEW_LINE).append("Populating variables.");
		String env = "Sample App";

		// Create directories if not yet present
		if (!(new File("c:\\MyLogs")).exists()) {
			(new File("c:\\MyLogs")).mkdir();
		}
		sbTrace.append(NEW_LINE).append("env : ").append(env);
	}

	private void updateAppenders(Logger logger, boolean rootLogger,
			HashSet appenders, HashMap cachedAppenders, StringBuffer sbTrace) {
		Enumeration e = logger.getAllAppenders();

		while (e.hasMoreElements()) {
			sbTrace.append(NEW_LINE).append("Logger being updated is ")
					.append(logger.getName());
			sbTrace.append(" ").append(logger.getAdditivity());

			Appender a = (Appender) e.nextElement();
			updateAppender(logger, a, rootLogger, appenders, cachedAppenders,
					sbTrace);

			sbTrace.append(" Additivity name is ").append(a.getName());
		}

	}

	private void updateAppender(Logger logger, Appender a, boolean rootLogger,
			HashSet appenders, HashMap cachedAppenders, StringBuffer sbTrace) {

		if (!(a instanceof RollingFileAppender)) {
			return;
		}

		if (a == null || a.getName() == null) {
			if (rootLogger) {
				LogManager.getRootLogger().removeAppender(a);
			} else {
				LogManager.getLogger(logger.getName()).removeAppender(a);
			}
			return;
		}
		try {
			FileAppender fileAppender = (FileAppender) a;

			Appender a2 = null;

			if (cachedAppenders.containsKey(a.getName())) {
				a2 = (Appender) cachedAppenders.get(a.getName());
			} else {
				a2 = LUtils
						.setRollingFileAppenderProperties((RollingFileAppender) fileAppender);
				cachedAppenders.put(a.getName(), a2);
			}

			if (rootLogger) {
				LogManager.getRootLogger().removeAppender(a);
				LogManager.getRootLogger().addAppender(a2);
			} else {
				LogManager.getLogger(logger.getName()).removeAppender(a);
				LogManager.getLogger(logger.getName()).addAppender(a2);
			}
			appenders.add(a);
		} catch (Throwable e) {
			e.printStackTrace();
			sbTrace.append("Error occurred is : " + e);
		}

	}

	private void closeAllOldAppenders(HashSet appendersList) {
		Iterator it = appendersList.iterator();
		while (it.hasNext()) {
			FileAppender fileAppender = (FileAppender) it.next();
			String fileName = fileAppender.getFile();
			fileAppender.close();
			if (fileName != null) {
				File file = new File(fileName);
			}
		}
	}

}
