package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatedPage extends CommonActionsPage {
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    private WebElement confirmButton;

    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    private WebElement accountCreated;


    public AccountCreatedPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void confirmAccount(){
        getElement(accountCreated);
        validateText(accountCreated, "Account Created!");
        clickElement(confirmButton);
    }
}
