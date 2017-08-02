package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DonorMilkReceiveDonorBottlePage {

	@FindBy(id = "txtDonorMilkNumber")
	public WebElement donorBottleNumberTextbox;

	@FindBy(id = "txtExpireDate")
	public WebElement expireDateTextbox;

	@FindBy(id = "txtCalories")
	public WebElement kiloCaloriesTextbox;

	@FindBy(id = "cmdDone")
	public WebElement confirmButton;

	@FindBy(id = "cmdCancel")
	public WebElement exitButton;

	// Expire Bottle Confirma Popup

	@FindBy(id = "modalErrorConfirm_cmdOK")
	public WebElement yesButtonExpireBottleWarning;

	@FindBy(id = "modalErrorConfirm_cmdCancel")
	public WebElement noButtonExpireBottleWarning;

	/*
	 * //Logout... public static WebElement linkLogout() { element =
	 * driver.findElement(By.id("header_cmdLogout")); return element; } public
	 * static WebElement btnYesLogoutPopup() { element =
	 * driver.findElement(By.id("header__modalConfirm_cmdOK")); return element;
	 * } public static WebElement btnNoLogoutPopup() { element =
	 * driver.findElement(By.id("header__modalConfirm_cmdCancel")); return
	 * element; }
	 */

}
