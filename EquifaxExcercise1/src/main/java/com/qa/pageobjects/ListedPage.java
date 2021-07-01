package com.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListedPage {

	public WebDriver driver;

	By price1 = By.xpath(
			"//span[@cel_widget_id='MAIN-SEARCH_RESULTS-1'] /div/div/div/div/div[2]/div[2]/div/div/div[3]/div[1]/div/div[1]/div[2]/a/span/span[1]");

	public ListedPage(WebDriver driver) {

		this.driver = driver;

	}
	
	
	public WebElement getfirstItemPriceElement()
	{
	WebElement ele= driver.findElement(price1);
	
	return ele;
	}

}
