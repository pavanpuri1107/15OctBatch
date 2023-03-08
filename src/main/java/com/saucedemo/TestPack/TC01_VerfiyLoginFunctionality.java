package com.saucedemo.TestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01_VerfiyLoginFunctionality extends TestBaseClass
{
	@Test
	public void verifyLoginFunctionality() throws IOException
	{	 
		log.info("Apply verification");
		  
		  //BA/PO/Dev-> acceptanace criteria
		String expectedTitle = "Swag Labs";   //given
		  
		String actualTitle   = driver.getTitle();
		  
		Assert.assertEquals(actualTitle, expectedTitle);	
	}
	

}
