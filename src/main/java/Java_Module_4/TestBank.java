package Java_Module_4;

/**
 * Created by mingjingtang on 2/22/17.
 */
public class TestBank {
	public static void main(String[] args){
		Bank b1 = new Bank();
		b1.name = "HSBC";
		b1.accountbalance = 10000;
		b1.interesgained(500);
		System.out.println(b1.accountbalance);

		//here we will create an object of member class
		Members m = new Members();
		m.add = "1801 south avenue, california";
		m.name = "Jack Daniels";

		b1.mem = m;
		System.out.println(b1.mem.add);
		System.out.println(b1.mem.name);

		Bank b2 = new Bank();
		b2.name = "Barclays";
		b2.accountbalance = 20000;
		b2.mem = new Members();

		b2.mem.add = "12 road street, LA";
		b2.mem.name = "Cory";
		System.out.println(b2.mem.add);
		System.out.println(b2.mem.name);

		b2.getBalance();

		Members m2 = b2.getBalance();

		m2.deposit();
		m2.withdrawl();

		b2.getBalance().deposit();
		b2.getBalance().withdrawl();
	}
}
