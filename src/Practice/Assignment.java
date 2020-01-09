package Practice;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] arsg) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='ui-state-default '])[2]")).click();
		Select adults = new Select(driver.findElement(By.id("Adults")));
		adults.selectByVisibleText("4");
		Select children = new Select(driver.findElement(By.id("Childrens")));
		children.selectByIndex(2);
		Select infant = new Select(driver.findElement(By.id("Infants")));
		children.selectByIndex(1);

		driver.findElement(By.id("MoreOptionsDiv")).click();
		Select class_travel = new Select(driver.findElement(By.id("Class")));
		class_travel.selectByVisibleText("Business");
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Philippine Airlines" + Keys.ENTER);
		driver.findElement(By.id("SearchBtn")).click();
		Assert.assertEquals(driver.findElement(By.id("homeErrorMessage")).getText(),
				"Sorry, but we can't continue until you fix everything that's marked in RED");
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
