package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideEndTransfusionPage 
{
	
	@FindBy(id = "txtUnitNumber")
	public WebElement unitNumberTextbox;
	
	@FindBy(id = "txtUnitDivision")
	public WebElement unitNumberDivisionTextbox;
	

	@FindBy(id = "lstBloodProduct")
	public WebElement bloodProductDropDown;
	
	@FindBy(id = "cmdOK")
	public WebElement continueButtonUnitProductSection;
	
	
	@FindBy(id = "cmdCancel")
	public WebElement exitButtonUnitProductSection;
	
    //Volume Page
	@FindBy(id = "cmdUpdateDateTime")
	public WebElement changeEndTransfusionDateTimeLinkVolumePage;
	
	@FindBy(id = "dpEndDate_foo")
	public WebElement endTransfusionDateTimeTextboxVolumePage;
	
	@FindBy(id = "txtVolume")
	public WebElement volumeTransferredTextbox;
	
	@FindBy(id = "lstReactions")
	public WebElement transfusionReactionDropdown;
	
	@FindBy(id = "txtComment")
	public WebElement endTransfusionCommentTextboxVolumePage;
	
	
	@FindBy(id = "Continue")
	public WebElement continueVolumePage;

	@FindBy(id = "cmdCancel")
	public WebElement cancelVolumePage;
	
	//Reactons Page
	@FindBy(id = "lstReactions_0")
	public WebElement elevatedTempCheckbox;
	
	@FindBy(id = "lstReactions_1")
	public WebElement anaphylaxisTempCheckbox;
	
	@FindBy(id = "lstReactions_2")
	public WebElement hypotensionOrPainCheckbox;
	
	@FindBy(id = "txtComments")
	public WebElement commentTextboxClinicalSignsAndSymptomsPage;
	
	@FindBy(id = "Continue")
	public WebElement continueButtonClinicalSignsAndSymptomsPage;
	
	@FindBy(id = "cmdCancel")
	public WebElement exitButtonClinicalSignsAndSymptomsPage;
	
	//Reaction Instruction Page
	@FindBy(id = "Continue")
	public WebElement continueButtonReactionInstructionsPage;
	
	@FindBy(id = "cmdCancel")
	public WebElement exitButtonReactionInstructionsPage;
	
	//Vitals
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
	
	
	//Print Report Page
	@FindBy(id = "btnPrint")
	public WebElement printButton;
	
	@FindBy(id = "btnReturn")
	public WebElement cancelPrintButton;

	
	//Pop up when transfusion is not started
	@FindBy(id = "_modalErrorConfirm_cmdOK")
	public WebElement yesButtonUnitNumberDoesNotMatchRecordedTransfusion;
	
	@FindBy(id = "_modalErrorConfirm_cmdCancel")
	public WebElement noButtonUnitNumberDoesNotMatchRecordedTransfusion;
	
	@FindBy(id = "_modalErrorConfirm_cmdOK")
	public WebElement yesButtonBloodProdDoesNotMatchRecordedTransfusion;

	@FindBy(id = "_modalErrorConfirm_cmdCancel")
	public WebElement noButtonBloodProdDoesNotMatchRecordedTransfusion;
	

	
	
	
	
}
