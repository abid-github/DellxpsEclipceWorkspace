package webautomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollJs {

	WebDriver driver;

	@Test
	public void ByPixel()

	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\EclipseWorkSpace\\webautomation1\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Launch the application
		driver.get("http://demo.guru99.com/test/guru99home/");

		// To maximize the window. This code may not work with Selenium 3 jars. If
		// script fails you can remove the line below
		driver.manage().window().maximize();

		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,3000)");

	}

	@Test
	public void ByVisibleElement() {

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		// Launch the application
		driver.get("http://demo.guru99.com/test/guru99home/");

		// Find element by link text and store in variable "Element"
		WebElement Element = driver.findElement(By.linkText("Linux"));

		// This will scroll the page till the element is found
		js1.executeScript("arguments[0].scrollIntoView();", Element);

	}

}