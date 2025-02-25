package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDeletedPage extends CommonActionsPage{
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    private WebElement confirmButton;

    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    private WebElement accountCreated;


    public AccountDeletedPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void deleteAccount(){
        getElement(accountCreated);
        validateText(accountCreated, "ACCOUNT DELETED!");
        clickElement(confirmButton);
    }
}
