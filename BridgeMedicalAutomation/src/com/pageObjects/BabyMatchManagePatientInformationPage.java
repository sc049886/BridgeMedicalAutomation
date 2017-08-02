package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BabyMatchManagePatientInformationPage 
{
	
	
	//Link to update mother details
	@FindBy ( id = "editMother")			
	public WebElement editMotherLink;
	public WebElement getEditMotherLink() 
	{
		return editMotherLink;
	}
	
	//Correct Mother Name field
	@FindBy ( id = "txtCorrectMother_Name")	
	public WebElement correctMotherNameTextBox;
	public WebElement getcorrectMotherNameTextBox() 
	{
		return correctMotherNameTextBox;
	}
	
	//Correct Mother ID field
	@FindBy ( id = "txtCorrectMother_ID")	
	public WebElement correctMotherIDTextBox;
	public WebElement getCorrectMotherIDTextBox() 
	{
		return correctMotherIDTextBox;
	}

	//Confirm button
	@FindBy ( id = "cmdOK")					
	public WebElement confirmButton;
	public WebElement getConfirmButton() 
	{
		return confirmButton;
	}
	
	//Exit button
	@FindBy ( id = "cmdCancel")				
	public WebElement exitButton;
	public WebElement getExitButton() 
	{
		return exitButton;
	}
	

}
