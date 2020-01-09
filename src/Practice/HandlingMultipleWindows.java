package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		browser.manage().window().maximize();
		System.out.println("Before Switching:");
		System.out.println(browser.getTitle());
		browser.findElement(By.linkText("Pagkapribado")).click();
		Set<String> ids = browser.getWindowHandles();
		Iterator<String> it =  ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		browser.switchTo().window(childId);
		System.out.println("Child Windows");
		System.out.println(browser.getTitle());
		System.out.println("Parent Windows:");
		System.out.println(browser.getTitle());
		browser.switchTo().window(parentId);
		
	}

}
