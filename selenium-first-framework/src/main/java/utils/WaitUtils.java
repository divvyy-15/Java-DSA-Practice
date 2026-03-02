package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    public WebDriver driver;
    public WebDriverWait wait;
    //private static final int TIMEOUT = 10;--env driven timeout now through config.prop file

    public WaitUtils(WebDriver driver)
    {
        //this.driver = driver;
        //this.wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        int timeout = Integer.parseInt(ConfigReader.getProperty("timeout"));
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
    }

    public void waitForVisibility(WebElement ele)
    {
        wait.until(ExpectedConditions.visibilityOf(ele));
    }

    public void waitForClickability(WebElement ele)
    {
        wait.until(ExpectedConditions.elementToBeClickable(ele));
    }
}
