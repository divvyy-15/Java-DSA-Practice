package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ElementUtils;

public class LoginPage extends BasePage {

    //Constructor
    public LoginPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    /*Locators
    By usernameField = By.id("username");
    By pwdField = By.id("password");
    By submitBtn = By.id("submit");
    By errorMsg = By.id("error");*/

    @FindBy(id="username")
    WebElement usernameField;

    @FindBy(id="password")
    WebElement pwdField;

    @FindBy(id="submit")
    WebElement submitBtn;

    @FindBy(id="error")
    WebElement errorMsg;

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
