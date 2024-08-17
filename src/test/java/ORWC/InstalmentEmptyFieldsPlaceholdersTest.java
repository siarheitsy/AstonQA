package ORWC;

import MTSPageObjectModel.MainPage;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class InstalmentEmptyFieldsPlaceholdersTest extends BaseTest {

    @Test(groups = {"functional"}, description = "Check empty fields values of 'Instalment' option in online replenishment block", priority = -8)
    @Description("Test Description: test for correct display of the Score number, Sum and Email placeholders for 'Instalment' option")
    @Story("Check empty fields values of 'Instalment' option in online replenishment block")
    public static void instalmentEmptyFieldsPlaceholdersTest() {
        MainPage mainPage = new MainPage(BaseTest.driver);
        mainPage.chooseOrwcSelectOption("Рассрочка");
        Allure.step("Instalment option selected in ORWC block");
        instalmentScorePlaceholderCheck(mainPage);
        instalmentSumPlaceholderCheck(mainPage);
        instalmentEmailPlaceholderCheck(mainPage);
    }

    public static void instalmentScorePlaceholderCheck(MainPage mainPage) {
        if (Objects.equals(mainPage.getOrwcInstalmentScoreValue(), "")) {
            Assert.assertEquals(mainPage.getOrwcInstalmentScorePlaceholder(), "Номер счета на 44");
        }
    }

    public static void instalmentSumPlaceholderCheck(MainPage mainPage) {
        if (Objects.equals(mainPage.getOrwcInstalmentSumValue(), "")) {
            Assert.assertEquals(mainPage.getOrwcInstalmentSumPlaceholder(), "Сумма");
        }
    }

    public static void instalmentEmailPlaceholderCheck(MainPage mainPage) {
        if (Objects.equals(mainPage.getOrwcInstalmentEmailValue(), "")) {
            Assert.assertEquals(mainPage.getOrwcInstalmentEmailPlaceholder(), "E-mail для отправки чека");
        }
    }

}
