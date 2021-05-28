package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class postLoginDashboardPage {

	
WebDriver driver;
	
	public postLoginDashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By loginSuccessCheckpoint = By.xpath("//img[@alt='AS']");
	
	
	public List<WebElement> getLoginCheckpoint() {
		return driver.findElements(loginSuccessCheckpoint);
	}
	
	
}
