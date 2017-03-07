package Java_Module_4;

/**
 * Created by mingjingtang on 2/21/17.
 */
public class Department {

	//non static global variables

	public String dept_name;
	public int dept_id;
	public int no_of_emp;

	//Global Static variable
	public static String comp_name;


	//non static functions
	public void add_dept(){
		System.out.println("Department added");
	}

	public void change_dept(){
		System.out.println("Department added");
	}

	public void change_dep(){
		System.out.println("Department changed");
	}

	//Static method
	public static void national_holiday(){
		System.out.println("National holiday granted");
	}

}
