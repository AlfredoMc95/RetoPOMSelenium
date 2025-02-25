package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

    public void cleanInputText(WebElement localization) {
        localization.clear();
    }

    public void typeInputText(WebElement localization, String text) {
        localization.sendKeys(text);
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

    public void selectDropdownByText(WebElement dropdown, String value) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(value);
    }

    public WebElement getElement(WebElement element) {
        return element;
    }

    public void validateText(WebElement element, String expectedText) {
        String actualText = element.getText();
        Assertions.assertEquals(expectedText, actualText,"El texto obtenido no coincide con el esperado.");
    }
}
