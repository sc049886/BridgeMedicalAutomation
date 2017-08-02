package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bridge.utilities.IEDriver;

public class SystemManagerBreastMilkSettingsPage extends IEDriver
{
	private static WebElement element = null;
	public static WebElement textBoxFreshExpTimeLength()
	{
		element  = driver.findElement(By.id("txtBottleRefExpHours" ));
		return element;
	}
	public WebElement textBoxFreshExpTimeLengthUnits()
	{
		element  = driver.findElement(By.id("lstBottleRefExpMode" ));
		return element;
	}
	 
		public static WebElement textBoxFrozenExpTimeLength()
		{
			element  = driver.findElement(By.id("txtBottleFrzExpHours" ));
			return element;
		}
		public WebElement textBoxFrozenExpTimeLengthUnits()
		{
			element  = driver.findElement(By.id("lstBottleFrzExpMode" ));
			return element;
		}

	public static WebElement textBoxThawedExpTimeLength()
		{
			element  = driver.findElement(By.id("txtBottleThawExpHours" ));
			return element;
		}
	public WebElement textBoxThawedExpTimeLengthUnits()
		{
			element  = driver.findElement(By.id("lstBottleThawExpMode" ));
			return element;
		}
			 
	 public static WebElement btnConfirm()
		{
			element  = driver.findElement(By.id("cmdOK" ));
			return element;
		}
	 public static WebElement btnCancel()
		{
			element  = driver.findElement(By.id("btnCancel" ));
			return element;
		}
	

}
