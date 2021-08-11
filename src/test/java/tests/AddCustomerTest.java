package tests;

import helper.BaseTest;
import helper.DataProviderClass;
import org.jsoup.Connection;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BackOfficePage;
import pages.HomePage;
import pages.LoginPage;

public class AddCustomerTest extends BaseTest {

    @Test
    public void addNewUserTest(){
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnBankManagerLoginBtn();

        BackOfficePage backOfficePage = new BackOfficePage(driver);
        backOfficePage.clickAddCustomerBtn();
        backOfficePage.fillNewCustomerInfo("Valeryia", "Zhdanava", "20015");

        softAssert.assertTrue(driver.switchTo().alert().getText().contains("Customer added successfully"));
        driver.switchTo().alert().accept();

        softAssert.assertAll();
    }

    @Test(dependsOnMethods = {"addNewUserTest"})
    public void checkNewUserInTheList(){
        BackOfficePage backOfficePage = new BackOfficePage(driver);
        backOfficePage.openCustomers();
        // TODO: add checking new user in the table
    }
}
