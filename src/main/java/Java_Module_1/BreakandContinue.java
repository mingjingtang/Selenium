package Java_Module_1;

/**
 * Created by mingjingtang on 2/16/17.
 */
public class BreakandContinue {
	public void go(){
		System.out.println("First");

//		break;
//		continue;

		System.out.println("Last");
	}

	//continue--> continue to the next cycle --> to skip the iteration
	public static void main(String[] args){
//		Java_Module_1.BreakandContinue b = new Java_Module_1.BreakandContinue();
//		b.go();

		for(int i = 0; i < 10; i++){
			if(i >=5 && i<=7){
				continue;
			}

//			if(i==5){
//				break;
//			}
			System.out.println(i);
		}

		System.out.println("Outside the loop");
	}
}
