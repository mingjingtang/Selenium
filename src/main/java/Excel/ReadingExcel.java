package Excel;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by mingjingtang on 2/27/17.
 */
public class ReadingExcel {
	public static void main(String[] args) throws IOException, InvalidFormatException {
		File f = new File("/Users/mingjingtang/IdeaProjects/selenium/src/main/resources/myExcelFile.xlsx");
		FileInputStream fi = new FileInputStream(f);

		Workbook workbook = WorkbookFactory.create(fi);
		Sheet sheet0 = workbook.getSheetAt(0);
	/*
		Row row0 = sheet0.getRow(0);
		Cell cellA = row0.getCell(0);

		System.out.println(cellA);
	*/

		for(Row row : sheet0){
			for(Cell cell: row){
				switch (cell.getCellType()){
					case Cell.CELL_TYPE_STRING:
						System.out.print(cell.getStringCellValue() +"\t");
						break;
					case Cell.CELL_TYPE_NUMERIC:
						if(cell.getNumericCellValue() < 10) {
							System.out.print(cell.getNumericCellValue() + "\t\t");
							break;
						}
						else{
							System.out.print(cell.getNumericCellValue()+"\t");
							break;
						}

					case Cell.CELL_TYPE_BLANK:
						System.out.print("Blank cell" + "\t");
						break;
				}
			}
			System.out.println();
		}


		fi.close();
	}
}
