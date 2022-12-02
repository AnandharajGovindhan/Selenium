package org.stepdefinition;

import org.base.Baseclass;
import org.pojo.BistobitesPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Bistobites2 extends Baseclass {
	
	BistobitesPojo bb;
	
	@Given("that I am logged in as a user and on the home page.")
	public void thatIAmLoggedInAsAUserAndOnTheHomePage() {
		launchBrowser();
		windowMaximize();
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("I see the “HOME” button on the page and click it.")
	public void iSeeTheHOMEButtonOnThePageAndClickIt() throws InterruptedException {
		bb = new BistobitesPojo();
		Thread.sleep(3000);
		clickBtn(bb.getHome());
	  
	}

	@When("I see a dropdown labeled “Dosa”.")
	public void iSeeADropdownLabeledDosa() {
		bb = new BistobitesPojo();
		scrollThePage(bb.getDosadd());
	}

	@When("Click the dosa button.")
	public void clickTheDosaButton() {
		bb = new BistobitesPojo();
		clickBtn(bb.getDosadd());
	}

	@When("select the “Masala Dosa” option.")
	public void selectTheMasalaDosaOption() {
		bb = new BistobitesPojo();
		clickBtn(bb.getMasladosa());
	}

	@When("Enter the page and check the “Available Time”.")
	public void enterThePageAndCheckTheAvailableTime() {
	  String txt = bb.getTime().getText();
	  System.out.println(txt);
	  
	}

}
