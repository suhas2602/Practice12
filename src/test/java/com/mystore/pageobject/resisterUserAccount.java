package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class resisterUserAccount {


	WebDriver ldriver;


	public resisterUserAccount(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//identify webelemets

	@FindBy(xpath= "//a[@title=\"View my customer account\"]")
	WebElement userName;


	public String GetUserName()
	{
		String uName=userName.getText();
		return uName;
	}

}
