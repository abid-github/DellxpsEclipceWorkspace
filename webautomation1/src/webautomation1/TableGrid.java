package webautomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;

		System.setProperty("webdriver.chrome.driver",
				"D:\\EclipseWorkSpace\\webautomation1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/22650/rsa-vs-eng-3rd-test-england-tour-of-south-africa-2019-20");

		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount = table.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms']")).size();

		int count = table.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();

		for (int i = 0; i < count - 2; i++) {

			// System.out.println(table.findElements(By.cssSelector("div[class = 'cb-col
			// cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());

			String clvalue = table
					.findElements(By.cssSelector("div[class = 'cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
					.get(i).getText();

			sum = sum + Integer.parseInt(clvalue);

		}

		String extvl = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();

		int total = sum + Integer.parseInt(extvl);

		// System.out.println(
		// driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText()
		// );
		// System.out.println(
		// driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText()
		// );

		String flval = driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();

		if (total == Integer.parseInt(flval)) {
			System.out.println("matched");

		} else {
			System.out.println("Not matched");
		}

		// div[text() = 'Extras']/following-sibling::div
		// div[text() = 'Total']/following-sibling::div

		// div[class = 'cb-col cb-col-100 cb-scrd-itms']
		// .cb-col.cb-col-100.cb-scrd-itms

		// System.out.println(rowcount);

	}

}

