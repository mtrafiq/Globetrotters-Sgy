package schoology.PageObject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

	public CorporatePage clickCorporateLink(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*
		WebElement tourLink = driver.findElement(By.xpath("//a[contains(.,'Tour')]"));
		WebElement corporateLink = driver.findElement(By.xpath("//a[@id='corporate-header']"));
		
		Actions action = new Actions(driver);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		action.moveToElement(tourLink).moveToElement(corporateLink).click().build().perform();
			*/
		
		WebElement tourLink = driver.findElement(By.linkText("Tour"));
		WebElement corporateLink = driver.findElement(By.linkText("Corporate"));
       
		Actions action = new Actions(driver);
 
        action.moveToElement(tourLink).moveToElement(corporateLink).click().build().perform();
        
		return new CorporatePage(driver);
		
	}


}
