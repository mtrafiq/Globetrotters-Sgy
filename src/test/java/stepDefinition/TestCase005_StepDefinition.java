package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import schoology.PageObject.SchoologyHomePage;
import schoology.PageObject.SchoologyRegFormPage;
import schoology.PageObject.SchoologySignupPage;

public class TestCase005_StepDefinition {
	
		WebDriver driver = TestBase.driver;
		SchoologyHomePage schoologyHomePage;
		SchoologySignupPage schoologySignupPage;
		SchoologyRegFormPage schoologyRegFormPage;
	
	@Given("^User is on home page$")
	public void userIsOnHomePage(){
		
		schoologyHomePage = new SchoologyHomePage(driver);
		schoologyHomePage.checkPageTitle();
	}
	
	@When("^User clicks on signup link$")
	public void userClickOnSignup(){
		
		schoologyHomePage.userClicksOnSignup();
		
	}
		
	@And("^User clicks on Student link$")
	public void clickStudentLink(){
		schoologySignupPage= new SchoologySignupPage(driver);
		schoologySignupPage.clickStudentLink();
	}
	
	@And ("^User Enters given access code$")
	public void enterAccessCode(){
		schoologySignupPage.enterAccessCode();
	}
	
	@And("^User clicks on continue button$")
	public void clickOnContinue(){
		schoologySignupPage.clickOnContinue();
		
		schoologyRegFormPage = new SchoologyRegFormPage(driver);
		schoologyRegFormPage = schoologySignupPage.clickOnContinue();	
	
	}
	
	@And ("^User completes form \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	
	public void fillForm(String firstName, String lastName, String emailAddress, String enterPassword, String confirmPassword){
		
		schoologyRegFormPage.enterFirstName(firstName);
		schoologyRegFormPage.enterLastName(lastName);
		schoologyRegFormPage.enterEmailAdd(emailAddress);
		schoologyRegFormPage.enterPasswd(enterPassword);
		schoologyRegFormPage.confirmPasswd(confirmPassword);
	}
	
	@And("^User selects Date of birth June 15 1920 \"([^\"]*)\", (\\d+), (\\d+)$")
	public void enterDateOfBirth(String month, int date, int year){
		
		schoologyRegFormPage.selectBirthMonth(month);
		schoologyRegFormPage.selectBirthDate(date);
		schoologyRegFormPage.selectBirthYear(year);
	}
		
	@And("^User confirms that periodic schoology updates option is checked$")
	public void confirmUpdateOptionIsChecked(){
		
		schoologyRegFormPage.confirmUpdateOptionIsSelected();
	}
	
	@And("^User made sure that Registeration button is Enabled$")
	public void confirmRegisterButtonIsClickable(){
		
		schoologyRegFormPage.confirmRegisterBtnIsEnabled();
	
	}




}

