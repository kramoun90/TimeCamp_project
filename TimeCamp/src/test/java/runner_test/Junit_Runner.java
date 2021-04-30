package runner_test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import timecamp_client.TimeCamp_Client_API;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
@RunWith(Cucumber.class)
@CucumberOptions(
        // For Single feature File
//        features = {"src/test/java/FeatureFile/TimeCamp.Feature"},
        // For Multiple feature file: the path of the feature files
        features = {"src/test/java/FeatureFile"}, //the path of the feature files
        //the path of the step definition files
        glue = {"step_diff","TimeCamp_StepDif"},
        //to generate different types of reporting
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/index.html",
                "pretty:target/cucumber-reports/cucumber-pretty.txt",
                "usage:target/cucumber-reports/cucumber-usage.json",
                "junit:target/cucumber-reports/cucumber-results.xml"},
        //it will check if any step is not defined in step definition file
        strict = true,
        //display the console output in a proper readable format
        monochrome = false,
        //to check the mapping is proper between feature file and step def file
        dryRun = false,
        publish = true,
        tags = "(@Employee)"
//        tags = "(@SmokeTest or @RegressionTest or @Test) and (not @pending)"
//        tags = "(@SmokeTest or @Regression) and (not @pending)"
//        //        tags = " (    @Regression or  @smokeTest    ) and not @pending    "
//        tags = {"@Regression or  @smokeTest or "}
//         tags={"@Test1,@Test2"}

)
public class Junit_Runner {
}
