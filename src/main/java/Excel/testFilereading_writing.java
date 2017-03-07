package Excel;

import java.io.*;

/**
 * Created by mingjingtang on 2/27/17.
 */
public class testFilereading_writing {
	public static void main(String[] args) throws IOException {
/*
		//create a file
		File file = new File("/Users/mingjingtang/IdeaProjects/selenium/src/main/resources/test.txt");
		file.createNewFile();

		//write inside a file
		FileWriter fw = new FileWriter("/Users/mingjingtang/IdeaProjects/selenium/src/main/resources/test.txt");
		BufferedWriter filewriter = new BufferedWriter(fw);

		filewriter.write("Please write inside this file");
		filewriter.newLine();
		filewriter.write("This is my second line");
		filewriter.flush();
*/
		//read from a file
		FileReader fr = new FileReader("/Users/mingjingtang/IdeaProjects/selenium/src/main/resources/test.txt");
		BufferedReader filereader = new BufferedReader(fr);

//		System.out.println(filereader.readLine());
//		System.out.println(filereader.readLine());
//		System.out.println(filereader.readLine());

		String i =  "";
		while ((i = filereader.readLine()) != null){
			System.out.println(i);
		}
	}

}
