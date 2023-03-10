package pt.nosautomation.ui.element;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pt.nosautomation.ui.page.BasePage;

public class RegisterPageElements extends BasePage {

    public RegisterPageElements(WebDriver driver, NgWebDriver ngDriver) {
        super(driver, ngDriver);
    }

    protected WebElement getPageTitle() {
        return dsl.getByClass("nosid-title").findElement(By.className("title"));
    }

    protected WebElement getFieldFullName() throws InterruptedException {
        return dsl.getByIdWithSleep("displayName-input");
    }

    protected WebElement getFieldPhoneNumber() {
        return dsl.getById("phone");
    }

    protected WebElement getFieldEmail() {
        return dsl.getById("email");
    }

    protected WebElement getRegisterFieldPassword() {
        return dsl.getById("password-input");
    }

    protected WebElement getCheckBoxTermsAndConditions() {
        return dsl.getByClass("checkbox-indicator");
    }

    protected WebElement getButtonCreateAccount() {
        return dsl.getByClass("nosid-button");
    }

    protected WebElement getExistingAccountMessage() {
        return dsl.getByXpath("/html/body/app-root/ng-component/div/signup-landingpage/div/div/form/div[1]/div/app-input[2]/nosid-input/div/div[2]");
    }
}
