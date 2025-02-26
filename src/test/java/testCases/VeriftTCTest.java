package testCases;

import base.BaseTest;
import org.junit.jupiter.api.Test;

public class VeriftTCTest extends BaseTest {

    @Test
    public void verifyTCPage(){
        homePage.testCasesPage();
        testCasePage.validatePageTitle("Automation Practice Website for UI Testing - Test Cases");
    }
}
