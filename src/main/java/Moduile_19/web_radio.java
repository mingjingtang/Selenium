package Moduile_19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by mingjingtang on 3/15/17.
 */
public class web_radio {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.firefox.marionette","/Users/mingjingtang/Downloads/geckodriver");
		WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();

		driver.get("http://www.echoecho.com/htmlforms10.htm");

		List<WebElement> radio_button = driver.findElements(By.name("group1"));
//		System.out.println("the size of the radio button is: "+radio_button.size());
//		for(int i = 0; i < radio_button.size(); i++){
//			System.out.println(radio_button.get(i).getAttribute("value"));
//		}
		System.out.println(radio_button.get(2).getAttribute("value"));
		System.out.println(radio_button.get(2).getAttribute("checked"));
		radio_button.get(2).click();//check the radio button if it is unchecked
		System.out.println(radio_button.get(2).getAttribute("checked"));

		Thread.sleep(3000);
		driver.quit();
	}

}
