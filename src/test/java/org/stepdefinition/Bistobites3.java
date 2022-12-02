package org.stepdefinition;

import org.base.Baseclass;
import org.pojo.BistobitesPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Bistobites3 extends Baseclass {
	
	
	BistobitesPojo b;
	@Given("that I am logged in as a user and on the home page")
	public void thatIAmLoggedInAsAUserAndOnTheHomePage() {
		launchBrowser();   
	}

	@When("Miximise the window")
	public void miximiseTheWindow() {
	  windowMaximize();
	  launchUrl("https://bistrobitesdc.com/");
	}

	@When("click the Account button.")
	public void clickTheAccountButton() {
		b= new BistobitesPojo();
		clickBtn(b.getAccountBtn());
	   
	}

	@When("Fill out the registration form with dummy data. \\(name, phone number, email…).")
	public void fillOutTheRegistrationFormWithDummyDataNamePhoneNumberEmail() {
		b= new BistobitesPojo();
		//Name
		passText("Anandharaj", b.getName());
		//Email
		passText("anandh@gmail.com", b.getEmail());
		//Phone
		passText("8798756453", b.getPhoneno());
		//password
		
		passText("Anandharaj1@", b.getPasswordreg());
	}

	@When("Skip the “confirm password” text label.")
	public void skipTheConfirmPasswordTextLabel() {
	   System.out.println("Skip the Confirm Password");
	}

	@When("click the register button.")
	public void clickTheRegisterButton() {
		b= new BistobitesPojo();
		clickBtn(b.getRegBtn());
	}

	@When("Get the pop-up “Please fill out the field”.")
	public void getThePopUpPleaseFillOutTheField() {
		System.out.println("Get the PopUp Message");
		
	}

	
}
