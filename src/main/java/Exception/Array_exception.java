package Exception;

/**
 * Created by mingjingtang on 2/23/17.
 */
public class Array_exception {
	public static void main(String[] args){
		System.out.println("Beginning");
		try{
			int[] i = new int[4];
			i[5] = 100;

			Thread.sleep(1000);
		}
		catch (Exception e){
			System.out.println("Error occurred");
			//screenshot
			//send mail attached screenshot and print error message
			//in mail subject
			e.printStackTrace();
		}

		System.out.println("Ending");

	}
}
