package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideStartTransfusionPage {

	@FindBy(id = "txtSecondaryIdentifier")
	public WebElement mrnIdTextbox;

	@FindBy(id = "cmdOK")
	public WebElement mrnContinueButton;

	@FindBy(id = "cmdCancel")
	public WebElement mrnExitButton;

	@FindBy(id = "grdChecks__ctl2_checkboxSelect")
	public WebElement preCheckVerifyDobCheckBox;

	@FindBy(id = "grdChecks__ctl3_txtCheck")
	public WebElement preCheckFilterNumberCheckbox;

	@FindBy(id = "grdChecks__ctl2_checkboxSelect")
	public WebElement preCheckCheckTheOriginalTransfusionOrder;

	@FindBy(id = "Continue")
	public WebElement preCheckContinueButton;

	@FindBy(id = "cmdCancel")
	public WebElement preCheckExitButton;

	@FindBy(id = "txtPatientId")
	public WebElement recipientPatientIDTextbox;

	@FindBy(id = "txtSecondaryID")
	public WebElement recipientMrnTextbox;

	@FindBy(id = "txtPatientName")
	public WebElement recipientPatientNameTextbox;

	@FindBy(id = "txtUnitNumber")
	public WebElement recipientUnitNumberTextbox;

	@FindBy(id = "txtUnitDivision")
	public WebElement recipientUnitDivisionNumberTextbox;

	@FindBy(id = "lstBloodType")
	public WebElement recipientBloodTypeDropDown;

	@FindBy(id = "txtPatientComment")
	public WebElement recipientCommentTextBox;

	@FindBy(id = "cmdOK")
	public WebElement recipientContinueButton;

	@FindBy(id = "cmdCancel")
	public WebElement recipientExitButton;

	@FindBy(id = "lstCenterCode")
	public WebElement donorCenterCodeDropDown;

	@FindBy(id = "txtUnitNumber")
	public WebElement donorUnitNumberTextbox;

	@FindBy(id = "txtUnitDivision")
	public WebElement donorUnitDivisionTextbox;

	@FindBy(id = "lstBloodProduct")
	public WebElement donorBloodProductDropDown;

	@FindBy(id = "lstBloodProduct")
	public WebElement donorBloodProductDeivisionExist;

	@FindBy(id = "txtBloodProduct")
	public WebElement isbtDonorBloodProductLookupLink;

	@FindBy(id = "grdAttributes__ctl3_checkboxSelect")
	public WebElement antiCMVNegativeBloodProductAttributeCheckbox;

	@FindBy(id = "grdAttributes__ctl4_checkboxSelect")
	public WebElement irradiatedBloodProductAttributeCheckbox;

	@FindBy(id = "cmdSave")
	public WebElement saveBloodAttributeButton;

	@FindBy(id = "lstDonationType")
	public WebElement donorBloodProductDonationTypeDropdown;

	@FindBy(id = "txtDivision")
	public WebElement donorBloodProductDevisionTextbox;

	@FindBy(id = "dpExpirationDate_foo")
	public WebElement donorBloodProductExipreDateTextbox;

	@FindBy(id = "lstBloodType")
	public WebElement donorBloodTypeDropDown;

	@FindBy(id = "cmdOK")
	public WebElement donorContinueButton;

	@FindBy(id = "cmdCancel")
	public WebElement donorExitButton;

	// Cosign page...
	@FindBy(id = "lstBloodBankApproved")
	public WebElement cosignBloodBankPermission;

	@FindBy(id = "lstUserAgrees")
	public WebElement cosignAgreeBloodTypeSubtitution;

	@FindBy(id = "lstReasons")
	public WebElement cosignReasonForBloodTypeSubtitution;

	@FindBy(id = "txtLoginId")
	public WebElement cosignUserIdTextBox;

	@FindBy(id = "txtPassword")
	public WebElement cosignPasswordTextBox;

	@FindBy(id = "Continue")
	public WebElement cosignNormalContinueButton;

	@FindBy(id = "cmdOK")
	public WebElement cosignContinueButton;

	@FindBy(id = "cmdCancel")
	public WebElement cosignExitButton;

	// Cosign Page Hazard
	@FindBy(id = "User_LoginId")
	public WebElement cosignUserIdOrPasswordInvalidErrorMessage;

	// Vitals section

	@FindBy(id = "_vitals_txtTemperature")
	public WebElement vitalsTemperatureFahrenheitTextbox;

	@FindBy(id = "_vitals_txtAltTemperature")
	public WebElement vitalsTemperatureCelsiusTextBox;

	@FindBy(id = "_vitals_lstTemperatureSite")
	public WebElement vitalsTemperatureSiteDropdown;

	@FindBy(id = "_vitals_txtHeartRate")
	public WebElement vitalsHeartRateTextbox;

	@FindBy(id = "_vitals_txtSystolic")
	public WebElement vitalsSystolicBloodPressureTextbox;

	@FindBy(id = "_vitals_txtDiastolic")
	public WebElement vitalsDiastolicBloodPressureTextbox;

	@FindBy(id = "_vitals_cboxPalp")
	public WebElement vitalsPalpCheckBox;

	@FindBy(id = "_vitals_txtRespirations")
	public WebElement vitalsRespirationTextbox;

	@FindBy(id = "_vitals_txtOxygenSaturation")
	public WebElement vitalsOxygenSaturationTextBox;

	@FindBy(id = "_vitals_txtComment")
	public WebElement vitalsCommentTextBox;

	@FindBy(id = "_vitals_cont")
	public WebElement vitalsContinueButton;

	@FindBy(id = "_vitals_canc")
	public WebElement vitalsExitButton;

	/*
	 * @FindBy(id = "DialogConfirmPrinter_cmdOK") public WebElement printButton;
	 * public static WebElement vitalsTempTextBoxFar() { element =
	 * driver.findElement(By.id("_vitals_txtTemperature")); return element; }
	 * 
	 * @FindBy(id = "DialogConfirmPrinter_cmdOK") public WebElement printButton;
	 * public static WebElement vitalsTempTextBoxCel() { element =
	 * driver.findElement(By.id("_vitals_txtAltTemperature")); return element; }
	 * 
	 * @FindBy(id = "DialogConfirmPrinter_cmdOK") public WebElement printButton;
	 * public static WebElement vitalsTempSiteTextBox() { element =
	 * driver.findElement(By.id("_vitals_lstTemperatureSite")); return element;
	 * } public static WebElement vitalsHeartRateTextBox() { element =
	 * driver.findElement(By.id("_vitals_txtHeartRate")); return element; }
	 * public static WebElement vitalsSystolicBloodPressureTextBox() { element =
	 * driver.findElement(By.id("_vitals_txtSystolic")); return element; }
	 * public static WebElement vitalsDiastolicBloodPressureTextBox() { element
	 * = driver.findElement(By.id("_vitals_txtDiastolic")); return element; }
	 * public static WebElement vitalsPalpCheckBox() { element =
	 * driver.findElement(By.id("_vitals_cboxPalp")); return element; } public
	 * static WebElement vitalsRespirationTextBox() { element =
	 * driver.findElement(By.id("_vitals_txtRespirations")); return element; }
	 * public static WebElement vitalsOxygenSaturationTextBox() { element =
	 * driver.findElement(By.id("_vitals_txtOxygenSaturation")); return element;
	 * } public static WebElement vitalsCommentTextBox() { element =
	 * driver.findElement(By.id("_vitals_txtComment")); return element; } public
	 * static WebElement vitalsContinueButton() { element =
	 * driver.findElement(By.id("_vitals_cont")); return element; } public
	 * static WebElement vitalsExitButton() { element =
	 * driver.findElement(By.id("_vitals_canc")); return element; }
	 */

	@FindBy(id = "grdChecks__ctl2_checkboxSelect")
	public WebElement checksOriginalTransOrderCheckBox;

	@FindBy(id = "grdChecks__ctl3_txtCheck")
	public WebElement checksSecondOrderVerificationTextBox;

	@FindBy(id = "grdChecks__ctl4_checkboxSelect")
	public WebElement checksSignedConsentCheckBox;

	@FindBy(id = "Continue")
	public WebElement checksContinueButton;

	@FindBy(id = "cmdCancel")
	public WebElement checksExitButton;

	@FindBy(id = "cmdOK")
	public WebElement startButtonStartTransfusionPage;

	@FindBy(id = "cmdCancel")
	public WebElement exitButtonStartTransfusionPage;

	@FindBy(id = "btnPrint")
	public WebElement printButtonPrintReportPage;

	@FindBy(id = "btnReturn")
	public WebElement cancelButtonPrintReportPage;

	// Alert or Error Messages Donor Section Screen.
	@FindBy(id = "StartTransfusionEvent_UnitNumber")
	public WebElement donorUnitNumberMissmatchErrorMsg;

	@FindBy(id = "StartTransfusionEvent_BloodProduct")
	public WebElement donorBloodProductErrorMsg;

	@FindBy(id = "StartTransfusionEvent_UnitNumber")
	public WebElement transfusionIsAlreadyInProgressErrorMsg;

	// Exit Trans Popup
	@FindBy(id = "_modalConfirm_cmdOK")
	public WebElement yesButtonExitTransPopup;

	@FindBy(id = "_modalConfirm_cmdCancel")
	public WebElement noButtonExitTransPopup;

	// Hazards
	// Racipient Page
	@FindBy(id = "StartTransfusionEvent_PatientId")
	public WebElement errorMsgPatientIDDoesNotMatch;

	@FindBy(id = "StartTransfusionEvent_PatientName")
	public WebElement patientNameDoesNotMatchErrorMessage;

	@FindBy(id = "StartTransfusionEvent_PatientId")
	public WebElement notValidBarcodeForPatientIDErrorMessage;

	@FindBy(id = "StartTransfusionEvent_PatientName")
	public WebElement notValidBarcodeForPatientNameErrorMessage;

	// _modalErrorConfirm_lblTitleHeader
	@FindBy(id = "_modalErrorConfirm_lblTitleHeader")
	public WebElement bloodGroupMissMatchPopup;

	// _modalErrorConfirm_cmdOK
	@FindBy(id = "_modalErrorConfirm_cmdOK")
	public WebElement yesButtonBloodGroupMissMatchPopup;

	@FindBy(id = "_modalErrorConfirm_cmdCancel")
	public WebElement noButtonBloodGroupMissMatchPopup;

	// _modalErrorConfirm_lblTitle
	@FindBy(id = "_modalErrorConfirm_lblTitle")
	public WebElement bloodGroupMissMatchTitlePopup;

	@FindBy(id = "StartTransfusionEvent_BloodType")
	public WebElement notAuthToChangeBloodGroupErrorMessage;

	// Donor page Hazards
	@FindBy(id = "_modalErrorConfirm_lblTitleHeader")
	public WebElement expiredBloodProductPopup;

	@FindBy(id = "_modalErrorConfirm_cmdOK")
	public WebElement yesButtonExpiredBloodProductPopup;

	@FindBy(id = "_modalErrorConfirm_cmdCancel")
	public WebElement noButtonExpiredBloodProductPopup;

	@FindBy(id = "_modalErrorConfirm_lblTitleHeader")
	public WebElement bloodTypeMissMatchPopup;

	@FindBy(id = "_modalErrorConfirm_cmdOK")
	public WebElement yesButtonDonorBloodTypeMissMatchPopup;

	@FindBy(id = "_modalErrorConfirm_cmdCancel")
	public WebElement noButtonDonorBloodTypeMissMatchPopup;

	@FindBy(id = "StartTransfusionEvent_BloodType")
	public WebElement donorBloodTypeIsNotAllowedForPatientErrorMessage;

	/*
	 * //Logoutprocess
	 * 
	 * public static WebElement linkLogout() { element =
	 * driver.findElement(By.id("header_cmdLogout")); return element; }
	 * 
	 * public static WebElement btnYesLogoutPopup() { element =
	 * driver.findElement(By.id("header__modalConfirm_cmdOK")); return element;
	 * } public static WebElement btnNoLogoutPopup() { element =
	 * driver.findElement(By.id("header__modalConfirm_cmdCancel")); return
	 * element; }
	 */

}
