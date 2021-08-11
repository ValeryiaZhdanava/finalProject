package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackOfficePage {

    private WebDriver driver;
    private WebDriverWait webDriverWait;
    private WebElement addCustomerBtn;
    private WebElement submitBtn;
    private WebElement showCustomersBtn;
    private By addCustomerBtnXpath = By.xpath("//button[@ng-click=\"addCust()\"]");
    private By showCustomersXpath = By.xpath("//button[@ng-click=\"showCust()\"]");

    private By submitBtnXpath = By.xpath("//button[@type=\"submit\"]");


    public BackOfficePage(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 2);
    }

    public void fillNewCustomerInfo(String firstName, String lastName, String postCode){
        submitBtn = waitForElement(submitBtnXpath);
        driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(firstName);
        driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@placeholder=\"Post Code\"]")).sendKeys(postCode);
        submitBtn.click();
    }


    public void clickAddCustomerBtn() {
        addCustomerBtn = waitForElement(addCustomerBtnXpath);
        addCustomerBtn.click();
    }

    public void openCustomers() {
        showCustomersBtn = waitForElement(showCustomersXpath);
        showCustomersBtn.click();
    }

    private WebElement waitForElement(By xpath){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
        return driver.findElement(xpath);
    }
}
