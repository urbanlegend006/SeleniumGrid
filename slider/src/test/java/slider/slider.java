package slider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {
	
	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\External Jars\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tcsglobal.udemy.com/organization/home/");
		driver.findElement(By.xpath("//*[text()='Java Programming Masterclass for Software Developers']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[@class='control-bar-button--icon--28inh udi udi-exp-play']")).click();
		
		WebElement bar = driver.findElement(By.className("video-progress-bar-control progress-bar--progress-bar-control--VTAGF progress-bar--no-hover--27B0W"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(bar).clickAndHold().moveByOffset(1000, 0).release().build().perform();
		
		
	}
	
}
