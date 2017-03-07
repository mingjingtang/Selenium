package Java_File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by mingjingtang on 2/24/17.
 */
public class WritingFiles {

	public static void main(String[] args) throws IOException {

		//stream connectivity
		// /Users/mingjingtang/IdeaProjects/selenium/src/main
		File f = new File("/Users/mingjingtang/IdeaProjects/selenium/src/main/resources/myTextFile.html");
		FileWriter fw = new FileWriter(f, false);
		BufferedWriter writer = new BufferedWriter(fw);

		//writing inside the File
		/*for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				int num = (int)(Math.random() *100);
				writer.write(num + ",");
			}
			writer.newLine();
		}
		*/


//		writer.newLine();
//		writer.write("first Line");
//		writer.newLine();
//		writer.write("India");
//		writer.newLine();
//		writer.write("Way2Automation");
//		writer.newLine();
//		writer.write("Raman");

		writer.write("<html> <body> <title>Way2Automation</title><h1>Learning Java from Way2Automation.com</h1></body> </html>");

		//closing stream
		writer.close();
		System.out.println("File Created !!!");


	}

}
