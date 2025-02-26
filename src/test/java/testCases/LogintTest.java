package testCases;

import base.BaseTest;
import org.junit.jupiter.api.Test;

public class LogintTest extends BaseTest {

    @Test
    public void LoginCorrectUser() {
        homePage.goToSignUpPage();
        singUpPage.enterUserLoginInfo("pedroTest@testgmail.com", "12345678");
        singUpPage.submitLogin();
        homePage.validateAccountName("Pedro");
        homePage.deleteAccount();
        accountDeletedPage.deleteAccount();
    }

    @Test
    public void LoginIncorrectUser() {
        homePage.goToSignUpPage();
        singUpPage.enterUserLoginInfo("pedroTestFake@testgmail.com", "FakePassword");
        singUpPage.submitLogin();
        singUpPage.validateErrorMesage("Your email or password is incorrect!");
    }

    @Test
    public void Logout() {
        homePage.goToSignUpPage();
        singUpPage.enterUserLoginInfo("pedroTest@testgmail.com", "12345678");
        singUpPage.submitLogin();
        homePage.validateAccountName("Pedro");
        homePage.logout();
        singUpPage.validatePageTitle("Automation Exercise - Signup / Login");
    }
}
