package Org.Test.SeleniumOpenBrowser;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelExecution { 
	private WebDriver driver;
	
	String strUrl = "https://www.google.com";
	
	@Parameters ({"browser"})
      @BeforeTest
      public void preCondition(@Optional String browser)
      {
         try
             {
                    if(browser.equalsIgnoreCase("Firefox"))

                    {

                    	 FirefoxBinary firefoxBinary = new FirefoxBinary();
               		  
               		  firefoxBinary.addCommandLineOptions("--headless");
               		  
               		  //firefoxBinary.addCommandLineOptions("--no-sandbox"); //
               		//  System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
               		  FirefoxOptions firefoxOptions = new FirefoxOptions();
               		  firefoxOptions.setBinary(firefoxBinary); 
               		  FirefoxDriver driver = new  FirefoxDriver(firefoxOptions);
               		  driver.get(strUrl);
               	      System.out.println("Headless Browser opened in FireFox browser"); 
                    }

                    if(browser.equalsIgnoreCase("Chrome")){

                        ChromeOptions chrOptions = new ChromeOptions(); 
                        chrOptions.addArguments("--headless");
                    	driver = new ChromeDriver(chrOptions);
                    	driver.get(strUrl);
                 	      System.out.println("Headless Browser opened in Chrome browser"); 
                    }

                    if(browser.equalsIgnoreCase("IE"))

                    {

                          //Location of the IEDriverServer.exe file stored in your machine               

                    	System.setProperty("webdriver.ie.driver","D:/ IEDriverServer.exe");

                          driver = new InternetExplorerDriver();

                    }                   

             }

             catch (WebDriverException e)

             {

                    System.out.println("Browser not found" +e.getMessage());

             }

           // driver.get(strUrl);

            // driver.manage().window().maximize();

           // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

      }

		/*
		 * @Test
		 * 
		 * public void addToCart() throws InterruptedException{ driver.get(strUrl);
		 * System.out.println("Browser Opened"); }
		 */
      
      @AfterTest
      public void quitBrowser() {
    	  driver.quit();
      }
      }

