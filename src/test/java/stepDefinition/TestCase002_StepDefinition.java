package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import schoology.PageObject.SchoologyResourcesPage;
import schoology.PageObject.SchoologyHomePage;

public class TestCase002_StepDefinition {

WebDriver driver = TestBase.driver;
SchoologyHomePage schoologyHomePage;
SchoologyResourcesPage schoologyResourcesPage;

@When("^User clicks on resources link$")
public void userClicksOnResources(){
	schoologyHomePage = new SchoologyHomePage(driver);
	schoologyHomePage.clickOnResources();
	
	schoologyResourcesPage = new SchoologyResourcesPage(driver);
	schoologyResourcesPage = schoologyHomePage.clickOnResources();
	
}

@And("User checks the research under Type")
public void userChecksResearchUnderType(){
	
	schoologyResourcesPage.checkResearchUnderType();
}

@Then("^User validates the presence of Research keyword in result$")
public void userValidatesResearchKeywordIsPresent(){
	
	schoologyResourcesPage.validateResultContainsResearch();
}
















}
