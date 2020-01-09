package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.io.ByteBufferPool.Bucket;

public class AssignmentWait {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.findElement(By.cssSelector("a[href='javascript: void(0);loadAjax();']")).click();
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results"))).getText());
		
	}

}
