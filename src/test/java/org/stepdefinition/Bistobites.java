package org.stepdefinition;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.BistobitesPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bistobites extends Baseclass {
	
	BistobitesPojo b;
	
	@Given("The user enters the testing site.")
	public void theUserEntersTheTestingSite() {
	   launchBrowser();
	   windowMaximize();
	   launchUrl("https://bistrobitesdc.com/");
	}

	@When("click the “Account” button.")
	public void clickTheAccountButton() {
	b = new BistobitesPojo();
	clickBtn(b.getAccountBtn());
	}

	@When("Give the wrong “Username” and “Password”.")
	public void giveTheWrongUsernameAndPassword() {
		b = new BistobitesPojo();
		//Username
		passText("78344384584", b.getPhone());
		b.getPhone();
		//Password/
		passText("Anandh1@", b.getPassword());
	}

	@When("click the “login” button.")
	public void clickTheLoginButton() {
		b = new BistobitesPojo();
		clickBtn(b.getLoginBtn());
	}

	@When("check the output \\(Invalid Mobile No).")
	public void checkTheOutputInvalidMobileNo() {
		b = new BistobitesPojo();
		String txt = b.getMobileno().getText();
		System.out.println(txt);
	}

	@Then("To close the website")
	public void toCloseTheWebsite() {
	   //closeEntireBrowser();
	}

}
