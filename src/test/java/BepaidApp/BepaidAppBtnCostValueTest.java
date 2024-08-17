package BepaidApp;

import MTSPageObjectModel.MainPage;
import ORWC.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import jdk.jfr.Name;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BepaidAppBtnCostValueTest extends BaseTest {

    @Test(groups = {"functional"}, description = "Check value of 'Pay' button in BepaidApp modal", priority = -3)
    @Description("Test Description: test for correct display of the cost value on the \"Continue\" button")
    @Story("Check value of 'Pay' button in BepaidApp modal")
    public static void bepaidAppBtnCostValueTest() {
        MainPage mainPage = new MainPage(BaseTest.driver);
        Assert.assertEquals(mainPage.getBepaidAppPayBtnValue(), "Оплатить 1.00 BYN");
    }

}
