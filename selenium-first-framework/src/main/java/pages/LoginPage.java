package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementUtils;

public class LoginPage extends BasePage {

    //Constructor
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    //Locators
    By usernameField = By.id("username");
    By pwdField = By.id("password");
    By submitBtn = By.id("submit");
    By errorMsg = By.id("error");

    //Actions
    public void enterUsername(String uName)
    {
        eu.sendKeysToElement(usernameField,uName);
    }

    public void enterPassword(String pwd)
    {
        eu.sendKeysToElement(pwdField,pwd);
    }

    public void clickSubmitButton()
    {
        eu.clickElement(submitBtn);
    }

    public String getErrorMsg()
    {
        return eu.getTextFromElement(errorMsg);
    }

    public void login(String uName,String pwd)
    {
        enterUsername(uName);
        enterPassword(pwd);
        clickSubmitButton();
    }
}
