package Java_Collections;

import java.util.ArrayList;

/**
 * Created by mingjingtang on 2/28/17.
 */
public class testArraylist {
	public static void main(String[] args){
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("first");//0
		myList.add("second");//1
		myList.add("third");//2

		System.out.println(myList.get(2));
		System.out.println(myList.size());

		for(int i = 0; i < myList.size(); i++){
			System.out.println(myList.get(i));
		}

	}
}
