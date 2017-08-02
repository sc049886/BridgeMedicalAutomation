package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemManagerBreastMilkSettingsPage 
{
	
	@FindBy (id = "txtBottleRefExpHours") 		public WebElement textboxFreshExpLength;
	@FindBy (id = "lstBottleRefExpMode") 		public WebElement textboxFreshExpLengthUnits;
	@FindBy (id = "txtBottleFrzExpHours") 		public WebElement textBoxFrozenExpTimeLength;
	@FindBy (id = "lstBottleFrzExpMode") 		public WebElement textBoxFrozenExpTimeLengthUnits;
	@FindBy (id = "txtBottleThawExpHours") 		public WebElement textBoxThawedExpTimeLength;
	@FindBy (id = "lstBottleThawExpMode") 		public WebElement textBoxThawedExpTimeLengthUnits;
	@FindBy (id = "cmdOK") 						public WebElement buttonConfirm;
	@FindBy (id = "btnCancel") 					public WebElement buttonCancel;
	@FindBy (id = "txtBottleFortExpHours") 		public WebElement textboxFortifiedExpLength;
	@FindBy (id = "lstBottleFortExpMode") 		public WebElement selectFortifiedExpLengthUnits;
	@FindBy (id = "txtDonorMilkThawExpHours") 	public WebElement textboxDonormilkThawedExp;
	
	@FindBy (xpath="/html/body/div/div[1]/form/div[7]/table[1]/tbody/tr/td[1]/input[2]")
	public WebElement linkFortifierSettings;
}
