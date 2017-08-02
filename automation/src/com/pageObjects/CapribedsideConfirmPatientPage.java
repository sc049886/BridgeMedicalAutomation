package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class CapribedsideConfirmPatientPage extends IEDriver
{
	private  WebElement element = null;

	public  WebElement confirmPatientID()
	{
		element  = driver.findElement(By.id("txtPatientId"));
		return element;
	}
	public  WebElement continueButton()
	{
		
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public  WebElement exitButton()
	{
		
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
}
