package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideCollectSpecimenPage {

	@FindBy(id = "DataGrid1__ctl4_checkboxSelect")
	public WebElement orderMetabolicCheckbox;

	@FindBy(id = "btnChangeDateTime")
	public WebElement changeDateTimeButton;

	@FindBy(id = "Cancel")
	public WebElement exitButton;

	// Exit Pop up
	@FindBy(id = "SpecimenExitDialog_cmdOK")
	public WebElement yesButtonExitPopup;

	@FindBy(id = "SpecimenExitDialog_cmdCancel")
	public WebElement noButtonExitPopup;

	// Logout
	/*
	 * public static WebElement linkLogout() { element =
	 * driver.findElement(By.id("header_cmdLogout")); return element; }
	 * 
	 * public static WebElement buttonYeslogoutPopup() { element =
	 * driver.findElement(By.id("header__modalConfirm_cmdOK")); return element;
	 * } public static WebElement buttonNologoutPopup() { element =
	 * driver.findElement(By.id("header__modalConfirm_cmdCancel")); return
	 * element; }
	 */

}
