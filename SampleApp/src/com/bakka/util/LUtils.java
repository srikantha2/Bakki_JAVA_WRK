/*
 * Utility class for Log4J functionality.
 * author: SB
 */
package com.bakka.util;

import org.apache.log4j.RollingFileAppender;


public class LUtils {

	public static RollingFileAppender setRollingFileAppenderProperties(
			RollingFileAppender a) {

		RollingFileAppender a2 = new RollingFileAppender();
		a2.setLayout(a.getLayout());

		String file = a.getFile();
		if (file != null) {
			a2.setFile(file);
		}

		a2.setMaxBackupIndex(a.getMaxBackupIndex());
		a2.setImmediateFlush(a.getImmediateFlush());
		a2.setBufferedIO(a.getBufferedIO());
		a2.setBufferSize(a.getBufferSize());
		a2.setAppend(a.getAppend());

		a2.setMaxFileSize(String.valueOf(a.getMaximumFileSize()));
		a2.setMaximumFileSize(a.getMaximumFileSize());
		a2.activateOptions(); 
		return a2;
	}
}
