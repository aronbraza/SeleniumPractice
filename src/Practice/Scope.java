package Practice;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("http://www.qaclickacademy.com/practice.php/");
		browser.manage().window().maximize();
		
		//get all the number of links on the page.
		System.out.println("Total Links on the page: "+browser.findElements(By.tagName("a")).size());
		
		//get the number the links on the footer section/
		WebElement footerdriver = browser.findElement(By.id("gf-BIG"));
		System.out.println("Total Links on the footer section: "+footerdriver.findElements(By.tagName("a")).size());
		
		//get the number of links on the 1st column of footer section.
		WebElement columndriver = footerdriver.findElement(By.xpath("//table//tbody//tr//td[1]/ul"));
		System.out.println("Total Links on the 1st column of foooter section: "+columndriver.findElements(By.tagName("a")).size());
		
		for(int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000);
		}
		
		Set<String> windows = browser.getWindowHandles();
		Iterator<String> iterator= windows.iterator();
		
		while(iterator.hasNext())
		{
			browser.switchTo().window(iterator.next());
			System.out.println(browser.getTitle());
		}
	
	}
}
