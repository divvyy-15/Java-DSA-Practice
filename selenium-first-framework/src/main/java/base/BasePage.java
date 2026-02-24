package base;

import org.openqa.selenium.WebDriver;
import utils.ElementUtils;

public class BasePage {

    public WebDriver driver;
    public ElementUtils eu;

    public BasePage(WebDriver driver)
    {
        this.driver = driver;
        this.eu = new ElementUtils(driver);
    }

}
