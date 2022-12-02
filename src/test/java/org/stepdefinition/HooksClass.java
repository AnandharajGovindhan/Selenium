package org.stepdefinition;

import org.base.Baseclass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends Baseclass {
	
	@Before(order = 1)
	//precondition
	private void precondition2() {
		launchBrowser();
		System.out.println("Launch the Browser");
	}
	@Before(order = 2)
	//precondition
	private void precondition1() {
		windowMaximize();
		System.out.println("max the window");
	}
	@Before(order = 6, value = "@Feature3")
	//precondition
	private void precondition3() {
		System.out.println(" Precondition 3");
				
	}
	
	@After(order = 10, value = "@Feature3")
	//postcondition
	private void postCondition2() {
		System.out.println("Take screenshot of scenarios");

	}

	@After(order = 4 )
	//postcondition
	private void postCondition1() {
		closeEntireBrowser();
		System.out.println("Close Entire browser");
	}
}
