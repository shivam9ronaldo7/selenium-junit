package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.utility.ReadPropertiesFile;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
	private ReadPropertiesFile rpf;	
	public WebDriver driver = null;
	
	@Before
	public void before() {
		rpf = new ReadPropertiesFile();
		String path = rpf.getWebdriverPath();
		String typeDriver = rpf.getBrowser();
		int waitTime = Integer.parseInt(rpf.getImplicitWaitTime());
		switch(typeDriver) {
		case "chrome":System.setProperty("webdriver.chrome.driver",path);
		driver = new ChromeDriver();
		break;
		case "firefox":System.setProperty("webdriver.gecko.driver",path);
		break;
		default: System.out.println("Invalid browser");
		System.exit(0);
		}		
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@After
	public void after() {
		driver.quit();
	}
	
}
