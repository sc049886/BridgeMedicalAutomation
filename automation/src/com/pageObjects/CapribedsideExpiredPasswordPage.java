package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class CapribedsideExpiredPasswordPage extends IEDriver
{
private  WebElement element = null;
	
	public  WebElement textBoxNewPassword()
	{
		element  = driver.findElement(By.id("NewPassword"));
		return element;
	}
	public  WebElement textBoxConfirmPassword()
	{
		element  = driver.findElement(By.id("ConfirmPassword"));
		return element;
	}
	public  WebElement btnOK()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public  WebElement btnCancel()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
}
