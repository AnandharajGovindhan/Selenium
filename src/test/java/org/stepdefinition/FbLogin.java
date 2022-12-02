package org.stepdefinition;

import org.base.Baseclass;
import org.pojo.FbLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends Baseclass{
	
	FbLoginPojo f;

	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
		launchBrowser();
		windowMaximize();

	}

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");
		

	}

	@When("To pass vaild username in email field")
	public void to_pass_vaild_username_in_email_field() {
		f = new FbLoginPojo();
		passText("selenium@gmail.com", f.getEmail());

	}

	@When("To pass Invaild password in password field")
	public void to_pass_Invaild_password_in_password_field() {
		f = new FbLoginPojo();
		passText("inmakes", f.getPasssword());
		
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new FbLoginPojo();
		clickBtn(f.getLoginBtn());
	}

	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() {
		System.out.println("......*.............");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	}

}
