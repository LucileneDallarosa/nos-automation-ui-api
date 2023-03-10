package pt.nosautomation.ui.page;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.WebDriver;
import pt.nosautomation.ui.element.HomePageElements;

public class HomePage extends HomePageElements {

    public HomePage(WebDriver driver, NgWebDriver ngDriver) {
        super(driver, ngDriver);
    }

    public void clickButtonAcceptCookiesHomePage() throws InterruptedException {
        getButtonAcceptCookiesHomePage().click();
    }

    public String validateNameInfo() {
        return getNameInfo().getText();
    }

    public String validatePhoneInfo() {
        return getPhoneInfo().getText();
    }

    public String validateEmailInfo() {
        return getEmailInfo().getText();
    }
}
