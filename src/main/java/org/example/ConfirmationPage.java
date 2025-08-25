package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ConfirmationPage {
    private WebDriver driver;

    private By phoneDisplay = By.cssSelector(".confirmation__phone");
    private By amountDisplay = By.cssSelector(".confirmation__amount");
    private By payButton = By.xpath("//button[contains(text(),'Оплатить')]");
    private By cardFields = By.cssSelector("input[placeholder*='****']");
    private By paymentIcons = By.xpath("//img[contains(@alt,'Visa') or contains(@alt,'MasterCard') or contains(@alt,'Белкарт')]");

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getDisplayedPhone() {
        return driver.findElement(phoneDisplay).getText();
    }

    public String getDisplayedAmount() {
        return driver.findElement(amountDisplay).getText();
    }

    public String getPayButtonText() {
        return driver.findElement(payButton).getText();
    }

    public boolean areCardFieldsEmpty() {
        List<WebElement> fields = driver.findElements(cardFields);
        return fields.stream().allMatch(f -> f.getAttribute("value").isEmpty());
    }

    public boolean arePaymentIconsVisible() {
        return driver.findElements(paymentIcons).size() >= 3;
    }
}
