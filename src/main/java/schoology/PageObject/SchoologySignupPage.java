package schoology.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SchoologySignupPage {

		WebDriver driver;
	
	public SchoologySignupPage(WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
	}
	
	public void clickStudentLink(){
		
		WebDriverWait wait = new WebDriverWait(driver, 30); 
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Student')]")));
    	driver.findElement(By.xpath("//a[contains(.,'Student')]")).click();
    }
	
	public void enterAccessCode(){
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.id("edit-code")).sendKeys("PVTWZ-GDCRN");
	}
	
	public SchoologyRegFormPage clickOnContinue(){
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.id("edit-submit")).click();
		return new SchoologyRegFormPage(driver);
	}
}
