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

    private String url = "http://testbetaadoric.onix.ua/tabs3.html";
    @Test
    public void fillOutForm() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://testbetaadoric.onix.ua/tabs3.html");

        Wait<WebDriver> wait = new WebDriverWait(driver,30,1000).withMessage("Element was not found");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("test_third_lb")));
        System.out.println("Element has been find - test_third_lb");

        //fill out form
        WebElement elementName = wait.until(ExpectedConditions.elementToBeClickable(By.name("FName")));
        elementName.clear();
        elementName.sendKeys("Max");
        WebElement elementLastName = driver.findElement(By.name("LName"));
        elementLastName.clear();
        elementLastName.sendKeys("Bond");
        WebElement elementEmail = driver.findElement(By.name("Email"));
        elementEmail.clear();
        elementEmail.sendKeys("maxbond@email.com");
        WebElement elementAge = driver.findElement(By.name("Age"));
        elementAge.clear();
        elementAge.sendKeys("18");
        WebElement elementPhone = driver.findElement(By.name("Phone"));
        elementPhone.clear();
        elementPhone.sendKeys("0661234567");
        WebElement elementUrl = driver.findElement(By.name("Url"));
        elementUrl.clear();
        elementUrl.sendKeys(url);
        //click button
        WebElement elementButtonSubmit = driver.findElement(By.cssSelector(".element-form-input"));
        elementButtonSubmit.click();

//        driver.quit();
        System.out.println("program closed");
    }
}
