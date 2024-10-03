package crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import connection.DriverConnection;

public class BrowserTest {
	String url ="https://www.facebook.com/";
	WebDriver driver = null;
	@Test
	@Parameters("browser")
	public void loginTest(String browser) {
		if(browser.equals("chrome")) {
			driver  = DriverConnection.driverConnection(url);
		}
		if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\jay-pc\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get(url);
		}
		if(browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\jay-pc\\Downloads\\geckodriver-v0.35.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
		}
	}
}
