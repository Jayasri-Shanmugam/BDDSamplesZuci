package stepDefinitions;
 
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import com.aventstack.extentreports.gherkin.model.Scenario;

import io.cucumber.java.After;
//import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
public class GooglePageStepDef {
	WebDriver driver;
//	@Before
	@Given("User is on Google Page")
	public void user_is_on_google_page() {
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	}
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {
	    WebElement searchBox=driver.findElement(By.cssSelector(".gLFyf"));
	    searchBox.sendKeys("Java Tutorial");
	    searchBox.submit();
	}
	@Then("Should display Java Tutorial Page")
	public void should_display_java_tutorial_page() {
	    Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
	}
	
	@When("User search Selenium Tutorial")
	public void user_search_selenium_tutorial() {
		 WebElement searchBox=driver.findElement(By.cssSelector(".gLFyf"));
		    searchBox.sendKeys("Selenium Tutorial");
		    searchBox.submit();
	}
	@Then("Should display Selenium Tutorial Page")
	public void should_display_selenium_tutorial_page() {
		 Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	}
	
	@After
	public void attachReportWithScreen(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			TakesScreenshot screen = (TakesScreenshot)driver;
			byte[] img = screen.getScreenshotAs(OutputType.BYTES);
			scenario.attach(img, "img/png", "ScreenshotImage");
		}
	}
 
}
 