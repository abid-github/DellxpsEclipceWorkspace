package webautomation1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooEmailJunkCleanup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.yahoo.com/");

		driver.findElement(By.xpath("//a[text()= 'Sign in']")).click();

		WebElement els = driver.findElement(By.xpath("//div[@id='login-landing']"));
		System.out.println(els.getText());
		
	

		System.out.println("******1");

		WebElement label = driver.findElement(By.xpath("//label[@id='login-label']"));

		System.out.println(label.getText());

		WebElement signin = driver.findElement(By.xpath("//input[@name ='username'] [@id='login-username']"));
		signin.sendKeys("abidindia_05");

		System.out.println(signin.getAttribute("value"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element1 = driver.findElement(By.xpath("//input[@type='submit']"));
		js.executeScript("arguments[0].click();", element1);

		driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("xyz");
		WebElement element2 = driver.findElement(By.name("verifyPassword"));
		js.executeScript("arguments[0].click();", element2);

		// js.executeScript("document.getElementsByName('password')[0].setAttribute('type','text');");
		// js.executeScript("document.getElementsByName('password')[0].value=\"test123\";");
		// WebElement pwd= driver.findElement(By.xpath("//input[@type='password']"));
		// pwd.sendKeys("re$mon$098");
		// js.executeScript("arguments[0].value = 'abid';", pwd);
		// js.executeScript("document.getElementById('login-passwd').value='text123'");
		// String mainWindow=driver.getWindowHandle();
		// driver.findElement(By.name("verifyPassword")).click();
		// driver.switchTo().window(mainWindow);

		Thread.sleep(100);

		driver.findElement(By.xpath("//a[@id='ybarMailLink' ][contains (@aria-label, 'Check ')]")).click();
		// js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(100);

		driver.findElement(By.xpath("//button[@data-test-id='toolbar-sort-menu-button']")).click();
		driver.findElement(By.xpath("//button[@data-test-id='sort-by-unread']")).click();

		for (int i = 0; i < 1; i++)

		{
			System.out.println("start");

			WebElement ele2 = driver
					.findElement(By.xpath("//button[@type='button' ][starts-with(@data-test-id, 'selection')]"));
			js.executeScript("arguments[0].click();", ele2);

			Thread.sleep(5000);

			List<WebElement> bootsdrp = driver
					.findElements(By.xpath("//ul[@data-test-id = 'selection-controls-menu']//li"));

			System.out.println(bootsdrp.size());

			for (int j = 0; j < bootsdrp.size(); j++) {
				// System.out.println(bootsdrp.get(j).getText());

				if (bootsdrp.get(j).getText().contains("Unread")) {
					bootsdrp.get(j).click();
					break;
				}
			}

//			WebElement ele3 = driver.findElement(By.xpath("//button[@data-test-id = 'select-all-unread-btn']"));
//			js.executeScript("arguments[0].click();", ele3);

			WebElement ele4 = driver.findElement(By.xpath("//button[@data-test-id = 'toolbar-delete']"));
			js.executeScript("arguments[0].click();", ele4);

			// ele4.click();

			int isPresent = driver.findElements(By.xpath("//button[@data-test-id= 'primary-btn']")).size();
			System.out.println("Pop up =" + (isPresent));
			if (isPresent != 0) {

				driver.findElement(By.xpath("//button[@data-test-id= 'primary-btn']")).click();
				Thread.sleep(100);

			}
			System.out.println("number of Delt Count " + (i));
		}

	}

}
