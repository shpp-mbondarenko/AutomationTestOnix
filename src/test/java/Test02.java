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
 * Created by Maxim Bondarenko on 24.03.2017.
 */
public class Test02 {


    @Test
    public void fillOutForm() {
        System.setProperty("webdriver.gecko.driver", "C:\\Geco\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://testbetaadoric.onix.ua/tabs3.html");

        Wait<WebDriver> wait = new WebDriverWait(driver,60,1000).withMessage("Element was not found");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("test_third_lb")));
        System.out.println("Element has been find - test_third_lb");

        //fill out form
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("FName")));
        element.clear();
        element.sendKeys("Max");
        element = driver.findElement(By.name("LName"));
        element.clear();
        element.sendKeys("Bond");
        element = driver.findElement(By.name("Email"));
        element.clear();
        element.sendKeys("maxbond@email.com");
        element = driver.findElement(By.name("Age"));
        element.clear();
        element.sendKeys("18");
        element = driver.findElement(By.name("Phone"));
        element.clear();
        element.sendKeys("0661234567");
        element = driver.findElement(By.name("Url"));
        element.clear();
        element.sendKeys("http://testbetaadoric.onix.ua/tabs3.html");
        //click button
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        element = driver.findElement(By.cssSelector(".element-form-input"));
        element.click();

        driver.quit();
        System.out.println("program closed");
    }
}
