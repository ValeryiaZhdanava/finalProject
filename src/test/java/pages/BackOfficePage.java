package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackOfficePage {

    private WebElement customerLoginBtn;
    private WebDriver driver;
    WebDriverWait webDriverWait;


    public BackOfficePage(WebDriver driver) {
        this.driver = driver;
    }
}
