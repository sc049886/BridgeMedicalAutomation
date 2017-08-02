package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemManagerSelectBloodProductPage {
	@FindBy(id = "dlItems__ctl6_editLink")
	public WebElement editLinkForCRT;

	@FindBy(id = "dlItems__ctl9_editLink")
	public WebElement editLinkForISBTWB;

	@FindBy(id = "dlItems__ctl8_editLink")
	public WebElement editLinkForWB;

	@FindBy(id = "cmdOK")
	public WebElement confirmButton;

}
