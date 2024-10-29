package HomePage.NewsSubscription;

import a1PageObjectModel.HomePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ToastPresenceTest extends BaseTest {

    @DisplayName("Отображение блока, всплывающего в ответ на отправление адреса email для подписки на новости")
    @ParameterizedTest
    @ValueSource(strings = {"", "meauvv@gmail.com"})
    @Order(1)
    public void toastPresenceTest(String email) {
        HomePage homePage = new HomePage(BaseTest.driver);
        homePage.sendEmailForNewsSub(email);
        assertTrue(homePage.isToastDisplayed());
    }

}
