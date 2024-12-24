package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


	

	public void VerifyLoginPage () {}


	


	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step -user is on login page ");
	}
	
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside Step - user enters username and password");
	}

	@And("clicks on loggin button")
	public void clicks_on_loggin_button() {
		System.out.println("Inside Step - clicks on loggin button");
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - user is navigated to the homepage");
	}





}
