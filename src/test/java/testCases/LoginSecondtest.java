package testCases;

import base.BaseTest;
import org.junit.jupiter.api.Test;

public class LoginSecondtest extends BaseTest {

    @Test
    public void createAndDeleteUser() {
        homePage.goToSignUpPage();
        singUpPage.enterUserLoginInfo("pedroTest@testgmail.com", "12345678");
        singUpPage.submitLogin();
        homePage.validateAccountName("Pedro");
        homePage.deleteAccount();
        accountDeletedPage.deleteAccount();
    }
}
