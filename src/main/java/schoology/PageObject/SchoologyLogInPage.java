package schoology.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SchoologyLogInPage {

	WebDriver driver;
	
	public SchoologyLogInPage(WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
	}
	
	
	public void userEntersUsername(){
		driver.findElement(By.id("edit-mail")).sendKeys("ant.vanegas@yahoo,com");
		
	}

	public void userEntersPassword(){
		driver.findElement(By.id("edit-pass")).sendKeys("123Class");
		
	}
	
	public SchoologyRegisteredUserHomePage userClicksLoginBtn(){
		driver.findElement(By.id("edit-submit")).click();
		return new SchoologyRegisteredUserHomePage(driver);
	}


}




