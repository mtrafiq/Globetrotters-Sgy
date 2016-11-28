package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import schoology.PageObject.CorporatePage;
import schoology.PageObject.SchoologyHomePage;

public class TestCase001_StepDefinition {

	WebDriver driver = TestBase.driver;
	SchoologyHomePage schoologyHomePage;
	CorporatePage corporatePage;
	
	/*
	@Given("^User is on Schoology home page$")
	public void userIsOnHomePage(){
		
		schoologyHomePage = new SchoologyHomePage(driver);
		schoologyHomePage.checkPageTitle();
	}*/

	@When("^User click corporate link by hovering over tour link$")
	public void userClicksOnCorporateLink(){
		
		schoologyHomePage.clickCorporateLink();
		
		corporatePage= new CorporatePage(driver);
		corporatePage =schoologyHomePage.clickCorporateLink();
	}
	
	@And("^User enters first name and last name \"([^\"]*)\", \"([^\"]*)\"$")
	public void userEnterFirstAndLastName(String firstName, String lastName){
		
		corporatePage.enterFirstAndLastNames(firstName, lastName);
	}

	@And("^User selects manager option from job function dropdown$")
	public void userSelectsManagerOption(){
		corporatePage.selectManagerFromJobFunction();
	}
	
	@And("^User Enters Phone, email address and company name \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void userEntersPhoneEmailAndCompany(String phone, String email, String company){
		corporatePage.enterPhoneEmailCompany(phone, email, company);
	}
	
	@And("^User selects 501, 2,000 option from employees size dropdown (\\d+)$")
	public void userSelectsEmployeeSize(int index){
		corporatePage.selectEmployeeSize(index);
	}

	@And("^User selects country from country dropdown \"([^\"]*)\"$")
	public void userSelectsCountry(String country){
		corporatePage.selectCountry(country);
	}

	@And("^User enters comments \"([^\"]*)\"$")
	public void userEntersComments(String comments){
		corporatePage.enterComments(comments);
	}

	@And("^User confirms that submit button is enabled$")
	public void userConfirmsSubmitBtnIsEnabled(){
		corporatePage.confirmSubmitBtnIsEnabled();
	}








































}
