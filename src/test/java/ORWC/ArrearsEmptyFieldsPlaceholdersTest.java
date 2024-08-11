package ORWC;

import MTSPageObjectModel.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;

public class ArrearsEmptyFieldsPlaceholdersTest extends BaseTest {

    @Test(groups = {"functional"}, description = "Check empty fields values of 'Arrears' option in online replenishment block")
    public static void arrearsEmptyFieldsPlaceholdersTest() {
        MainPage mainPage = new MainPage(BaseTest.driver);
        mainPage.chooseOrwcSelectOption("Задолженность");
        arrearsScorePlaceholderCheck(mainPage);
        arrearsSumPlaceholderCheck(mainPage);
        arrearsEmailPlaceholderCheck(mainPage);
    }

    public static void arrearsScorePlaceholderCheck(MainPage mainPage) {
        if (Objects.equals(mainPage.getOrwcArrearsScoreValue(), "")) {
            Assert.assertEquals(mainPage.getOrwcArrearsScorePlaceholder(), "Номер счета на 2073");
        }
    }

    public static void arrearsSumPlaceholderCheck(MainPage mainPage) {
        if (Objects.equals(mainPage.getOrwcArrearsSumValue(), "")) {
            Assert.assertEquals(mainPage.getOrwcArrearsSumPlaceholder(), "Сумма");
        }
    }

    public static void arrearsEmailPlaceholderCheck(MainPage mainPage) {
        if (Objects.equals(mainPage.getOrwcArrearsEmailValue(), "")) {
            Assert.assertEquals(mainPage.getOrwcArrearsEmailPlaceholder(), "E-mail для отправки чека");
        }
    }

}
