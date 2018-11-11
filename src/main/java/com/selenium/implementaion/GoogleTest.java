package com.selenium.implementaion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.utility.Hooks;

public class GoogleTest{
	private WebDriver driver;
	public GoogleTest(Hooks hooks) {
		this.driver = hooks.driver;
	}
	
	public void i_want_to_open(String url) {
		this.driver.get(url);
	}
	
	public void search_on_the_navigation_bar(String searchText){
		this.driver.findElement(By.id("lst-ib")).sendKeys("searchText", Keys.TAB);
	}
	
	public void i_click_on_the_search_button() {
		this.driver.findElement(By.name("btnK")).click();
	}
	
	public void result_is_dsplayed() {
		if(!this.driver.getTitle().equals("Google - Google Search")) {
			this.driver.quit();
		}
	}

}
