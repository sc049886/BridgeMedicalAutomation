package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridge.utilities.IEDriver;
import com.pageObjects.CapribedsideBrowseTransfusionHistoryPage;

public class CapribedsideBrowseTransfusionHistoryPageFunctions {
	
	CapribedsideBrowseTransfusionHistoryPage browsetranshistorypage= PageFactory.initElements(IEDriver.driver, 	CapribedsideBrowseTransfusionHistoryPage.class );
	WebElement element;
	Select sel;
	
	public void selectBloodProductEditTrans(int a)
	{
		element = browsetranshistorypage.bloodProduct();
    	sel = new Select(element);
    	sel.selectByIndex(a);
	}

}
