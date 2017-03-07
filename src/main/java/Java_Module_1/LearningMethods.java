package Java_Module_1;

/**
 * Created by mingjingtang on 2/14/17.
 */
public class LearningMethods {


	int i;// declaration, initialize

	//display

	// Return type --> dataType of the value returned by method
	// Keyword --> return
	public int display(int k, String a, char c, float f, boolean b){// declare --> define
		/*
		 * all definitions goes here!
		 */
		return 0;
	}

	public void show(){

	}

	public static void main(String[] args){
		LearningMethods learn = new LearningMethods();
		learn.show();
//		learn.display(k, a, c, f, b);
		LearningMethods learn1 = new LearningMethods();
		learn1.show();

		Home h = new Home(); // h --> Object --> i = 10;
		h.i++; // Object1 -- > i=11;

		Home h1 = new Home(); // h1 --> Object2 --> i = 10;
		h1.i++; // Object 2 --> i = 11;

		Home h2 = new Home(); // h2 --> Object3 --> i = 10;
		System.out.println(h2.i); // 10

	}
}
