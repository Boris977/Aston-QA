package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.mts.by/");
    }

    public void selectService(String name) {
        driver.findElement(By.cssSelector("span.select__now")).click();
        driver.findElement(By.xpath("//li[contains(text(),'" + name + "')]")).click();
    }

    public String getBlockTitleText() {
        return driver.findElement(By.xpath("//h2[contains(text(),'Онлайн пополнение')]"))
                .getText().replace("\n", " ").trim();
    }

    public boolean isMoreLinkVisible() {
        return driver.findElement(By.xpath("//a[contains(text(),'Подробнее о сервисе')]")).isDisplayed();
    }

    public boolean arePaymentLogosVisible() {
        String[] logos = {"Visa", "MasterCard", "Белкарт"};
        for (String alt : logos) {
            By logo = By.xpath("//img[contains(@alt,'" + alt + "')]");
            if (driver.findElements(logo).isEmpty() || !driver.findElement(logo).isDisplayed()) {
                return false;
            }
        }
        return true;
    }
}