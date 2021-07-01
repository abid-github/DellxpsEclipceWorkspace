package webautomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.lang.Enum;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkSpace\\webautomation1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/");

		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement leavingFrom = driver.findElement(By.id("fromPlaceName"));
		String s0 = leavingFrom.getAttribute("value");

		leavingFrom.sendKeys("BEN");

		String s1 = leavingFrom.getText();
		String s2 = leavingFrom.getAttribute("value");

		System.out.println("S0=" + s0);
		System.out.println("S1=" + s1);
		System.out.println("S2=" + s2);

		// need to import ENUM, even not worked bc of hidden
		//leavingFrom.sendKeys(Keys.DOWN);
		//leavingFrom.sendKeys(Keys.DOWN);
		
		String s4 = leavingFrom.getAttribute("value");
		System.out.println("S4=" + s4);
		// get(text) wont work bcz of hidden element----even thgough get(text) wont work for here.

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById('fromPlaceName').value;";

		String text = (String) js.executeScript(script);

		System.out.println("FromJS="  +text);

		int i = 0;

		while (!text.equalsIgnoreCase("MALEBENNURU"))

		{
			leavingFrom.sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			i++;
			if (i > 10) {
				break;
			}

		}

		if (i > 10) {
			System.out.println("Element Not Found ");
		}

		else
			System.out.println(text);

	}

}
