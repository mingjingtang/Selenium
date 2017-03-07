package Java_Module_4;

/**
 * Created by mingjingtang on 2/22/17.
 */
public class students {
	String name;
	int roll;
	int age;

	public students(){
		System.out.println("Adding student records");
	}

	public students(String name, int age, int roll){
		this.name = name; //this.name refers to the global variable name
		this.age = age;
		this.roll = roll;
	}
	public static void main(String[] args){
		students s1 = new students();
		s1.name = "Tom";
		s1.roll = 1;
		s1.age = 14;

		students s2 = new students();
		s2.name = "Jack";
		s2.roll = 2;
		s2.age = 15;

		students s3 = new students("Raman", 15,3);
		System.out.println("Argumented constructor name: " + s3.name);
		System.out.println("Argumented constructor age: " + s3.age);
		System.out.println("Argumented constructor roll: " + s3.roll);
	}
}
