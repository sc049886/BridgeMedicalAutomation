package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bridge.utilities.IEDriver;

public class SystemManagerTransfusionSettingsPage extends IEDriver
{

	private  WebElement element = null;
	public  WebElement displayPreviouslyStartedUnitsInHoldAndEndWithinTheLast()
	{
		element  = driver.findElement(By.id("txtDisplayStartedTransDays"));
		return element;
	}
	public  WebElement displayBloodTypeMismatchQuestion()
	{
		element  = driver.findElement(By.id("lstBloodTypeMismatchQuestions"));
		return element;
	}

	public  WebElement propmtForPatientBloodType()
	{
		element  = driver.findElement(By.id("lstPromptPatientBloodType"));
		return element;
	}
	
	public  WebElement expirationMessage()
	{
		element  = driver.findElement(By.id("lstExpirationStop"));
		return element;
	}
	
	public  WebElement linkBloodProducts()
	{
		element  = driver.findElement(By.xpath("//input[@value='Blood Products']"));
		return element;
	}
	public  WebElement linkBloodTypeChangeReasons()
	{
		element  = driver.findElement(By.xpath("//input[@value='Blood Type Change Reasons']"));
		return element;
	}
	public  WebElement linkReactionInstructions()
	{
		element  = driver.findElement(By.xpath("//input[@value='Reaction Instructions']"));
		return element;
	}
	public  WebElement linkReactionSignsAndSymptoms()
	{
		element  = driver.findElement(By.xpath("//input[@value='Reaction Signs and Symptoms']"));
		return element;
	}
	//Blood Product Substitution Chart link
	public  WebElement linkBloodProductSubstitutionChart()
	{
		element  = driver.findElement(By.name("_ctl5"));
		return element;
	}
	public  WebElement buttonConfirm()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	
	public  WebElement buttonCancel()
	{
		element  = driver.findElement(By.id("btnCancel"));
		return element;
	}
	

}
