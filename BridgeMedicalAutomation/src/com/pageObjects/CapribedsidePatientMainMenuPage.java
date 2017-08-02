package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsidePatientMainMenuPage {

	@FindBy(id = "cmdReceiveBottles_cmdButton")
	public WebElement receiveBottlesButton;

	@FindBy(id = "cmdStateChangeBottles_cmdButton")
	public WebElement stateChangeButton;

	@FindBy(id = "cmdCombineBottles_cmdButton")
	public WebElement combineBottlesButton;

	@FindBy(id = "cmdPrepareBottles_cmdButton")
	public WebElement prepareBottlesButton;

	@FindBy(id = "cmdDispenseBottles_cmdButton")
	public WebElement administerBottlesButton;

	@FindBy(id = "cmdPrintMilkLabels_cmdButton")
	public WebElement printLabelsButton;

	@FindBy(id = "cmdDischargeBottles_cmdButton")
	public WebElement dischargeBottlesButton;

	@FindBy(id = "cmdBrowseBottleHistory_cmdButton")
	public WebElement browseBottleHistoryButton;

	@FindBy(id = "cmdManagePatientInformation_cmdButton")
	public WebElement managePatientInformationButton;

	// Blood TransfusionMenuElements
	@FindBy(id = "cmdStartTransfusion_cmdButton")
	public WebElement startTransfusionButton;

	@FindBy(id = "cmdHoldTransfusion_cmdButton")
	public WebElement holdTransfusionButton;

	@FindBy(id = "cmdEndTransfusion_cmdButton")
	public WebElement endTransfusionButton;

	@FindBy(id = "cmdRapidStartTransfusion_cmdButton")
	public WebElement rapidStartTransfusionButton;

	@FindBy(id = "cmdAdministerDerivative_cmdButton")
	public WebElement administerDerivativeButton;

	@FindBy(id = "cmdBrowseTransfusions_cmdButton")
	public WebElement browseTransfusionHistoryButton;
	
	//---Transfusion Started Tag.
	@FindBy(id = "cmdStartTransfusion_notificationText")
	public WebElement transfusionStartedTag;

	// cmdBrowseTransfusions_cmdButtonDisabled
	@FindBy(id = "cmdBrowseTransfusions_cmdButtonDisabled")
	public WebElement ditheredRrowseTransfusinHistoryButton;

	@FindBy(id = "cmdViewReactionInstructions_cmdButton")
	public WebElement viewReactionInformationButton;

	@FindBy(id = "cmdChangeBloodType_cmdButton")
	public WebElement changeBloodTypeButton;

	@FindBy(id = "PatientDetails_cmdChangePatient")
	public WebElement changePatientButton;

	// Collect Specimen Elements
	@FindBy(id = "cmdCollectSpecimens_cmdButton")
	public WebElement collectSpecimensButton;

	// Logout

	@FindBy(id = "header_cmdLogout")
	public WebElement logoutLink;

	@FindBy(id = "header__modalConfirm_cmdOK")
	public WebElement confirmLogoutOKButton;

}
