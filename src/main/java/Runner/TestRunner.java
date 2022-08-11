package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Guilherme\\eclipse-workspace\\BDDFramework\\src\\main\\java\\Features\\login.feature",
		glue= {"stepDefinitions"},
		tags = "@tag1",
		plugin = {"pretty", "html:target/cucumber-reports" }
	
		)

public class TestRunner {

}
