package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.Baseclass;
import org.pojo.BistobitesPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Bistobites4 extends Baseclass {
	BistobitesPojo b;
	
	@Given("That I am logged in as a user and on the home page.")
	public void thatIAmLoggedInAsAUserAndOnTheHomePage() {
		launchBrowser();
		windowMaximize();
		launchUrl("https://bistrobitesdc.com/");
	    
	}

	@When("Click the “search” icon.")
	public void clickTheSearchIcon() {
		b = new BistobitesPojo();
		clickBtn(b.getIcon());
	    
	}

	@When("search “Coffee” and check the can dollar is “$ {double}”.")
	public void searchCoffeeAndCheckTheCanDollarIs$(Double double1) throws AWTException {
		b = new BistobitesPojo();
		passText("Coffee", b.getSearch());
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
