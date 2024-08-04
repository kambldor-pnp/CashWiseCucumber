package utilities;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberReport.html","json:target/testRepot.json"},
        features = "src/test/resources/features",
        glue = "step_definitions",
        tags = "@saucePositive",
        dryRun = false
)


public class CucumberRunner {
}
=======

@RunWith(Cucumber.class)
@CucumberOptions(
            plugin = {"html:target/cucumberReport.html", "json:target/testReport.json"},
            features = "src/test/resources/features",
            glue = "step_definitions",
            tags = "@AddCheck",
            dryRun = false

    )
public class CucumberRunner {
}






