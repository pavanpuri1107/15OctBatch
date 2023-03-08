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

public class TC04_VerfiyAllProductsAddToCartFunctionality extends TestBaseClass
{  
	@Test
	public void verifyAllProductProductAddToCartFunctionality() throws IOException
	{		
		//all products add to cart
		HomePOMClass hp = new HomePOMClass(driver);
				
		hp.clickMultiProducts();
		System.out.println("Clicked on all products");
				
		System.out.println("Apply the validation");
				
		String expectedProductSelected = "6";
				
		String actualProductSelected = hp.getTextFromAddToCart();
				
		Assert.assertEquals(actualProductSelected, expectedProductSelected);	
	}
	
}
