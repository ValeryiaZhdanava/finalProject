package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    WebDriverWait webDriverWait;
    private By customerLoginXpath = By.xpath("//button[text()='Customer Login']");
    private By bankManagerLoginXpath = By.xpath("//button[text()='Bank Manager Login']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 2);

    }

    public void clickOnCustomerLoginBtn(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(customerLoginXpath));
        driver.findElement(customerLoginXpath).click();
    }

    public void clickOnBankManagerLoginBtn(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(bankManagerLoginXpath));
        driver.findElement(bankManagerLoginXpath).click();

    }

    public void waitForLoginPage() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()=\"Your Name :\"]")));
    }

    public void waitForAddBackOfficePage() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Add Customer \"]")));
    }

}
