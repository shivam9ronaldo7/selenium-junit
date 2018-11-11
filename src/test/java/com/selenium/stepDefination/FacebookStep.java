package com.selenium.stepDefination;

import org.junit.jupiter.api.Test;
import com.selenium.implementaion.FacebookTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookStep {
	private FacebookTest facebookTest;
	public FacebookStep(FacebookTest facebookTest) {
		this.facebookTest = facebookTest;
	}

	@Test
	@Given("^facebooks landing page loads with title \"([^\"]*)\"$")
	public void facebooks_landing_page_loads_with_title(String title) throws Throwable {	
		this.facebookTest.facebooks_landing_page_loads_with_title(title);
	}

	@When("^user enters first name as \"([^\"]*)\"$")
	public void user_enters_first_name_as(String firstName) throws Throwable {
		this.facebookTest.user_enters_first_name_as(firstName);
	}

	@When("^user enters last name as \"([^\"]*)\"$")
	public void user_enters_last_name_as(String lastName) throws Throwable {
		this.facebookTest.user_enters_last_name_as(lastName);
	}

	@When("^user enters mobile number as \"([^\"]*)\"$")
	public void user_enters_mobile_number_as(String phNum) throws Throwable {
		this.facebookTest.user_enters_mobile_number_as(phNum);
	}

	@When("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		this.facebookTest.user_enters_password_as(password);
	}

	@When("^user enters dob date as \"([^\"]*)\"$")
	public void user_enters_dob_date_as(String date) throws Throwable {
		this.facebookTest.user_enters_dob_date_as(date);
	}

	@When("^user enters dob month as \"([^\"]*)\"$")
	public void user_enters_dob_month_as(String month) throws Throwable {
		this.facebookTest.user_enters_dob_month_as(month);
	}

	@When("^user enters dob year as \"([^\"]*)\"$")
	public void user_enters_dob_year_as(String year) throws Throwable {
		this.facebookTest.user_enters_dob_year_as(year);
	}

	@When("^user clicks gender as \"([^\"]*)\"$")
	public void user_clicks_gender_as(String gender) throws Throwable {
		this.facebookTest.user_clicks_gender_as(gender);
	}

	@Then("^clicks sign up button$")
	public void clicks_sign_up_button() throws Throwable {
		this.facebookTest.clicks_sign_up_button();
	}

	@Then("^page to enter FB otp is loaded$")
	public void page_to_enter_FB_otp_is_loaded() throws Throwable {
		this.facebookTest.page_to_enter_FB_otp_is_loaded();
	}
}
