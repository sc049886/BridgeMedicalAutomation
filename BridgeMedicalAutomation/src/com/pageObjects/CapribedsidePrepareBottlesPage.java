package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsidePrepareBottlesPage {

	@FindBy(id = "txtBottleNumber")
	public WebElement bottleNumberTextbox;

	@FindBy(id = "lblExpireDate")
	public WebElement expirationDateTextbox;

	@FindBy(id = "dpThawDate_foo")
	public WebElement thawDateTextbox;

	@FindBy(id = "cmdDivide")
	public WebElement divideLink;

	@FindBy(id = "cmdFortifiers_uncheckedImage")
	public WebElement addFortifiersCheckbox;

	@FindBy(id = "cmdFortifiers_checkedImage")
	public WebElement cancelFortifiersCheckbox;

	@FindBy(id = "cbDispose")
	public WebElement disposeCheckbox;

	@FindBy(id = "cbReprintLabel")
	public WebElement reprintLableCheckbox;

	@FindBy(id = "txtComment")
	public WebElement commentsTextbox;

	@FindBy(id = "cmdDone")
	public WebElement confirmButton;

	@FindBy(id = "cmdCancel")
	public WebElement exitButton;

	// Hazards...
	@FindBy(id = "divModalErrorConfirm")
	public WebElement warningPopup;

	@FindBy(id = "modalErrorConfirm_cmdButton1")
	public WebElement yesButtonWarningPopup;

	@FindBy(id = "modalErrorConfirm_cmdCancel")
	public WebElement noButtonWarningPopup;

	@FindBy(id = "modalErrorConfirm_modalErrorConfirmPopup")
	public WebElement donorWarningPopup;

	@FindBy(id = "modalErrorConfirm_cmdButton1")
	public WebElement yesButtonDonorWarningPopup;

	@FindBy(id = "modalErrorConfirm_cmdCancel")
	public WebElement noButtonDonorWarningPopup;

	@FindBy(id = "errorLabel")
	public WebElement bottleNotReceivedErrorMessage;

	// Divide Bottle Page
	@FindBy(id = "cmdOK")
	public WebElement printDividedBottleButton;

	@FindBy(id = "cmdCancel")
	public WebElement cancelPrintDivideBottleButton;

}
