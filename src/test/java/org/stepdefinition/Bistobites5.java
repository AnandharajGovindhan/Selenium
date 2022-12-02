package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.Baseclass;
import org.pojo.BistobitesPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Bistobites5 extends Baseclass{
	
	BistobitesPojo b;
	
	@Given("That I am logged in as a user and on the homepage")
	public void thatIAmLoggedInAsAUserAndOnTheHomepage() {
		launchBrowser();
		windowMaximize();
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("To click the “search” icon.")
	public void toClickTheSearchIcon() {
		b = new BistobitesPojo();
		clickBtn(b.getIcon());
	}

	@When("Find out the “Spanish Omelet” and Click the icon.")
	public void findOutTheSpanishOmeletAndClickTheIcon() throws AWTException {
		b = new BistobitesPojo();
		passText("Spanish Omelet", b.getSearch());
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

	@When("Select the option by probability.")
	public void selectTheOptionByProbability() {
		b = new BistobitesPojo();
		clickBtn(b.getOmelet());
	
	}

	@When("check the dollar probability.")
	public void checkTheDollarProbability() {
		b = new BistobitesPojo();
		String txt = b.getPrice().getText();
		System.out.println(txt);
		
	
	}

}
