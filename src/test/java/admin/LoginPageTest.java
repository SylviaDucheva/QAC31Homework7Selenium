package admin;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.admin.DashboardPage;

public class LoginPageTest extends BaseTest {
    @Test
    public void testSuccessfulLogin() {
        pages.admin.LoginPage.goToLoginPage();
        pages.admin.LoginPage.login("admin", "parola123!");
        String actualUsernameText = DashboardPage.getUsernameText();
        Assert.assertEquals(actualUsernameText, "Milen Strahinski");
    }

    @Test
    public void testSuccessfulLoginWithAdmin1() {
        pages.admin.LoginPage.goToLoginPage();
        pages.admin.LoginPage.login("admin1", "parola123!");
        String actualUsernameText = DashboardPage.getUsernameText();
        Assert.assertEquals(actualUsernameText, "AdminQAC22_First AdminQAC22_Last");
    }
}
