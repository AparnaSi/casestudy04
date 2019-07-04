package stepdef;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class log {
	WebDriver driver;
	@Given("User is on Login page")
	public void user_is_on_Login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver= new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	   
	}
	    
	

	@When("User enters the username as {string}")
	public void user_enters_the_username_as(String uname) {
	   WebElement un= driver.findElement(By.name("userName"));
	   un.sendKeys(uname);
	}

	@When("User enters the pasword as {string}")
	public void user_enters_the_pasword_as(String pwd) {
		WebElement pass= driver.findElement(By.name("password"));
		pass.sendKeys(pwd);
				
	}
	    
	@When("User clicks on login")
	public void user_clicks_on_login() {
	    WebElement login= driver.findElement(By.name("Login"));
	    login.click();}
	
	@When("Verify successfull login")
	public void verify_successfull_login() {
		String signin = driver.getTitle();
		Assert.assertTrue(signin.contains("Home"));
	    System.out.println("Success");
	}

	@Then("Close the application")
	public void close_the_application() {
		driver.close();
	    
	}




}
