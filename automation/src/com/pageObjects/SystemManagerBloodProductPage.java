package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class SystemManagerBloodProductPage extends IEDriver 
{
	private static WebElement element = null;
	public static WebElement editLinkForCRT()
	{
		element  = driver.findElement(By.id("dlItems__ctl6_editLink"));
		return element;
	}
	public static WebElement editLinkForISBTWB()
	{
		element  = driver.findElement(By.id("dlItems__ctl9_editLink"));
		return element;
	}
	public static WebElement editLinkForWB()
	{
		element  = driver.findElement(By.id("dlItems__ctl8_editLink"));
		return element;
	}
	public static WebElement linkBack()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}

}
