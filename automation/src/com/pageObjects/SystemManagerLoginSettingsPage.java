package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class SystemManagerLoginSettingsPage extends IEDriver
{
private  WebElement element = null;
	
	public WebElement forceChangePassword()
	{
		element  = driver.findElement(By.id("lstPasswordExpiration"));
		return element;
	}
	
	public  WebElement btnConfirm()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public  WebElement btnCancel()
	{
		element  = driver.findElement(By.id("btnCancel"));
		return element;
	}
	public WebElement passwordAttemptsBefore()//Aj
	{
		element  = driver.findElement(By.id("lstPasswordLockout"));
		return element;
	}
	
	
	public  WebElement unlockDuration()//Aj
	{
		element  = driver.findElement(By.id("lstLockoutDuration"));
		return element;
	}
	
	
	
	public  WebElement sessionTimeoutDuration()//Aj
	{
		element  = driver.findElement(By.id("lstBedsideALTime"));
		return element;
	}
	
	
	public  WebElement sessionTimeoutDurationTransfusion()//Aj
	{
		element  = driver.findElement(By.id("lstTransfuionALTime"));
		return element;
	}
	
	
	public  WebElement sessionTimeoutDurationSystemManager()//Aj
	{
		element  = driver.findElement(By.id("lstNonBedsideALTime"));
		return element;
	}
	
	
	
	public WebElement sessionTimeoutDurationBabyMatch()//Aj
	{
		element  = driver.findElement(By.id("lstBabyMatchALTime"));
		return element;
	}
	
	
	
	
	public  WebElement requireUpperCase()
	{
		element  = driver.findElement(By.id("cboxUpper"));
		return element;
	}
	
	public  WebElement requireLowerCase()
	{
		element  = driver.findElement(By.id("cboxLower"));
		return element;
	}
	
	public  WebElement requireNumeric()
	{
		element  = driver.findElement(By.id("cboxNumeric"));
		return element;
	}
	
	public  WebElement requireSpecialCharecter()
	{
		element  = driver.findElement(By.id("cboxSpecial"));
		return element;
	}
	
	public  WebElement passwordChangeAfter24()
	{
		element  = driver.findElement(By.id("cbox24Hours"));
		return element;
	}
	
}
