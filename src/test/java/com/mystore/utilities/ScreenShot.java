package com.mystore.utilities;

import org.openqa.selenium.support.PageFactory;

import com.mystore.testsaces.TestBase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
public class ScreenShot extends TestBase{
	public ScreenShot()
	{
		PageFactory.initElements(driver,this);
	}
	static String path="E:/Java_Selenium/screenshots";
	public static void TakesScreenshot(String filename) 
	{
		
		
		try
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(path+filename+System.currentTimeMillis()+".png");
			FileHandler.copy(src, dest);
		} 
		catch (IOException e)
		{
			System.out.println("please provide correct path");
			e.printStackTrace();
		}
		
	}
	
}
