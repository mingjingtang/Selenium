package Java_Module_3;

/**
 * Created by mingjingtang on 2/21/17.
 */
public class PrintTables {
	public static void table(int t){
		for(int i = 1; i <=10; i++){
			System.out.println(t *i);
		}
	}

	public static void main(String[] args){
		table(10);
	}
}
