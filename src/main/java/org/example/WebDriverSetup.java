package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSetup {

    public static WebDriver webDriverSetup() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.get("http://www.mts.by/");
        WebElement cookieDisagreeBtn = driver.findElement(By.xpath("//button[contains(@class,\"cookie__cancel\")]"));
        cookieDisagreeBtn.click();
        return driver;
    }

}
