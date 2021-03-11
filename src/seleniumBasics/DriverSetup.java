package seleniumBasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	
	
		  private static WebDriver driver;
		  
		  public static WebDriver getWebDriver()
		  {
			     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				 driver = new ChromeDriver();
				driver.manage().window().maximize();
				return driver;
		  }
		
		 

}
