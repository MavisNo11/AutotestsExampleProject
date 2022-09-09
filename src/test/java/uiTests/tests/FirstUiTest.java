package uiTests.tests;

import helpers.ConfProperties;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import uiTests.pageObjects.YaPage;

import java.util.concurrent.TimeUnit;

import java.time.Duration;

public class FirstUiTest {

    public static YaPage yaPage;
    public static WebDriver driver;

    private final String EXPECTED_TITLE = "Автоматизированное тестирование";

    @BeforeClass
    public static void beforeAll() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        Duration duration = Duration.ofSeconds(5);
        driver.manage().timeouts().implicitlyWait(duration);
        //получение ссылки на страницу входа из файла настроек
        driver.get(ConfProperties.getProperty("loginpage"));

        yaPage = new YaPage(driver);
    }

    @AfterClass
    public static void afterAll() {
        driver.quit();
    }

    @Test
    public void showTitleTest() {
        yaPage.fillSearchInput("Automation testing");
        yaPage.clickSearchButton();
        String actualTitle = yaPage.getSerpTitle();
        Assert.assertEquals("Serp title is right", EXPECTED_TITLE, actualTitle);
    }
}
