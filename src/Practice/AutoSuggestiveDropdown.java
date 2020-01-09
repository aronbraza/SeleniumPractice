package Practice;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestiveDropdown {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.makemytrip.com/");

		
		WebElement From = browser.findElement(By.id("fromCity"));
		From.click();
		Thread.sleep(2000);
		WebElement From_Textbox = browser.findElement(By.xpath("//input[@placeholder='From']"));
		From_Textbox.sendKeys("Manila, Philippines"+Keys.ARROW_DOWN + Keys.ENTER);
		WebElement To_Textbox = browser.findElement(By.xpath("//input[@placeholder='To']"));
		To_Textbox.sendKeys("Tokyo, Japan"+Keys.ARROW_DOWN + Keys.ENTER);
	}

}
