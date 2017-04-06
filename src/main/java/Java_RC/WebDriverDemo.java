package Java_RC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by mingjingtang on 3/9/17.
 */
public class WebDriverDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/mingjingtang/Downloads/geckodriver");

		WebDriver webDriver = new FirefoxDriver();
		webDriver.get("http://www.google.com");

		webDriver.quit();
	}
}
