package Exception;

/**
 * Created by mingjingtang on 2/23/17.
 */
public class finally_block {
	public static void main(String[] args){
//		final int x = 100;
//		x = 200;

		try{
			//DB Connection --successfully
			//executing some queries
			//validating the data and comparing from website
			//closing connection
//			int[] i = new int[4];
//			i[0] = 100;
//			System.out.println("Close dbconnection in try block");
		}
		catch (Throwable t){
			System.out.println("Error occurred");
		}
		finally {
			System.out.println("Closing the DB Connection");
		}
	}
}
