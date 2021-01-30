package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Assessment.feature",
        glue = {"step_definitions","Hooks"},
        tags={"@SemesterTest"}

)
public class Runner {

}
