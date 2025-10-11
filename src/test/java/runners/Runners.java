package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = { "stepdefinitions", "hooks" },
        tags = "@Login",
        dryRun = false ,
        plugin = {
                "html:target/reports/html-reports/cucumber.html",
                "json:target/reports/json-reports/cucumber.json",
                "junit:target/reports/xml-reports/cucumber.xml",
                "pretty"
        }
)
public class Runners {
}
