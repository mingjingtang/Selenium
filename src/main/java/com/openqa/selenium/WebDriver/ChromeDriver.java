package com.openqa.selenium.WebDriver;

/**
 * Created by mingjingtang on 3/13/17.
 */
public class ChromeDriver implements WebDriver{
	public ChromeDriver(){
		System.out.println("Launching Chrome");
	}

	@Override
	public void click(String locator) {
		System.out.println("Clicked on an Element in Chrome: "+locator);
	}

	@Override
	public void sendKeys(String locator, String value) {
		System.out.println("Typed in an Element in Chrome: "+ locator+" value entered: "+value);
	}

}
