package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridge.utilities.IEDriver;
import com.pageObjects.CapribedsideBrowseBottleHistoryPage;

public class CapribedsideBrowseBottleHistoryPageFunctions {
	
	WebElement element;
	Select drop;
	CapribedsideBrowseBottleHistoryPage browsebottlehistory = PageFactory.initElements(IEDriver.driver,CapribedsideBrowseBottleHistoryPage.class );
	
	public  Select dropDwn_FinalStatus()
	{
		element = browsebottlehistory.finalStatusFilter();
		drop  = new Select(element);
		return  drop;
}
	
	public  Select dropDwn_StorageState()
	{
		element = browsebottlehistory.storageStateFilter();
		drop  = new Select(element);
		return  drop;
}

}
