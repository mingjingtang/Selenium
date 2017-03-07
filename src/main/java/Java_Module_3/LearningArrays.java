package Java_Module_3;

/**
 * Created by mingjingtang on 2/21/17.
 */
public class LearningArrays {
	public static void main(String[] args){
		int emp1 = 5000;
		int emp2 = 6000;

		int emp10 = 1000;

		int[] salary;
		salary = new int[10];

		String month[] = {"Jan","Feb","March"};
		System.out.println(month[0]);
		System.out.println(month.length);
		for(int i = 0; i < month.length; i++){
			System.out.println(month[i]);
		}
	}
}
