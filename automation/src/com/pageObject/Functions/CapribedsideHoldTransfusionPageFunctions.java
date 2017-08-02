package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridge.utilities.IEDriver;
import com.pageObjects.CapribedsideHoldTransfusionPage;


public class CapribedsideHoldTransfusionPageFunctions 
{
	Select sel;
	WebElement element;
	CapribedsideHoldTransfusionPage holdtranspage = PageFactory.initElements(IEDriver.driver, 	CapribedsideHoldTransfusionPage.class );

	public void selectBlodProduct(int a)
	{
		element = holdtranspage.dropDownBlodProduct();
    	sel = new Select(element);
    	sel.selectByIndex(a);
	}
	
	public void selectReasonForHold(int a)
	{
		element = holdtranspage.reasonForHold();
    	sel = new Select(element);
    	sel.selectByIndex(a);
	}
	
	
}
