package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSort {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		List<WebElement> ItemsList = browser.findElements(By.cssSelector("div[class='products'] table td:nth-child(2)"));
		
		browser.findElement(By.cssSelector("div[class='products'] table th:nth-child(2)")).click();
		//browser.findElement(By.cssSelector("div[class='products'] table th:nth-child(2)")).click();
		List<String> originalList = new ArrayList<String>();
		System.out.println("Original List:");
		for(int i=0; i<ItemsList.size(); i++)
		{
			System.out.println(ItemsList.get(i).getText());
			originalList.add(ItemsList.get(i).getText());
		}
		
		List<String> copiedList = new ArrayList<String>();
		for(int i=0; i<originalList.size(); i++)
		{
			copiedList.add(originalList.get(i));
		}
		
		Collections.sort(copiedList);
		Collections.reverse(copiedList);
		System.out.println("Sorted List:");
		for(String item : copiedList)
		{
			System.out.println(item);
		}
		
		//Assert.assertEquals(originalList, copiedList);
	
	}

}
