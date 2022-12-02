package org.pojo;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends Baseclass {
	//1.Non Parameteized Constructor
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);
	}
		//2.Private WebElements
		//WebElement email = driver.findElement(By.id("email"));
		
//		@FindAll({
//			@FindBy(xpath="//input[@id='email']"),
//			@FindBy(xpath="//input[@name='email']"),
//			@FindBy(xpath="//input[@data-testid='royal_email']")
//		})
//		private WebElement varRef;
	
	
		@FindBy(id="email")
		private WebElement email ;

		
		@FindBy(xpath="//input[@aria-label='Password']")
		private WebElement passsword;
		
		@FindBy(name="login")
		private WebElement loginBtn;
		
		//3.Gettters to acccess webelements outside the class
		
//		public WebElement getVarRef() {
//			return varRef;
//		}
		
		public WebElement getEmail() {
			return email;
		}

		public WebElement getPasssword() {
			return passsword;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}



}
