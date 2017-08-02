package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bridge.utilities.IEDriver;

public class BabyMatchManagePatientInformationPage extends IEDriver
{
	
	
	@FindBy ( id = "editMother")
	private WebElement editMotherLink;
	
	public WebElement getEditMotherLink() {
		return editMotherLink;
	}
	
	
	
	
	
	
	private static WebElement element = null;
	public static WebElement editMotherLink()
	{
		element  = driver.findElement(By.id("editMother"));
		return element;
	}
	
	public static WebElement clickOnConfirmButton()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement clickOnExitButton()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement correctMotherField()
	{
		element  = driver.findElement(By.id("txtCorrectMother_Name"));
		return element;
	}
	public static WebElement correctIdField()
	{
		element  = driver.findElement(By.id("txtCorrectMother_ID"));
		return element;
	}
	
	
	
	

}
