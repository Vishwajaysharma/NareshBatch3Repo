package testcases;

import io.cucumber.java.en.*;

public class Login 
{
	
	@Given("user navigates to login page")
	public void user_navigates_to_login_page() 
	{
	   System.out.println("---> user has navigated to the login page");
	}

	@When("user enters valid email {string}")
	public void user_enters_valid_email(String userName) 
	{
	   System.out.println("---> user entered valid email : " + userName);
	}

	@When("user enters valid password {string}")
	public void user_enters_valid_password(String password) 
	{
		System.out.println("---> user ha entered valid password : " + password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
	   System.out.println("---> user has clicked the login button");
	}

	@Then("The user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() 
	{
	   System.out.println("---> user has redirected to the dashboard");
	}

	@When("user enters invalid email {string}")
	public void user_enters_invalid_email(String invalidemail) 
	{
	    System.out.println("---> user has entered invalid email : " + invalidemail);
	}

	@When("user enters invalid password {string}")
	public void user_enters_invalid_password(String invalidpassword) 
	{
	    System.out.println("---> user has enterdd invalid password : " + invalidpassword);
	}

	@Then("An error message invalid user or password should be displayed")
	public void an_error_message_invalid_user_or_password_should_be_displayed() 
	{
	   System.out.println("---> error message has displayed for invalid user or password");
	}

	@Then("user should get proper warning message")
	public void user_should_get_proper_warning_message() 
	{
	    System.out.println("---> user has got proper warning message");
	}

}
