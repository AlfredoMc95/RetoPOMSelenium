package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.AccountCreatedPage;
import pages.AccountInformationPage;
import pages.HomePage;
import pages.SignUpPage;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;
    protected SignUpPage singUpPage;
    protected AccountInformationPage accountInformationPage;
    protected AccountCreatedPage accountCreatedPage;

    @BeforeEach
    public void setUp() {
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        singUpPage = new SignUpPage(driver);
        accountInformationPage = new AccountInformationPage(driver);
        accountCreatedPage = new AccountCreatedPage(driver);
        homePage.visitPage("https://automationexercise.com/");
    }

    /*@AfterEach
    public void tearDown() {
        driver.quit();
    }*/

}
