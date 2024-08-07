import MTSPageObjectModel.MainPage;
import org.example.WebDriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class ContinueBtnTest {

    static WebDriver driver;

    @BeforeClass
    public void testDriverSetup() {
        driver = WebDriverSetup.webDriverSetup();
    }

    @AfterClass
    static void testDriverClose() {
        driver.switchTo().defaultContent();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.quit();
    }

    @Test(groups = {"functional"}, description = "Check functionality of “Continue” button with correctly filled fields")
    public static void negativeContinueBtnTest() {
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
        MainPage mainPage = new MainPage(driver);
        mainPage.submitOrwcFormWithCredentials("(29)777-77-77", "1");
        Assert.assertTrue(mainPage.isBepaidAppPhoneErrorMessageDisplayed());
    }
}
