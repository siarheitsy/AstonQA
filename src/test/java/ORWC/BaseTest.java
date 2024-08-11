package ORWC;

import WebDriverInstance.WebDriverInstance;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    public static WebDriver driver;

    @BeforeClass
    public void testDriverSetup() {
        driver = WebDriverInstance.getInstance();
    }

    @AfterTest
    static void testDriverClose() {
        driver.quit();
    }

}
