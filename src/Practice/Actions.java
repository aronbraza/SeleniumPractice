package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.amazon.com/");
		browser.manage().window().maximize();

		org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(browser);
		WebElement move = browser.findElement(By.id("nav-link-accountList"));
		
		action.moveToElement(browser.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();;
		
		
		
		//Move to specific element.
		action.moveToElement(move).contextClick().build().perform();
		
		
	}

}
