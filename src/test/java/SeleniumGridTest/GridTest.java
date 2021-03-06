package SeleniumGridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {
	//Testing Grid
	@Test
	public void setUp() {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName("chrome"); 
		cap.setPlatform(Platform.ANY);
		 		
		String hub = "http://192.168.56.1:4444/wd/hub";
		
		try {
			WebDriver driver = new RemoteWebDriver(new URL(hub), cap);
			driver.get("https://google.com");
			System.out.println(driver.getTitle());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void setUp1() {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName("chrome"); 
		cap.setPlatform(Platform.ANY);
		 		
		String hub = "http://192.168.56.1:4444/wd/hub";
		
		try {
			WebDriver driver = new RemoteWebDriver(new URL(hub), cap);
			driver.get("https://facebook.com");
			System.out.println(driver.getTitle());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void setUp2() {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName("chrome"); 
		cap.setPlatform(Platform.ANY);
		 		
		String hub = "http://192.168.56.1:4444/wd/hub";
		
		try {
			WebDriver driver = new RemoteWebDriver(new URL(hub), cap);
			driver.get("https://youtube.com");
			System.out.println(driver.getTitle());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void setUp3() {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setBrowserName("chrome"); 
		cap.setPlatform(Platform.ANY);
		 		
		String hub = "http://192.168.56.1:4444/wd/hub";
		
		try {
			WebDriver driver = new RemoteWebDriver(new URL(hub), cap);
			driver.get("https://amazon.in");
			System.out.println(driver.getTitle());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
