package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DonorMilkReserveReleaseBottle {

	@FindBy(id = "txtDonorMilkNumber")
	public WebElement donorBottleNumberTextbox;

	@FindBy(id = "txtPatientID")
	public WebElement patientIdTextbox;

	@FindBy(id = "cmdDone")
	public WebElement confirmButton;

	@FindBy(id = "cmdCancel")
	public WebElement exitButton;

	// Logout ...
	@FindBy(id = "header_cmdLogout")
	public WebElement linkLogout;

	@FindBy(id = "header__modalConfirm_cmdOK")
	public WebElement yesButtonLogoutPopup;

	@FindBy(id = "header__modalConfirm_cmdCancel")
	public WebElement noButtonLogoutPopup;

}
