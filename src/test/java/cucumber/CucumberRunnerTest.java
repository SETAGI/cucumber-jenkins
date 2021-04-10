package cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//This code has a integration with jenkins and gitHub, it runs a job when it detects a change in the code.

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/mavenTest.feature",

        glue = ("methods")
)

public class CucumberRunnerTest {

}
