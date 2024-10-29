package HomePage.NewsSubscription;

import WebDriverInstance.WebDriverInstance;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    public static WebDriver driver;

    @BeforeEach
    public void testDriverSetup() {
        driver = WebDriverInstance.getInstance();
    }

    @AfterAll
    static void testDriverClose() {
        WebDriverInstance.quitDriver();
    }

}
