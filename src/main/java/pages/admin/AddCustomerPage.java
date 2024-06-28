package pages.admin;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.WaitTool;

public class AddCustomerPage extends LoginPage {
    private static final By FIRST_NAME = By.id("input-firstname");
    private static final By LAST_NAME = By.id("input-lastname");
    private static final By EMAIL = By.id("input-email");
    private static final By TELEPHONE = By.id("input-telephone");
    private static final By PASSWORD = By.id("input-password");
    private static final By CONFIRM_PASSWORD = By.id("input-confirm");
    private static final By SAVE_BTN = By.xpath("//*[@id=\"content\"]/div[1]/div/div/button/i");
    private static final By FILTER_BTN = By.id("button-filter");
    private static final By DISPLAYED_EMAIL = By.id("input-email");

    public static void fillInFirstName() {
        writeTextInWebElement(FIRST_NAME, "Sylvia");
    }

    public static void fillInLastName() {
        writeTextInWebElement(LAST_NAME, "Ducheva");
    }

    public static void fillInEmailAddress() {
        String prefix = RandomStringUtils.randomAlphanumeric(7);
        String suffix = RandomStringUtils.randomAlphabetic(5);
        String emailAddress = prefix + "@" + suffix + ".com";
        writeTextInWebElement(EMAIL, emailAddress);
    }

    public static void fillInTelephone() {
        writeTextInWebElement(TELEPHONE, "0888111111");
    }

    public static void fillInPassword() {
        writeTextInWebElement(PASSWORD, "Passw0rd123*");
    }

    public static void confirmPassword() {
        writeTextInWebElement(CONFIRM_PASSWORD, "Passw0rd123*");
    }

    public static void clickSaveBtn() {
        clickOnElementByLocator(SAVE_BTN);
    }

    public static void waitForPageToBeDisplayed() {
        WaitTool.waitForElementVisibility(FIRST_NAME, 20);
    }

    public static void waitForMainPage() {
        WaitTool.waitForElementVisibility(EMAIL, 10);
    }

    public static void clickFilterBtn() {
        clickOnElementByLocator(FILTER_BTN);
    }

    public static void addEmail() {
        WaitTool.waitForElementVisibility(DISPLAYED_EMAIL, 10);
        String text2 = driver.findElement(EMAIL).getText();
        writeTextInWebElement(DISPLAYED_EMAIL, text2);
    }

    public static void checkEmails() {
        String text1 = driver.findElement(DISPLAYED_EMAIL).getText();
        String text2 = driver.findElement(EMAIL).getText();
        Assert.assertEquals(text1, text2);
    }
}
