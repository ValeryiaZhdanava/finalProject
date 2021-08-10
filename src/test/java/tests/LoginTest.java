package tests;

import helper.BaseTest;
import helper.DataProviderClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginName", dataProviderClass = DataProviderClass.class)
    public void positiveLoginTest(String name){
        SoftAssert softAssert = new SoftAssert();
        HomePage homePage = new HomePage(driver);
        homePage.clickOnCustomerLoginBtn();
        homePage.waitForLoginPage();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithExistedAcc(name);
        softAssert.assertEquals(loginPage.getNameAfterLogIn(), name, "Name after is not equal with the chosen name");
        System.out.println("Test is finished. Login was successful!!!");
        softAssert.assertAll();
    }



}
