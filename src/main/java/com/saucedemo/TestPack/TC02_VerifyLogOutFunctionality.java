package com.saucedemo.TestPack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePOMClass;
import com.saucedemo.UtilityPack.UtilityClass;

public class TC02_VerifyLogOutFunctionality extends TestBaseClass
{
	@Test
	public void verifyLogOutFunctionality() throws IOException
	{
	 //logOutActivity
		HomePOMClass hp = new HomePOMClass(driver);
		
		hp.clickSettingBtn();
		System.out.println("Clicked on setting button");
		
		hp.clickLogOutBtn();
		System.out.println("Clicked on logOut Button");
		
		System.out.println("Went on loginPage");
		
		//take screenshot
	    UtilityClass.screenshotMethod(driver, "TC02_loginPage_PageScreenshot");
	  	System.out.println("Screenshot is taken");
	  	
		System.out.println("Apply verification");
		  
		  //BA/PO/Dev-> acceptanace criteria
		String expectedTitle = "Swag Labs";   //given
		  
		String actualTitle   = driver.getTitle();
		  
		Assert.assertEquals(actualTitle, expectedTitle);	
	}
	

}
