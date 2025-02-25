package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends CommonActionsPage {


    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement userName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    private WebElement userEmail;

    @FindBy(xpath = "//button[normalize-space()='Signup']")
    private WebElement signUpButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterUserInfo(String name, String email){
        cleanInputText(userName);
        cleanInputText(userEmail);
        typeInputText(userName, name);
        typeInputText(userEmail, email);
    }

    public void submitSignUp() {
        clickElement(signUpButton);
    }
}
