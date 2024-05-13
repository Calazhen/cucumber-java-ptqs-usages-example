package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/cucumber"},
        features = "C:\\Development\\Workspace\\cucumberSelenium\\src\\test\\resources\\features",
        tags = "@ExemploLoginComEsquema",
        glue = "steps",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTest {

}
