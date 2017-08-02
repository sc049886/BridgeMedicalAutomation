package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideBrowseTransfusionHistoryPage 
{
	//Info Page
	@FindBy(id="btnGen")
	public WebElement generalButton;
	
	
	@FindBy(id="btnReact")
	public WebElement reactionButton;
	
	@FindBy(id="btnVitals")
	public WebElement vitalsButton;
	
	@FindBy(id="btnChecks")
	public WebElement checksButton;
	
	@FindBy(id="btnHolds")
	public WebElement holdButton;
	
	@FindBy(id="cmdOK")
	public WebElement backButtonInformationPage;
	
	
	//Edit Transfusion.
	
	@FindBy(id="dpEndTransDate_foo")
	public WebElement endTransfusionDateTextBox;
	
	@FindBy(id="lstBloodProduct")
	public WebElement bloodProductDropDown;
	
	
	@FindBy(id="txtVolume")
	public WebElement volumeTransfusedTextBox;

	@FindBy(id="Continue")
	public WebElement confirmEditTransfusionButton;
	
	@FindBy(id="cmdCancel")
	public WebElement exitEditTransfusionButton;
	
	//Correct Blood Plasma Derivative...
	@FindBy(id="dpDerivativeDateTime_foo")
	public WebElement administerDateTimeTextBox;

	@FindBy(id="cmdConfirm")
	public WebElement confirmEditBloodPlasmaDerivativeButton;
	
	@FindBy(id="cmdCancel")
	public WebElement exitEditBloodPlasmaDerivativeButton;

	
	
	//Logout Process
/*	public  WebElement linkLogout()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
	
	public  WebElement btnYesLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdOK"));
		return element;
	}
	public  WebElement btnNoLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdCancel"));
		return element;
	}*/
	
	//REaction-Post Transfusion Page
	@FindBy(id="lstReactions_0")
	public WebElement elevatedTemperatureCheckBox;
	
	@FindBy(id="lstReactions_1")
	public WebElement anaphylaxisCheckBox;
	
	@FindBy(id="lstReactions_2")
	public WebElement hypotensionCheckBox;
	
	@FindBy(id="lstReactions_3")
	public WebElement reducedUrinOutputCheckbox;
	
	@FindBy(id="lstReactions_4")
	public WebElement failureToClotCheckbox;
	
	@FindBy(id="lstReactions_5")
	public WebElement dyspneaNauseaCheckBox;
	
	@FindBy(id="lstReactions_6")
	public WebElement uticariaChillsCheckbox;
	
	@FindBy(id="Continue")
	public WebElement confirmPostTransfusionButton;

	@FindBy(id="cmdCancel")
	public WebElement exitPostTransfusionButton;

	
	
	//Post Transfusion Reaction Instruction page.
	@FindBy(id="headerInstructions")
	public WebElement reactionInstructionHeader;

	@FindBy(id="Continue")
	public WebElement confirmReactionInstructionButton;

	@FindBy(id="cmdCancel")
	public WebElement exitReactionInstructionButton;
	
	@FindBy(id="cmdOK")
	public WebElement backButtonBrowseTransfusionHistoryPage;
	

	
	
	//Report Page
	@FindBy(id="btnPrint")
	public WebElement printPostTransfusionReportButton;
	
	@FindBy(id="btnReturn")
	public WebElement cancelPostTransfusionReportButton;
	
	


}
