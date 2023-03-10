package pt.nosautomation.ui.registerFeature;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pt.nosautomation.ui.BaseUiTest;

public class RegisterStepDefs extends BaseUiTest {

    @After
    public void closeWebPage() {
        super.closeWebSite();
    }

    @Given("^Access NOS$")
    public void openNos() throws InterruptedException {
        super.openWebSite("https://login.nos.pt");
        Thread.sleep(5000);
        loginPage.clickButtonAcceptCookies();
    }

    @Given("^Click to Register$")
    public void clickRegisterLink() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.clickRegisterLink();
        Thread.sleep(5000);
        Assert.assertEquals("Criar conta NOSID", registerPage.getTitleLable());
    }

    @When("^Set Full name: (.+)$")
    public void setFullName(String fullName) throws InterruptedException {
        registerPage.setFullName(fullName);
    }

    @When("^Set Phone number: (.+)$")
    public void setPhoneNumber(String phoneNumber) {
        registerPage.setRegisterPhoneNumber(phoneNumber);
    }

    @When("^Set E-mail: (.+)$")
    public void setEmail(String email) {
        registerPage.setEmail(email);
    }

    @When("^Set Password to register: (.+)$")
    public void setPassword(String password) {
        registerPage.setRegisterPassword(password);
    }

    @When("^Mark the checkbox 'Terms And Conditions'$")
    public void markCheckboxTermsAndConditions() {
        registerPage.markCheckBoxTermsAndConditions();
    }

    @When("^Click Create Account button$")
    public void clickButtonCreateAccount() {
        registerPage.clickButtonCreateAccount();
    }

    @Then("^Validate the Creation$")
    public void validateAccountCreation() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals("Precisamos de validar o seu número de telemóvel", registerPage.getTitleLable());
    }

    @Then("^The field Email will be with the Existing Account message$")
    public void validateExistingAccountCreation() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals("Este email já está a ser utilizado. Recupere a sua conta aqui", registerPage.validateExistingAccountMessage());
    }
}
