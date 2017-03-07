package Java_Module_4;

/**
 * Created by mingjingtang on 2/21/17.
 */
public class staticandnonstatic {

	public static int q = 200; // Global static variable
	public int p = 100; // Global non static variable

	//static function
	public static void first_function(){
		int abc = 20;// this abc is a local variable

	}

	//non static method
	public void second_function(){
		int xyz = 100;// this xyz is a local variable
	}
}
