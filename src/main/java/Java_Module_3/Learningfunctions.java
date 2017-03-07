package Java_Module_3;

/**
 * Created by mingjingtang on 2/21/17.
 */
public class Learningfunctions {
	public static int a = 30;
	public static int b = 20;



	public static void print(){
		System.out.println("Learning Functions");
	}

	public static void addNumbers(){
		int c = a+ b;
		System.out.println("Additiong of two numbers are: "+ c);
	}

	public static int addNumbers(int r, int s){
		int add = r + s;
//		System.out.println("Addtion of two numbers are: "+ add);
		return add;
	}

	public static void main(String[] args){
		print();
		addNumbers();
		int res = addNumbers(30, 40);
		System.out.println(res);
	}
}
