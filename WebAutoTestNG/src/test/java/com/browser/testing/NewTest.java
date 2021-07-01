package com.browser.testing;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {

	WebDriver driver ;

	
	@Parameters({"browserName"})
	@BeforeTest
	public void setUp(String browserName)

	{
		System.out.println("Browser Name Is " + browserName);
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\EclipseWorkSpace\\WebAutoTestNG\\driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\EclipseWorkSpace\\WebAutoTestNG\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize();

	}

	@Test
	public void browserLaunch() {

		driver.get("https://google.com");

	}

	@AfterTest

	public void tearDown() {

		driver.close();
		System.out.println("Test is completed");

	}

}
