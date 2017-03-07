package Java_Collections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by mingjingtang on 3/1/17.
 */
public class testReflection {
	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		String x = "click";//xls file
		Method method = testReflection.class.getMethod(x, String.class);
		method.invoke(method, "Hi,there");
	}

	public static void click(String x){
		System.out.println("Executing the Test: " + x);
	}
}
