package steps;

import org.testng.Assert;

import browserfactory.DriverFactory;
import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginDemo 
{
	
	LoginPage loginpage =  new LoginPage(DriverFactory.getDriver());
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	    DriverFactory.getDriver().get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("the user enters {string} into the username field")
	public void the_user_enters_into_the_username_field(String username) {
		loginpage.enterUserName(username);
	}

	@When("the user enters {string} into the password field")
	public void the_user_enters_into_the_password_field(String password) {
	   loginpage.enterPassword(password);
	}

	@When("the user clicks the Submit button")
	public void the_user_clicks_the_submit_button() {
		loginpage.clicksubmit();
	}

	@Then("the new page URL should contain {string}")
	public void the_new_page_url_should_contain(String expectedurl) {
	   Assert.assertEquals(loginpage.getCurrentURL(), expectedurl);
	}

	@Then("the new page should display text containing {string}")
	public void the_new_page_should_display_text_containing_or(String successLoginMessage) {
	   Assert.assertEquals(loginpage.loginsuccess(), successLoginMessage);
	}

	@Then("the {string} button should be visible on the new page")
	public void the_button_should_be_visible_on_the_new_page(String string) {
	   Assert.assertEquals(loginpage.logOutButton(), true);
	}

	@Then("an error message should be displayed")
	public void an_error_message_should_be_displayed() {
		Assert.assertEquals(loginpage.loginErrorDisplayed(), true);
	}

	@Then("the error message text should be {string}")
	public void the_error_message_text_should_be(String expectedErrText) {
		Assert.assertEquals(loginpage.loginErrorText(), expectedErrText);
	}


}
