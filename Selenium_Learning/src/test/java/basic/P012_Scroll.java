package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P012_Scroll {
	public static void main(String[] args) {
		String url =  "https://demoqa.com/automation-practice-form";
		WebDriver driver=  DriverConnection.driverConnection(url);
		
		//1.scroll by pixels
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,250)", "");
		
		
		//2.scroll by element
//		WebElement btn  = driver.findElement(By.id("uploadPicture"));
//		js.executeScript("arguments[0].scrollIntoView();", btn);
//		
//		btn.sendKeys("C:\\Users\\jay-pc\\Downloads\\dell.png");
		
		//3.scroll to heigth
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}
}
