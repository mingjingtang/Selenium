package testWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by mingjingtang on 3/14/17.
 */
public class testDropdowns {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","/Users/mingjingtang/Downloads/chromedriver");
//		WebDriver driver1 = new org.openqa.selenium.chrome.ChromeDriver();

//		System.setProperty("webdriver.gecko.driver","/Users/mingjingtang/Downloads/geckodriver");
		System.setProperty("webdriver.firefox.marionette","/Users/mingjingtang/Downloads/geckodriver");

		WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();
		driver.get("https://www.wikipedia.org/");

		WebElement element = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(element);

//		select.selectByVisibleText("Eesti");
//		select.selectByValue("hi");

//		List<WebElement> options = select.getOptions();
//		System.out.println(options.size());
//		for(int i = 0; i < options.size(); i++){
//			System.out.println(options.get(i).getText());
//		}

		System.out.println("------------Printing all dropdown values--------------");
		List<WebElement> options = driver.findElements(By.tagName("option"));
		System.out.println(options.size());
		for(int i = 0; i < options.size(); i++){
			System.out.println(options.get(i).getAttribute("lang"));
		}

		System.out.println("------------Printing all links values---------------- ");
		WebElement block = driver.findElement(By.xpath(".//*[@id='www-wikipedia-org']/div[6]"));
//		List<WebElement> links = driver.findElements(By.tagName("a"));
		List<WebElement> links = block.findElements(By.tagName("a"));
		System.out.println("Total links are:" + links.size());
		for(int i = 0; i < links.size(); i++){
//			System.out.println(links.get(i).getAttribute("href"));
			System.out.println(links.get(i).getText());
		}


		Thread.sleep(3000);
		driver.quit();
	}
}
