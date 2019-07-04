package stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class example {
	WebDriver driver;
	@Given("User is on home page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    
	}

	@When("User searches for {string}")
	public void user_searches_for(String product) {
	    WebElement prod = driver.findElement(By.name("products"));
	    prod.sendKeys(product);
	    
	    Actions actions= new Actions(driver);
	    actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div"))).click().perform();
	}

	
	

	@Then("User verifies and closes the application")
	public void user_verifies_and_closes_the_application() {
	   WebElement veri= driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[1]/center[1]/h4"));
	   String verify = veri.getText();
	   Assert.assertEquals(verify, "Headphone");
	   driver.close();
	}


}
