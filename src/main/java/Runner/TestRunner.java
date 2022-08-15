package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Guilherme\\eclipse-workspace\\BDDFramework\\src\\main\\java\\Features\\login.feature",
		glue= {"stepDefinitions"},
		stepNotifications = true, //shows the test scenarios steps into JUnit test results tab    
		monochrome = true, //display the console output in a readable format
		tags = "@tag1",
		plugin = {"pretty", "html:target/cucumber-reports" }, //generates different types of reporting
		dryRun = false //check the mapping between Feature File and Step Definitions file
	
		)

public class TestRunner {

}
