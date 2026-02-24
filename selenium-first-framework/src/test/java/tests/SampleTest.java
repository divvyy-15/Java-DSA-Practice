package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.SecurePage;

public class SampleTest extends BaseTest {
    @Test
    public void verifyValidLogin() {
        SoftAssert sa = new SoftAssert();
        LoginPage lp = new LoginPage(driver);
        lp.login("student","Password123");

        SecurePage sp = new SecurePage(driver);

        //Assert.assertTrue(sp.getSuccessMsg().contains("Logged In Successfully"),"Login was not successful");
        //Assert.assertTrue(sp.isLogoutButtonDisplayed(),"Log out button is not displayed!");

        sa.assertTrue(sp.getSuccessMsg().contains("Logged In Successfully"),"Login was not successful");
        sa.assertTrue(sp.isLogoutButtonDisplayed());
        sa.assertAll();

        System.out.println("Login action performed!");
    }

    @Test
    public void invalidLoginTest()
    {
        LoginPage lp = new LoginPage(driver);
        lp.login("student","pass123");
        Assert.assertTrue(lp.getErrorMsg().contains("invalid"));
    }
}
