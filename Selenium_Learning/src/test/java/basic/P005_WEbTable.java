package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import connection.DriverConnection;

public class P005_WEbTable {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = DriverConnection.driverConnection(url);
		
		String uName = "Helen Bennett";
		
		List<WebElement> thead = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		for(WebElement e:thead) {
			System.out.print(e.getText()+" ");
		}
		System.out.println();
		for(int i=2;i<=7;i++) {
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]"));
			for(int j = 1;j<=3;j++) {
				List<WebElement> cols =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]/span"));
				for(WebElement e1:cols) {
					System.out.print(e1.getText()+" ");
					if(e1.getText().equals(uName)) {
						System.out.println("your condition");
					}
				}
			}
			System.out.println();
		}
	}
}
