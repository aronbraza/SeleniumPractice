package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AssignmentAutoSuggestiveDropdown {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys("Phi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String getText = (String) js.executeScript(script);
		System.out.println(getText);
		
		
	}

}
