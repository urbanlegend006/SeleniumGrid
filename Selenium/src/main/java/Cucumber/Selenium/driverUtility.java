package Cucumber.Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverUtility {
	
	public WebDriver driver;
	Properties prop = new Properties();
	
	public WebDriver initializeDriver() throws IOException {
		
		FileInputStream fis = new FileInputStream("E:\\Eclipse\\Workspace\\Selenium\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		
		if(prop.getProperty("browser").equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", prop.getProperty("ChromeDriverPath"));
		driver = new ChromeDriver();
		
		}
		else if(prop.getProperty("browser").equals("firefox")) {
			
		}else if(prop.getProperty("browser").equals("internetexplorer")) {
			
		}else if (prop.getProperty("browser").equals("edge")) {
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
