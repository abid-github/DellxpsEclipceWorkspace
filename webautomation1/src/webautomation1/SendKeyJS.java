package webautomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\EclipseWorkSpace\\webautomation1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		WebElement Search = driver.findElement(By.xpath("//input[@name='q']"));

		// .sendKeys(Keys.chord(Keys.SHIFT,"abid"),Keys.SEMICOLON );
		// .sendKeys(Keys.SHIFT,"abid", Keys.SEMICOLON);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = 'abid';", Search);
		
		//("document.getElementById('textbox').value= 'some text';")

	}

}
