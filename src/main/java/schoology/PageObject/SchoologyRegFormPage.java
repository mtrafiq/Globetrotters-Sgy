package schoology.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.Select;

public class SchoologyRegFormPage {
	
		WebDriver driver;
	
	public SchoologyRegFormPage(WebDriver driver){
		this.driver = driver;
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	
	public void enterFirstName(String firstName){

		WebDriverWait wait = new WebDriverWait(driver, 30); 
        wait.until(ExpectedConditions.elementToBeClickable(By.id("edit-name-first")));
    	
        WebElement fName = driver.findElement(By.id("edit-name-first"));
		fName.sendKeys(firstName);		
	}
	
	public void enterLastName(String lastName){
		
		WebElement lName = driver.findElement(By.id("edit-name-last"));
		lName.sendKeys(lastName);
	}
			
	public void enterEmailAdd(String emailAddress){		
		WebElement eMail = driver.findElement(By.id("edit-login"));
		eMail.sendKeys(emailAddress);
	}
	public void enterPasswd(String password){
		WebElement passwd = driver.findElement(By.id("edit-pass-1"));
		passwd.sendKeys(password);
	}
	public void confirmPasswd(String confirmPassword){
		
		WebElement confirmPasswd = driver.findElement(By.id("edit-pass-2"));
		confirmPasswd.sendKeys(confirmPassword);
					
		}

	public void selectBirthMonth(String month){
		
		Select birthMonth = new Select(driver.findElement(By.id("edit-birthday-month")));
		birthMonth.selectByVisibleText(month);
	}
	public void selectBirthDate(int date){
		
		Select birthDate = new Select(driver.findElement(By.id("edit-birthday-day")));
		birthDate.selectByIndex(date);
	}
	public void selectBirthYear(int year){
		
		Select birthYear = new Select(driver.findElement(By.id("edit-birthday-year")));
		birthYear.selectByIndex(year);
	}
	public void confirmUpdateOptionIsSelected(){
		
		if (driver.findElement(By.id("edit-receive-email-updates")).isSelected()){
			System.out.println("Receive email updates option is selected");
			
		}else{
			driver.findElement(By.id("edit-receive-email-updates")).click();
		}
	}
		public void confirmRegisterBtnIsEnabled(){
			
			if (driver.findElement(By.id("edit-submit")).isEnabled()){
				System.out.println("Register Btn is Enabled and Test Case 005 is Passed");
			
			}else{
				System.out.println("Register Btn is not Enabled and Test Case 005 in Failed");
		
	}
			
	}
		
	

}
