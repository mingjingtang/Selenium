package Java_Module_1;

/**
 * Created by mingjingtang on 2/15/17.
 */
public class Calculators {
	public static void main(String[] args){
		int a = 10;
		int b = 2;

		Calculators c = new Calculators();
		System.out.println(c.add(a, b));// arguments
		System.out.println(c.sub(a, b));
		System.out.println(c.mul(a, b));
		System.out.println(c.div(a, b));
	}

	public int add(int a, int b){// parameters
		return a + b;
	}

	public int sub(int a, int b){
		return a - b;
	}

	public int mul(int a, int b){
		return a * b;
	}

	public int div(int a, int b){
		return a / b;
	}
}
