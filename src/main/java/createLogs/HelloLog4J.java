package createLogs;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;

/**
 * Created by mingjingtang on 3/1/17.
 */
public class HelloLog4J {
	/*
	 * Console
	 * File .log
	 * Mail
	 */

	private static final Logger logger = LogManager.getLogger(HelloLog4J.class);

	public static void main(String a[]){

		// import org.apache.logging.log4j.core.LoggerContext;

		LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
		File file = new File("/Users/mingjingtang/IdeaProjects/selenium/src/main/resources/log4j2.xml");

       // this will force a reconfiguration
		context.setConfigLocation(file.toURI());


		logger.debug("Logger Debug");
		logger.info("Logger Info");
		logger.error("Logger Error");
	}
}
