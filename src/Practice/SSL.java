package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL {
	
	public static void main(String[] args)
	{	
		//Desired Capabilities
		DesiredCapabilities dc=DesiredCapabilities.chrome();
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		//Chrome Options
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.merge(dc);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\OJT - Project Sec1\\Desktop\\selenium notes\\chromedriver.exe");
		WebDriver browser = new ChromeDriver(chromeOptions);
		browser.get("");
		browser.manage().window().maximize();
	}

}
