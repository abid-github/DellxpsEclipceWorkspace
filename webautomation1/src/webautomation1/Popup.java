package webautomation1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Popup {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\EclipseWorkSpace\\webautomation1\\driver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      
     
      
      driver.manage().window().maximize();
      System.out.println(driver.getCurrentUrl());
      driver.get("https://demoqa.com/alerts");
      System.out.println(driver.getCurrentUrl());
      
      
     

      try {
          driver.findElement(By.id("timerAlertButton")).click();
          WebDriverWait wait = new WebDriverWait(driver,1);
          wait.until(ExpectedConditions.alertIsPresent());
          Alert simpleAlert = driver.switchTo().alert();
          simpleAlert.accept();
          System.out.println("Unexpected alert accepted");
      } catch (Exception e) {
          System.out.println("unexpected alert not present");
      }
      driver.quit();
  }
}
