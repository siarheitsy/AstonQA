package HomePage.NewsSubscription;

import a1PageObjectModel.HomePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ToastMessageTest extends BaseTest {

    @DisplayName("Соответствие текста в блоке, всплывающем в ответ на отправление адреса email для подписки на новости")
    @ParameterizedTest
    @CsvSource({"meauvv@gmail.com,Вы подписались,Вы успешно подписались на нашу новостную рассылку.", "a, Ошибка заполнения,Проверьте указанный email."})
    @Order(2)
    public void toastMessageTest(String email, String expectedTitle, String expectedText) {
        HomePage homePage = new HomePage(BaseTest.driver);
        homePage.sendEmailForNewsSub(email);
        assertAll("Проверка соответствия текста в всплывающем блоке", () -> assertEquals(expectedTitle, homePage.getToastContentTitle(), "Заголовок должен содержать \"" + expectedTitle + "\""), () -> assertEquals(expectedText, homePage.getToastContentText(), "Текст должен содержать \"" + expectedText + "\""));
    }

}
