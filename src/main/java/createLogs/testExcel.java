package createLogs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;

/**
 * Created by mingjingtang on 2/28/17.
 *
 */
public class testExcel {
	private static final Logger log = LogManager.getLogger(testExcel.class);

	public static void main(String[] args) {
		// import org.apache.logging.log4j.core.LoggerContext;

		LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
		File file = new File("/Users/mingjingtang/IdeaProjects/selenium/src/main/resources/log4j2.xml");

		// this will force a reconfiguration
		context.setConfigLocation(file.toURI());

		//read excel file
		ExcelReader excel = new ExcelReader("/Users/mingjingtang/Documents/testdata.xlsx");
		String sheetName = "trainer";

		log.debug("Getting the row count");
		System.out.println(excel.getRowCount(sheetName));

		log.debug("Getting the column count");
		System.out.println(excel.getColumnCount(sheetName));

		log.debug("Getting the data");
		System.out.println(excel.getCellData(sheetName,"username",2));

		log.debug("Entering the data");
		System.out.println(excel.setCellData(sheetName,"username",4, "Ishita"));
	}

}
