package com.mystore.testsaces;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import com.mystore.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
ReadConfig read=new ReadConfig();
String url=read.getBaseUrl();
String browser=read.getBrowser();


public static WebDriver driver;
public static Logger logger;

@BeforeClass
public void setup()
{
	switch(browser.toLowerCase())
	{
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		break;
	
		
		default :
			driver=null;
			break;
			
	
	}
	//implicit wait 10 sec
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//for logging 
	logger=LogManager.getLogger("MyStoreV1");
	//open url
			driver.get(url);
			logger.info("open url");
}

@AfterClass
public void teaeDown()
{
	driver.close();
	driver.quit();
}
//user method to capture screen shot
	public  void captureScreenShot(WebDriver driver,String testName) throws IOException
	{
		//step1: convert webdriver object to TakesScreenshot interface
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		//step2: call getScreenshotAs method to create image file
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(System.getProperty("diruser.") + "//screenshots//" + testName + ".png");
	
		//step3: copy image file to destination
		FileUtils.copyFile(src, dest);
	}
}
