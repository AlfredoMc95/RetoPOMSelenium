package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonActionsPage {

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    private WebElement homeButton;

    @FindBy(xpath = "//ul[@class='nav navbar-nav']//b")
    private WebElement accountName;

    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    private WebElement deleteAccount;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
    private WebElement logout;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void goToSignUpPage(){
        clickElement(homeButton);
    }

    public void validateAccountName(String expectedName){
        getElement(accountName);
        validateText(accountName, expectedName);
    }

    public void deleteAccount(){
        clickElement(deleteAccount);
    }

    public void logout(){
        clickElement(logout);
    }
}
