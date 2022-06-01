package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Guilherme\\eclipse-workspace\\BDDFramework\\src\\main\\java\\Features",
		glue= {"C:\\Users\\Guilherme\\eclipse-workspace\\BDDFramework\\src\\main\\java\\stepDefinitions"}
	
		)

public class TestRunner {

}
