package MTSPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class MainPage {

    private String pageUrl = "https://www.mts.by/";
    //ORWC means online replenishment without commission
    private By orwcBlockTitle = By.xpath("//div[contains(@class,\"pay__wrapper\")]/h2");
    private By orwcPaymentSystemLogoImage = By.xpath("//div[@class='pay__partners']//img");
    private By orwcAboutServiceBtn = By.xpath("//a[contains(text(), 'Подробнее о сервисе')]");
    private By orwcPhoneNumberInput = By.xpath("//input[@id=\"connection-phone\"]");
    private By orwcSumInput = By.xpath("//input[@id=\"connection-sum\"]");
    private By orwcContinueBtn = By.xpath("//button[@type='submit' and contains(text(), 'Продолжить')]");

    private By bepaidAppModalContentBlock = By.xpath("//div[@class='app-wrapper__content']");
    private By bepaidAppPhoneErrorMessage = By.xpath("//p[text()='Неверно указан номер']");

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public String getOrwcBlockTitle() {
        return driver.findElement(orwcBlockTitle).getText();
    }

    public boolean isOrwcPaymentSystemLogoPresented(String image_path) {
        boolean isLogoPresented = false;
        for (int i = 0; i < driver.findElements(orwcPaymentSystemLogoImage).size(); i++) {
            isLogoPresented = Objects.equals(driver.findElements(orwcPaymentSystemLogoImage).get(i).getAttribute("src"), image_path);
            if (isLogoPresented) break;
        }
        return isLogoPresented;
    }

    public PaymentProcedureAndOnlinePaymentsSecurityPage aboutOrwcServiceBtnClick() {
        driver.findElement(orwcAboutServiceBtn).click();
        return new PaymentProcedureAndOnlinePaymentsSecurityPage(driver);
    }

    public MainPage typeOrwcPhoneNumber(String phoneNumber) {
        driver.findElement(orwcPhoneNumberInput).sendKeys(phoneNumber);
        return this;
    }

    public MainPage typeOrwcSum(String sumValue) {
        driver.findElement(orwcSumInput).sendKeys(sumValue);
        return this;
    }

    public MainPage submitOrwcForm() {
        driver.findElement(orwcContinueBtn).submit();
        return this;
    }

    public MainPage submitOrwcFormWithCredentials(String phoneNumber, String sumValue) {
        typeOrwcPhoneNumber(phoneNumber);
        typeOrwcSum(sumValue);
        return submitOrwcForm();
    }

    public boolean isBepaidAppPhoneErrorMessageDisplayed() {
        return driver.findElement(bepaidAppPhoneErrorMessage).isDisplayed();
    }

}
