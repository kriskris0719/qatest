package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgorPasswordPage {
    private WebDriver driver;
    private By enterEmail = By.id("email");
    private By retrievePassword = By.id("form_submit");

    public ForgorPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEnterEmail(String email) {
        driver.findElement(enterEmail).sendKeys(email);
    }

    public SecureAccessPasswordPage clickRetPassButton(){
        driver.findElement(retrievePassword).click();
        return new SecureAccessPasswordPage(driver);
    }
}
