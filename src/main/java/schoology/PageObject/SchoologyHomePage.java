package schoology.PageObject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SchoologyHomePage {

 WebDriver driver;

 public SchoologyHomePage(WebDriver driver) {
  this.driver = driver;
  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
  driver.manage().window().maximize();
 }


 public void checkPageTitle() {
  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
  Assert.assertTrue(driver.getTitle().contains("Schoology"));
 }

 public SchoologySignupPage userClicksOnSignup() {

  driver.findElement(By.id("signup-header")).click();
  return new SchoologySignupPage(driver);

 }

 public CorporatePage clickCorporateLink() {
  
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement tourLink = driver.findElement(By.linkText("Tour"));
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(tourLink));

  WebElement corporateLink = driver.findElement(By.linkText("Corporate"));

  Actions action = new Actions(driver);

  action.moveToElement(tourLink).moveToElement(corporateLink).click().build().perform();

  return new CorporatePage(driver);
 }

 public SchoologyResourcesPage clickOnResources() {

  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  driver.findElement(By.id("resources-header")).click();
  return new SchoologyResourcesPage(driver);
 }

}