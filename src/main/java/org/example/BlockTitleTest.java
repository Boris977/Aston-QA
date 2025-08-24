package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BlockTitleTest extends BaseTest {

    @Test
    public void checkBlockTitle() {
        driver.get("https://www.mts.by/");

        WebElement title = driver.findElement(By.xpath("//h2[contains(text(),'Онлайн пополнение')]"));
        assertTrue(title.isDisplayed(), "Заголовок блока не отображается");

        
        String actualText = title.getText().replace("\n", " ").trim();
        String expectedText = "Онлайн поплнение без комиссии";

        assertEquals(expectedText, actualText, "Текст заголовка не совпадает");
    }
}
