package tests;

import helper.BaseTest;
import helper.DataProviderClass;
import org.jsoup.Connection;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;

public class AddCustomerTest extends BaseTest {

    @Test
    public void addNewUserTest(){
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnBankManagerLoginBtn();
        homePage.waitForAddBackOfficePage();

        LoginPage loginPage = new LoginPage(driver);

        softAssert.assertAll();
    }
}
