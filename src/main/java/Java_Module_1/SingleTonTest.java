package Java_Module_1;

/**
 * Created by mingjingtang on 2/16/17.
 */
public class SingleTonTest {

	private static SingleTonTest instance = new SingleTonTest();

	private SingleTonTest(){
		System.out.println("Creating object");
	}

	public static SingleTonTest getInstance(){
		return instance;
	}

	public static void main(String[] args){
		SingleTonTest s1 = SingleTonTest.getInstance();
		SingleTonTest s2 = SingleTonTest.getInstance();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
	}
}
