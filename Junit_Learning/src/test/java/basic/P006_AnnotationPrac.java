package basic;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import connection.DriverConnection;

public class P006_AnnotationPrac {
	static WebDriver driver = null;
	@BeforeClass
	public static void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.driverConnection(url);
	}
	
	@Test
	public void titleCheck() throws InterruptedException {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Facebook-Home";
		assertEquals(expectedTitle, actualTitle);
		Thread.sleep(3000);
	}
	
	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}
}
