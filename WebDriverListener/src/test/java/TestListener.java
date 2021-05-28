
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class TestListener extends SimpleTest implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

        System.out.println(iTestResult.getTestName() +" has been started successfully");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println(iTestResult.getTestName() +" has been passed successfully");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        File src = ((TakesScreenshot) SimpleTest.getCurrentDriver()).getScreenshotAs(OutputType.FILE);
        File dest;
        dest = new File("E:\\Eclipse\\Workspace\\WebDriverListener\\target\\screenshot.png");
        try {
            FileUtils.copyFile(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
