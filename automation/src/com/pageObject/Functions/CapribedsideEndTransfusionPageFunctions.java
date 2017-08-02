package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridge.utilities.IEDriver;
import com.pageObjects.CapribedsideEndTransfusionPage;

public class CapribedsideEndTransfusionPageFunctions {
	
	CapribedsideEndTransfusionPage endtransfusionpage = PageFactory.initElements(IEDriver.driver, CapribedsideEndTransfusionPage.class );
	private WebElement element = null;
	Select sel;
	public void selectBlodProduct(int a)
	{
		element = endtransfusionpage.dropDownBloodProduct();
	   	sel = new Select(element);
	   	sel.selectByIndex(a);
	}

	public void selectTransfusionReactionAnswer(String a)
	{
		element = endtransfusionpage.dropdownTransfusionReaction();
    	sel = new Select(element);
    	sel.selectByValue(a);
	}
	
	public void selectVitalsTempSite(int a) throws InterruptedException
    {    	
		element = endtransfusionpage.vitalsTempSiteTextBox();
    	sel = new Select(element);
    	sel.selectByIndex(a);
    	
    }
}
