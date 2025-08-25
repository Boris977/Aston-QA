package org.example;
import org.example.MainPage;
import org.example.PaymentPage;
import org.example.ConfirmationPage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OnlineTopUpTest extends BaseTest {

    @Test
    public void testOnlineTopUpBlock() {
        MainPage mainPage = new MainPage(driver);
        PaymentPage paymentPage = new PaymentPage(driver);
        ConfirmationPage confirmationPage = new ConfirmationPage(driver);

        // Открываем сайт
        mainPage.open();

        // Проверка ошибок при незаполненных полях для всех вариантов
        String[] services = {"Услуги связи", "Домашний интернет", "Рассрочка", "Задолженность"};
        for (String service : services) {
            mainPage.selectService(service);
            paymentPage.clickContinue();

            assertTrue(paymentPage.isPhoneErrorVisible(), "Нет ошибки для телефона при '" + service + "'");
            assertTrue(paymentPage.isAmountErrorVisible(), "Нет ошибки для суммы при '" + service + "'");
        }

        // Заполнение формы для "Услуги связи"
        mainPage.selectService("Услуги связи");
        paymentPage.fillPhone("297777777");
        paymentPage.fillAmount("5");
        assertTrue(paymentPage.isContinueEnabled(), "Кнопка 'Продолжить' должна быть активна");
        paymentPage.clickContinue();

        // Проверка отображения данных в окне подтверждения
        assertTrue(confirmationPage.getDisplayedPhone().contains("297777777"), "Номер телефона не совпадает");
        assertTrue(confirmationPage.getDisplayedAmount().contains("5"), "Сумма не совпадает");
        assertTrue(confirmationPage.getPayButtonText().contains("5"), "Сумма не отображается на кнопке");

        // Проверка полей карты
        assertTrue(confirmationPage.areCardFieldsEmpty(), "Поля карты должны быть пустыми");

        // Проверка логотипов платёжных систем
        assertTrue(confirmationPage.arePaymentIconsVisible(), "Логотипы платёжных систем не отображаются");
    }
}
