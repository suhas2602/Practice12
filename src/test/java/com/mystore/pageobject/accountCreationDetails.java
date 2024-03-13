package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class accountCreationDetails {
WebDriver ldriver;
	
	
	public accountCreationDetails(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//identify webelemets
	
	@FindBy(id = "id_gender1")    //select Mr
	WebElement titleMr;
	
	@FindBy(id="customer_firstname")
	WebElement firstName;
	
	@FindBy(id="customer_lastname")
	WebElement lastName;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="submitAccount")
	WebElement register;
	
	public void SelectTitlemsg()
	{
		titleMr.click();
	}
	
	public void AddFirstName(String firstname)
	{
		firstName.sendKeys(firstname);
	}
	public void AddLastName(String lastname)
	{
		lastName.sendKeys(lastname);
	}
	public void Enterpass(String password1)
	{
		password.sendKeys(password1);
	}
	
	public void ClickOnRegister()
	{
		register.click();
	}
}
