package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserProperties {

    public WebDriver getWebDriver() {
        //определение пути до драйвера и его настройка
        System.setProperty(ConfProperties.getProperty("chromedriver"), ConfProperties.getProperty("chromedriverpath"));

        WebDriver driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();

        Duration duration = Duration.ofSeconds(5);
        driver.manage().timeouts().implicitlyWait(duration);

        return driver;
    }
}
