package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class CapribedsideViewReactionInformationPage extends IEDriver
{
	private static WebElement element = null;
	//Blood Type Chnage Reasons
	public static WebElement buttonBack()
		{
			element  = driver.findElement(By.id("Button_Cancel"));
			return element;
		}

	public WebElement linkLogout()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
}
