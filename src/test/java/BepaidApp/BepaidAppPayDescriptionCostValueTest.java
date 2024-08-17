package BepaidApp;

import MTSPageObjectModel.MainPage;
import ORWC.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BepaidAppPayDescriptionCostValueTest extends BaseTest {

    @Test(groups = {"functional"}, description = "Check cost value in BepaidApp modal", priority = -5)
    @Description("Test Description: test for correct display of the cost value")
    @Story("Check cost value in BepaidApp modal")
    public static void bepaidAppPayDescriptionCostValueTest() {
        BaseTest.driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
        MainPage mainPage = new MainPage(BaseTest.driver);
        Allure.step("Bepaid App modal opened");
        Assert.assertEquals(mainPage.getBepaidAppPayDescriptionCostValue(), "1.00 BYN");
    }

}
