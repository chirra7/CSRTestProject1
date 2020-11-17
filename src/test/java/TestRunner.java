
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "resource\\featureFile1.features"
        ,glue={"src\\test\\java\\StepDefinition\\"}
)

public class TestRunner {

}