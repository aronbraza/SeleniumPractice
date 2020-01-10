package Practice;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class fileUpload {
	
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium java  files\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		String downloadPath = System.getProperty("user.dir");
		//set download path to chromedriver
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		option.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.cssSelector("[class*=\"g-btn--choose\"]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\OJT - Project Sec1\\Desktop\\autoIT script\\fileUpload.exe");
		
		//Verify if the file has successfully downloaded.
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*=\"g-btn--medium\"]")));
		driver.findElement(By.cssSelector("[class*=\"g-btn--medium\"]")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Download Now")));
		driver.findElement(By.linkText("Download Now")).click();
		Thread.sleep(3000);
		File file = new File(downloadPath+"/Converted.jpg");
		if(file.exists())
		{
			System.out.println("File found");
			if(file.delete())
			System.out.println("File deleted");
			

			
		}
		
	}

}
