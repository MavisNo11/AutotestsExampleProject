package uiTests.tests;

import helpers.BrowserProperties;
import helpers.Pages;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import uiTests.pageObjects.YaPage;

public class FirstUiTest {

    public static YaPage yaPage;
    public static WebDriver driver;

    private final String EXPECTED_TITLE = "Автоматизированное тестирование";

    @BeforeClass
    public static void beforeAll() {
        BrowserProperties properties = new BrowserProperties();
        driver = properties.getWebDriver();

        yaPage = new YaPage(driver);
    }

    @Before
    public void before() {
        driver.get(Pages.MAIN_URL.getUrl());
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
