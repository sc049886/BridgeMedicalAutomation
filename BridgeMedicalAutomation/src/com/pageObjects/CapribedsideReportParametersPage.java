package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideReportParametersPage {

	@FindBy(id = "in_From_foo")
	public WebElement fromDateTextbox;

	@FindBy(id = "in_To_foo")
	public WebElement toDateTextbox;

	@FindBy(id = "btnDisplay")
	public WebElement displayButton;

	@FindBy(id = "btnDisplay")
	public WebElement cancelButton;

}
