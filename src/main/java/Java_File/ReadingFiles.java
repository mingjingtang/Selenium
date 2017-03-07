package Java_File;

import java.io.*;

/**
 * Created by mingjingtang on 2/26/17.
 */
public class ReadingFiles {
	public static void main(String[] args) throws IOException {

		//connecting Streams
		File f = new File("/Users/mingjingtang/IdeaProjects/selenium/src/main/resources/myTextFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);

		//read text file
//		System.out.println(reader.readLine());
//		System.out.println(reader.readLine());

		String line = null;
		while((line = reader.readLine())!=null){
			System.out.println(line);
		}

		reader.close();

	}
}
