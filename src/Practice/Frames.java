package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://jqueryui.com/droppable/");
		browser.manage().window().maximize();
		browser.switchTo().frame(browser.findElement(By.cssSelector("iframe.demo-frame")));
		Actions action = new Actions(browser);
		WebElement source = browser.findElement(By.id("draggable"));
		WebElement target = browser.findElement(By.id("droppable"));
		action.dragAndDrop(source, target).build().perform();
		
		
		
		
	}

}
