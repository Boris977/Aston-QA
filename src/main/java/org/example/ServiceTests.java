package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ServiceTests extends BaseTest {

    @Test
    public void checkMoreAboutServiceLink() {
        driver.get("https://www.mts.by/");

        WebElement moreLink = driver.findElement(By.xpath("//a[contains(text(),'Подробнее о сервисе')]"));
        assertTrue(moreLink.isDisplayed(), "Ссылка 'Подробнее о сервисе' не отображается");
    }
}
