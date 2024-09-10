package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P002_FacebookLogin {
	public static void main(String[] args) {
		String url ="https://www.facebook.com/";
		WebDriver driver = DriverConnection.driverConnection(url);
		
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.sendKeys("seelnium@gmail.com");
		
		WebElement passEle = driver.findElement(By.id("pass"));
		passEle.sendKeys("selenium@123");
		
		WebElement btnLogin  = driver.findElement(By.name("login"));
		btnLogin.click();
		
	}
}
