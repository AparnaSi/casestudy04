package stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class reg {
	 
		WebDriver driver;
		@Given("User is on signup page")
		public void user_is_on_signup_page() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");  
			 driver= new ChromeDriver();
		    driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
		    //driver.manage().window().maximize();
		}

		@When("User enters username as {string}")
		public void user_enters_username_as(String uname) {
			WebElement newname= driver.findElement(By.name("userName"));
			newname.sendKeys("Winterfell");
					}

		@When("User enters firstname as {string}")
		public void user_enters_firstname_as(String fname) {
			WebElement fname1= driver.findElement(By.name("firstName"));
			fname1.sendKeys("harry");
		}

		@When("User enters lastname as {string}")
		public void user_enters_lastname_as(String lname) {
			WebElement lname1= driver.findElement(By.name("lastName"));
			lname1.sendKeys("Potter");
		}

		@When("User enters password as {string}")
		public void user_enters_password_as(String pass) {

			WebElement pass1= driver.findElement(By.name("password"));
			pass1.sendKeys("nimbus2000");
		}

		@When("User enters confirm password as {string}")
		public void user_enters_confirm_password_as(String cpass) {
			WebElement cpass1= driver.findElement(By.name("confirmPassword"));
			cpass1.sendKeys("nimbus2000");
		}

		@When("User enters gender")
		public void user_enters_gender() {
			//WebElement gen=driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]"));
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[2]"))).click().perform();
			//WebElement gender= driver.findElement(By.name("gender"));
			//gen.click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		@When("User enters email as {string}")
		public void user_enters_email_as(String email) {
			WebElement email1= driver.findElement(By.name("emailAddress"));
			email1.sendKeys("aparna.sivarajan@gmail.com");
		}

		@When("User enters mobileno as {string}")
		public void user_enters_mobileno_as(String mob) {

			WebElement mob1= driver.findElement(By.name("mobileNumber"));
			mob1.sendKeys("1234567890");
		}

		@When("User enters dob as {string}")
		public void user_enters_dob_as(String DOB) {
			WebElement DOB1= driver.findElement(By.name("dob"));
			DOB1.sendKeys("06/06/1999");
		}

		@When("User enters address as {string}")
		public void user_enters_address_as(String addr) {
			WebElement addr1= driver.findElement(By.name("address"));
			addr1.sendKeys("10/50,Chennai");	
		}

		@When("User selects security question")
		public void user_selects_security_question() {
		    Select security= new Select(driver.findElement(By.name("securityQuestion")));
			security.selectByIndex(0);
		}

		@When("User enters answer as {string}")
		public void user_enters_answer_as(String sans) {
			WebElement ans= driver.findElement(By.name("answer"));
			ans.sendKeys("Chennai");
		}

		@When("User clicks register button")
		public void user_clicks_register_button() {
			WebElement ok= driver.findElement(By.name("Submit"));
			ok.click();	
		}

		@When("verify the successful registration")
		public void verify_the_successful_registration() {
		   String regi= driver.getTitle();
		   Assert.assertTrue(regi.contains("Login"));
			System.out.println("Success");
		}

		@Then("close the application")
		public void close_the_application() {
		     driver.close();
		}


	}

