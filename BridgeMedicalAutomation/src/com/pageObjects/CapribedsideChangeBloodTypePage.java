package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideChangeBloodTypePage {

	@FindBy(id = "lstNewBloodType")
	public WebElement newBloodTypeDropdown;

	@FindBy(id = "lstConfirmedBloodType")
	public WebElement confirmNewBloodTypeDropdown;

	@FindBy(id = "lstReasonForChange")
	public WebElement reasonForBloodTypeChangeDropdown;

	@FindBy(id = "txtLoginId")
	public WebElement userIDTextbox;

	@FindBy(id = "txtPassword")
	public WebElement passwordTextbox;

	@FindBy(id = "cmdOK")
	public WebElement confirmButton;

	@FindBy(id = "cmdCancel")
	public WebElement exitButton;

	@FindBy(id = "lblBloodtype_Details")
	public WebElement currentBloodTypeVisibleText;

	// Logout Process
	/*
	 * public WebElement linkLogout() { element =
	 * driver.findElement(By.id("header_cmdLogout")); return element; }
	 * 
	 * public WebElement btnYesLogoutPopup() { element =
	 * driver.findElement(By.id("header__modalConfirm_cmdOK")); return element;
	 * } public WebElement btnNoLogoutPopup() { element =
	 * driver.findElement(By.id("header__modalConfirm_cmdCancel")); return
	 * element; }
	 */

}
