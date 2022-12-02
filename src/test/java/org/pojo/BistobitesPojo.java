package org.pojo;

import org.base.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BistobitesPojo extends Baseclass {
	
	public BistobitesPojo() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[@href='https://bistrobitesdc.com/login'])[2]")
	private WebElement AccountBtn;
	
	@FindBy(id="phone")
	private WebElement phone;
	
	@FindBy(name="password")
	private WebElement password;

	@FindBy(name="login")
	private WebElement loginBtn;
	
	
	@FindBy(xpath="//li[contains(text(),'Mobile No ')]")
	private WebElement mobileno;
	
	@FindBy(xpath = "(//a[@href='https://bistrobitesdc.com'])[3]")
	private WebElement home;
	
	@FindBy(xpath="(//div[@class='col-lg-3 col-md-6 col-sm-6 col-ms-12 col-xs-12'])[4]")
	private WebElement dosadd;
	
	@FindBy(xpath="//h2[text()='Masala Dosa']")
	private WebElement masladosa;

	@FindBy(xpath="//div[@class='textwidget']")
	private WebElement time;
	
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement phoneno;
	
	@FindBy(id="password_reg")
	private WebElement passwordreg;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement regBtn;
	
	@FindBy(id="lte-top-search-ico")
	private WebElement icon;
	
	@FindBy(xpath="(//input[@placeholder='Search'])[2]")
	private WebElement search;
	
	@FindBy(xpath="//h2[text()='Spanish omelet']")
	private WebElement Omelet;

	@FindBy(id="priceshow")
	private WebElement price;
	
	@FindBy(xpath="//a[@href='https://bistrobitesdc.com/aboutus']")
	private WebElement ourstory;
	
	public WebElement getAccountBtn() {
		return AccountBtn;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getDosadd() {
		return dosadd;
	}

	public WebElement getMasladosa() {
		return masladosa;
	}

	public WebElement getTime() {
		return time;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhoneno() {
		return phoneno;
	}

	public WebElement getPasswordreg() {
		return passwordreg;
	}

	public WebElement getRegBtn() {
		return regBtn;
	}

	public WebElement getIcon() {
		return icon;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getOmelet() {
		return Omelet;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getOurstory() {
		return ourstory;
	}
	
	
}
