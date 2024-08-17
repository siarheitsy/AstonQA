package BepaidApp;

import MTSPageObjectModel.MainPage;
import ORWC.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BepaidAppPayDescriptionTextValueTest extends BaseTest {

    @Test(groups = {"functional"}, description = "Check value of text description in BepaidApp modal", priority = -4)
    @Description("Test Description: test for correct display of the selected option and Phone number value")
    @Story("Check value of text description in BepaidApp modal")
    public static void bepaidAppPayDescriptionTextValueTest() {
        MainPage mainPage = new MainPage(BaseTest.driver);
        Assert.assertEquals(mainPage.getBepaidAppPayDescriptionTextValue(), "Оплата: Услуги связи Номер:375297777777");
    }

}
