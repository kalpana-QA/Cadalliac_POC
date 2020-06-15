package com.tripmasters.framework.reports;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logs {
	private static Logger Log;
	// static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(" ");
	// Initialize Log4j logs
	public Logs() {
		Log = Logger.getLogger(Logs.class.getName());
		PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/resources/log4j.properties");
	}

	// This is to print log at the starting of the test case
	public void startTestCase(String sTestCaseName) {

		Log.info("*******************          " + sTestCaseName + "      " + "-S-T-A-R-T-E-D-" + "  ****************************************");

	}

	// This is to print log for the ending of the test case
	public void endTestCase(String sTestCaseName) {

		Log.info("XXXXXXXXXXXXXXXXXXXXXXX           " + sTestCaseName + "    " + "-E---N---D-" + "             XXXXXXXXXXXXXXXXXXXXXX");

	}

	public static void info(String message) {
		 Log.info(message);
	}

	public void warn(String message) {

		Log.warn(message);

	}

	public static void error(String message) {

		Log.error(message);

	}

	public void fatal(String message) {

		Log.fatal(message);

	}

	public void debug(String message) {

		Log.debug(message);

	}

}
