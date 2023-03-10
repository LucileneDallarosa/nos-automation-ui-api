package pt.nosautomation.api;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/api/user.feature"},
        plugin = {"pretty", "com.cucumber.listener.ExtentCucumberFormatter:output/report_User.html"})
public class RunUserTest {
}
