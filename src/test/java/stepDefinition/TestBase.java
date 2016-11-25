package stepDefinition;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestBase {
	
	
	 static WebDriver driver;
	
	@Before
	public void openBrowser() {
		String osDriver = getOsDriver();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator+"drivers"+File.separator+osDriver);
		driver = new ChromeDriver();
		driver.get("http://www.schoology.com");
	}
	
	private String getOsDriver() {
		
		String osName = System.getProperty("os.name").toLowerCase();  //Windows 7
			if(osName.indexOf("win") >= 0) {
				return "chromedriver.exe";
			} else {
				return "chromedriver";
			}
	}

	@After
	public void closeBrowser(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		driver.quit();
	}
}
