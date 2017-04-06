package Module_21;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import javax.mail.MessagingException;
import java.io.IOException;


/**
 * Created by mingjingtang on 3/16/17.
 */
public class Capturescreenshot {
	public static void main(String[] args) throws IOException, MessagingException {
		System.setProperty("webdriver.firefox.marionette","/Users/mingjingtang/Downloads/geckodriver");

		WebDriver driver = new org.openqa.selenium.firefox.FirefoxDriver();
		SendMailUsingAuthentication mail = new SendMailUsingAuthentication();

		driver.get("http://gmail.com");

		java.io.File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,new java.io.File("/Users/mingjingtang/Downloads/capturescreen.jpg"));

		/*
		 * Screenshot in case of an error
		 */
		try{
			driver.findElement(By.xpath(".//*[@id='dddd']"));
		}
		catch (Throwable t){
			FileUtils.copyFile(scrFile,new java.io.File("/Users/mingjingtang/Downloads/errorscreen1.jpg"));

			mail.postMail(SendMailUsingAuthentication.emailList, SendMailUsingAuthentication.emailSubjectTxt,
					SendMailUsingAuthentication.emailMsgTxt, SendMailUsingAuthentication.emailFromAddress);
		}

	}
}
