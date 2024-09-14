package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import connection.DriverConnection;

public class P003_FaceCreateAccount {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = DriverConnection.driverConnection(url);
		
		WebElement createAccount = driver.findElement(By.linkText("Create new account"));
		createAccount.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		Thread.sleep(3000);
		
		WebElement firstNameEle = driver.findElement(By.name("firstname"));
		firstNameEle.sendKeys("selenium");
		
		WebElement dayEle = driver.findElement(By.id("day"));
		Select days = new Select(dayEle);
		days.selectByIndex(0);
		
		WebElement monthEle = driver.findElement(By.id("month"));
		Select months = new Select(monthEle);
		months.selectByValue("4");
		
		WebElement yearEle = driver.findElement(By.id("year"));
		Select years = new Select(yearEle);
		years.selectByVisibleText("2000");
		
		List<WebElement> gender = driver.findElements(By.id("sex"));
		gender.get(1).click();
	}
}
