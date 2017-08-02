package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideChangePasswordPage  {

	@FindBy(id = "UserId")
	public WebElement currentUserIDTextbox;

	@FindBy(id = "Password")
	public WebElement currentPasswordIDTextbox;

	@FindBy(id = "NewPassword")
	public WebElement newPasswordTextbox;

	@FindBy(id = "ConfirmPassword")
	public WebElement confirmPasswordTextbox;

	@FindBy(id = "cmdOK")
	public WebElement OkButton;

	@FindBy(id = "cmdCancel")
	public WebElement cancelButton;

}
