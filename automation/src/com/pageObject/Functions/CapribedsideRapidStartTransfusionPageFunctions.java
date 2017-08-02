package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.bridge.utilities.IEDriver;
import com.pageObjects.CapribedsideRapidStartTransfusionPage;

public class CapribedsideRapidStartTransfusionPageFunctions {

	WebElement element;
	CapribedsideRapidStartTransfusionPage rapidtranspage = PageFactory.initElements(IEDriver.driver, 	CapribedsideRapidStartTransfusionPage.class );
	Select sel;
	public void selectDonorBloodType(String a)
	{
		element = rapidtranspage.donorBloodTypeDropDown();
    	sel = new Select(element);
    	sel.selectByVisibleText(a);
	}
}
