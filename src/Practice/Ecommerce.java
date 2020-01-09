package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce {
	
	public static void main (String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		browser.manage().window().maximize();
		//browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Beans", "Tomato"};
		AddItems(browser, itemsNeeded);
		browser.findElement(By.xpath("//img[@alt='Cart']")).click();
		browser.findElement(By.xpath("//div[@class='cart-preview active']//button[text()='PROCEED TO CHECKOUT']")).click();
		WebDriverWait wait = new WebDriverWait(browser, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		browser.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		browser.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(browser.findElement(By.cssSelector("span.promoInfo")).getText());
		//browser.findElement(By.xpath("//button[text()='Place Order']")).click();
	}
	
	
	public static void AddItems(WebDriver browser, String [] itemsNeeded) throws InterruptedException
	{
		
		List<WebElement> products = browser.findElements(By.cssSelector("h4.product-name"));
		Thread.sleep(3000);
		//Convert array into array list for easy search.
		int j=0;
		
		for(int i=0; i<products.size(); i++)
		{
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				browser.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				if(j==itemsNeeded.length) 
				{
					break;
				}
				
			}
		}
	}

}
