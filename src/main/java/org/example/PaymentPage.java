package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {
    private WebDriver driver;

    private By phoneInput = By.xpath("//input[contains(@placeholder,'телефон')]");
    private By amountInput = By.xpath("//input[contains(@placeholder,'сумма')]");
    private By continueButton = By.xpath("//button[contains(text(),'Продолжить')]");
    private By phoneError = By.xpath("//input[contains(@placeholder,'телефон')]/following-sibling::label");
    private By amountError = By.xpath("//input[contains(@placeholder,'сумма')]/following-sibling::label");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillPhone(String phone) {
        driver.findElement(phoneInput).sendKeys(phone);
    }

    public void fillAmount(String amount) {
        driver.findElement(amountInput).sendKeys(amount);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public boolean isContinueEnabled() {
        return driver.findElement(continueButton).isEnabled();
    }

    public boolean isPhoneErrorVisible() {
        return driver.findElements(phoneError).size() > 0 && driver.findElement(phoneError).isDisplayed();
    }

    public boolean isAmountErrorVisible() {
        return driver.findElements(amountError).size() > 0 && driver.findElement(amountError).isDisplayed();
    }

    public void submitForm(String phone, String amount) {
        fillPhone(phone);
        fillAmount(amount);
        clickContinue();
    }
}
