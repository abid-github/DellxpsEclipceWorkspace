package webautomation1;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//driver//chromedriver.exe//");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.uvdesk.com/en/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		

		/*
		 * String text =
		 * driver.findElement(By.xpath("//div[@class= 'col-md-5'] ")).getText();
		 * 
		 * System.out.println(text);
		 */

		String url = "";

		int nullcount = 0;
		int vailedlinkcount = 0;

		int brokenlinkcount = 0;

		System.out.println("Total links : " + links.size());

		for (int i = 0; i < links.size(); i++)

		{
			url = links.get(i).getAttribute("href");

			// System.out.println(url);

			try {

				if (url != null) {

					if (verifyLink(url).equals("Brokenlink")) {
						brokenlinkcount = brokenlinkcount + 1;
					} else {
						vailedlinkcount = vailedlinkcount + 1;
					}
				} else
					nullcount = nullcount + 1;

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("Tatal Brokenlinks = " + brokenlinkcount);
		System.out.println("Tatal null links = " + nullcount);
		System.out.println("Tatal Validlinks = " + vailedlinkcount);
	}

	static String verifyLink(String urllink) throws IOException {

		URL urlobj = new URL(urllink);

		HttpURLConnection httpconn = (HttpURLConnection) urlobj.openConnection();

		httpconn.setConnectTimeout(2000);

		httpconn.connect();

		// System.out.println(" code------------" + httpconn.getResponseCode());

		/*
		 * if (httpconn.getResponseCode() == 200) { System.out.println( urllink +
		 * " is Good urllink " + httpconn.getResponseCode() + "-" +
		 * httpconn.getResponseMessage()); }
		 */
		if (httpconn.getResponseCode() > 400) {

			System.out.println(urllink + " ----Is Brokenlink--- " + httpconn.getResponseCode() + "-"
					+ httpconn.getResponseMessage());
			return "Brokenlink";
		} else
			return "validLink";
	}

}
