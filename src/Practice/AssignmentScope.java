package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AssignmentScope {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();

		
		WebElement checkBox = driver.findElement(By.id("checkBoxOption3"));
		String valueOfCheckbox = driver.findElement(By.cssSelector("label[for='honda']")).getText();
		checkBox.click();
		
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select option = new Select(dropDown);
		option.selectByVisibleText(valueOfCheckbox);
		
		WebElement textBox = driver.findElement(By.id("name"));
		textBox.sendKeys(valueOfCheckbox);
		WebElement alertButton = driver.findElement(By.id("alertbtn"));
		alertButton.click();
		Assert.assertEquals(driver.switchTo().alert().getText(), "Hello "+valueOfCheckbox+", share this practice page and share your knowledge");
	
	}

}
