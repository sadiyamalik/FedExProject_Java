package StepsDefinitions;

import BaseClasses.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends DriverUtil {
    DriverUtil dr = new DriverUtil();


    @Before
    public void SetupDriver() {
        dr.SetDriver();
    }

    @After(order=0)
    public void failScenarioS(Scenario scenario) {

        try {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            if (scenario.isFailed()) {
                scenario.log("this is my failure message");
                TakesScreenshot ts = (TakesScreenshot) dr.SetDriver();
                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", screenshotName);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }

     //dr.closeDriver();

    }
}
