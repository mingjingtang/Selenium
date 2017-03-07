package Java_Module_1;

/**
 * Created by mingjingtang on 2/15/17.
 */
public class MethodCalling {
	//static component --> cannot give a call to non-static component directly.
	// static --> static(allowed)
	// non-static --> non-static,static(allowed)
	// non-static components cannot be called with out making an object of this class.
	// static  --> OO(object oriented)

	/*
	 * compile
	 * run
	 */

	public static void main(String[] args){
		MethodCalling m = new MethodCalling();
		m.go();
	}

	public void go(){
		System.out.println("Inside go MEthod");
		go1();
	}

	public void go1(){
		System.out.println("Inside go1 MEthod");
		go2();
	}
	public void go2(){
		System.out.println("Inside go2 MEthod");
	}

}
