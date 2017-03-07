package Java_Collections;

import java.util.Hashtable;

/**
 * Created by mingjingtang on 3/1/17.
 */
public class testHashtable {
	public static void main(String[] args){
		Hashtable<String, String> ht = new Hashtable<String,String>();
		ht.put("name","Raman");
		ht.put("location","Delhi");
		ht.put("course","Selenium");

		//over write the course
		ht.put("course","QTP");

		System.out.println(ht.get("location"));
		System.out.println(ht.get("course"));
	}
}
