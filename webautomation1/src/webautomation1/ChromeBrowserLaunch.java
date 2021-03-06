package webautomation1;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch {

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver","D:\\EclipseWorkSpace\\webautomation1\\driver\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Properties prop = new Properties();

		File fl = new File(System.getProperty("user.dir") + "\\Configuration\\config.properties");

		try {
			FileInputStream fis = new FileInputStream(fl);
			prop.load(fis);
		
		} catch (IOException e) {

			e.printStackTrace();
		}

		driver.get(prop.getProperty("url"));

	}

}
