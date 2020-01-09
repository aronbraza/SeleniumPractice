package Practice;

import javax.print.DocFlavor.INPUT_STREAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMessage {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://rahulshettyacademy.com/AutomationPractice/");
		browser.manage().window().maximize();
		
		//First Alert Message
		browser.findElement(By.id("name")).sendKeys("Aron Paul G. Braza");
		browser.findElement(By.id("alertbtn")).click();
		System.out.println(browser.switchTo().alert().getText());
		browser.switchTo().alert().accept();
		
		Thread.sleep(2000);
		//Noote: If you want to click OK button on alert message use accept() method, however if you want to click Cancel button use dismiss() method.
		
		//Second Alert Message
		browser.findElement(By.id("name")).clear();
		browser.findElement(By.id("name")).sendKeys("Aron Braza");
		browser.findElement(By.cssSelector("input[value='Confirm']")).click();
		System.out.println(browser.switchTo().alert().getText());
		browser.switchTo().alert().dismiss();
		
		
		
	}

}
