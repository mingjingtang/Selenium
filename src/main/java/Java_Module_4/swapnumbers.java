package Java_Module_4;

/**
 * Created by mingjingtang on 2/21/17.
 */
public class swapnumbers {
	int s;
	int t;

	public static void swap(int a, int b){//pass by value
		int temp = a;
		a = b;
		b = temp;
	}

	public static void swap(swapnumbers p){//pass by reference
		int temp = p.s;
		p.s = p.t;
		p.t = temp;
	}

	public static void main(String[] args){
		swapnumbers sw = new swapnumbers();
		sw.s = 50;
		sw.t = 100;

		swap(sw.s,sw.t);//pass by value
		System.out.println("Pass by values s is "+ sw.s);
		System.out.println("Pass by values t is "+ sw.t);

		swap(sw); // pass by reference
		System.out.println("Pass by reference s is "+ sw.s);
		System.out.println("PAss by reference t is "+ sw.t);
	}
}
