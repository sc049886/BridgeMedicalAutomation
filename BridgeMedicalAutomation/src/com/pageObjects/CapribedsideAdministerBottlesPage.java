package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideAdministerBottlesPage  {

	

	@FindBy(id = "txtBottleNumber")
	public WebElement bottleNumberTextBox;

	public WebElement getbottleNumberTextBox() {
		return bottleNumberTextBox;
	}

	@FindBy(id = "txtVolume")
	public WebElement volumeTextBox;

	public WebElement getVolumeTextBox() {
		return volumeTextBox;
	}

	@FindBy(id = "divModalErrorConfirm")
	public WebElement warningPopup;

	public WebElement getWarningPopup() {
		return warningPopup;
	}

	@FindBy(id = "modalErrorConfirm_cmdButton1")
	public WebElement warningPopupYesButton;

	public WebElement getWarningPopupYesButton() {
		return warningPopupYesButton;
	}

	@FindBy(id = "modalErrorConfirm_cmdCancel")
	public WebElement warningPopupNoButton;

	public WebElement getWarningPopupNoButton() {
		return warningPopupNoButton;
	}

	@FindBy(id = "errorLabel")
	public WebElement donorBottleErrorMessage;

	public WebElement getDonorBottleErrorMessage() {
		return donorBottleErrorMessage;
	}

	@FindBy(id = "cmdConfirm")
	public WebElement confirmButton;

	public WebElement getConfirmButton() {
		return confirmButton;
	}

	@FindBy(id = "cmdConfirm")
	public WebElement exitButton;

	public WebElement getExitButton() {
		return exitButton;
	}

	@FindBy(id = "errorLabel")
	public WebElement bottleConnotBeAdministerForThisPatientErrorMsg;

	public WebElement getBottleConnotBeAdministerForThisPatientErrorMsg() {
		return bottleConnotBeAdministerForThisPatientErrorMsg;
	}

	// Hazards

	@FindBy(id = "errorLabel")
	public WebElement bottleNotReceivedErrorMessage;

	public WebElement getBottleNotReceivedErrorMessage() {
		return bottleNotReceivedErrorMessage;
	}

	private static String warningPop = ".//span[text()='Warning:']";

	public static String getWarningPop() {
		return warningPop;
	}

}
