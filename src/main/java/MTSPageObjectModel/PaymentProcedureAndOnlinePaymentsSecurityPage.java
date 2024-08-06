package MTSPageObjectModel;

import org.openqa.selenium.WebDriver;

public class PaymentProcedureAndOnlinePaymentsSecurityPage {

    private String pageUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";

    private final WebDriver driver;

    public PaymentProcedureAndOnlinePaymentsSecurityPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageUrl() {
        return pageUrl;
    }

}
