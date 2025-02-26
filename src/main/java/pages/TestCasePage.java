package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestCasePage extends CommonActionsPage {

    public TestCasePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void validatePageTitle(String expectedName){
        validateStringText(getTitle(), expectedName);
    }
}
