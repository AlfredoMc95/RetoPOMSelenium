package testCases;

import base.BaseTest;
import org.junit.jupiter.api.Test;

public class RegisterUserTest extends BaseTest {

    @Test
    public void createUser() {
        homePage.goToSignUpPage();
    }
}
