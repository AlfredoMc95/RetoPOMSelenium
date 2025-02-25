package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import pages.RegisterUserPage;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;
    protected RegisterUserPage registerUserPage;

    @BeforeEach
    public void setUp() {
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        homePage.visitPage("https://automationexercise.com/");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
