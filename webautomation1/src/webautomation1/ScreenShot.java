package webautomation1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShot {

	@Test
	public void yahooScreenShot() throws IOException {

		FileInputStream fis = new FileInputStream(
				"D:\\EclipseWorkSpace\\webautomation1\\Configuration\\config.properties");
		Properties pro = new Properties();
		pro.load(fis);

		System.setProperty("webdriver.chrome.driver", pro.getProperty("driverPath"));
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.Yahoo.com");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@type='text' and @role='combobox']")).sendKeys("hello");

		// driver.findElement(By.xpath("//button[@aria-label ='Search']")).click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\EclipseWorkSpace\\webautomation1\\Screenshots\\yahoo.png");
		FileHandler.copy(src, dest);

		// FilterInputStream fis = new FileInputStream ();

		driver.quit();
	}
}
