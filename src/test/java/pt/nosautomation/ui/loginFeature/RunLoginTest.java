package pt.nosautomation.ui.loginFeature;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/ui/login.feature"},
        plugin = {"pretty", "com.cucumber.listener.ExtentCucumberFormatter:output/report_Login.html"})
public class RunLoginTest {
}
