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
import com.qa.pageobjects.CheckedOutpage;
import com.qa.pageobjects.HomePage;
import com.qa.pageobjects.ListedPage;

public class CheckedOutTest extends TestBase {

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test
	public void cackOutPagePricevalidation() {

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
		WebElement actclick = act.addtocartClickButton();
		jse.executeScript("return arguments[0].click();", actclick);
		CheckedOutpage cop = new CheckedOutpage(driver);
		WebElement cope = cop.cartPriceEle();
		String actualpriceOnchkOut = (String) jse.executeScript("return arguments[0].innerText", cope);

		Assert.assertEquals(actualpriceOnchkOut, actualPriceOnListed);

		cop.chekoutbuttonEle().click();

	}

	@AfterTest
	public void tearDown() {

		driver.close();
	}

}
