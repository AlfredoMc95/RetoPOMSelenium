package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonActionsPage {

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    private WebElement homeButton;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void goToSignUpPage(){
        clickElement(homeButton);
    }
}
