package BepaidApp;

import MTSPageObjectModel.MainPage;
import ORWC.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BepaidAppCardInputPlaceholdersTest extends BaseTest {

    @Test(groups = {"functional"}, description = "Check empty input fields values option in BepaidApp modal", priority = -2)
    @Description("Test Description: test for correct display of the Card number, Validity period, CVC and Owner name placeholders")
    @Story("Check empty input fields values option in BepaidApp modal")
    public static void bepaidAppCardInputPlaceholdersTest() {
        MainPage mainPage = new MainPage(BaseTest.driver);
        bepaidAppCardNumberCheck(mainPage);
        bepaidAppCardDurationCheck(mainPage);
        bepaidAppCardCvcCheck(mainPage);
        bepaidAppCardOwnerNameCheck(mainPage);
    }

    public static void bepaidAppCardNumberCheck(MainPage mainPage) {
        Assert.assertEquals(mainPage.getBepaidAppCardNumberValue(), "Номер карты");
    }

    public static void bepaidAppCardDurationCheck(MainPage mainPage) {
        Assert.assertEquals(mainPage.getBepaidAppCardDurationValue(), "Срок действия");
    }

    public static void bepaidAppCardCvcCheck(MainPage mainPage) {
        Assert.assertEquals(mainPage.getBepaidAppCardCvcValue(), "CVC");
    }

    public static void bepaidAppCardOwnerNameCheck(MainPage mainPage) {
        Assert.assertEquals(mainPage.getBepaidAppCardOwnerNameValue(), "Имя держателя (как на карте)");
    }

}
