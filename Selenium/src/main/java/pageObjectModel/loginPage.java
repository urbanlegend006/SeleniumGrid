package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By userEmail = By.name("loginfmt");
	By next = By.xpath("//*[@type='submit']");
	By password = By.xpath("//input[@name = 'passwd']");
	By loginButton = By.xpath("//*[@type='submit']");
	
	public WebElement getUserEMail() {
		return driver.findElement(userEmail);
	}
	
	public WebElement clickNext() {
		return driver.findElement(next);
	}
	
	public WebElement setPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}
	
}
