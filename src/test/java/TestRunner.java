import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {
                "C:\\Users\\Jimmy\\IdeaProjects\\cucumberTest\\src\\test\\resources\\cukes\\01folders_menu_styling.feature"
        },
        glue = {"StepDefs"},
        plugin = {"pretty"}
)
@RunWith(Cucumber.class)
public class TestRunner {
}
