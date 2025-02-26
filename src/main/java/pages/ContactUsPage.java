package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends CommonActionsPage {

    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement name;

    @FindBy(xpath = "//input[@placeholder='Email']")
    private WebElement email;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    private WebElement subject;

    @FindBy(xpath = "//textarea[@id='message']")
    private WebElement message;

    @FindBy(xpath = "//input[@name='upload_file']")
    private WebElement uploadFile;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    private WebElement alertSuccess;

    @FindBy(xpath = "//i[@class='fa fa-angle-double-left']")
    private WebElement backButton;

    public ContactUsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void validatePageTitle(String expectedName){
        validateStringText(getTitle(), expectedName);
    }

    public void userData(String nameTxt, String emailTxt){
        cleanInputText(name);
        typeInputText(name, nameTxt);
        cleanInputText(email);
        typeInputText(email, emailTxt);
    }

    public void submitForm(String subjectTxt, String messageTxt){
        cleanInputText(subject);
        typeInputText(subject, subjectTxt);
        cleanInputText(message);
        typeInputText(message, messageTxt);
    }

    public void uploadFile(String filePath){
        getElement(uploadFile);
        getElement(uploadFile).sendKeys(filePath);
    }

    public void submitForm(){
        clickElement(submitButton);
    }

    public void alertcontactMessage(){
        alertMessage();
    }

    public void validateCompleteMessage(String expectedMessage){
        getElement(alertSuccess);
        validateText(alertSuccess, expectedMessage);
    }

    public void returnToHomePage(){
        clickElement(backButton);
    }
}
