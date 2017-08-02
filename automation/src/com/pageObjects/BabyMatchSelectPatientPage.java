package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class BabyMatchSelectPatientPage extends IEDriver
{   private static WebElement element = null;

	public static WebElement scanPatientID()
	{
		
		element  = driver.findElement(By.id("txtPatientId"));
		return element;
	}
	public WebElement button_Logout()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
}
