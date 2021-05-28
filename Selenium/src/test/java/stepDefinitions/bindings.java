package stepDefinitions;


import pageObjectModel.loginPage;
import pageObjectModel.postLoginDashboardPage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Cucumber.Selenium.driverUtility;
import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class bindings extends driverUtility {
	
	//private static final Logger log = LogManager.getLogger(bindings.class.getName());
	public static final Logger log = LogManager.getLogger(bindings.class.getName());
	
	@Given("^User is at prelogin page$")
    public void user_is_at_prelogin_page()   {
            
		try{
			WebDriver driver = initializeDriver();
		
		log.error("The Driver is created");
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Eclipse\\Workspace\\Selenium\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		log.debug("Page is opened");
		}catch(Exception e) {
			System.out.println("The exception is "+e.getMessage());
		}
    }
	
	//@When("^user logs in with valid userid \"([^\"]*)\" and password \"([^\"]*)\"$")
	@When("user logs in with valid userid {string} and password {string}")
    public void user_logs_in_with_valid_userid_something_and_password_something(String userName, String password) throws Throwable {
		loginPage lp = new loginPage(driver);
    	lp.getUserEMail().sendKeys(userName);
    	log.debug("username is eneterd succesfully");
    	lp.clickNext().click();
    	log.debug("The Next button is clicked successfully");
    	Thread.sleep(3000);
    	lp.setPassword().sendKeys(password);
    	log.debug("password is eneterd succesfully");
    	lp.getLoginButton().click(); 
    	log.debug("The Login button is clicked successfully");
    }
    
    @Then("^Login is successful$")
    public void login_is_successful() throws Throwable {
    	postLoginDashboardPage pldp = new postLoginDashboardPage(driver);
    	int count = pldp.getLoginCheckpoint().size();
    	driver.close();
    	log.info("The Browser is closed");
    	Assert.assertEquals(1, count);
    	if(count!=1) {
    		log.error("The Post login page is not displayed");
    	}else {
    		log.debug("Post login page is displayed");
    	}
    	
    }

    
	
}
