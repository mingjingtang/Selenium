package Exception;

/**
 * Created by mingjingtang on 2/23/17.
 */
public class test {

	public static void main(String[] args){
		System.out.println("Before try block");
		try {
			System.out.println("Beginning");
			int divide = 10 / 0;
			System.out.println(divide);
		}
		catch (Exception e){
			System.out.println("Error occurred");
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		System.out.println("Ending");
		System.out.println("After try catch block");
	}
}
