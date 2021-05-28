import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SimpleTest {

    private static WebDriver driver;

    public static WebDriver getCurrentDriver(){
        return driver;
    }

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sarke\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/maven-tutorials/how-to-execute-selenium-webdriver-testng-xml-using-maven");
    }

    @Test
    public void verifyPageTitle(){
        Assert.assertTrue(false);
    }

    @AfterMethod
    public void tearDown(){
       // driver.close();
        driver.quit();
    }
}
