package com.openqa.selenium.WebDriver;

/**
 * Created by mingjingtang on 3/13/17.
 */
public class InternetExplorerDriver implements WebDriver {
	public InternetExplorerDriver(){
		System.out.println("Launching IE");
	}

	@Override
	public void click(String locator) {
		System.out.println("Clicked on an Element in IE: "+locator);
	}

	@Override
	public void sendKeys(String locator, String value) {
		System.out.println("Typed in an Element in IE: "+ locator+" value entered: "+value);
	}
}
