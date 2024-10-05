package listener;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import connection.DriverConnection;

public class FBTest {

	static WebDriver driver = null;
	@BeforeClass
	public static void openBrowser() {
		String url = "https://www.facebook.com/";
		driver = DriverConnection.driverConnection(url);
	}
	
	@Test
	public void login(ITestContext context) {
		driver.findElement(By.name("email")).sendKeys("selenium@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("selenium123");
		context.setAttribute("driver", driver);
		assertTrue(false);
	}
}
