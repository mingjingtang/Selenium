package WebDriver_Wait;

import com.openqa.selenium.WebDriver.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * Created by mingjingtang on 4/3/17.
 */
public class wait_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","/Users/mingjingtang/Downloads/geckodriver");
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();
//		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);

		driver.get("https://www.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

		driver.findElement(By.id("uh-search-box")).sendKeys("selenium");
//		Thread.sleep(5000);

//		WebDriverWait wait = new WebDriverWait(driver, 20L);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='uh-search-button']")));

		Wait<WebDriver> wait = new FluentWait<WebDriver>((WebDriver) driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(2,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class)
				.withMessage("User defined wait timed out after 10 seconds");

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='uh-search-button']")));
//		driver.findElement(By.xpath(".//*[@id='uh-search-button']")).click();

		driver.close();
	}
}
