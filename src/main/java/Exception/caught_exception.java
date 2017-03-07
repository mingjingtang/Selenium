package Exception;

/**
 * Created by mingjingtang on 2/23/17.
 */
public class caught_exception {
	public static void main(String[] args) throws InterruptedException {
		int[] i = new int[4];
		i[5] = 100;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Thread.sleep(1000);
		Thread.sleep(1000);
	}
}
