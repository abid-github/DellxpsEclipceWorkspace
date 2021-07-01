package webautomation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseoverAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\EclipseWorkSpace\\webautomation1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// //span[@class= 'nav-line-2 nav-long-width']
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.get("https://www.amazon.com/");
		//driver.findElement(By.xpath("//span[@class= 'nav-line-2 nav-long-width']")).click();
		
		driver.get("https://developer.mozilla.org/en-US/");
		
		WebElement  wb = driver.findElement(By.xpath("//button[text()='References & Guides']"));
		
		Actions  as= new Actions(driver );
		as.moveToElement(wb).click().build().perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Tutorials')]")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
