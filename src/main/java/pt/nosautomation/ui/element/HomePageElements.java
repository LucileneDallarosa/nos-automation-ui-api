package pt.nosautomation.ui.element;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pt.nosautomation.ui.page.BasePage;

public class HomePageElements extends BasePage {

    public HomePageElements(WebDriver driver, NgWebDriver ngDriver) {
        super(driver, ngDriver);
    }

    protected WebElement getButtonAcceptCookiesHomePage() throws InterruptedException {
        return dsl.getByXpathWithSleep("//*[@id=\"c-right\"]/a[1]");
    }

    protected WebElement getNameInfo() {
        return dsl.getByClass("name");
    }

    protected WebElement getPhoneInfo() {
        return dsl.getByClass("phone");
    }

    protected WebElement getEmailInfo() {
        return dsl.getByClass("email");
    }
}