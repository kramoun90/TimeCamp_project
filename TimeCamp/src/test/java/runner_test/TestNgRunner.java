package runner_test;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/featureFile"}
        , glue = {"step_diff","TimeCamp_StepDif"}
        , tags = "@Employee"
        , monochrome = true
        , plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber-reports/cucumber.json",
        "junit:target/cucumber-reports/cucumber.xml"}
)
public class TestNgRunner extends AbstractTestNGCucumberTests {
}
