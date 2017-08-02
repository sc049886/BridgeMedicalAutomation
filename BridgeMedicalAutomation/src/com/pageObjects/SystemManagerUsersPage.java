package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemManagerUsersPage 
{

	
	@FindBy (id = "txtPassword") 		public WebElement textBoxPassword;
	@FindBy (id = "txtConfirmPassword") public WebElement textReenterPassword;
	@FindBy (id = "cmdOK") 				public WebElement buttonConfirm;
	@FindBy (id = "cmdCancel") 			public WebElement buttonCancel;
	@FindBy (id = "header_cmdLogout") 	public WebElement linkLogout;
	@FindBy (id = "cmdCreate") 			public WebElement linkCreateUser;
	@FindBy (id = "lstRole") 			public WebElement userRole;
	@FindBy (id = "txtFirstName") 		public WebElement createUserFName;
	@FindBy (id = "txtLastName") 		public WebElement createUserLName;
	@FindBy (id = "txtLoginId") 		public WebElement createUserUserId;
	@FindBy (id = "txtInitials") 		public WebElement createUserInitials;
	@FindBy (id = "txtAlias") 			public WebElement createUsertxtAlias;
	@FindBy (id = "MainError") 			public WebElement errorMessage;
	@FindBy (id = "txtPassword") 		public WebElement createUserPassword;
	
	@FindBy (id = "lstBabyMatchRecipient") 				public WebElement babyMatchRecipient;
	@FindBy (id = "dlUsers__ctl33_editLink") 			public WebElement editSuperuser;
	@FindBy (id = "txtConfirmPassword") 				public WebElement createUserConfirmPassword;
	@FindBy (id = "grdFacility__ctl2_checkboxFacility") public WebElement createUserFacility_Default;
	
}
