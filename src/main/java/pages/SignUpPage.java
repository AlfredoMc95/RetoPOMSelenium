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

    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement userEmailLogin;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement userPassword;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    private WebElement incorrectLogin;

    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    private WebElement emailExist;

    public SignUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterUserRegisterInfo(String name, String email){
        cleanInputText(userName);
        cleanInputText(userEmail);
        typeInputText(userName, name);
        typeInputText(userEmail, email);
    }

    public void submitSignUp() {
        clickElement(signUpButton);
    }

    public void enterUserLoginInfo(String email, String password){
        cleanInputText(userEmailLogin);
        cleanInputText(userPassword);
        typeInputText(userEmailLogin, email);
        typeInputText(userPassword, password);
    }

    public void submitLogin() {
        clickElement(loginButton);
    }

    public void validateErrorMesage(String expectedMessage){
        getElement(incorrectLogin);
        validateText(incorrectLogin, expectedMessage);
    }

    public void validatePageTitle(String expectedName){
        validateStringText(getTitle(), expectedName);
    }

    public void validateErrorMesageEmail(String expectedMessage){
        getElement(emailExist);
        validateText(emailExist, expectedMessage);
    }
}
