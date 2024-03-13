package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
WebDriver ldriver;
	
	
	public MyAccount(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div/input[@id=\"email_create\"]")
	WebElement create_Email;
	
	@FindBy(xpath="//button[@id=\"SubmitCreate\"]")
	WebElement SubmitEmailBtn;
	
	//alraedy register 
	@FindBy(id="email")
	WebElement Enter_Email2;
	
	@FindBy(id="passwd")
	WebElement Enter_pass2;
	
	@FindBy(id="SubmitLogin")
	WebElement Registerd_Login2;
	
	public void CreateEmail(String email)
	{
		create_Email.sendKeys(email);
	}
	public void ClickSubmitEmail()
	{
		SubmitEmailBtn.click();
	}
	
	//action methods for already registered
	public void EnterRegistyeredEmail(String email)
	{
		Enter_Email2.sendKeys(email);;
	}
	public void EnterRegistyeredpass(String pass)
	{
		Enter_pass2.sendKeys(pass);
	}
	public void SumbitRegisterLogin()
	{
		Registerd_Login2.click();
	}
}
