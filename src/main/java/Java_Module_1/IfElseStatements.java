package Java_Module_1;

/**
 * Created by mingjingtang on 2/15/17.
 */
public class IfElseStatements {
	public static void main(String[] args){
		int num = (int) (Math.random()*20);
		System.out.println(num);

		if(num > 10){
			System.out.println("Number is Greater than 10");
		}
		else if(num <= 10 &&  num >= 5){
			System.out.println("Number is between 10 and 5");
		}
		else{
			System.out.println("Number is less than 10");
		}
	}
}
