/*
package seleniumBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriptExecutor {

	public WebDriver driver;
	public static Object jsfname,jslname, jsuname, jspwd, jsphone, jsemail, jssubmit, jsreset;

	@BeforeTest
	public WebDriver createDriver() {
		driver = DriverSetup.getWebDriver();
		driver.get("https://webapps.tekstac.com/Agent_Registration/");
		return driver;
	}

	//@AfterMethod
	public void CloseDriver() {
		driver.quit();
	}

	public void submitForm(String fname, String lname, String uname, String pwd, String phone, String email) {
		
		   JavascriptExecutor jse = ((JavascriptExecutor) driver);

		    jsfname=jse.executeScript("document.getElementsByName('firstname')[0].value='"+fname+"'");
	        jslname=jse.executeScript("document.getElementsByName('lastname')[0].value='"+lname+"'");
	        jsuname=jse.executeScript("document.getElementsByName('username')[0].value='"+uname+"'");
	        jspwd=jse.executeScript("document.getElementsByName('password')[0].value='"+pwd+"'");
	        jsphone=jse.executeScript("document.getElementsByName('phonenumber')[0].value='"+phone+"'");
	        jsemail=jse.executeScript("document.getElementsByName('email')[0].value='"+email+"'");
	        jssubmit=jse.executeScript("document.getElementById('submit').click()");
		    
		    System.out.println(jsfname);
		    System.out.println(jslname);
		    System.out.println(jsuname);
		    System.out.println(jsphone);
		    System.out.println( jsemail);
		    System.out.println(jssubmit);
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	public void reset() {
		JavascriptExecutor jse = ((JavascriptExecutor) driver);

		jsreset=jse.executeScript("document.getElementById('reset').click()");
		System.out.println(jsreset);
	}

	@Test
	public void verifyRegistration() {

		reset();
		submitForm("Rahul", "Dravid", "Rahul", "rahul@123", "6232126711", "rahultest@gmail.com");

	}

}

*/