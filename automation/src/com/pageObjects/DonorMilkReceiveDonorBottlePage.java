package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.bridge.utilities.IEDriver;

public class DonorMilkReceiveDonorBottlePage extends IEDriver
{
	private static WebElement element = null;
	public WebElement donorBottleNumber()
	{
		element  = driver.findElement(By.id("txtDonorMilkNumber"));
		return element;
	}
	
	public WebElement expireDate()
	{
		element  = driver.findElement(By.id("txtExpireDate"));
		return element;
	}

	public WebElement kiloCalories()
	{
		element  = driver.findElement(By.id("txtCalories"));
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
	//Expire Bottle Confirma Popup

	public static WebElement buttonYesExpireBottleWarning(){
		return element = driver.findElement(By.id("modalErrorConfirm_cmdOK"));
	}
	public static WebElement buttonNoExpireBottleWarning(){
		return element = driver.findElement(By.id("modalErrorConfirm_cmdCancel"));
	}
	
	//Logout...
	public static WebElement linkLogout()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
	public static WebElement btnYesLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdOK"));
		return element;
	}
	public static WebElement btnNoLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdCancel"));
		return element;
	}
	
	
}
