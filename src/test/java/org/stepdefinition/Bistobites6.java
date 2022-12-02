package org.stepdefinition;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.BistobitesPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Bistobites6 extends Baseclass {
	
	BistobitesPojo b;
	@Given("that I am logged in as a user and on the Home page.")
	public void thatIAmLoggedInAsAUserAndOnTheHomePage() {
		launchBrowser();
		windowMaximize();
		launchUrl("https://bistrobitesdc.com/");
	   
	}

	@When("Click the “Our Story” option.")
	public void clickTheOurStoryOption() {
		b = new BistobitesPojo();
		clickBtn(b.getOurstory());
	   
	}

	@When("Check the spelling mistake.")
	public void checkTheSpellingMistake() {
		WebElement spelling = driver.findElement(By.xpath("//p[contains(text(),'It’s true! ')]"));
	   System.out.println(spelling.getText());
	   
	}


}
