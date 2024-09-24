package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P008_WindowHandle {
	public static void main(String[] args) {
		String url = "https://demo.guru99.com/popup.php";
		WebDriver driver = DriverConnection.driverConnection(url);
		
		WebElement link = driver.findElement(By.linkText("Click Here"));
		link.click();
		
		String mainWin = driver.getWindowHandle();
		System.out.println(mainWin);
	 	Set<String> allWin = driver.getWindowHandles();
	 	for(String s:allWin) {
	 		System.out.println(s);
	 		if(!s.equals(mainWin)) {
	 			driver.switchTo().window(s);
	 			driver.findElement(By.name("emailid")).sendKeys("selenium@gmail.com");
	 			driver.findElement(By.name("btnLogin")).click();
	 			driver.close();
	 		}
	 	}
	}
}
