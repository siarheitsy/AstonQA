import MTSPageObjectModel.MainPage;
import org.example.WebDriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogosPresenceTest {

    static WebDriver driver;

    @BeforeClass
    public void testDriverSetup() {
        driver = WebDriverSetup.webDriverSetup();
    }

    @AfterClass
    static void testDriverClose() {
        driver.quit();
    }

    @Test(groups = {"functional"}, description = "Check for payment system logos of online replenishment block")
    public static void logosPresenceTest() {
        String[] logoImagePaths = new String[]{"/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg", "/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg", "/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg", "/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg", "/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg"};
        MainPage mainPage = new MainPage(driver);
        for (String logoImagePath : logoImagePaths) {
            boolean isLogoImagePresented = mainPage.isOrwcPaymentSystemLogoPresented("https://www.mts.by" + logoImagePath);
            Assert.assertTrue(isLogoImagePresented);
        }

    }

}
