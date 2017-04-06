package ProjectRC;

/**
 * Created by mingjingtang on 3/13/17.
 */
public class DefaultSelenium {
	public DefaultSelenium(String serverHost, int serverPort, String browserStartCommand, String browserURL){
		System.out.println("Sever host: "+serverHost);
		System.out.println("Sever port: "+serverPort);
		System.out.println("Browser: "+browserStartCommand);
		System.out.println("URL: "+ browserURL);
	}

	public void start(){
		System.out.println("Staring the selenium session");
	}

	public void click(String locator){
		System.out.println("Clicked on an Element: "+ locator);
	}

	public void type(String locator, String value){
		System.out.println("selected the element as: "+locator+" Typed the value as: "+value);
	}
}
