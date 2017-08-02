package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideStateChangePage {

	@FindBy(id = "txtBottleNumber")
	public WebElement bottleNumberTextbox;

	@FindBy(id = "cmdCancel")
	public WebElement exitButton;

	@FindBy(id = "modalErrorConfirm_lblTitleHeader")
	public WebElement warningBottleMayNotBeChangedForThisPatient;

	@FindBy(id = "modalErrorConfirm_cmdButton3")
	public WebElement acknowledgeButtonBottleMayNotBeChangedForThisPatientPopup;

	@FindBy(id = "errorLabel")
	public WebElement bottleNotReceivedErrorMessage;

}
