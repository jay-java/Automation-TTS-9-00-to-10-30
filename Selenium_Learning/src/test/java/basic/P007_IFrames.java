package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import connection.DriverConnection;

public class P007_IFrames {
	public static void main(String[] args) {
		String url = "https://demoqa.com/frames";
		WebDriver driver = DriverConnection.driverConnection(url);
		
		WebElement iFrame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iFrame1);
		
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());
		
		String mainWin = driver.getWindowHandle();
		driver.switchTo().window(mainWin);
		
		WebElement iFrame2 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(iFrame2);
		
		WebElement text1 = driver.findElement(By.id("sampleHeading"));
		System.out.println(text1.getText());
	}
}
