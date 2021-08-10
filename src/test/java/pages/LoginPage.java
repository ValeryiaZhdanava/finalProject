package pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    protected Logger logger = Logger.getLogger(this.getClass());
    private WebDriver driver;
    private WebDriverWait dw;
    private WebElement selectYourName;
    private WebElement loginBtn;
    private By welcomeLineXpath = By.xpath("//strong[text()=\" Welcome \"]/span");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        selectYourName = driver.findElement(By.id("userSelect"));
        loginBtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
    }

    public void loginWithExistedAcc(String name){
        selectYourName.click();
        driver.findElement(By.xpath("//select/option[text()=\"" + name + "\"]")).click();
        loginBtn.click();
        logger.trace("Logged in as: " + name);
    }

    public String getNameAfterLogIn(){
        dw = new WebDriverWait(driver, 2);
        dw.until(ExpectedConditions.visibilityOfElementLocated(welcomeLineXpath));
        return driver.findElement(welcomeLineXpath).getText();
    }

}
