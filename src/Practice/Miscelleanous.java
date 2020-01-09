package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {
	
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.manage().deleteAllCookies();
		browser.manage().deleteCookieNamed("sessionKey");
		browser.get("https://www.google.com/");
		
		//get screenshot		
		File src = ((TakesScreenshot) browser).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\OJT - Project Sec1\\eclipse-workspace\\SeleniumPractice\\Screenshot\\Screenshot.png"));
	}

}
