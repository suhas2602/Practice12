package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
//create pageobject of webdriver
	
	WebDriver ldriver;
	
	
	public IndexPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//identify webelemets
	
	@FindBy(linkText = "Sign in")
	WebElement Signin;
	
	//identify action
	
	public void ClickOnSignIn()
	{
		Signin.click();
	}
}
