package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ScreenshotUtils {

    public static String captureScreenshot(WebDriver driver, String testName)
    {
        //Cast driver to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        //Capture screenshot
        File source = ts.getScreenshotAs(OutputType.FILE);

        //Create /screenshots folder automatically
        String screenshotPath = System.getProperty("user.dir") + "/screenshots/" + testName + ".png";

        //Save file using test name
        Path destination = Paths.get(screenshotPath);
        try
        {
            Files.createDirectories(destination.getParent());
            Files.copy(source.toPath(),destination);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        //Return path (important for reporting later)
        return screenshotPath;
    }
}
