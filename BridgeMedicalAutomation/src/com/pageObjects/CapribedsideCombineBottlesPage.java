package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideCombineBottlesPage {

	@FindBy(id = "txtBottleNumber")
	public WebElement bottleNumberTextbox;

	@FindBy(id = "txtComment")
	public WebElement commentTextbox;

	@FindBy(id = "cmdDone")
	public WebElement confirmButton;

	@FindBy(id = "cmdPrepare")
	public WebElement prepareButton;

	@FindBy(id = "cmdCancel")
	public WebElement exitButton;

	@FindBy(id = "modalErrorConfirm_lblTitleHeader")
	public WebElement bottleMayNotBeCombinedForThisPatienWarningMessage;

	@FindBy(id = "modalErrorConfirm_cmdButton3")
	public WebElement acknowledgeButtonBottleMayNotBeCombinedForThisPatienWarningPopup;

	@FindBy(id = "errorLabel")
	public WebElement bottleNotReceivedErrorMessage;

}
