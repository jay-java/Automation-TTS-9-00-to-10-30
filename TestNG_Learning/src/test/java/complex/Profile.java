package complex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Profile {

	@Test
	public void profilecheck(ITestContext con) {
		WebDriver driver = (WebDriver) con.getAttribute("driver");
		driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/span[1]")).click();
	}

}
