import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberReport.html", "json:target/testReport.json"},
        features = "/Users/nurgazyamanbaev/Desktop/CashWiseCucumber/src/test/resources/features",
        glue = "step_definitions",
        tags = "@AddingClient",
        dryRun = false
)


public class CucucmberRunner {

}
