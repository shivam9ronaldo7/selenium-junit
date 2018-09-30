package com.selenium.stepDefination.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleLanding {
	
	WebDriver driver = null;
	
	@Given("^I want to open \"([^\"]*)\"$")
	public void i_want_to_open(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:/Download Softwares/Code GIT Repository/Selenium Automation GIT Repo/driver/chromedriver_2.42_win32.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("^search \"([^\"]*)\" on the navigation bar$")
	public void search_on_the_navigation_bar(String searchText) throws Throwable {
		driver.findElement(By.id("lst-ib")).sendKeys("searchText", Keys.TAB);
	}

	@When("^I click on the search button$")
	public void i_click_on_the_search_button() throws Throwable {
		driver.findElement(By.name("btnK")).click();
	}

	@Then("^result is dsplayed$")
	public void result_is_dsplayed() throws Throwable {
		driver.quit();
	}

	@Then("^(\\d+) search link i\\.e\\. result is displayed$")
	public void search_link_i_e_result_is_displayed(int arg1) throws Throwable {
		
	}
}
