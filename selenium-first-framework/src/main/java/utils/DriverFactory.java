package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    //private static WebDriver driver; --earlier
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver()
    {
        String browserValue = ConfigReader.getProperty("browser");
        //driver.set(new ChromeDriver());
        if(browserValue.equalsIgnoreCase("chrome"))
        {
            driver.set(new ChromeDriver());
        }
        else if(browserValue.equalsIgnoreCase("edge"))
        {
            driver.set(new EdgeDriver());
        }
        else if(browserValue.equalsIgnoreCase("firefox"))
        {
            driver.set(new FirefoxDriver());
        }
        else
        {
            throw new RuntimeException("Browser not supported! "+browserValue);
        }
    }

    public static WebDriver getDriver()
    {
        /*if(driver==null)
        {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;*/
        return driver.get();
    }

    public static void quitDriver()
    {
        /*if(driver!=null)
        {
            driver.quit();
            driver = null;
        }*/
        driver.get().quit();
        driver.remove();
    }
}
