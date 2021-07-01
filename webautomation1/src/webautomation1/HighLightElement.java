package webautomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkSpace\\webautomation1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.gmail.com");

		WebElement ele = driver.findElement(By.xpath("//input[@type='email']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// div[@jsname='V1ur5d']
		// "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid
		// red;');", ele);
		
		String script = "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');";
		String script1 = "arguments[0].style.border= '2px solid red'";

		js.executeScript(script, ele);

	}

}
