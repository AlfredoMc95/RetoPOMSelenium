package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterUserPage extends CommonActionsPage {

    @FindBy(id = "username")
    private WebElement username;


    public RegisterUserPage(WebDriver driver) {
        super(driver);
    }




}
