package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideReceiveBottlesPage {

	@FindBy(id = "txtPatientId")
	public WebElement bottlePatientIdTextbox;

	@FindBy(id = "modalErrorConfirm_cmdOK")
	public WebElement yesButtonBottleNumberWarningPopup;

	@FindBy(id = "modalErrorConfirm_cmdCancel")
	public WebElement noButtonBottleNumberWarningPopup;

	@FindBy(id = "dpCollectionDate_foo")
	public WebElement collectedDateTimeTextbox;

	@FindBy(id = "lstStorageState")
	public WebElement storageStateDropdown;

	@FindBy(id = "txtComment")
	public WebElement commentsTextbox;

	@FindBy(id = "cmdConfirm")
	public WebElement confirmButton;

	@FindBy(id = "cmdCancel")
	public WebElement exitButton;

	@FindBy(id = "modalErrorConfirm_lblBody")
	public WebElement expiredBottleConfirmPopup;

	@FindBy(id = "modalErrorConfirm_cmdOK")
	public WebElement yesButtonExpiredBottleConfirmPopup;

	@FindBy(id = "modalErrorConfirm_cmdCancel")
	public WebElement noButtonExpiredBottleConfirmPopup;

	/*
	 * private static String TextPatientId = " .//span[@id='lblPatientID']";
	 * 
	 * public static String getTextPatientId() { return TextPatientId; }
	 */
	@FindBy(id = "errorLabel")
	public WebElement patientNotMatchErrorMessage;

	@FindBy(id = "errorLabel")
	public WebElement duplicateBottleErrorMessage;

	// When enabled scan for receive bottle.
	@FindBy(id = "errorLabel")
	public WebElement manualEntryErrorMessage;

	// Receive Bottle Logout popup

	@FindBy(id = "header_cmdLogout")
	public WebElement logoutLink;

	@FindBy(id = "header__modalConfirm_cmdOK")
	public WebElement yesButtonLogoutPopup;

	@FindBy(id = "header__modalConfirm_cmdCancel")
	public WebElement noButtonLogoutPopup;

}
