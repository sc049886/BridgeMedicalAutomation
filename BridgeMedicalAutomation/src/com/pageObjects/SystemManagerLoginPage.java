package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SystemManagerLoginPage 

{
	@FindBy (id = "UserId") 		public WebElement textboxUsername;
	@FindBy (id = "Password") 		public WebElement textboxPassword;
	@FindBy (id = "cmdLogin") 		public WebElement buttonSubmit;
	@FindBy (id = "errorsLabel") 	public WebElement labelErrorText;
	
	public WebElement getTextboxUsername() {
		return textboxUsername;
	}
	public void setTextboxUsername(WebElement textboxUsername) {
		this.textboxUsername = textboxUsername;
	}
	public WebElement getTextboxPassword() {
		return textboxPassword;
	}
	public void setTextboxPassword(WebElement textboxPassword) {
		this.textboxPassword = textboxPassword;
	}
	public WebElement getButtonSubmit() {
		return buttonSubmit;
	}
	public void setButtonSubmit(WebElement buttonSubmit) {
		this.buttonSubmit = buttonSubmit;
	}
	
}