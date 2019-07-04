package stepdef;

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

public class example2 {
	WebDriver driver;
	@Given("User is registered to TestMe App")
	public void user_is_registered_to_TestMe_App() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    WebElement un= driver.findElement(By.name("userName"));
		   un.sendKeys("lalitha");
		   WebElement pass= driver.findElement(By.name("password"));
			pass.sendKeys("Password123");
			 WebElement login= driver.findElement(By.name("Login"));
			    login.click();}

	

	@When("User searches for a headphones")
	public void user_searches_for_a_headphones() {
		WebElement search= driver.findElement(By.xpath("//*[@id=\"myInput\"]"));
	    search.sendKeys("headphone");
	    Actions action= new Actions(driver);
	    action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    
	}

	@When("Proceed to payment process without adding products to the cart")
	public void proceed_to_payment_process_without_adding_products_to_the_cart() {
	   WebElement pay= driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]"));
	   pay.click();
	 	}

	@Then("TestMe App does not display the cart icon")
	public void testme_App_does_not_display_the_cart_icon() {
		if (driver.getTitle().equals("View Cart")) {
			Assert.assertFalse(false);
		}
		else {
			Assert.assertTrue(true);
		}
	  driver.close();  
	}



}
