package testcases;

import io.cucumber.java.en.*;

public class Register 
{
	
	@Given("user navigates to registration account page")
	public void user_navigates_to_registration_account_page() {
	   System.out.println("---> user has navigated to Registration account page");
	}

	@When("user enters first name {string} into  the first name field")
	public void user_enters_first_name_into_the_first_name_field(String firstname) {
		System.out.println("---> user has entered first name : " + firstname + " into firstname field");
	}

	@When("user enters last name {string} into the last name field")
	public void user_enters_last_name_into_the_last_name_field(String lastname) {
		System.out.println("---> user has entered last name : " + lastname + " into lastname field");
	}

	@When("user enters email address {string} into email field")
	public void user_enters_email_address_ravilella_gmail_com_into_email_field(String email) {
		System.out.println("---> user has entered email : " +email + " into email field" );
	}

	@When("user enters telephone number {string} into telephone field")
	public void user_enters_telephone_number_into_telephone_field(String telephone) {
		System.out.println("---> user has entered telephone number " + telephone);
	}

	@When("user enters password {string} into password field")
	public void user_enters_password_into_password_field(String password) {
		System.out.println("---> user has eneterd password "+ password + " into password field");
	}

	@When("user enters confirm password {string} into confirm password field")
	public void user_enters_confirm_password_into_confirm_password_field(String password) {
		System.out.println("---> user has eneterd confirm password "+ password + " into confirm password field");
	}

	@When("user selects privacy policy field")
	public void user_selects_privacy_policy_field() {
		System.out.println("---> user has selected pricvacy policy field");
	}

	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() {
		System.out.println("---> user has clicled on continue Button");
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
		System.out.println("---> user account has successfully created");
	}

	@When("user selects yes for newsletter")
	public void user_selects_yes_for_newsletter() {
		System.out.println("---> user has selected yes for newsletter");
	}

	@When("user donot enter details into any fields")
	public void user_donot_enter_details_into_any_fields() {
		System.out.println("---> user has not entered any details into any field");
	}

	

	@Then("warning message should be displayed for all the mandatody fields")
	public void warning_message_should_be_displayed_for_all_the_mandatody_fields() {
		System.out.println("---> ");
	}

}
