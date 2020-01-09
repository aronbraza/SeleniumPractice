package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.path2usa.com/travel-companions");
		browser.manage().window().maximize();
		
		browser.findElement(By.id("travel_date")).click();
		
		
		//select May 28 on the calendar.		
		while(!browser.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("May"))
		{
			browser.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}
		
		 List<WebElement> dates = browser.findElements(By.className("day"));
		 int count = dates.size();
		 
		 for(int i=0; i<count; i++)
		 {
			 String date = browser.findElements(By.className("day")).get(i).getText();
			 if(date.equalsIgnoreCase("25"))
			 {
				 browser.findElements(By.className("day")).get(i).click();
				 break;
			 }
		 }
		 
	}

}
