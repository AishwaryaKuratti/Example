package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
	
	
	@Test
	public  void verifyFaceBookHomePage(){
		
		String URL = "https://www.facebook.com";
		WebDriver driver=DriverSetup.getWebDriver();
		driver.get(URL);
		String pageTitle = driver.getTitle();
		System.out.println("We get the Title Like :" +pageTitle);
		Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
		driver.close();
		
	}

}

