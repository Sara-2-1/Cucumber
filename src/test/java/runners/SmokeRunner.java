package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@smoke",   // ← يشغل فقط السيناريوهات اللي عليها @smoke
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true
)
public class SmokeRunner {
}
