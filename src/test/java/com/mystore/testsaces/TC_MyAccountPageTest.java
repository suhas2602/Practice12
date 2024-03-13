package com.mystore.testsaces;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.IndexPage;
import com.mystore.pageobject.MyAccount;
import com.mystore.pageobject.accountCreationDetails;
import com.mystore.pageobject.resisterUserAccount;



public class TC_MyAccountPageTest  extends TestBase{


	@Test
	public void varifyRegistrationAndLogin()
	{
		
		IndexPage pg=new IndexPage(driver);
		pg.ClickOnSignIn();
		logger.info("click on login");
		MyAccount acc=new MyAccount(driver);
		acc.CreateEmail("durgavale41415s1g@gmail.com");
		logger.info("enter email adress");
		acc.ClickSubmitEmail();
		logger.info("click on submit");

		accountCreationDetails account=new accountCreationDetails(driver);
		account.SelectTitlemsg();
		account.AddFirstName("suhas");
		account.AddLastName("durgavale");
		account.Enterpass("suhas111");
		account.ClickOnRegister();


		resisterUserAccount resister=new resisterUserAccount(driver);
		String Username= resister.GetUserName();
		Assert.assertEquals("Suhas durgavale", Username);

	}
	@Test(enabled=false)
	public void varifylogin() 
	{
		IndexPage pg=new IndexPage(driver);
		pg.ClickOnSignIn();
		logger.info("click on login");
		
		MyAccount my=new MyAccount(driver);
		my.EnterRegistyeredEmail("durgavale41415s1g@gmail.com");
		my.EnterRegistyeredpass("suhas111");
		my.SumbitRegisterLogin();
		
	}
}
