package Java_Compile;

/**
 * Created by mingjingtang on 3/1/17.
 */
public class ComparisonTest {
	public static void main(String[] args){
		// == object reference same address
		//.equals same content


		String name1 = "Way2Automation";
		String name2 = "Way2Automation";

		String name_1 = new String("Raman");
		String name_2 = new String("Raman");

		int x = 100;
		int y = 100;

//		System.out.println(name1 == name2); //True
//		System.out.println(name1.equals(name2)); //True
//
//		System.out.println(x == y);
//
//		System.out.println(name_1.equals(name_2)); // True
//		System.out.println(name_1 == name_2); // False

		SingleTonTest s1 = SingleTonTest.getInstance();
		SingleTonTest s2 = SingleTonTest.getInstance();

		//s1 and s2 have the same address
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
	}
}
