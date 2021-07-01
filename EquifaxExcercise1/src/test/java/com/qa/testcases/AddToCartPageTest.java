package com.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pageobjects.AddToCartPage;
import com.qa.pageobjects.HomePage;
import com.qa.pageobjects.ListedPage;

public class AddToCartPageTest extends TestBase {

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test
	public void addtoCartPricevalidation() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		HomePage hp = new HomePage(driver);
		hp.getPlaceholder().sendKeys("qa testing for beginners");
		hp.getPlaceholder().sendKeys(Keys.ARROW_DOWN);
		hp.getPlaceholder().sendKeys(Keys.ENTER);
		
		ListedPage lp = new ListedPage(driver);
		WebElement elp = lp.getfirstItemPriceElement();
		String actualPriceOnListed = (String) jse.executeScript("return arguments[0].innerHTML", elp);
		jse.executeScript("return arguments[0].click();", elp);

		AddToCartPage act = new AddToCartPage(driver);
		WebElement actpr = act.actPriceElement();
		String actualPrcOnAddToCart = (String) jse.executeScript("return arguments[0].innerText", actpr);
		
		
		Assert.assertEquals(actualPrcOnAddToCart, actualPriceOnListed);

	}

	@AfterTest
	public void tearDown() {

		//driver.close();
	}

}
