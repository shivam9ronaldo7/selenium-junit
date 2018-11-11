package com.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
	
	private Properties prop;
	private final String propFilePath = "D:/Download Softwares/Code GIT Repository/Selenium Automation GIT Repo/startup.properties";
	
	public ReadPropertiesFile() {
		BufferedReader buffReader;
		prop = new Properties();
		try {
			buffReader = new BufferedReader(new FileReader(propFilePath));	
			try {
				prop.load(buffReader);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
	}
	
	public String getBrowser() {
		String browser = prop.getProperty("browser");
		return browser;		
	}
	
	public String getWebdriverPath() {
		String webdriverPath = prop.getProperty("webDriverPath");
		return webdriverPath;	
	}
	
	public String getImplicitWaitTime() {
		String implicitWaitTime = prop.getProperty("implicitWaitTime");
		return implicitWaitTime;	
	}
	
	public String getExtentConfigPath() {
		String extentConfigPath = prop.getProperty("extentreportConfigPath");
		return extentConfigPath;
	}
	
}
