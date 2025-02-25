package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountInformationPage extends CommonActionsPage {

    @FindBy(xpath = "//input[@id='id_gender1']")
    private WebElement gender1;

    @FindBy(xpath = "//input[@id='id_gender2']")
    private WebElement gender2;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    private WebElement BirthDay;

    @FindBy(xpath = "//select[@id='months']")
    private WebElement BirthMonth;

    @FindBy(xpath = "//select[@id='years']")
    private WebElement BirthYear;

    @FindBy(xpath = "//input[@id='newsletter']")
    private WebElement newsletter;

    @FindBy(xpath = "//input[@id='optin']")
    private WebElement optin;

    @FindBy(xpath = "//input[@id='first_name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last_name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='company']")
    private WebElement company;

    @FindBy(xpath = "//input[@id='address1']")
    private WebElement address1;

    @FindBy(xpath = "//input[@id='address2']")
    private WebElement address2;

    @FindBy(xpath = "//select[@id='country']")
    private WebElement country;

    @FindBy(xpath = "//input[@id='state']")
    private WebElement state;

    @FindBy(xpath = "//input[@id='city']")
    private WebElement city;

    @FindBy(xpath = "//input[@id='zipcode']")
    private WebElement zipcode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    private WebElement mobileNumber;

    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    private WebElement createAccountButton;

    public AccountInformationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void maleGender(){
        clickElement(gender1);
    }

    public void femaleGender(){
        clickElement(gender2);
    }

    public void setPassword(String passwordTxt){
        cleanInputText(password);
        typeInputText(password, passwordTxt);
    }

    public void selectBirthDate(String day, String month, String year) {
        selectDropdownByText(BirthDay, day);
        selectDropdownByText(BirthMonth, month);
        selectDropdownByText(BirthYear, year);
    }

    public void offertsInfo(){
        clickElement(newsletter);
        clickElement(optin);
    }

    public void AddressInfor(String nameTxt, String lastNameTxt , String companyTxt, String address1Txt, String address2Txt,String countryTxt, String cityTxt, String stateTxt, String zipTxt, String mobileTxt){
        cleanInputText(firstName);
        typeInputText(firstName, nameTxt);
        cleanInputText(lastName);
        typeInputText(lastName, lastNameTxt);
        cleanInputText(company);
        typeInputText(company, companyTxt);
        cleanInputText(address1);
        typeInputText(address1, address1Txt);
        cleanInputText(address2);
        typeInputText(address2, address2Txt);
        selectDropdownByText(country, countryTxt);
        cleanInputText(state);
        typeInputText(state, stateTxt);
        cleanInputText(city);
        typeInputText(city, cityTxt);
        cleanInputText(zipcode);
        typeInputText(zipcode, zipTxt);
        cleanInputText(mobileNumber);
        typeInputText(mobileNumber, mobileTxt);
    }

    public void createAccount() {
        clickElement(createAccountButton);
    }
}
