package org.stepdefinition;

import org.base.Baseclass;
import org.pojo.RedbusPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Redbus extends Baseclass{
	
	RedbusPojo r;
	
	@Given("To launch the Chrome browser and Minimize the window")
	public void toLaunchTheChromeBrowserAndMinimizeTheWindow() {
		launchBrowser();
		windowMaximize();
	   
	}

	@When("To launch the url of redbus")
	public void toLaunchTheUrlOfRedbus() {
	   launchUrl("https://www.redbus.in/");
	}

	@When("To click the signin logo")
	public void toClickTheSigninLogo() {
		r = new RedbusPojo();
		clickBtn(r.getSigninLogo());
	   
	}

	@When("To click the sign in\\/sign up name")
	public void toClickTheSignInSignUpName() {
		r = new RedbusPojo();
		clickBtn(r.getSigin());
	}

	@When("To click the facebook login")
	public void toClickTheFacebookLogin() throws InterruptedException {
		Thread.sleep(3000);
		r = new RedbusPojo();
		clickBtn(r.getFacebook());
	}

	@When("To pass the data in email box")
	public void toPassTheDataInEmailBox() {
		r = new RedbusPojo();
		passText("anandh@gmail.com", r.getEmail());
	}

	@When("To pass the data in password box")
	public void toPassTheDataInPasswordBox() {
		r = new RedbusPojo();
		passText("3890247257", r.getPassword());
	}

	@Then("To close the chrome browser in redbus application")
	public void toCloseTheChromeBrowserInRedbusApplication() {
	 closeEntireBrowser();	}
	
		
}
