package Java_Collections;

import java.util.Hashtable;

/**
 * Created by mingjingtang on 3/1/17.
 */
public class testHashTable1 {
	public static void main(String[] args){
		Hashtable<String, String> ht1 = new Hashtable<String, String>();
		ht1.put("Course1", "Selenium");
		ht1.put("Course2", "QTP");

		Hashtable<String, String> ht2 = new Hashtable<String, String>();
		ht2.put("location1","delhi");
		ht2.put("location2","mumbai");

		Hashtable<String, Hashtable<String,String>> ht = new Hashtable<String, Hashtable<String, String>>();
		ht.put("institute",ht1);
		ht.put("country",ht2);
		System.out.println(ht.get("institute").get("Course1"));
		System.out.println(ht.get("country").get("location1"));
	}
}
