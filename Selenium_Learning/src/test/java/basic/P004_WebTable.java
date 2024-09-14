package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P004_WebTable {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.driverConnection(url);
		
		WebElement name = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[2]/span"));
		System.out.println(name.getText());
				
	}
}
