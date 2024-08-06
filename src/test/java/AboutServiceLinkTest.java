import MTSPageObjectModel.MainPage;
import MTSPageObjectModel.PaymentProcedureAndOnlinePaymentsSecurityPage;
import org.example.WebDriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AboutServiceLinkTest {

    static WebDriver driver;

    @BeforeClass
    public void testDriverSetup() {
        driver = WebDriverSetup.webDriverSetup();
    }

    @AfterClass
    static void testDriverClose() {
        driver.quit();
    }

    @Test(groups = {"functional"}, description = "Check functionality of “More about the service” link")
    public static void aboutServiceLinkTest() {
        MainPage mainPage = new MainPage(driver);
        PaymentProcedureAndOnlinePaymentsSecurityPage aboutServicePage = mainPage.aboutOrwcServiceBtnClick();
        Assert.assertEquals(aboutServicePage.getPageUrl(), "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
        driver.navigate().back();
    }
}
