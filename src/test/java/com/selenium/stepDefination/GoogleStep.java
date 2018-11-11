package com.selenium.stepDefination;

import org.junit.jupiter.api.Test;
import com.selenium.implementaion.GoogleTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleStep {
	
	private GoogleTest googleTest;
	public GoogleStep(GoogleTest googleTest) {
		this.googleTest = googleTest;
	}
	
	@Test
	@Given("^I want to open \"([^\"]*)\"$")
	public void i_want_to_open(String url) throws Throwable {
		this.googleTest.i_want_to_open(url);
	}

	@Given("^search \"([^\"]*)\" on the navigation bar$")
	public void search_on_the_navigation_bar(String searchText) throws Throwable {
		this.search_on_the_navigation_bar(searchText);
	}

	@When("^I click on the search button$")
	public void i_click_on_the_search_button() throws Throwable {
		this.i_click_on_the_search_button();
	}

	@Then("^result is displayed$")
	public void result_is_dsplayed() throws Throwable {
		this.result_is_dsplayed();
	}
}
