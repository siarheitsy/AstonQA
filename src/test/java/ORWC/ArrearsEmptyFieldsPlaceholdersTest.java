package ORWC;

import MTSPageObjectModel.MainPage;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Objects;

public class ArrearsEmptyFieldsPlaceholdersTest extends BaseTest {

    @Test(groups = {"functional"}, description = "Check empty fields values of 'Arrears' option in online replenishment block", priority = -7)
    @Description("Test Description: test for correct display of the Score number, Sum and Email placeholders for 'Arrears' option")
    @Story("Check empty fields values of 'Arrears' option in online replenishment block")
    public static void arrearsEmptyFieldsPlaceholdersTest() {
        MainPage mainPage = new MainPage(BaseTest.driver);
        mainPage.chooseOrwcSelectOption("Задолженность");
        Allure.step("Arrears option selected in ORWC block");
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
