package uiTests.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class YaPage {

    public WebDriver driver;
    private WebDriverWait wait;
    public YaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @FindBy(css = "input.search3__input")
    private WebElement searchInput;
    //private Input searchInput;

    @FindBy(xpath = "//div[contains(@class, 'search3__inner')]//button[contains(@type, 'submit')]")
    private WebElement searchButton;

    @FindBy(css = "div.serp-title")
    private WebElement serpTitle;

    public void fillSearchInput(String text) {
        searchInput.sendKeys(text);
    }

    public void clickSearchButton() {
        wait.until(ExpectedConditions.visibilityOf(searchButton));
        searchButton.click();
    }

    public String getSerpTitle() {
        wait.until(ExpectedConditions.visibilityOf(serpTitle));
        return serpTitle.getText();
    }
}
