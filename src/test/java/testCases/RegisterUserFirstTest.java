package testCases;

import base.BaseTest;
import org.junit.jupiter.api.Test;

public class RegisterUserFirstTest extends BaseTest {

    @Test
    public void createAndDeleteUser() {
        homePage.goToSignUpPage();
        singUpPage.enterUserRegisterInfo("Paco", "PacoTest@testgmail.com");
        singUpPage.submitSignUp();
        accountInformationPage.maleGender();
        accountInformationPage.setPassword("12345678");
        accountInformationPage.selectBirthDate("25", "March", "1990");
        accountInformationPage.offertsInfo();
        accountInformationPage.AddressInfor("paco", "Ramires", "NN", "Av. Test", "NN", "Israel", "Brasilia", "DF", "12345678", "11234567890");
        accountInformationPage.createAccount();
        accountCreatedPage.confirmAccount();
        homePage.validateAccountName("Paco");
        homePage.deleteAccount();
        accountDeletedPage.deleteAccount();
    }
}
