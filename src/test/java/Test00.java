import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Maxim Bondarenko on 21.03.2017.
 */
public class Test00 {

    @Test
    public void navigateToWebPage(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://testbetaadoric.onix.ua/tabs3.html");

        //wait until object appear
        Wait<WebDriver> wait = new WebDriverWait(driver,10,1000).withMessage("Element was not found");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#test_first_lb")));
        System.out.println("wait 10 sec");
        WebElement element = driver.findElement(By.cssSelector("#test_first_lb"));

        driver.quit();
        System.out.println("program closed");
    }
}
