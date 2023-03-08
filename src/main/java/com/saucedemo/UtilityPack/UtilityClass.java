package com.saucedemo.UtilityPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static void screenshotMethod(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver; 
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);	   
		File destFile = new File("D:\\Back-up Data\\Desktop-Backup\\Pavan Velo\\Automation Batch Material\\Oct-15thBatch-Morning\\Automation Notes\\ScreenshotFolder\\"+ name +".jpg");   
		FileHandler.copy(sourceFile, destFile);		   
	}

}
