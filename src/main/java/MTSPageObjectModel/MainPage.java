package MTSPageObjectModel;

import WebDriverInstance.WebDriverInstance;
import org.example.IsElementLocatedInFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class MainPage {
    //ORWC means online replenishment without commission
    private By orwcConnectionPhoneNumberInput = By.xpath("//input[@id=\"connection-phone\"]");
    private By orwcConnectionSumInput = By.xpath("//input[@id=\"connection-sum\"]");
    private By orwcConnectionEmailInput = By.xpath("//input[@id=\"connection-email\"]");
    private By orwcInternetPhoneNumberInput = By.xpath("//input[@id=\"internet-phone\"]");
    private By orwcInternetSumInput = By.xpath("//input[@id=\"internet-sum\"]");
    private By orwcInternetEmailInput = By.xpath("//input[@id=\"internet-email\"]");
    private By orwcInstalmentScoreInput = By.xpath("//input[@id=\"score-instalment\"]");
    private By orwcInstalmentSumInput = By.xpath("//input[@id=\"instalment-sum\"]");
    private By orwcInstalmentEmailInput = By.xpath("//input[@id=\"instalment-email\"]");
    private By orwcArrearsScoreInput = By.xpath("//input[@id=\"score-arrears\"]");
    private By orwcArrearsSumInput = By.xpath("//input[@id=\"arrears-sum\"]");
    private By orwcArrearsEmailInput = By.xpath("//input[@id=\"arrears-email\"]");
    private By orwcContinueBtn = By.xpath("//button[@type='submit' and contains(text(), 'Продолжить')]");
    private By orwcSelectHeader = By.xpath("//button[contains(@class,'select__header')]");
    private By orwcSelectOption = By.xpath("//div[contains(@class,'select__wrapper')]//p[contains(@class, 'select__option')]");
    private By orwcSelectItem = By.xpath("//div[contains(@class,'select__wrapper')]//li[contains(@class, 'select__item')]");
    private By orwcSelectActiveItem = By.xpath("//div[contains(@class,'select__wrapper')]//li[contains(@class, 'active') and contains(@class, 'select__item')]");

    private By bepaidAppModalContentBlock = By.xpath("//div[@class='app-wrapper__content']");
    private By bepaidAppPayDescriptionCostValue = By.xpath("//div[@class='pay-description__cost']/span");
    private By bepaidAppPayDescriptionTextValue = By.xpath("//div[@class='pay-description__text']/span");
    private By bepaidAppPayBtn = By.xpath("//button[@class='colored disabled']");
    private By bepaidAppCardNumberInput = By.xpath("//label[@class='ng-tns-c46-1 ng-star-inserted']");
    private By bepaidAppCardCvcInput = By.xpath("//label[@class='ng-tns-c46-5 ng-star-inserted']");
    private By bepaidAppCardDurationInput = By.xpath("//label[@class='ng-tns-c46-4 ng-star-inserted']");
    private By bepaidAppCardOwnerNameInput = By.xpath("//label[@class='ng-tns-c46-3 ng-star-inserted']");
    private By bepaidAppCardPaymentSystemStableLogo = By.xpath("//img[@class='ng-tns-c61-0 ng-star-inserted']");
    private By bepaidAppCardPaymentSystemChangeableLogo = By.xpath("//img[contains(@class, 'ng-tns-c61-0 ng-trigger ng-trigger-randomCardState ng-star-inserted')]");

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = WebDriverInstance.getInstance();
    }

    public void clickOrwcSelectHeader() {
        driver.findElement(orwcSelectHeader).click();
    }

    public void clickOrwcSelectItem(String optionText) {
        List<WebElement> selectOptions = driver.findElements(orwcSelectOption);
        for (int i = 0; i < selectOptions.size(); i++) {
            if (Objects.equals(selectOptions.get(i).getText(), optionText)) {
                List<WebElement> selectItems = driver.findElements(orwcSelectItem);
                selectItems.get(i).click();
            }
        }
    }

    public void chooseOrwcSelectOption(String optionText) {
        clickOrwcSelectHeader();
        clickOrwcSelectItem(optionText);
    }

    public String getOrwcConnectionPhoneNumberValue() {
        return driver.findElement(orwcConnectionPhoneNumberInput).getText();
    }

    public String getOrwcInternetPhoneNumberValue() {
        return driver.findElement(orwcInternetPhoneNumberInput).getText();
    }

    public String getOrwcConnectionPhoneNumberPlaceholder() {
        return driver.findElement(orwcConnectionPhoneNumberInput).getAttribute("placeholder");
    }

    public String getOrwcInternetPhoneNumberPlaceholder() {
        return driver.findElement(orwcInternetPhoneNumberInput).getAttribute("placeholder");
    }

    public String getOrwcInstalmentScoreValue() {
        return driver.findElement(orwcInstalmentScoreInput).getText();
    }

    public String getOrwcArrearsScoreValue() {
        return driver.findElement(orwcArrearsScoreInput).getText();
    }

    public String getOrwcInstalmentScorePlaceholder() {
        return driver.findElement(orwcInstalmentScoreInput).getAttribute("placeholder");
    }

    public String getOrwcArrearsScorePlaceholder() {
        return driver.findElement(orwcArrearsScoreInput).getAttribute("placeholder");
    }

    public String getOrwcConnectionSumValue() {
        return driver.findElement(orwcConnectionSumInput).getText();
    }

    public String getOrwcInternetSumValue() {
        return driver.findElement(orwcInternetSumInput).getText();
    }

    public String getOrwcInstalmentSumValue() {
        return driver.findElement(orwcInstalmentSumInput).getText();
    }

    public String getOrwcArrearsSumValue() {
        return driver.findElement(orwcArrearsSumInput).getText();
    }

    public String getOrwcConnectionSumPlaceholder() {
        return driver.findElement(orwcConnectionSumInput).getAttribute("placeholder");
    }

    public String getOrwcInternetSumPlaceholder() {
        return driver.findElement(orwcInternetSumInput).getAttribute("placeholder");
    }

    public String getOrwcInstalmentSumPlaceholder() {
        return driver.findElement(orwcInstalmentSumInput).getAttribute("placeholder");
    }

    public String getOrwcArrearsSumPlaceholder() {
        return driver.findElement(orwcArrearsSumInput).getAttribute("placeholder");
    }

    public String getOrwcConnectionEmailValue() {
        return driver.findElement(orwcConnectionEmailInput).getText();
    }

    public String getOrwcInternetEmailValue() {
        return driver.findElement(orwcInternetEmailInput).getText();
    }

    public String getOrwcInstalmentEmailValue() {
        return driver.findElement(orwcInstalmentEmailInput).getText();
    }

    public String getOrwcArrearsEmailValue() {
        return driver.findElement(orwcArrearsEmailInput).getText();
    }

    public String getOrwcConnectionEmailPlaceholder() {
        return driver.findElement(orwcConnectionEmailInput).getAttribute("placeholder");
    }

    public String getOrwcInternetEmailPlaceholder() {
        return driver.findElement(orwcInternetEmailInput).getAttribute("placeholder");
    }

    public String getOrwcInstalmentEmailPlaceholder() {
        return driver.findElement(orwcInstalmentEmailInput).getAttribute("placeholder");
    }

    public String getOrwcArrearsEmailPlaceholder() {
        return driver.findElement(orwcArrearsEmailInput).getAttribute("placeholder");
    }

    public void typeOrwcPhoneNumber(String phoneNumber) {
        driver.findElement(orwcConnectionPhoneNumberInput).sendKeys(phoneNumber);
    }

    public void typeOrwcSum(String sumValue) {
        driver.findElement(orwcConnectionSumInput).sendKeys(sumValue);
    }

    public void submitOrwcForm() {
        driver.findElement(orwcContinueBtn).submit();
    }

    public void submitOrwcFormWithCredentials(String phoneNumber, String sumValue) {
        typeOrwcPhoneNumber(phoneNumber);
        typeOrwcSum(sumValue);
        submitOrwcForm();
    }

    public boolean isBepaidAppmodalLocatedInFrame() {
        return IsElementLocatedInFrame.isElementLocatedInFrame(driver, bepaidAppModalContentBlock);
    }

    public boolean isBepaidAppModalLoaded() {
        if (isBepaidAppmodalLocatedInFrame()) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
            wait.until(ExpectedConditions.visibilityOfElementLocated(bepaidAppModalContentBlock));
            return driver.findElement(bepaidAppModalContentBlock).isDisplayed();
        } else {
            return false;
        }
    }

    public String getBepaidAppPayDescriptionCostValue() {
        return driver.findElement(bepaidAppPayDescriptionCostValue).getText();
    }

    public String getBepaidAppPayDescriptionTextValue() {
        return driver.findElement(bepaidAppPayDescriptionTextValue).getText();
    }

    public String getBepaidAppPayBtnValue() {
        return driver.findElement(bepaidAppPayBtn).getText();
    }

    public String getBepaidAppCardNumberValue() {
        return driver.findElement(bepaidAppCardNumberInput).getText();
    }

    public String getBepaidAppCardDurationValue() {
        return driver.findElement(bepaidAppCardDurationInput).getText();
    }

    public String getBepaidAppCardCvcValue() {
        return driver.findElement(bepaidAppCardCvcInput).getText();
    }

    public String getBepaidAppCardOwnerNameValue() {
        return driver.findElement(bepaidAppCardOwnerNameInput).getText();
    }

    public boolean isBepaidAppCardPaymentSystemStableLogoPresented(String image_path) {
        boolean isLogoPresented = false;
        for (int i = 0; i < driver.findElements(bepaidAppCardPaymentSystemStableLogo).size(); i++) {
            isLogoPresented = Objects.equals(driver.findElements(bepaidAppCardPaymentSystemStableLogo).get(i).getAttribute("src"), image_path);
            if (isLogoPresented) return isLogoPresented;
        }
        return isLogoPresented;
    }

    public boolean isBepaidAppCardPaymentSystemChangeableLogoPresented(String image_path) {
        boolean isLogoPresented = false;
        for (int i = 0; i < driver.findElements(bepaidAppCardPaymentSystemChangeableLogo).size(); i++) {
            isLogoPresented = Objects.equals(driver.findElements(bepaidAppCardPaymentSystemChangeableLogo).get(i).getAttribute("src"), image_path);
            if (isLogoPresented) return isLogoPresented;
        }
        return isLogoPresented;
    }

}