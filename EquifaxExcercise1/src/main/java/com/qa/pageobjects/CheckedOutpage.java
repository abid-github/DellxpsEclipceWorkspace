package com.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckedOutpage {

	
	public WebDriver driver;
	
	By cartprice = By.cssSelector("#hlb-subcart > div.a-row.a-spacing-micro > span > span.a-color-price.hlb-price.a-inline-block.a-text-bold");

	By chekoutbutton = By.xpath("//*[@id='hlb-ptc-btn-native']");
			
	public CheckedOutpage(WebDriver driver) {

		this.driver = driver;

	}
	
	
	public WebElement chekoutbuttonEle()
	{
	WebElement ele= driver.findElement(chekoutbutton);
	
	return ele;
	}
	public WebElement cartPriceEle()
	{
	WebElement ele= driver.findElement(cartprice);
	
	return ele;
	}
	

	
	

}
