package admin;

import org.testng.annotations.Test;
import pages.admin.AddCustomerPage;

public class AddCustomerTest extends NavigationCustomerPageTest {
    @Test
    public void addCustomer() {
        AddCustomerPage.waitForPageToBeDisplayed();
        AddCustomerPage.fillInFirstName();
        AddCustomerPage.fillInLastName();
        AddCustomerPage.fillInEmail();
        AddCustomerPage.fillInTelephone();
        AddCustomerPage.fillInPassword();
        AddCustomerPage.confirmPassword();
        AddCustomerPage.clickSaveBtn();
    }

    @Test
    public void checkIfCustomerCreated() {
        AddCustomerPage.waitForMainPage();
        AddCustomerPage.addEmail();
        AddCustomerPage.clickFilterBtn();
        AddCustomerPage.checkEmails();
    }
}
