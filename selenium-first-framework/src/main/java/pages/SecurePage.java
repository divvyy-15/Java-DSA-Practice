package pages;

import base.BasePage;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ElementUtils;

import java.time.Duration;

public class SecurePage extends BasePage {

    public SecurePage(WebDriver driver)
    {
        super(driver);
    }

    By successMsg = By.xpath("//h1[@class='post-title']");
    By logoutBtn = By.xpath("//a[text()='Log out']");

    public String getSuccessMsg()
    {
        String successMsgUI = eu.getTextFromElement(successMsg);
        //System.out.println("Success message displayed is: "+successMsgUI);
        return successMsgUI;
    }

    public boolean isLogoutButtonDisplayed()
    {
        return eu.isElementDisplayed(logoutBtn);
    }
}
