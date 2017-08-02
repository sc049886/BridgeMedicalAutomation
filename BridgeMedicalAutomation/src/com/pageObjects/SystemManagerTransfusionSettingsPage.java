package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemManagerTransfusionSettingsPage 
{

	@FindBy (id = "txtDisplayStartedTransDays") 	public WebElement displayPreviouslyStartedUnitsInHoldAndEndWithinTheLast;
	@FindBy (id = "lstBloodTypeMismatchQuestions") 	public WebElement displayBloodTypeMismatchQuestion;
	@FindBy (id = "lstPromptPatientBloodType") 		public WebElement propmtForPatientBloodType;
	@FindBy (id = "lstExpirationStop") 				public WebElement expirationMessage;
	@FindBy (id = "cmdOK") 							public WebElement buttonConfirm;
	@FindBy (id = "btnCancel") 						public WebElement buttonCancel;
	
	@FindBy (name = "_ctl5") 						public WebElement linkBloodProductSubstitutionChart;
	
	@FindBy (xpath = "//input[@value='Blood Products']") 				public WebElement linkBloodProducts;
	@FindBy (xpath = "//input[@value='Reaction Instructions']") 		public WebElement linkReactionInstructions;
	@FindBy (xpath = "//input[@value='Reaction Signs and Symptoms']") 	public WebElement linkReactionSignsAndSymptoms;
	@FindBy (xpath = "//input[@value='Blood Type Change Reasons']") 	public WebElement linkBloodTypeChangeReasons;
	@FindBy (name = "_ctl0")
	public WebElement bloodPlasmaDerivativeLink;
}
