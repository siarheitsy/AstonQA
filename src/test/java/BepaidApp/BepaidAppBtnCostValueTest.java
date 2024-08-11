package BepaidApp;

import MTSPageObjectModel.MainPage;
import ORWC.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BepaidAppBtnCostValueTest extends BaseTest {

    @Test(groups = {"functional"}, description = "Check value of 'Pay' button in BepaidApp modal")
    public static void bepaidAppBtnCostValueTest() {
        MainPage mainPage = new MainPage(BaseTest.driver);
        Assert.assertEquals(mainPage.getBepaidAppPayBtnValue(), "Оплатить 1.00 BYN");
    }

}
