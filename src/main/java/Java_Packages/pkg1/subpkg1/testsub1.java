package Java_Packages.pkg1.subpkg1;

import Java_Packages.teacher.teacherLogin;
import Java_Packages.teacher.teacherSubject;

/**
 * Created by mingjingtang on 2/23/17.
 *
 * import statements
 */
public class testsub1 {

	public static void main(String[] args){
		teacherLogin teacher = new teacherLogin();
		teacher.testTeacherLogin();
		teacher.name = "Raman";
		teacherSubject subject = new teacherSubject();
		subject.subject = "Selenium";

	}

}
