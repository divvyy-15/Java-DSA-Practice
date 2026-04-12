package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.DriverFactory;
import utils.ScreenshotUtils;

public class TestListener implements ITestListener {

    public void onTestFailure(ITestResult result)
    {
        String testName = result.getName();
        ScreenshotUtils.captureScreenshot(DriverFactory.getDriver(),testName);
        System.out.println("Screenshot captured for failed test: "+testName);
    }
}
