package com.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage {

	public WebDriver driver;
	
	
	By actprice = By.xpath("//*[@id='newBuyBoxPrice']");
	
	By addTocartClickbutton = By.xpath("//*[@id='add-to-cart-button']");

	public AddToCartPage(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement actPriceElement() {
		WebElement actpriceele = driver.findElement(actprice);

		return actpriceele;
	}
	
	public WebElement addtocartClickButton() {
		WebElement atcButton = driver.findElement(addTocartClickbutton);

		return atcButton;
	}

}
