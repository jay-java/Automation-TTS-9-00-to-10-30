package complex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import connection.DriverConnection;

public class User {

	static WebDriver driver = null;

	@BeforeClass
	public static void openBrowser() {
		String url = "https://careercenter.tops-int.com/";
		driver = DriverConnection.driverConnection(url);
	}

	@Test
	public void login(ITestContext con) {
		driver.findElement(By.id("mobile")).sendKeys("7096512011");
		driver.findElement(By.id("password")).sendKeys("7096512011");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
		con.setAttribute("driver", driver);
	}
}
