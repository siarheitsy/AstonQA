package ORWC;

import MTSPageObjectModel.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContinueBtnTest extends BaseTest {

    @Test(groups = {"functional"}, description = "Check functionality of “Continue” button with correctly filled fields")
    public static void negativeContinueBtnTest() {
        BaseTest.driver.get("http://www.mts.by/");
        BaseTest.driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
        MainPage mainPage = new MainPage(BaseTest.driver);
        mainPage.chooseOrwcSelectOption("");
        mainPage.submitOrwcFormWithCredentials("(29)777-77-77", "1");
        Assert.assertTrue(mainPage.isBepaidAppModalLoaded());
    }
}
