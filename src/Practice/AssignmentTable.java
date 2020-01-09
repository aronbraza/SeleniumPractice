package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTable {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		int numberOfRows = driver.findElements(By.cssSelector("table[id='product'] tr th")).size();
		int numberOfColumns = driver.findElements(By.cssSelector("table[id='product'] tr")).size();
		String secondColumnValue = driver.findElement(By.cssSelector("table[id='product'] tr:nth-child(3)")).getText(); 
		System.out.println(numberOfRows);
		System.out.println(numberOfColumns);
		System.out.println(secondColumnValue);
	}

}
