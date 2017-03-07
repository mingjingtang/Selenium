package Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by mingjingtang on 2/27/17.
 */
public class WritingExcel {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("firstSheet");
/*		Row row0 = sheet0.createRow(1);

		Cell cellA = row0.createCell(1);
		Cell cellB = row0.createCell(2);

		cellA.setCellValue("first cell");
		cellB.setCellValue("second cell");
*/

		for(int rows = 0; rows < 10; rows++){
			Row row = sheet0.createRow(rows);
			for(int cols = 0; cols < 10; cols++){
				Cell cell = row.createCell(cols);
				cell.setCellValue((int)(Math.random()*100));
			}
		}


		//connecting streams
		File f = new File("/Users/mingjingtang/IdeaProjects/selenium/src/main/resources/myExcelFile.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		workbook.write(fo);

		//closing the streams
		fo.close();

		System.out.println("File Created!");
	}
}
