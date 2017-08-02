package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideExpiredPasswordPage {

	@FindBy(id = "NewPassword")
	public WebElement newPasswordTextbox;

	@FindBy(id = "ConfirmPassword")
	public WebElement confirmPasswordTextbox;

	@FindBy(id = "cmdOK")
	public WebElement okButton;

	@FindBy(id = "cmdCancel")
	public WebElement cancelButton;

}
