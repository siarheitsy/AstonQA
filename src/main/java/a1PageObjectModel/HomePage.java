package a1PageObjectModel;

import WebDriverInstance.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = WebDriverInstance.getInstance();
    }

    //news subscription block
    private By newsSubEmailInput = By.xpath("//input[@id='i-subscribe-input']");
    private By newsSubBtn = By.xpath("//label[@for='i-subscribe-input']/button[@type='submit']");
    private By toastBodyDiv = By.xpath("//div[@class='iziToast-body']");
    private By toastContentTitleDiv = By.xpath("//div[@class='iziToast-body']//div[@class='toast-content-title']");
    private By toastContentTextDiv = By.xpath("//div[@class='iziToast-body']//div[@class='toast-content-text']");

    public String getToastContentTitle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOfElementLocated(toastContentTitleDiv));
        return driver.findElement(toastContentTitleDiv).getText();
    }

    public String getToastContentText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOfElementLocated(toastContentTextDiv));
        return driver.findElement(toastContentTextDiv).getText();
    }

    public void typeNewsSubEmailInput(String email) {
        driver.findElement(newsSubEmailInput).sendKeys(email);
    }

    public void clickNewsSubBtn() {
        WebElement button = driver.findElement(newsSubBtn);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.elementToBeClickable(button));
        /*Actions actions = new Actions(driver);
        actions.moveToElement(button).click().perform();*/
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
        //button.click();
    }

    public void sendEmailForNewsSub(String email) {
        typeNewsSubEmailInput(email);
        clickNewsSubBtn();
    }

    public boolean isToastDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
            wait.until(ExpectedConditions.visibilityOfElementLocated(toastContentTextDiv));
            return driver.findElement(toastBodyDiv).isDisplayed() && driver.findElement(toastContentTitleDiv).isDisplayed() && driver.findElement(toastContentTextDiv).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
