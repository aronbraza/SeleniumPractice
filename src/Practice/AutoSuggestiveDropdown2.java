package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown2 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://ksrtc.in/oprs-web/guest/home.do");
		browser.manage().window().maximize();
		
		browser.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		browser.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)browser;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{
			i++;
			browser.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if(i>10)
			{
				break;
			}
		}
		
		if(i>10)
		{
			System.out.println("Element not Found.");
		}
		else
		{
			System.out.println("Element Found.");
		}
		
		
		
		
		
	}

}
