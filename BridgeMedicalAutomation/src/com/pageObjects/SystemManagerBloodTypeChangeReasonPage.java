package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemManagerBloodTypeChangeReasonPage 
{
	
	@FindBy (id = "cmdCreate") 		public WebElement linkCreateBloodTypeChangeReasons;
	@FindBy (id = "txtCode") 		public WebElement textboxCodeCreateReason;
	@FindBy (id = "txtValue") 		public WebElement textboxNameCreateReason;
	@FindBy (id = "txtDescription") public WebElement textboxDescriptionCreateReason;
	@FindBy (id = "cmdOK") 			public WebElement buttonConfirmCreateReason;
	@FindBy (id = "cmdCancel") 		public WebElement buttonCancelCreateReason;
	@FindBy (id = "cmdOK") 			public WebElement linkBack;

}
