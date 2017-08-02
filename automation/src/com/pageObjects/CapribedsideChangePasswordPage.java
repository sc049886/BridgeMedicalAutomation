package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class CapribedsideChangePasswordPage extends IEDriver {

	private  WebElement element = null;

	public  WebElement currentUserID()
	{
		element  = driver.findElement(By.id("UserId"));
		return element;
	}
	public  WebElement currentPassword()
	{
		element  = driver.findElement(By.id("Password"));
		return element;
	}
	public  WebElement newPassword()
	{
		element  = driver.findElement(By.id("NewPassword"));
		return element;
	}
	public  WebElement newConfirmPassword()
	{
		element  = driver.findElement(By.id("ConfirmPassword"));
		return element;
	}
	
	public  WebElement buttonOK()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public  WebElement buttonCancel()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
}
