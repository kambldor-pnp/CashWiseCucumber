import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberReport.html", "json:target/testReport.json"},
        features = "classpath:features",
        glue = "step_definitions",
        tags = "@ProductsAndServices",
        dryRun = true
)



public class ProductsAndServicesCucumberRunner {
}
