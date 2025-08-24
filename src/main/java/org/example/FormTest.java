package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormTest extends BaseTest {

    @Test
    public void checkFormSubmission() {
        driver.get("https://www.mts.by/");

        // Выбор услуги "Услуги связи"
        driver.findElement(By.cssSelector("span.select__now")).click();
        driver.findElement(By.xpath("//li[contains(text(),'Услуги связи')]")).click();


        // Ввод номера телефона
        WebElement phoneInput = driver.findElement(By.xpath("//input[contains(@placeholder,'телефон')]"));
        phoneInput.sendKeys("297777777");

        // Ввод суммы
        WebElement amountInput = driver.findElement(By.xpath("//input[contains(@placeholder,'сумма')]"));
        amountInput.sendKeys("5");

        // Проверка и нажатие кнопки "Продолжить"
        WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(),'Продолжить')]"));
        assertTrue(continueButton.isEnabled(), "Кнопка 'Продолжить' должна быть активна");
        continueButton.click();
    }
}
