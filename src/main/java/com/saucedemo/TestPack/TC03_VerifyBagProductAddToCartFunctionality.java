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

public class TC03_VerifyBagProductAddToCartFunctionality extends TestBaseClass
{

	@Test
	public void verifyBagProductAddToCartFunctionality() throws IOException
	{
		//bag product add to cart
		HomePOMClass hp = new HomePOMClass(driver);
		
		hp.clickOnBagProduct();
		System.out.println("Clicked on bag product");
		
		System.out.println("Apply the validation");
		
		String expectedProductSelected = "1";
		
		String actualProductSelected = hp.getTextFromAddToCart();
		
		Assert.assertEquals(actualProductSelected, expectedProductSelected);	
	}
	
	
}
