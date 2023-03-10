package pt.nosautomation.ui.page;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.WebDriver;
import pt.nosautomation.ui.element.LoginPageElements;

public class LoginPage extends LoginPageElements {

    public LoginPage(WebDriver driver, NgWebDriver ngDriver) {
        super(driver, ngDriver);
    }

    public void clickButtonAcceptCookies() throws InterruptedException {
        getButtonAcceptCookies().click();
    }

    public String validateTitleText() {
        return getTitleOnPage().getText();
    }

    public void setUserName(String userName) {
        getFielduserName().sendKeys(userName);
    }

    public void setPassword(String password) throws InterruptedException {
        getFieldPassword().sendKeys(password);
    }

    public void unmarkCheckBoxKeepSession() {
        getCheckBoxKeepSession().click();
    }

    public void clickEnterButton() {
        getEnterButton().click();
    }

    public void clickBackToSessionButton() {
        getBackToSessionButton().click();
    }

    public void clickRegisterLink() {
        getLinkRegister().click();
    }

    public String validateNoUserFoundMessage() throws InterruptedException {
        return getNoUserFoundMessage().getText();
    }

    public String validateNumberConfirmationPage() {
        return getNumberConfirmationMessage().getText();
    }

    public String validateInvalidPhoneNumberErrorMessage() {
        return getInvalidPhoneNumberMessage().getText();
    }

    public String validateIncorrectPasswordErrorMessage() {
        return getIncorrectPasswordMessage().getText();
    }

    public String validateRecoverPasswordRedirect() {
        return getTitleOnPage().getText();
    }

    public String validateUserNameTitle() {
        return getUserNameTitle().getText();
    }
}
