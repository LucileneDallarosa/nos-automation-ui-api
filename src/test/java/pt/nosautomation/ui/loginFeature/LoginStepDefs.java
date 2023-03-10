package pt.nosautomation.ui.loginFeature;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pt.nosautomation.ui.BaseUiTest;

public class LoginStepDefs extends BaseUiTest {

    private String userName;

    @After
    public void closeWebPage() {
        super.closeWebSite();
    }

    @Given("^Access NOS WebPage$")
    public void openNosWebPage() throws InterruptedException {
        super.openWebSite("https://login.nos.pt");
        Thread.sleep(5000);
        loginPage.clickButtonAcceptCookies();

        Assert.assertEquals("Iniciar Sessão", loginPage.validateTitleText());
    }

    @When("^Input User Name: (.+)$")
    public void setUserName(String userName) {
        this.userName = userName;
        loginPage.setUserName(userName);
    }

    @When("^Click on Enter button$")
    public void clickEnterButton() {
        loginPage.clickEnterButton();
    }

    @When("^Set Password: (.+)$")
    public void setPassword(String password) throws InterruptedException {
        loginPage.setPassword(password);
    }

    @When("^Click to unmark CheckBox Keep Session$")
    public void unmarkCheckBoxKeepSession() {
        loginPage.unmarkCheckBoxKeepSession();
    }

    @Then("^Will open the NOS home page$")
    public void openNosHomePage() throws InterruptedException {
        Thread.sleep(5000);
        homePage.clickButtonAcceptCookiesHomePage();

        Assert.assertEquals("Lucilene Dallarosa", homePage.validateNameInfo());
        Assert.assertEquals("937603161", homePage.validatePhoneInfo());
        Assert.assertEquals("lucilene.h.dallarosa@gmail.com", homePage.validateEmailInfo());
    }

    @Then("^Will show the 'No User Found' error message$")
    public void noUserFoundMessage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Não foi encontrado nenhum utilizador", loginPage.validateNoUserFoundMessage());
    }

    @Then("^Will redirect to number confirmation page$")
    public void numberConfirmationPage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Confirme o indicativo do seu número", loginPage.validateNumberConfirmationPage());
    }

    @Then("^Will show the 'Invalid phone number' error message$")
    public void invalidPhoneNumberMessage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Número de telemóvel inválido", loginPage.validateInvalidPhoneNumberErrorMessage());
    }

    @Then("^Will show the 'Incorrect password' error message$")
    public void incorrectPasswordErrorMessage() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Password incorreta", loginPage.validateIncorrectPasswordErrorMessage());
    }

    @Then("^Will redirect to Recover password page$")
    public void recoverPassword() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals("Recupere a sua password", loginPage.validateRecoverPasswordRedirect());
    }

    @Then("^Click to return to session$")
    public void returnToSession() {
        loginPage.clickBackToSessionButton();

        Assert.assertEquals(userName, loginPage.validateUserNameTitle());
    }
}
