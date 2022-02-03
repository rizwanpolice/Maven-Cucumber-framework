package Steps;

import org.junit.Assert;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import PageObjects.LoginPage;
import driver.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions extends BaseClass {
	
	static LoginPage login;
	static {
		login = PageFactory.initElements(driver, LoginPage.class);
		System.out.println("This is in static block");
	}
	
	@Given("I launch the demoqa website")
	public void i_launch_the_demoqa_website() {
	    driver.get("https://demoqa.com/login");
	}
	
	@When("I enter username")
	public void i_enter_username() {
		login.enterUsername("RizwanDemo");
	}
	
	@When("I enter password")
	public void i_enter_password() {
		login.enterPassword("TestPassword@1");
	}
	
	@When("I enter username {string}")
	public void i_enter_username(String user) {
		login.enterUsername(user);
	}
	
	@When("I enter password {string}")
	public void i_enter_password(String pass) {
		login.enterPassword(pass);
	}
	
	@When("I click login button")
	public void i_click_login_button() {
		login.clickLoginButton();
	}
	
	@Then("I see the home page")
	public void i_see_the_home_page() {
	   new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[text()=\"Profile\"]")));
	   String homePage = driver.findElement(By.xpath("//div[text()=\"Profile\"]")).getText();
	   System.out.println(homePage);

	}

}
