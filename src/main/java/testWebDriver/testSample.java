package testWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by mingjingtang on 3/14/17.
 */

public class testSample {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver","/Users/mingjingtang/Downloads/geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());

		WebElement element = driver.findElement(By.id("Email"));
		element.sendKeys("tmjcsh@gmail.com");

//		element.submit();
		element = driver.findElement(By.id("next"));
		element.click();

//		element = driver.findElement(By.className("hidden-label"));
//		element.sendKeys("9D3-9Gs-D4E-X5W");

//		element = driver.findElement(By.name("signIn"));
//		element.click();


	}
}
