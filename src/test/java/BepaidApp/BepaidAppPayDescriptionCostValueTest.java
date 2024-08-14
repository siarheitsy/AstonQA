package BepaidApp;

import MTSPageObjectModel.MainPage;
import ORWC.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BepaidAppPayDescriptionCostValueTest extends BaseTest {

    @Test(groups = {"functional"}, description = "Check cost value in BepaidApp modal", priority = -5)
    public static void bepaidAppPayDescriptionCostValueTest() {
        BaseTest.driver.manage().timeouts().implicitlyWait(1500, TimeUnit.MILLISECONDS);
        MainPage mainPage = new MainPage(BaseTest.driver);
        Assert.assertEquals(mainPage.getBepaidAppPayDescriptionCostValue(), "1.00 BYN");
    }

}
