package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import pages.SecurePage;
import utils.DriverFactory;

public class SampleTest extends BaseTest {
    @Test
    public void verifyValidLogin() {
        SoftAssert sa = new SoftAssert();
        //LoginPage lp = new LoginPage(driver);
        LoginPage lp = new LoginPage(DriverFactory.getDriver());
        lp.login("student","Password123");

        //SecurePage sp = new SecurePage(driver);
        SecurePage sp = new SecurePage(DriverFactory.getDriver());

        //Assert.assertTrue(sp.getSuccessMsg().contains("Logged In Successfully"),"Login was not successful");
        //Assert.assertTrue(sp.isLogoutButtonDisplayed(),"Log out button is not displayed!");

        sa.assertTrue(sp.getSuccessMsg().contains("Logged In Successfully"),"Login was not successful");
        sa.assertTrue(sp.isLogoutButtonDisplayed());
        sa.assertAll();

        System.out.println("Login action performed!");
    }

    @Test(dataProvider = "invalidUsers")
    public void invalidLoginTest(String user,String pwd)
    {
        //LoginPage lp = new LoginPage(driver);
        LoginPage lp = new LoginPage(DriverFactory.getDriver());
        lp.login(user,pwd);
        Assert.assertTrue(lp.getErrorMsg().contains("invalid"));
    }

    @DataProvider(name="invalidUsers")
    public Object[][] invalidUser()
    {
        return new Object[][]{
                {"wrongUser1", "wrongPass1"},
                {"wrongUser2", "wrongPass2"},
                {"student", "wrongPass"},
                {"", "Password123"}
        };
    }

}
