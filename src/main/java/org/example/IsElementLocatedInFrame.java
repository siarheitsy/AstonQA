package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IsElementLocatedInFrame {

    public static boolean isElementLocatedInFrame(WebDriver driver, By xpath) {
        int size = driver.findElements(By.tagName("iframe")).size();
        for (int i = 0; i <= size; i++) {
            driver.switchTo().frame(i);
            int total = driver.findElements(xpath).size();
            if (total > 0) {
                return true;
            }
        }
        driver.switchTo().defaultContent();
        System.out.println("Не найдено фреймов с нужным элементом, искомый путь: " + xpath);
        return false;
    }

}
