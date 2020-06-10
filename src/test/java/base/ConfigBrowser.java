package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigBrowser {
	
	public static WebDriver  driver;
	
	public static WebDriver initBrowser()
	
	{
		try {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return driver;
	}

}
