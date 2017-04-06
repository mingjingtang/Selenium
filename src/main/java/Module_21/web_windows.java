package Module_21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by mingjingtang on 3/17/17.
 */
public class web_windows {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","/Users/mingjingtang/Downloads/geckodriver");
		WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();



		driver.get("http://www.urbanoutfitters.com/urban/index.jsp");




		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div[5]/main/div/section[1]/div[1]/div/article/div/span[1]/a")))
				.contextClick()
				.keyDown(Keys.SHIFT)
				.click()
				.keyUp(Keys.SHIFT)
				.perform();


		Set<String> handlesSet = driver.getWindowHandles();
		Iterator<String> iterate = handlesSet.iterator();
		while (iterate.hasNext()) {
			System.out.println("Window: " + iterate.next());//first window(main)
		}


		for(int i = 0; i < 3; i++) {
			handlesSet.forEach(eachElement ->{
				driver.switchTo().window(eachElement);
			});
			Thread.sleep(1000);
		}





		System.out.println("---------After the new tab is opened----------.");

//		driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div[6]/div/div[2]/ul/li[2]/a"));
//		handles = driver.getWindowHandles();
//		iterate = handles.iterator();
//		String thirdwindow = iterate.next();
//		System.out.println(thirdwindow);
//
//		System.out.println("-------After the shorts is opened---------");
//		Thread.sleep(6000L);

		driver.findElement(By.id("utility_signin")).click();
//		Thread.sleep(6000L);
		System.out.println("-------After the Sign in is opened---------");
//		driver.findElement(By.id("checkoutEmail")).sendKeys("tmjcsh@gmail.com");
//		driver.findElement(By.id("checkoutPassword")).sendKeys("619andyREN");

//
//		driver.findElement(By.xpath(".//*[@id='login']/div/div[1]/div/form[1]/input[13]")).click();
//		Thread.sleep(2000L);

		driver.close();


	}
}
