import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Maxim Bondarenko on 21.03.2017.
 */
public class Test00 {

    @Test
    public void navigateToWebPage(){
        System.setProperty("webdriver.gecko.driver","C:\\Geco\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://testbetaadoric.onix.ua/tabs3.html");

        //wait 10 sec
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("wait 10 sec");
        WebElement element = driver.findElement(By.cssSelector("#test_first_lb"));

        driver.quit();
        System.out.println("program closed");
    }
}
