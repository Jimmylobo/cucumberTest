import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(features = {"src/test/resources/cukes"}, glue = {"src/main/StepDefs"})
@RunWith(Cucumber.class)
public class TestRunner {
}
