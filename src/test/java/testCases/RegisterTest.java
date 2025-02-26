package testCases;

import base.BaseTest;
import org.junit.jupiter.api.Test;

public class RegisterTest extends BaseTest {

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

    @Test
    public void createUser(){
        homePage.goToSignUpPage();
        singUpPage.enterUserRegisterInfo("Pedro", "pedroTest@testgmail.com");
        singUpPage.submitSignUp();
        accountInformationPage.maleGender();
        accountInformationPage.setPassword("12345678");
        accountInformationPage.selectBirthDate("25", "March", "1990");
        accountInformationPage.offertsInfo();
        accountInformationPage.AddressInfor("Pedro", "Ramires", "NN", "Av. Test", "NN", "Israel", "Brasilia", "DF", "12345678", "11234567890");
        accountInformationPage.createAccount();
        accountCreatedPage.confirmAccount();
        homePage.validateAccountName("Pedro");
    }

    @Test
    public void CreateUserWithSameEmail(){
        homePage.goToSignUpPage();
        singUpPage.enterUserRegisterInfo("Pedro", "pedroTest@testgmail.com");
        singUpPage.submitSignUp();
        singUpPage.validateErrorMesageEmail("Email Address already exist!");
    }
}
