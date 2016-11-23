package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import schoology.PageObject.SchoologyHomePage;

public class TestCase005_StepDefinition {
	
	WebDriver driver = TestBase.driver;
	
	@Given("^User is on home page$")
	public void userIsOnHomePage(){
		
		SchoologyHomePage schoologyHomePage = new SchoologyHomePage(driver);
		schoologyHomePage.checkPageTitle();
	}

	
}
