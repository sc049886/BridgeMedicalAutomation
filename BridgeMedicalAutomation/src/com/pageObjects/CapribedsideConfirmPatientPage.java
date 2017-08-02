package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideConfirmPatientPage {

	@FindBy(id = "txtPatientId")
	public WebElement confirmPatientIdTextbox;

	@FindBy(id = "cmdOK")
	public WebElement continueButton;

	@FindBy(id = "cmdCancel")
	public WebElement exitButton;

}
