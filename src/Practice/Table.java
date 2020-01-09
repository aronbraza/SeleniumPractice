package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.modifier.SyntheticState;

public class Table {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
		browser.get("https://www.cricbuzz.com/live-cricket-scorecard/23780/ben-vs-ap-round-3-elite-group-a-and-b-ranji-trophy-2019-20");
		browser.manage().window().maximize();
		
		int sum=0;
		WebElement table = browser.findElement(By.cssSelector(".cb-col.cb-col-100.cb-ltst-wgt-hdr"));
		int rowCount= table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms")).size();
		int count = table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).size();
		
		for(int i=0; i<count-2; i++)
		{
			System.out.println(table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).get(i).getText());
			String value = table.findElements(By.cssSelector(".cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).get(i).getText();
			int valueInteger =  Integer.parseInt(value);
			sum=sum+valueInteger;
			
		}
		System.out.println(sum);
		String Extras = browser.findElement(By.xpath("//div[text()='Extras']//following-sibling::div")).getText();
		int extrasValue = Integer.parseInt(Extras);
		int total = sum + extrasValue;
		System.out.println(total);
		String actualTotal = browser.findElement(By.xpath("//div[text()='Total']//following-sibling::div")).getText();
		int actualTotalValue = Integer.parseInt(actualTotal);
		if(total == actualTotalValue)
		{
			System.out.println("Count Matches");
		}
		
		else
		{
			System.out.println("Count Fails");
		}
	}

}
