package webautomation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SherwinWilliam {

	public static void main(String[] args) {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\EclipseWorkSpace\\webautomation1\\driver\\chromedriver.exe"); WebDriver
		 * driver = new ChromeDriver();
		 */

		System.setProperty("webdriver.gecko.driver", (System.getProperty("user.dir")) + "\\driver\\geckodriver.exe");
		
		//System.setProperty("webdriver.gecko.driver","D:\\EclipseWorkSpace\\webautomation1\\driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.sherwin-williams.com/homeowners/products");

		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.findElement(By.xpath("//input[@name='username']"))
				.sendKeys("abid.railtel@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123");

		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        //click not working for chrome, but js and action class helped .
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		
		
		
		// submit.sendKeys(Keys.ENTER);

		// Actions action = new Actions(driver);
		// action.moveToElement(submit).click().build().perform();

		// JavascriptExecutor js = (JavascriptExecutor)driver;
		// js.executeScript("arguments[0].click();", submit);
	}

}
