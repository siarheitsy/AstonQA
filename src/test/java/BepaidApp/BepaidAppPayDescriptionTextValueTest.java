package BepaidApp;

import MTSPageObjectModel.MainPage;
import ORWC.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BepaidAppPayDescriptionTextValueTest extends BaseTest {

    @Test(groups = {"functional"}, description = "Check value of text description in BepaidApp modal", priority = -4)
    public static void bepaidAppPayDescriptionTextValueTest() {
        MainPage mainPage = new MainPage(BaseTest.driver);
        Assert.assertEquals(mainPage.getBepaidAppPayDescriptionTextValue(), "Оплата: Услуги связи Номер:375297777777");
    }

}
