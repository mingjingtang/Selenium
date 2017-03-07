package Java_Module_4;

/**
 * Created by mingjingtang on 2/21/17.
 */
public class Company {

	public static void main(String[] args){
		Department d = new Department();
		Department d1 = new Department();
		Department.comp_name = "Microsoft";
		Department.national_holiday();

		d.dept_id = 10;
		d.dept_name = "Telecom";
		d.no_of_emp = 1000;

		d1.dept_id = 101;
		d1.dept_name = "Sales";
		d1.no_of_emp = 5000;

		d.add_dept();
		d.change_dep();
		System.out.println("Department_id is: "+d.dept_id);
		System.out.println("Department_name is: "+d.dept_name);
		System.out.println("Department_no_of_emp is: "+ d.no_of_emp);


		d1.add_dept();
		d1.change_dep();
		System.out.println("Department_id is: "+d1.dept_id);
		System.out.println("Department_name is: "+d1.dept_name);
		System.out.println("Department_no_of_emp is: "+ d1.no_of_emp);
	}
}
