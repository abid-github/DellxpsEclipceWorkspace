package com.qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;

	By searchPlaceholder = By.cssSelector("#twotabsearchtextbox");

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getPlaceholder() {
		return driver.findElement(searchPlaceholder);
	}

}
