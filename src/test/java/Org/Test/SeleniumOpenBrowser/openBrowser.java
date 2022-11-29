package Org.Test.SeleniumOpenBrowser;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.Test;

public class openBrowser {

	@Test
	public void open_browser() {
		
		/*
		 * ProfilesIni profile = new ProfilesIni(); FirefoxProfile myprofile =
		 * profile.getProfile("xyzprofile");
		 * 
		 * 
		 * // Initialize Firefox driver WebDriver driver = new FirefoxDriver();
		 * //Maximize browser window // driver.manage().window().maximize(); //Go to URL
		 * which you want to navigate driver.get("http://www.google.com"); //Set timeout
		 * for 5 seconds so that the page may load properly within that time
		 * //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //close
		 * firefox browser driver.close();
		 */

		
		  String strUrl = "https://www.google.com";
		  
		  FirefoxBinary firefoxBinary = new FirefoxBinary();
		  
		  firefoxBinary.addCommandLineOptions("--headless");
		  
		  //firefoxBinary.addCommandLineOptions("--no-sandbox"); //
		//  System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
		  FirefoxOptions firefoxOptions = new FirefoxOptions();
		  firefoxOptions.setBinary(firefoxBinary); 
		  FirefoxDriver driver = new  FirefoxDriver(firefoxOptions);
		  
		  
		  
		  
			/*
			 * FirefoxOptions options = new FirefoxOptions();
			 * 
			 * options.setHeadless(true);
			 */
		//  WebDriver driver = new FirefoxDriver(firefoxOptions);
		  
		//  driver.get("google.com"); // driver.quit(); //
		  driver.get("https://google.com"); // 
		 // WebDriver driver = new  FirefoxDriver();
		  
		  
		  System.out.println("URL-----> " + strUrl); driver.get(strUrl);
		  
		  System.out.println("Browser Opened"); // driver.manage().window().maximize();
		  driver.quit();
		  
		  
		  // ProfilesIni profile = new ProfilesIni(); // FirefoxProfile myprofile =
			/*
			 * profile.getProfile("xyzProfile"); // Initialize Firefox driver
			 * 
			 * // Maximize browser window driver.manage().window().maximize(); // Go to URL
			 * which you want to navigate driver.get("http://www.google.com"); // Set
			 * timeout for 5 seconds so that the page may load properly within that time
			 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // close
			 * firefox browser
			 */
		  }

}
