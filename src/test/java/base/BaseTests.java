package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement inputsLink1 = driver.findElement(By.linkText("Shifting Content"));
        inputsLink1.click();
        WebElement inputsLink2 = driver.findElement(By.linkText("Example 1: Menu Element"));
        inputsLink2.click();
        List<WebElement> lnks = driver.findElements(By.tagName("li"));
        System.out.println("Number Links "+lnks.size());
    }

    public void ex(){
        driver.quit();
    }

    public static void main(String args[]) {
        BaseTests test = new BaseTests();
        test.setUp();
        test.ex();
    }
}


