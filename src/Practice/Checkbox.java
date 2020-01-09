package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.spicejet.com/");
		browser.manage().window().maximize();
		
		
		//Get the size of the element
		System.out.println(browser.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(browser.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
		
		//Click Student checkbox
		browser.findElement(By.cssSelector("input[id*='Student']")).click();
		//Verify if the checkbox is selected.
		System.out.println(browser.findElement(By.cssSelector("input[id*='Student']")).isSelected());
		Assert.assertTrue(browser.findElement(By.cssSelector("input[id*='Student']")).isSelected());
		
		browser.findElement(By.id("ctl00_mainContent_view_date1")).click();
		browser.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//browser.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	
		//Check if the element is enable or disable
		//Assert.assertTrue(browser.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		//System.out.println(browser.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		//Another way to check if the element if is enable or disable
		
		if(browser.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Element is enable!");
			Assert.assertTrue(true);
		}
		
		else
		{
			System.out.println("Element is disable!");
			Assert.assertTrue(true);
		}
		System.out.println(browser.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		
		//Asignment in Dropdown
		//URL: https://rahulshettyacademy.com/AutomationPractice/
		
		/*
		browser.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(browser.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(3000);
		browser.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(browser.findElement(By.id("checkBoxOption1")).isSelected());
		
		
		System.out.println(browser.findElements(By.cssSelector("input[id*='checkBoxOption']")).size());
		*/
		
	}


}
