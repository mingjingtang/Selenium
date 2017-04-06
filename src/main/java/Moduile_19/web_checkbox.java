package Moduile_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by mingjingtang on 3/15/17.
 */
public class web_checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","/Users/mingjingtang/Downloads/geckodriver");
		WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();

		driver.get("https://my.screenname.aol.com/_cqr/login/login.psp?sitedomain=sns.mail.aol.com&seamless=novl&lang=en&locale=US&authLev=0&siteState=sid%3A1a7b6fba-07c2-4a65-ae5a-332b117499f7|qp%3A|ld%3Amail.aol.com|uv%3AAOL|at%3ASNS|lc%3Aen_US|rt%3ASTD|snt%3AScreenName|&offerId=newmail-en-us-v2");

		List<WebElement> check_box = driver.findElements(By.name("rememberMe"));

		System.out.println(check_box.get(0).getAttribute("value"));
		System.out.println(check_box.get(0).getAttribute("checked"));
		check_box.get(0).click();//check the radio button if it is unchecked
		System.out.println(check_box.get(0).getAttribute("checked"));

		Thread.sleep(3000);
		driver.quit();
	}
}
