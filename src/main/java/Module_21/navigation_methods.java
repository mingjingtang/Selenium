package Module_21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by mingjingtang on 3/17/17.
 */
public class navigation_methods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","/Users/mingjingtang/Downloads/geckodriver");

		WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();
		SendMailUsingAuthentication mail = new SendMailUsingAuthentication();

		driver.navigate().to("http://google.com");
		driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();

		Thread.sleep(2000L);
		driver.navigate().back();
		Thread.sleep(2000L);
		driver.navigate().forward();
	}
}
