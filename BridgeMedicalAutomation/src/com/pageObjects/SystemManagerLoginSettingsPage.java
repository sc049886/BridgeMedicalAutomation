package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemManagerLoginSettingsPage 
{
	@FindBy (id = "lstPasswordExpiration") 	public WebElement forceChangePassword;
	@FindBy (id = "cmdOK") 					public WebElement buttonConfirm;
	@FindBy (id = "btnCancel") 				public WebElement buttonCancel;
	@FindBy (id = "lstPasswordLockout") 	public WebElement passwordAttemptsBefore;
	@FindBy (id = "lstLockoutDuration") 	public WebElement unlockDuration;
	@FindBy (id = "lstBedsideALTime") 		public WebElement sessionTimeoutDuration;
	@FindBy (id = "lstTransfuionALTime") 	public WebElement sessionTimeoutDurationTransfusion;
	@FindBy (id = "lstNonBedsideALTime") 	public WebElement sessionTimeoutDurationSystemManager;
	@FindBy (id = "lstBabyMatchALTime") 	public WebElement sessionTimeoutDurationBabyMatch;
	@FindBy (id = "cboxUpper") 				public WebElement requireUpperCase;
	@FindBy (id = "cboxLower") 				public WebElement requireLowerCase;
	@FindBy (id = "cboxNumeric") 			public WebElement requireNumeric;
	@FindBy (id = "cboxSpecial") 			public WebElement requireSpecialCharecter;
	@FindBy (id = "cbox24Hours") 			public WebElement requirePasswordChangeAfter24hours;

}
