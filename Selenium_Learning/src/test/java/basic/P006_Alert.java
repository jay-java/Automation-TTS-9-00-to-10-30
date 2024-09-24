package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import connection.DriverConnection;

public class P006_Alert {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://demoqa.com/alerts";
		WebDriver driver = DriverConnection.driverConnection(url);
		
		//1.Alert
//		WebElement btn = driver.findElement(By.id("alertButton"));
//		btn.click();
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(3000);
//		alert.accept();
		
		
		//2.alert
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement btn = driver.findElement(By.id("timerAlertButton"));
//		btn.click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		
		//3.alert
//		WebElement btn = driver.findElement(By.id("confirmButton"));
//		btn.click();
//		Thread.sleep(3000);
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		
		//4.alert
		WebElement btn = driver.findElement(By.id("promtButton"));
		btn.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("learn selenium");
		alert.accept();
		
		
	}
}
