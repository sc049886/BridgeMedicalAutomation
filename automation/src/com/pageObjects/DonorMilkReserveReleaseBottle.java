package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class DonorMilkReserveReleaseBottle extends IEDriver
{
	private  WebElement element = null;
	public WebElement donorBottleNumber()
	{
		element  = driver.findElement(By.id("txtDonorMilkNumber"));
		return element;
	}
	public WebElement patientID()
	{
		element  = driver.findElement(By.id("txtPatientID"));
		return element;
	}
	public WebElement buttonConfirm()
	{
		element  = driver.findElement(By.id("cmdDone"));
		return element;
	}
	public WebElement buttonExit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}

	//Logout ...
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
