package schoology.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class SchoologyRegisteredUserHomePage {
WebDriver driver;
	
	public SchoologyRegisteredUserHomePage(WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
	}
	
	

}
