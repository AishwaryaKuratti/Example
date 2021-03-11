/*
package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.io.File;
import java.io.IOException;

public class Slider { // DO NOT Change the class Name

	static String baseUrl = "http://webapps.tekstac.com/OnlineShopping/fashion.html";
	public static WebDriver driver;
	public static String productInfo;
	public static String quantityInfo;
	public static String priceInfo;

	@BeforeTest
	public WebDriver createDriver() {
		driver = DriverSetup.getWebDriver();
		driver.get(baseUrl);
		return driver;
	}

	@AfterMethod
	public void CloseDriver() {
		driver.quit();
	}

	public static void implDragnDrop() { // DO NOT change the method signature

		// Locate the source web element that needs to be dragged.

		// Locate the target web element that needs to be dropped.

		// Creating object of Actions class to build composite actions

		// Performing the drag and drop action

		WebElement source = driver.findElement(By.id("Shirts"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.clickAndHold(source).moveToElement(target).release(target).build().perform();

	}

	public static void implMoveSlider() { // DO NOT change the method signature
		// Creating object of Actions class to build composite actions

		// Locate the slider web element

		// Move the slider to '5'

		// For Example

		// You can use the below methods to move the slider

		// * moveToElement(WebElement target)

		// * dragAndDropBy(WebElement source, int xOffset, int yOffset)

		// xOffset value is chosen as given below

		// a. If the 'kg' value is 5 the xOffset is "-10"
		// b. If the 'kg' value is 4 the xOffset is "-20"

		// c. If the 'kg' value is 3 the xOffset is "-40"

		// d. If the 'kg' value is 6 the xOffset is "10"

		// e. If the 'kg' value is 7 the xOffset is "20"

		// yOffset value is default ‘0’
		WebElement slider = driver.findElement(By.id("myRange"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, -10, 0).build().perform();
	}

	public String getProductDetail() { // DO NOT change the method signature

		// Locate the text displaying the product name.

		// Assign the displaying text to the static variable 'productInfo'

		// Return the text using getText() method.
		productInfo = driver.findElement(By.xpath("//*[@id='product']")).getText();
		return productInfo;

	}

	public String getQuantityDetail() { // DO NOT change the method signature

		// Locate the text displaying the product quantity(No).

		// Assign the displaying text to the static variable 'quantityInfo'

		// Return the text using getText() method.
		quantityInfo = driver.findElement(By.xpath("//*[@id='No']")).getText();
		return quantityInfo;
	}

	public String getPriceDetail() { // DO NOT change the method signature
		// Locate the text displaying the product price.

		// Assign the displaying text to the static variable 'priceInfo'

		// Return the text using getText() method.
		priceInfo = driver.findElement(By.xpath("//*[@id = 'price']")).getText();
		return priceInfo;
	}

	@Test
	public static void verifySlider() { // DO NOT change the method signature
		Slider ex = new Slider();

		// Implement the required code
		// Close the driver
		implDragnDrop();
		implMoveSlider();

		driver.close();

	}
}

*/