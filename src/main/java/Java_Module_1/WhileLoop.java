package Java_Module_1;

/**
 * Created by mingjingtang on 2/15/17.
 */
public class WhileLoop {
	public static void main(String[] args){
		/*
		 * loops are not statements --> they are nto terminated but exits
		 * entry criteria --> loop condition must be true
		 * exist criteria --> loop condition is false
		 */


		int i = 12;
		do{
			System.out.println(i);
			i++;
		}
//		while(i <= 10){
//			System.out.println(i);
//			i++;
//		}
		while(i<=10);
		System.out.println(i);
		System.out.println("after loop");
	}
}
