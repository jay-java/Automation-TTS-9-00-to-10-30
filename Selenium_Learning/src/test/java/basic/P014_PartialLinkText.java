package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P014_PartialLinkText {
	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		
		WebDriver driver = DriverConnection.driverConnection(url);
		List<WebElement> links = driver.findElements(By.partialLinkText("Create"));
		
//		for(WebElement e:links) {
//			System.out.println(e.getText());
//		}
		
		links.get(0).click();
	}
}
