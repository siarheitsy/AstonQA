package WebDriverInstance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebDrivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
        driver.get("http://www.mts.by/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,\"cookie__cancel\")]")));
        WebElement cookieDisagreeBtn = driver.findElement(By.xpath("//button[contains(@class,\"cookie__cancel\")]"));
        cookieDisagreeBtn.click();
        return driver;
    }

}
