package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bridge.utilities.IEDriver;

public class CapribedsideStateChangePage extends IEDriver
{
	private  WebElement element = null;
	public  WebElement txt_box_BottleNumber( )
	{
		element  = driver.findElement(By.id("txtBottleNumber"));
		return element;
	}
	public  WebElement button_Exit( )
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	public  WebElement warningBottleMayNotBezChangedForThisPatient( )
	{
		element  = driver.findElement(By.id("modalErrorConfirm_lblTitleHeader"));
		return element;
	}
	public  WebElement ackButtonBottleMayNotBezChangedForThisPatientPopup( )
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdButton3"));
		return element;
	}
	public  WebElement errMsgBottleNotReceived( )
	{
		element  = driver.findElement(By.id("errorLabel"));
		return element;
	}
	

}
