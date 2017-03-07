package Java_Module_5;

/**
 * Created by mingjingtang on 2/23/17.
 */
public class Department implements Employee {
	public static void main(String[] args) {
		Employee e = new Department();
		e.hr_policy();
		e.salary();
	}

	@Override
	public void salary() {
		System.out.println("Salary granted for this month");
	}

	@Override
	public void hr_policy() {
		System.out.println("HR Policies applied");
	}
}
