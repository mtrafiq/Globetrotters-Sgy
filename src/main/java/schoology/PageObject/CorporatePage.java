package schoology.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CorporatePage {

WebDriver driver;

public CorporatePage(WebDriver driver){
	this.driver = driver;
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
}

public void enterFirstAndLastNames(String firstName, String lastName){
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	wait.until(ExpectedConditions.elementToBeClickable(By.id("FirstName")));
	
	driver.findElement(By.id("FirstName")).sendKeys(firstName);
	driver.findElement(By.id("LastName")).sendKeys(lastName);
}

public void selectManagerFromJobFunction(){
	
	Select manager = new Select(driver.findElement(By.id("Job_Function__c")));
	manager.selectByVisibleText("Manager");
		
}

public void enterPhoneEmailCompany(String phone, String email, String company){
	
	driver.findElement(By.id("Phone")).sendKeys(phone);
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Company")).sendKeys(company);
}

public void selectEmployeeSize(int index){
	
	Select employeeSize = new Select (driver.findElement(By.id("NumberOfEmployees")));
	employeeSize.selectByIndex(index);
}

public void selectCountry(String country){
	Select countryName = new Select(driver.findElement(By.id("Country")));
	countryName.selectByVisibleText(country);
}

public void enterComments(String comments){
	driver.findElement(By.id("Comment__c")).sendKeys(comments);
}

public void confirmSubmitBtnIsEnabled(){
	if (driver.findElement(By.xpath("//button[contains(.,'Submit')]")).isEnabled()){
		System.out.println("Submit Btn is Enabled and TC001 is Passed");
	}else{
		System.out.println("Submit Btn is not enabled and TC001 is Failed");
	}
}









}
