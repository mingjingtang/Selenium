package Java_Module_5;

/**
 * Created by mingjingtang on 2/22/17.
 */
public class testBike {
	public static void main(String[] args){
		Bike b = new Bike();
		b.color = "Black";
		b.startBike();

		makeHonda m = new makeHonda();
		m.color = "Blue";
		m.startBike();// makeHonda
		m.tyreType();

		Bike b1 = new makeHonda();
		b1.startBike();//makeHonda
		b1.stopBike();
	}
}
