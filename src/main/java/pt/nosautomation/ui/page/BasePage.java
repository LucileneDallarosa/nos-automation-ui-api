package pt.nosautomation.ui.page;

import com.paulhammant.ngwebdriver.NgWebDriver;
import org.openqa.selenium.WebDriver;
import pt.nosautomation.ui.service.DSL;

public class BasePage {

    protected DSL dsl;

    BasePage(WebDriver driver) {
        dsl = new DSL(driver);
    }

    protected BasePage(WebDriver driver, NgWebDriver ngDriver) {
        dsl = new DSL(driver, ngDriver);
    }


}
