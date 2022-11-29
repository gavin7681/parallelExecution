package Org.Test.SeleniumOpenBrowser;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class openFireFox {

	public static void main(String[] args) {
		 String strUrl = "https://www.google.com";
		  
		  FirefoxBinary firefoxBinary = new FirefoxBinary();
		  
		  firefoxBinary.addCommandLineOptions("--headless");
		  
		  //firefoxBinary.addCommandLineOptions("--no-sandbox"); //
		//  System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
		  FirefoxOptions firefoxOptions = new FirefoxOptions();
		  firefoxOptions.setBinary(firefoxBinary); 
		  FirefoxDriver driver = new  FirefoxDriver(firefoxOptions);
	}

}
