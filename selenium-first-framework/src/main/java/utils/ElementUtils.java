package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {

    public WebDriver driver;
    WaitUtils waitUtils;

    public ElementUtils(WebDriver driver)
    {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    public void clickElement(By locator)
    {
        waitUtils.waitForClickability(locator);
        driver.findElement(locator).click();
    }

    public void sendKeysToElement(By locator,String inpText)
    {
        waitUtils.waitForVisibility(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(inpText);
    }

    public String getTextFromElement(By locator)
    {
        waitUtils.waitForVisibility(locator);
        return driver.findElement(locator).getText();
    }

    public boolean isElementDisplayed(By locator)
    {
        waitUtils.waitForVisibility(locator);
        return driver.findElement(locator).isDisplayed();
    }
}
