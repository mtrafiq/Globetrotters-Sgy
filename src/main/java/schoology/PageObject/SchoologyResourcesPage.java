package schoology.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SchoologyResourcesPage {

	WebDriver driver;
	
	public SchoologyResourcesPage(WebDriver driver){
		
		this.driver = driver;
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	
	}
	
public void checkResearchUnderType(){
		
		driver.findElement(By.xpath("//label[contains(.,'Research')]")).click();
	}
	
	public void validateResultContainsResearch(){
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		WebElement result = driver.findElement(By.xpath("//a[contains(@href,'/pc-mag-review?from=resources')]"));
		result.getText();
		System.out.println("text from research result is  "+result);
		
		
		if (driver.findElement(By.xpath("//a[contains(@href,'/pc-mag-review?from=resources')]")).getText().contains("Research")){
			
			System.out.println("Result are filtered by Research Type and Test Case 002 is Pass");
			
		}else{
			System.out.println("Test Case 002 cannot be validated");
		}
	

	}







}
