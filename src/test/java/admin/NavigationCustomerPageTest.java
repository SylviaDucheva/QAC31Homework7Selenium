package admin;

import org.testng.annotations.Test;
import pages.admin.AddCustomerPage;
import pages.admin.NavigationCustomerPage;

public class NavigationCustomerPageTest extends LoginPageTest {

    @Test
    public void testAddCustomer() {
        NavigationCustomerPage.clickOnDropdownCustomerNavigation();
        NavigationCustomerPage.selectCustomerOption();
        NavigationCustomerPage.clickOnAddCustomerButton();

        AddCustomerPage.waitForPageToBeDisplayed();
        AddCustomerPage.fillInFirstName();
        AddCustomerPage.fillInLastName();
        AddCustomerPage.fillInEmailAddress();
        AddCustomerPage.fillInTelephone();
        AddCustomerPage.fillInPassword();
        AddCustomerPage.confirmPassword();
        AddCustomerPage.clickSaveBtn();

        AddCustomerPage.waitForMainPage();
        AddCustomerPage.addEmail();
        AddCustomerPage.clickFilterBtn();
        AddCustomerPage.checkEmails();
    }
}
