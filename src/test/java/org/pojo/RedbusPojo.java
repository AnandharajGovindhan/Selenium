package org.pojo;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedbusPojo extends Baseclass{
	public RedbusPojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="i-icon-profile")
	private WebElement SigninLogo;
	
	@FindBy(id="signInLink")
	private WebElement sigin;
	
	@FindBy(xpath="//div[@class='facebook-text']")
	private WebElement facebook;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;

	public WebElement getSigninLogo() {
		return SigninLogo;
	}

	public WebElement getSigin() {
		return sigin;
	}

	public WebElement getFacebook() {
		return facebook;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}
	
}
