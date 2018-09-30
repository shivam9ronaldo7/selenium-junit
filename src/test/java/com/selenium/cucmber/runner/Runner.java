package com.selenium.cucmber.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/com/selenium/stories"
		,glue={"com.selenium.stepDefination.google"}
		)
public class Runner {
	
}
