package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsElementLocatedInFrame {

    public static boolean isElementLocatedInFrame(WebDriver driver) {
        int size = driver.findElements(By.tagName("iframe")).size();
        for (int i = 0; i <= size; i++) {
            driver.switchTo().frame(i);
            int total = driver.findElements(By.xpath("//div[@class='app-wrapper__content']")).size();
            if (total > 0) {
                return true;
            }
        }
        driver.switchTo().defaultContent();
        return false;
    }

}
