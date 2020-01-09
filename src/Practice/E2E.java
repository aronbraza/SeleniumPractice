package Practice;

import java.sql.Driver;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class E2E {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.spicejet.com/");
		browser.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(browser, 30);
		
		//Steps
		browser.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		browser.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		browser.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		browser.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(2000);
		browser.findElement(By.id("divpaxinfo")).click();
		Select select = new Select(browser.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		select.selectByVisibleText("3");
		browser.findElement(By.id("divpaxinfo")).click();
		browser.findElement(By.cssSelector("input[id*='Student']")).click();
		Assert.assertTrue(browser.findElement(By.cssSelector("input[id*='Student']")).isSelected());
		System.out.println(browser.findElement(By.cssSelector("input[id*='Student']")).isSelected());
		Thread.sleep(2000);
		if (browser.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("Element is disable");
			Assert.assertTrue(true);
			
		}
		
		else
		{
			System.out.println("Element is enable");
			Assert.assertTrue(false);
		}
		browser.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
		
		
		
		
		
	}

}
