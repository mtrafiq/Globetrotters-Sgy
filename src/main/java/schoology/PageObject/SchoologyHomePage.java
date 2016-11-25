package schoology.PageObject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SchoologyHomePage {

		WebDriver driver;
	
	public SchoologyHomePage(WebDriver driver){
		this.driver= driver;
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	public void checkPageTitle(){
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Assert.assertTrue(driver.getTitle().contains("Schoology"));
	}
	
	public SchoologySignupPage userClicksOnSignup(){
		
		driver.findElement(By.id("signup-header")).click();	
		return new SchoologySignupPage(driver);
	
	}
}
