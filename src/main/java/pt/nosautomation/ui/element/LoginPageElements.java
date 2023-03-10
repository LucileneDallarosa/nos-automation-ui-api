package pt.nosautomation.ui.element;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pt.nosautomation.ui.page.BasePage;

public class LoginPageElements extends BasePage {

    public LoginPageElements(WebDriver driver, NgWebDriver ngDriver) {
        super(driver, ngDriver);
    }

    protected WebElement getButtonAcceptCookies() throws InterruptedException {
        return dsl.getByXpathWithSleep("//*[@id=\"c-right\"]/a[1]");
    }

    protected WebElement getTitleOnPage() {
        return dsl.getByClass("nosid-title").findElement(By.className("title"));
    }

    protected WebElement getFielduserName() {
        return dsl.getById("username-input");
    }

    protected WebElement getFieldPassword() throws InterruptedException {
        return dsl.getByIdWithSleep("password-input");
    }

    protected WebElement getNumberConfirmationMessage() {
        return dsl.getByXpath("/html/body/app-root/ng-component/div/generic-countrycodeconfirmation/div/div/div/div/section[1]/div[2]");
    }

    protected WebElement getInvalidPhoneNumberMessage() {
        return dsl.getByXpath("/html/body/app-root/ng-component/div/generic-countrycodeconfirmation/div/div/div/div/section[2]/form/app-phone-input/nosid-phoneinput/div/div[2]");
    }

    protected WebElement getIncorrectPasswordMessage() {
        return dsl.getByXpath("/html/body/app-root/ng-component/div/authentication-password/div/div/div/div/form/div[1]/app-password-input/nosid-passwordinput/div/div[2]");

    }

    protected WebElement getEnterButton() {
        return dsl.getByClass("nosid-button");
    }

    protected WebElement getCheckBoxKeepSession() {
        return dsl.getByClass("checkbox-indicator");
    }

    protected WebElement getBackToSessionButton() {
        return dsl.getByXpath("/html/body/app-root/ng-component/div/authentication-userblocked/div/div/div/div[2]/input[2]");
    }

    protected WebElement getLinkRegister() {
        return dsl.getByClass("nosid-link");
    }

    protected WebElement getNoUserFoundMessage() throws InterruptedException {
        return dsl.getByXpathWithSleep("/html/body/app-root/ng-component/div/authentication-username/div/div/div/div[1]/section[2]/form/div[1]/app-input/nosid-input/div/div[2]");
    }

    protected WebElement getUserNameTitle() {
        return dsl.getByClass("username").findElement(By.className("text"));
    }
}
