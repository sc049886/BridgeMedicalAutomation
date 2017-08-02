package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideDischargeBottlesPage {
	// private String warningPop = ".//span[text()='Warning:']";
	@FindBy(id = "txtBottleNumber")
	public WebElement bottleNumberTextbox;

	@FindBy(id = "divModalErrorConfirm")
	public WebElement warningPopup;

	@FindBy(id = "modalErrorConfirm_cmdButton1")
	public WebElement yesButtonWarningPopup;

	@FindBy(id = "modalErrorConfirm_cmdCancel")
	public WebElement noButtonWarningPopup;

	@FindBy(id = "cmdCancel")
	public WebElement exitButton;

	/*
	 * public String getWarningPop() { return warningPop; }
	 */
	@FindBy(id = "modalErrorConfirm_lblTitleHeader")
	public WebElement bottleMayNotBeDischargeToThisPatientErrorMsg;

	@FindBy(id = "modalErrorConfirm_cmdButton3")
	public WebElement acknowledgeButtonBottleMayNotBeDischargeToThisPatientPopup;

	// Hazards
	@FindBy(id = "errorLabel")
	public WebElement bottleNotReceivedErrorMessage;

}
