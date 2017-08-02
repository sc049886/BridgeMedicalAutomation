package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class CapribedsideChangeBloodTypePage extends IEDriver
{
	private  WebElement element = null;
	public  WebElement newBloodType()
	{
		element  = driver.findElement(By.id("lstNewBloodType"));
		return element;
	}
	public  WebElement confirmNewBloodType()
	{
		element  = driver.findElement(By.id("lstConfirmedBloodType"));
		return element;
	}
	public  WebElement reasonForBloodTypeChange()
	{
		element  = driver.findElement(By.id("lstReasonForChange"));
		return element;
	}
	
	public  WebElement textBoxUserID()
	{
		element  = driver.findElement(By.id("txtLoginId"));
		return element;
	}
	public  WebElement textBoxPassword()
	{
		element  = driver.findElement(By.id("txtPassword"));
		return element;
	}
	public  WebElement btnConfirm()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public  WebElement btnExit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	public  WebElement currentBloodType()
	{
		element  = driver.findElement(By.id("lblBloodtype_Details"));
		return element;
	}
	//Logout Process
	public  WebElement linkLogout()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
	
	public  WebElement btnYesLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdOK"));
		return element;
	}
	public  WebElement btnNoLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdCancel"));
		return element;
	}

}
