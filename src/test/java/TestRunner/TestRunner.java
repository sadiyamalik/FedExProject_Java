package TestRunner;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/Reports/BDD_HTML_Reports",
                "rerun:target/rerun.txt"
        },
        features = {"src/test/resources/Features"},
        glue = {"StepsDefinitions"},
        tags = "@MultipleTracking"



)


public class TestRunner {
}
