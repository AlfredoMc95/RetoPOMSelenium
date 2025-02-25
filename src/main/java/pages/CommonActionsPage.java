package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class CommonActionsPage {

    protected WebDriver driver;

    public CommonActionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void visitPage(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void cleanInputText(By localization) {
        driver.findElement(localization).clear();
    }

    public void typeInputText(By localization, String text) {
        driver.findElement(localization).sendKeys(text);
    }

    public void sendText(By localization){
        driver.findElement(localization).submit();
    }

    public void implicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void clickElement(WebElement localization){
        localization.click();
    }
}
