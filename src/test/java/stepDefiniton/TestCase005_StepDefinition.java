package stepDefiniton;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import schoology.PageObject.SchoologyHomePage;

public class TestCase005_StepDefinition {
	
	WebDriver driver = TestBase.driver;
	
	@Given("^User is on home page$")
	public void userIsOnHomePage(){
		
		SchoologyHomePage schoologyHomePage = new SchoologyHomePage(driver);
		schoologyHomePage.checkPageTitle();
	}

}
