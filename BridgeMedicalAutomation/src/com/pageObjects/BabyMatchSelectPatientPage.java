package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BabyMatchSelectPatientPage 
{   
	@FindBy(id = "txtPatientId")
	public WebElement patientIDTextBox;

	public WebElement getPatientIDTextBox() {
		return patientIDTextBox;
	}

	@FindBy(id = "txtRecipientId")
	public WebElement racipientIDTextBox;

	public WebElement getRacipientIDTextBox() {
		return racipientIDTextBox;
	}

	@FindBy(id = "Continue")
	public WebElement continueButton;

	public WebElement getContinueButton() {
		return continueButton;
	}

	@FindBy(id = "modalConfirm_cmdOK")
	public WebElement confirmButtonFromPopup;

	public WebElement getConfirmButtonFromPopup() {
		return confirmButtonFromPopup;
	}

	@FindBy(id = "modalErrorConfirm_title")
	public WebElement titleMatchFailedPopup;

	public WebElement getTitleMatchFailedPopup() {
		return titleMatchFailedPopup;
	}

	@FindBy(id = "header_cmdManagePatientLink")
	public WebElement managePatientInfoLink;

	public WebElement getManagePatientInfoLink() {
		return managePatientInfoLink;
	}

	@FindBy(id = "lstToLocation")
	public WebElement toLocationDropDown;

	public WebElement getToLocationDropDown() {
		return toLocationDropDown;
	}

	@FindBy(id = "lstFromLocation")
	public WebElement fromLocationDropDown;

	public WebElement getFromLocationDropDown() {
		return fromLocationDropDown;
	}

	@FindBy(id = "cmdCancel")
	public WebElement cancelButton;

	public WebElement getCancelButton() {
		return cancelButton;
	}

	@FindBy(id = "BabyMatchEvent_PatientId")
	public WebElement invalidPatientIDAlertMessage;

	public WebElement getInvalidIDAlertMessage() {
		return invalidPatientIDAlertMessage;
	}

	@FindBy(id = "modalErrorConfirm_cmdButton1")
	public WebElement acknowledgeButtonMatchFailedPopup;

	public WebElement getAcknowledgeButtonMatchFailedPopup() {
		return acknowledgeButtonMatchFailedPopup;
	}

	/*
	 * public static WebElement invalidMatchPopup() { element =
	 * driver.findElement(By.id("modalErrorConfirm_title")); return element;
	 * 
	 * } public static WebElement invalidMatchPopupAckButton() { element =
	 * driver.findElement(By.id("modalErrorConfirm_cmdButton1")); return
	 * element;
	 * 
	 * }
	 */

	@FindBy(id = "header_cmdLogout")
	public WebElement logoutLink;

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
}
