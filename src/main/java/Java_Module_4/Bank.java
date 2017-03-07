package Java_Module_4;

/**
 * Created by mingjingtang on 2/22/17.
 */
public class Bank {

	String name;
	int accountbalance;
	Members mem;

	public int interesgained(int increment){
		accountbalance = accountbalance + increment;
		return accountbalance;
	}

	public Members getBalance(){
		return mem;
	}
}
