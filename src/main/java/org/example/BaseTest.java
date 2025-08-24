package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    protected WebDriver driver;

    @BeforeEach
    public void setup() {
        // ✅ Указываем путь к ChromeDriver версии 139
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\strik\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        // ✅ Указываем путь к Chrome for Testing версии 139
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\strik\\Downloads\\chrome-win64 (2)\\chrome-win64\\chrome.exe");

        // 🔧 Инициализируем драйвер с нужным бинарником
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

