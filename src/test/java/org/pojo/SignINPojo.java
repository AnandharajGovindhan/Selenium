package org.pojo;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignINPojo extends Baseclass{
	public SignINPojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Create New Account')]")
	private WebElement CreateNewAccBtn;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement firstNameTxtBox;
	
	@FindBy(name="lastname")
	private WebElement secondNameTxtBox;
	
	@FindBy(name="reg_email__")
	private WebElement mobileorEmailTxtBox;
	
	@FindBy(id="password_step_input")
	private WebElement password;

	public WebElement getCreateNewAccBtn() {
		return CreateNewAccBtn;
	}

	public WebElement getFirstNameTxtBox() {
		return firstNameTxtBox;
	}

	public WebElement getSecondNameTxtBox() {
		return secondNameTxtBox;
	}

	public WebElement getMobileorEmailTxtBox() {
		return mobileorEmailTxtBox;
	}

	public WebElement getPassword() {
		return password;
	}
	
	

}
