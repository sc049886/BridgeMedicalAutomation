package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideViewReactionInformationPage {

	// Blood Type Chnage Reasons
	@FindBy(id = "Button_Cancel")
	public WebElement backButton;

	@FindBy(id = "header_cmdLogout")
	public WebElement linkLogout;

}
