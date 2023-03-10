package pt.nosautomation.ui.registerFeature;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/ui/register.feature"},
        plugin = {"pretty", "com.cucumber.listener.ExtentCucumberFormatter:output/report_Register.html"})
public class RunRegisterTest {
}
