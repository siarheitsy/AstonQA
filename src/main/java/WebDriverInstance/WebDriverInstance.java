package WebDriverInstance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverInstance {

    private static WebDriver driverInstance;

    public static WebDriver getInstance() {
        if (driverInstance == null) {
            return driverInstance = Initialize();
        }
        return driverInstance;
    }

    private WebDriverInstance() {
    }

    private static WebDriver Initialize() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
        driver.get("http://www.mts.by/");
        WebElement cookieDisagreeBtn = driver.findElement(By.xpath("//button[contains(@class,\"cookie__cancel\")]"));
        cookieDisagreeBtn.click();
        return driver;
    }

}
