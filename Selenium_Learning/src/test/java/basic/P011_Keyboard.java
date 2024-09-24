package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import connection.DriverConnection;

public class P011_Keyboard {
	public static void main(String[] args) {
		String url ="https://www.google.com/";
		WebDriver driver = DriverConnection.driverConnection(url);
		
		WebElement search = driver.findElement(By.name("q"));
		
		Actions actions  = new Actions(driver);
		actions.click(search)
		       .keyDown(Keys.LEFT_SHIFT)
			   .sendKeys("learn selenium")
			   .keyUp(Keys.LEFT_SHIFT)
			   .pause(Duration.ofSeconds(3))
			   .keyDown(Keys.ARROW_DOWN)
			   .keyDown(Keys.ENTER)
			   .build()
			   .perform();
	}
}
