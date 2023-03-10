package pt.nosautomation.ui;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pt.nosautomation.ui.page.HomePage;
import pt.nosautomation.ui.page.LoginPage;
import pt.nosautomation.ui.page.RegisterPage;

public class BaseUiTest {

    public WebDriver driver;
    protected NgWebDriver ngDriver;
    protected JavascriptExecutor jsDriver;
    protected LoginPage loginPage;
    protected RegisterPage registerPage;
    protected HomePage homePage;

    public void openWebSite(String url) {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        jsDriver = (JavascriptExecutor) driver;
        ngDriver = new NgWebDriver(jsDriver);

        driver.get(url);
        ngDriver.waitForAngularRequestsToFinish();

        loginPage = new LoginPage(driver, ngDriver);
        registerPage = new RegisterPage(driver, ngDriver);
        homePage = new HomePage(driver, ngDriver);
    }

    public void waitForAngularRequest() {
        ngDriver.waitForAngularRequestsToFinish();
    }

    public void closeWebSite() {
        if (null != driver)
            driver.quit();
    }
}
