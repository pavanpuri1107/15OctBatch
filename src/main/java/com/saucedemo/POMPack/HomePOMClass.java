package com.saucedemo.POMPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass 
{
	//POM class
	//1.WebDriver globally declared
	//2.@FindBy ele find
	//3.Ele action->method create
	//4.COnstructor create-
	
	private WebDriver driver;
	private Select s;
	
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	private WebElement settingBtn;
	
	public void clickSettingBtn()
	{
		settingBtn.click();
	}
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logOutBtn;
	
	public void clickLogOutBtn()
	{
		logOutBtn.click();
	}
	
	//bag ele-add to cart
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement bagProduct;
	
	public void clickOnBagProduct()
	{
		bagProduct.click();
	}
	
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
	private WebElement addToCart;
	
	public String getTextFromAddToCart()
	{
		String actualProductSelected = addToCart.getText();
	    return actualProductSelected;   //=1
	}
	
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> multiProducts;
	
	public void clickMultiProducts()
	{
		for(int i=0; i<multiProducts.size();i++)
		{
			multiProducts.get(i).click();
		}
	}
	
	//Assignment
	//for regular concept-use for loop
	//for collection concept -always use for each loop
	

	public HomePOMClass(WebDriver driver)
	{
		//global      local
		this.driver = driver;
				
	   PageFactory.initElements(driver, this);
	   
//	   s = new Select(dropDown);
	}
	
	
	//Assignment
	//use dropDOwn for applying filter
//	@FindBy(xpath="//span[@class='shopping_cart_badge']")
//	private WebElement dropDown;
//	
//	public void clickOnDropDown()
//	{
//		dropDown.click();
//		
//		s.selectByValue("Value");
//	}
	
	
	

}
