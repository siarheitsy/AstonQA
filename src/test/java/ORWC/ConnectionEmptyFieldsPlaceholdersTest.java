package ORWC;

import MTSPageObjectModel.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class ConnectionEmptyFieldsPlaceholdersTest extends BaseTest {

    @Test(groups = {"functional"}, description = "Check empty fields values of 'Connection' option in online replenishment block", priority = -10)
    public static void connectionEmptyFieldsPlaceholdersTest() {
        MainPage mainPage = new MainPage(BaseTest.driver);
        mainPage.chooseOrwcSelectOption("Задолженность");
        connectionPhoneNumberPlaceholderCheck(mainPage);
        connectionSumPlaceholderCheck(mainPage);
        connectionEmailPlaceholderCheck(mainPage);
    }

    public static void connectionPhoneNumberPlaceholderCheck(MainPage mainPage) {
        if (Objects.equals(mainPage.getOrwcConnectionPhoneNumberValue(), "")) {
            Assert.assertEquals(mainPage.getOrwcConnectionPhoneNumberPlaceholder(), "Номер телефона");
        }
    }

    public static void connectionSumPlaceholderCheck(MainPage mainPage) {
        if (Objects.equals(mainPage.getOrwcConnectionSumValue(), "")) {
            Assert.assertEquals(mainPage.getOrwcConnectionSumPlaceholder(), "Сумма");
        }
    }

    public static void connectionEmailPlaceholderCheck(MainPage mainPage) {
        if (Objects.equals(mainPage.getOrwcConnectionEmailValue(), "")) {
            Assert.assertEquals(mainPage.getOrwcConnectionEmailPlaceholder(), "E-mail для отправки чека");
        }
    }

}
