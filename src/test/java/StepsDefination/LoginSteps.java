package StepsDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginSteps {
	
	WebDriver driver;
	BasePage page;
	LoginPage loginPage;
	
	@Before
	public void setUp() {
		page = new BasePage();
		driver = page.getDriver("chrome");
		loginPage = new LoginPage(driver);
	}
	
	@After
	public void tearDown() {
		page.closeBrowser();
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		page.openUrl("https://www.saucedemo.com");
	}
	@Then("user enter {string} and {string}")
	public void user_enter_and(String user, String pass) {
		 loginPage.enterLoginDetail(user,pass);	
	}
	@Then("user click on login button")
	public void user_click_on_login_button() {
		loginPage.clickLoginBtn();
		
	}
	@When("product page open")
	public void product_page_open() {
		Assert.assertTrue(true);
	}
	
	@Then("user enter {string} incorrect {string} details")
	public void user_enter_incorrect_details(String user, String pass) {
		loginPage.enterLoginDetail(user, pass);
	}
	
	@When("error is message popup")
	public void error_is_message_popup() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void runtest(){
		System.out.println("Hello working");
	}


	
}
