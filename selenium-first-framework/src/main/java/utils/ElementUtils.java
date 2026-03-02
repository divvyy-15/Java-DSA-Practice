package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {

    public WebDriver driver;
    WaitUtils waitUtils;

    public ElementUtils(WebDriver driver)
    {
        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);
    }

    public void clickElement(WebElement ele)
    {
        waitUtils.waitForClickability(ele);
        ele.click();
    }

    public void sendKeysToElement(WebElement ele, String inpText)
    {
        waitUtils.waitForVisibility(ele);
        ele.clear();
        ele.sendKeys(inpText);
    }

    public String getTextFromElement(WebElement ele)
    {
        waitUtils.waitForVisibility(ele);
        return ele.getText();
    }

    public boolean isElementDisplayed(WebElement ele)
    {
        waitUtils.waitForVisibility(ele);
        return ele.isDisplayed();
    }
}
