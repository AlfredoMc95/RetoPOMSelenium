package testCases;

import base.BaseTest;
import org.junit.jupiter.api.Test;

public class ContactUsFormTest extends BaseTest {

    @Test
    public void contactUsForm(){
        homePage.contactUs();
        contactUsPage.validatePageTitle("Automation Exercise - Contact Us");
        contactUsPage.userData("Juan", "juan@testgmail.com");
        contactUsPage.submitForm("aboutTesting", "lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt ut labore et dolore magna aliqua");
        contactUsPage.uploadFile("C:\\Users\\owl_e\\Desktop\\TestUpload.txt");
        contactUsPage.submitForm();
        contactUsPage.alertcontactMessage();
        contactUsPage.validateCompleteMessage("Success! Your details have been submitted successfully.");
        contactUsPage.returnToHomePage();
        contactUsPage.validatePageTitle("Automation Exercise");
    }
}
