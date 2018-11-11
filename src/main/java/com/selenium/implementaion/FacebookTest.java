package com.selenium.implementaion;

import org.openqa.selenium.By;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.utility.Hooks;

public class FacebookTest {	
	private WebDriver driver;
	public FacebookTest(Hooks hooks) {
		this.driver = hooks.driver;
	}
	
	public void facebooks_landing_page_loads_with_title(String title){
		//Assert.assertEquals("Facebook tile not matched", title, facebookTestDriver.getTitle());
	}
	
	public void user_enters_first_name_as(String firstName) {
		this.driver.findElement(By.name("firstname")).sendKeys(firstName);
	}
	
	public void user_enters_last_name_as(String lastName) {
		this.driver.findElement(By.name("lastname")).sendKeys(lastName);
	}
	
	public void user_enters_mobile_number_as(String phNum) {
		this.driver.findElement(By.name("reg_email__")).sendKeys(phNum);
	}
	
	public void user_enters_password_as(String password) {
		this.driver.findElement(By.name("reg_passwd__")).sendKeys(password);
	}
	
	public void user_enters_dob_date_as(String date) {
		Select sc = new Select(this.driver.findElement(By.name("birthday_day")));
		sc.selectByValue(date);
	}
	
	public void user_enters_dob_month_as(String month) {
		Select sc = new Select(this.driver.findElement(By.name("birthday_month")));
		sc.selectByValue(month);
	}
	
	public void user_enters_dob_year_as(String year) {
		Select sc = new Select(this.driver.findElement(By.name("birthday_year")));
		sc.selectByValue(year);
	}
	
	public void user_clicks_gender_as(String gender) {
		switch(gender) {
		case "Male": this.driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		break;
		case "Female": this.driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
		break;
		//default:Assert.assertFalse("Invalid gender", false);
		}
	}
	
	public void clicks_sign_up_button() {
		this.driver.findElement(By.name("websubmit")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void page_to_enter_FB_otp_is_loaded() {
		//Assert.assertEquals("OTP page not loaded", "Facebook", this.facebookTestDriver.getTitle());
	}
	
}
