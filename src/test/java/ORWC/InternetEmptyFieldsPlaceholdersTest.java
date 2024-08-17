package ORWC;

import MTSPageObjectModel.MainPage;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class InternetEmptyFieldsPlaceholdersTest extends BaseTest {

    @Test(groups = {"functional"}, description = "Check empty fields values of 'Internet' option in  online replenishment block", priority = -9)
    @Description("Test Description: test for correct display of the Phone number, Sum and Email placeholders for 'Internet' option")
    @Story("Check empty fields values of 'Internet' option in online replenishment block")
    public static void internetEmptyFieldsPlaceholdersTest() {
        MainPage mainPage = new MainPage(BaseTest.driver);
        mainPage.chooseOrwcSelectOption("Домашний интернет");
        Allure.step("Internet option selected in ORWC block");
        internetPhoneNumberPlaceholderCheck(mainPage);
        internetSumPlaceholderCheck(mainPage);
        internetEmailPlaceholderCheck(mainPage);
    }

    public static void internetPhoneNumberPlaceholderCheck(MainPage mainPage) {
        if (Objects.equals(mainPage.getOrwcInternetPhoneNumberValue(), "")) {
            Assert.assertEquals(mainPage.getOrwcInternetPhoneNumberPlaceholder(), "Номер абонента");
        }
    }

    public static void internetSumPlaceholderCheck(MainPage mainPage) {
        if (Objects.equals(mainPage.getOrwcInternetSumValue(), "")) {
            Assert.assertEquals(mainPage.getOrwcInternetSumPlaceholder(), "Сумма");
        }
    }

    public static void internetEmailPlaceholderCheck(MainPage mainPage) {
        if (Objects.equals(mainPage.getOrwcInternetEmailValue(), "")) {
            Assert.assertEquals(mainPage.getOrwcInternetEmailPlaceholder(), "E-mail для отправки чека");
        }
    }

}
