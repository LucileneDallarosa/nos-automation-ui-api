package pt.nosautomation.ui.page;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.WebDriver;
import pt.nosautomation.ui.element.RegisterPageElements;

public class RegisterPage extends RegisterPageElements {

    public RegisterPage(WebDriver driver, NgWebDriver ngDriver) {
        super(driver, ngDriver);
    }

    public String getTitleLable() {
        return getPageTitle().getText();
    }

    public void setFullName(String fullName) throws InterruptedException {
        getFieldFullName().sendKeys(fullName);
    }

    public void setRegisterPhoneNumber(String phoneNumber) {
        getFieldPhoneNumber().sendKeys(phoneNumber);
    }

    public void setEmail(String email) {
        getFieldEmail().sendKeys(email);
    }

    public void setRegisterPassword(String password) {
        getRegisterFieldPassword().sendKeys(password);
    }

    public void markCheckBoxTermsAndConditions() {
        getCheckBoxTermsAndConditions().click();
    }

    public void clickButtonCreateAccount() {
        getButtonCreateAccount().click();
    }

    public String validateExistingAccountMessage() {
        return getExistingAccountMessage().getText();
    }


}
