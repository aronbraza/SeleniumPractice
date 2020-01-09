package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		
		
		
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.spicejet.com/");
		browser.manage().window().maximize();
		
		//Handle Dynamic Dropdown
		browser.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		browser.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//browser.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		browser.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		
	}

}
