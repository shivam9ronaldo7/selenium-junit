package com.selenium.cucmber.runner;

import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import com.utility.ReadPropertiesFile;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/com/selenium/stories",
		glue={"com.selenium.stepDefination","com.utility"},
		tags= {"@Facebook"},
		monochrome=true,
		plugin= { "pretty", "json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",
				"html:target/cucumber-reports",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
		}
		)
public class Runner {
}
