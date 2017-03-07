package Java_Compile;

/**
 * Created by mingjingtang on 3/1/17.
 */
public class SingleTonTest {
	private static SingleTonTest instance = new SingleTonTest();

	private SingleTonTest(){
 		System.out.println("Creating Object");

	}
	public static SingleTonTest getInstance(){
		return instance;
	}
}
