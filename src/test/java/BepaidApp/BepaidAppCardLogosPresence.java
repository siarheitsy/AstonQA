package BepaidApp;

import MTSPageObjectModel.MainPage;
import ORWC.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BepaidAppCardLogosPresence extends BaseTest {

    @Test(groups = {"functional"}, description = "Check for payment system logos in BepaidApp card inputs")
    public static void logosPresenceTest() {
        String[] stableLogoImagePaths = new String[]{"https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/visa-system.svg", "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/mastercard-system.svg", "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/belkart-system.svg"};
        String[] changeableLogoImagePaths = new String[]{"https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/maestro-system.svg", "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/mir-system-ru.svg"};
        MainPage mainPage = new MainPage(driver);
        for (String logoImagePath : stableLogoImagePaths) {
            boolean isLogoImagePresented = mainPage.isBepaidAppCardPaymentSystemStableLogoPresented(logoImagePath);
            Assert.assertTrue(isLogoImagePresented);
        }
        for (String logoImagePath : changeableLogoImagePaths) {
            boolean isLogoImagePresented = mainPage.isBepaidAppCardPaymentSystemChangeableLogoPresented(logoImagePath);
            Assert.assertTrue(isLogoImagePresented);
        }

    }

}
