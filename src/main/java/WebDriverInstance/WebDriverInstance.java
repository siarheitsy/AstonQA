package WebDriverInstance;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
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
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.a1.by/ru/");
        driver.manage().window().maximize();//setSize(new Dimension(1920, 1080));
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement cookieDisagreeBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='CookiesStickyPanel']//button[@data-action-button='rejectAll']")));
            cookieDisagreeBtn.click();
        } catch (TimeoutException ex) {
            System.out.println("Проблема с закрытием окна куки");
        }
        return driver;
    }

    public static void quitDriver() {
        if (driverInstance != null) {
            driverInstance.quit();
            driverInstance = null;
        }
    }

}
