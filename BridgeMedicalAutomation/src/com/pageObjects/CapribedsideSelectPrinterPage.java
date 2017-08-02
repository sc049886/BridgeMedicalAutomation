package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CapribedsideSelectPrinterPage {

	@FindBy(id = "DialogConfirmPrinter_cmdOK")
	public WebElement printButton;

	@FindBy(id = "DialogConfirmPrinter_cmdCancel")
	public WebElement cancelPrintButton;

	@FindBy(xpath = "//a[@href='SelectPrinter.aspx?PrinterId=XXVA06-19-5134']")
	public WebElement selectAutomationPrinter;

}
