package ORWC;

import MTSPageObjectModel.MainPage;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContinueBtnTest extends BaseTest {

    @Test(groups = {"functional"}, description = "Check functionality of “Continue” button with correctly filled fields", priority = -6)
    @Description("Test Description: test for correct work of \"Continue\" button with correctly filled inputs")
    @Story("Check functionality of “Continue” button with correctly filled fields")
    public static void negativeContinueBtnTest() {
        BaseTest.driver.get("http://www.mts.by/");
        BaseTest.driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
        MainPage mainPage = new MainPage(BaseTest.driver);
        mainPage.chooseOrwcSelectOption("");
        mainPage.submitOrwcFormWithCredentials("(29)777-77-77", "1");
        Allure.step("Input fields filled in ORWC block");
        Assert.assertTrue(mainPage.isBepaidAppModalLoaded());
    }
}
