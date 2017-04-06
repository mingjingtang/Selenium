package testMyWebDriverProject;


import com.openqa.selenium.WebDriver.InternetExplorerDriver;
import com.openqa.selenium.WebDriver.WebDriver;

/**
 * Created by mingjingtang on 3/13/17.
 */
public class testSample {
	public static void main(String[] args){
//		FirefoxDriver driver = new FirefoxDriver();
//		InternetExplorerDriver driver1 = new InternetExplorerDriver();
//		ChromeDriver driver2 = new ChromeDriver();

		WebDriver driver = new InternetExplorerDriver();
		driver.click("Submit button");
		driver.sendKeys("Text Box", "trainer@way2automation.com");

	}
}
