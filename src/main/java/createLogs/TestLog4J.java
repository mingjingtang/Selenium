package createLogs;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;

/**
 * Created by mingjingtang on 3/1/17.
 */
public class TestLog4J {

	private static Logger log = LogManager.getLogger(TestLog4J.class);

	public static void main(String[] args){

		// import org.apache.logging.log4j.core.LoggerContext;

		LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
		File file = new File("/Users/mingjingtang/IdeaProjects/selenium/src/main/resources/log4j2.xml");

		// this will force a reconfiguration
		context.setConfigLocation(file.toURI());

		log.debug("This is a debug Log");
		log.info("This is a info Log");
		log.error("Error in a Project");
	}
}
