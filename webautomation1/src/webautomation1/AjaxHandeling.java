package webautomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AjaxHandeling {

	private String url = "http://demo.guru99.com/test/ajax.html";

	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass

	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkSpace\\webautomation1\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to(url);

	}

	@Test

	public void test_AjaxExample() {

		wait = new WebDriverWait(driver, 5);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".container")));

		// Get the text before performing an ajax call

		WebElement noTextElement = driver.findElement(By.className("radiobutton"));

		String textBefore = noTextElement.getText().trim();
		System.out.println(textBefore);

		// click on radio button yes
		driver.findElement(By.id("yes")).click();

		// Click on Check Button
		driver.findElement(By.id("buttoncheck")).click();

		/* Get the text after ajax call */

		WebElement textElemnt = driver.findElement(By.className("radiobutton"));

		wait.until(ExpectedConditions.visibilityOf(textElemnt));

		String textAfter = textElemnt.getText().strip();
		System.out.println(textAfter);

		/* Verify both texts before ajax call and after ajax call text. */

		Assert.assertNotEquals(textElemnt, textAfter);
		;

		System.out.println("Ajax Call Performed");

		String expectedText = "Radio button is checked and it's value is Yes";

		/* Verify expected text with text updated after ajax call */
		Assert.assertEquals(textAfter, expectedText);
		driver.close();

	}

}
