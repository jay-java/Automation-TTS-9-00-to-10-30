package basic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import connection.DriverConnection;

public class P013_ScreenShot {
	public static void getScreenShot(WebDriver driver,String path) {
		TakesScreenshot ss = (TakesScreenshot)driver;
		try {
			File source = ss.getScreenshotAs(OutputType.FILE);
			File dest  = new File(path);
			
			FileUtils.copyFile(source, dest);
			System.out.println("ss taken");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		String url  ="https://www.facebook.com/";
		WebDriver driver  = DriverConnection.driverConnection(url);
		String path = "D:\\ss\\fb.png";
		getScreenShot(driver, path);
	}
}
