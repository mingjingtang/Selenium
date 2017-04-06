package com.openqa.selenium.WebDriver;

/**
 * Created by mingjingtang on 3/13/17.
 */
public class FirefoxDriver implements WebDriver {
	public FirefoxDriver(){
		System.out.println("Launching Firefox");
	}

	@Override
	public void click(String locator) {
		System.out.println("Clicked on an Element in Firefox: "+locator);
	}

	@Override
	public void sendKeys(String locator, String value) {
		System.out.println("Typed in an Element in FireFox: "+ locator+" value entered: "+value);
	}
}
