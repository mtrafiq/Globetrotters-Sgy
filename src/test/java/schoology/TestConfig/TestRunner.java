package schoology.TestConfig;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"User-Stories"},
		glue = { "stepDefinition"},
		tags = { "@TC002" },
		format = { "pretty", "html:target"})




public class TestRunner {
	
}

	
