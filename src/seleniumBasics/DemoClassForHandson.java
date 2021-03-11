/*
package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DemoClassForHandson {
	
	
	@Test
	public  void verifyTekstacHandsOn(){
	String URL = "https://webapps.tekstac.com/AddressBook/";
	WebDriver driver=DriverSetup.getWebDriver();
	driver.get(URL);
	String fName=driver.findElement(By.xpath("//td[normalize-space()=\"NickName\"]/ancestor::div")).getText();
	System.out.println("Text is:"+fName);
	driver.quit();
	}

}


*/