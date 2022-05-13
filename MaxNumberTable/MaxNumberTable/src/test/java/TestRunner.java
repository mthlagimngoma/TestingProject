import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/MaxNumber.feature",
        glue = "stepdefinitions", plugin = {"pretty", "html:target/Report.html"})
public class TestRunner extends AbstractTestNGCucumberTests {
}