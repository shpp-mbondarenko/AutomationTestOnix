import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Created by Maxim Bondarenko on 22.03.2017.
 */
public class Test01 {

    @Test
    public void changeKeyValue(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://testbetaadoric.onix.ua/tabs3.html");


        //-------------------------------
        Wait<WebDriver> wait = new WebDriverWait(driver,60,1000).withMessage("Element was not found");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("test_second_lb")));
        System.out.println("Element has been find - test_second_lb");
        //-------------------------------

        //finding element in session storage
        LocalStorage localStorage = new LocalStorage(driver);
        System.out.println("Elements value BEFORE - " + localStorage.getItemFromLocalStorage("lastSpentTime_58cc15276887c92891c9df66"));
        localStorage.setItemInLocalStorage("lastSpentTime_58cc15276887c92891c9df66", "1000");
        System.out.println("Elements value AFTER - " + localStorage.getItemFromLocalStorage("lastSpentTime_58cc15276887c92891c9df66"));

        driver.quit();
        System.out.println("program closed");

    }
}
