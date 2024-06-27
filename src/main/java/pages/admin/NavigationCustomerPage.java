package pages.admin;
import org.openqa.selenium.By;
import pages.base.BasePage;
import org.openqa.selenium.By;
import pages.base.BasePage;

public class NavigationCustomerPage extends BasePage {
    private static final By CUSTOMER_DROPDOWN = By.id("menu-customer");
    private static final By CUSTOMER_OPTION = By.xpath("//*[@id='menu-customer']//li[1]/a");
    private static final By ADD_CUSTOMER_BTN = By.xpath("//*[@class='fa fa-plus']/ ..");

    public static void clickOnDropdownCustomerNavigation() {
        clickOnElementByLocator(CUSTOMER_DROPDOWN);
    }

    public static void selectCustomerOption() {
        clickOnElementByLocator(CUSTOMER_OPTION);
    }

    public static void clickOnAddCustomerButton() {
        clickOnElementByLocator(ADD_CUSTOMER_BTN);
    }
}


