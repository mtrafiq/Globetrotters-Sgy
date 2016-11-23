package stepDefiniton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestBase {
	
	
	static WebDriver driver;
	
	@Before
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.schoology.com");
	}
	
	@After
	public void closeBrowser() {
		
		driver.quit();
	}
}
