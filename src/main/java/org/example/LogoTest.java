package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogoTest extends BaseTest {

    @Test
    public void checkPaymentLogos() {
        driver.get("https://www.mts.by/");
        String[] logos = {"Visa", "MasterCard", "Белкарт"};

        for (String alt : logos) {
            WebElement logo = driver.findElement(By.xpath("//img[contains(@alt,'" + alt + "')]"));
            assertTrue(logo.isDisplayed(), "Логотип " + alt + " не найден");
        }
    }
}
