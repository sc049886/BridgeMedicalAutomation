
package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideRapidStartTransfusionPage {

	// Donor Page Element
	@FindBy(id = "lstCenterCode")
	public WebElement donorCenterCodeDropdown;

	@FindBy(id = "txtUnitNumber")
	public WebElement donorUnitNumberTextbox;

	@FindBy(id = "lstBloodProduct")
	public WebElement donorBloodProductDropDown;

	@FindBy(id = "lblAttributes")
	public WebElement bloodProductAttribute;

	@FindBy(id = "grdAttributes__ctl3_checkboxSelect")
	public WebElement antiCMVNegativeBloodProductAttributeCheckbox;

	@FindBy(id = "grdAttributes__ctl4_checkboxSelect")
	public WebElement irradiatedBloodProductAttributeCheckbox;

	@FindBy(id = "cmdSave")
	public WebElement saveBloodAttributeButton;

	@FindBy(id = "dpExpirationDate_foo")
	public WebElement donorBloodProductExipreDateTextbox;

	@FindBy(id = "lstBloodType")
	public WebElement donorBloodTypeDropDown;

	@FindBy(id = "txtStartTxComment")
	public WebElement donorComments;

	@FindBy(id = "cmdOK")
	public WebElement donorContinueButton;

	@FindBy(id = "cmdCancel")
	public WebElement donorExitButton;
	// Donor Page Hazards
	@FindBy(id = "StartTransfusionEvent_BloodType")
	public WebElement donorBloodTypeIsNotAllowedForPatientErrorMessage;

	@FindBy(id = "_modalErrorConfirm_lblTitleHeader")
	public WebElement bloodTypeMissmatchPopup;

	@FindBy(id = "_modalErrorConfirm_cmdOK")
	public WebElement yesButtonDonorBloodTypeMissMatchPopup;

	@FindBy(id = "_modalErrorConfirm_cmdCancel")
	public WebElement noButtonDonorBloodTypeMissMatchPopup;

	// Cosign Page
	@FindBy(id = "txtLoginId")
	public WebElement cosignUserIdTextBox;

	@FindBy(id = "txtPassword")
	public WebElement cosignPasswordTextBox;

	@FindBy(id = "Continue")
	public WebElement cosignContinueButton;

	@FindBy(id = "cmdCancel")
	public WebElement cosignExitButton;

	// Cosign Page Hazard
	@FindBy(id = "User_LoginId")
	public WebElement cosignUserIdOrPasswordInvalidErrorMessage;

	// Rapid Start Star Page.
	@FindBy(id = "cmdOK")
	public WebElement startRapidTransfusionButton;

	@FindBy(id = "cmdCancel")
	public WebElement exitRapidTransfusionButton;

	// Rapid Start Print Page.
	@FindBy(id = "btnPrint")
	public WebElement printRapidTransfusionReportButton;

	@FindBy(id = "btnReturn")
	public WebElement cancelPrintRapidTransfusionReportButton;

	// Logout process
	@FindBy(id = "header_cmdLogout")
	public WebElement logoutLink;

	@FindBy(id = "header__modalConfirm_cmdOK")
	public WebElement yesButtonLogoutPopup;

	@FindBy(id = "header__modalConfirm_cmdCancel")
	public WebElement noButtonLogoutPopup;

	/*
	 * //Logout method public void logoutRapidTransfusion() throws Throwable {
	 * CapribedsideRapidStartTransfusionPage.linkLogout().click();
	 * Thread.sleep(2000);
	 * CapribedsideRapidStartTransfusionPage.btnYesLogoutPopup().click();
	 * 
	 * }
	 */

}
