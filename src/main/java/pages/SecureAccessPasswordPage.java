package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAccessPasswordPage {

    private WebDriver driver;
    private By statusNotification = By.xpath("//h1");

    public SecureAccessPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getNotification(){
        return driver.findElement(statusNotification).getText();
    }
}
