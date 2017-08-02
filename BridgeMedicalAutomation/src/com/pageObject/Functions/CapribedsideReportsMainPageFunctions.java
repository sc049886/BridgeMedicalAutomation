package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.pageObjects.CapribedsideReportsMainPage;

public class CapribedsideReportsMainPageFunctions 
{
	CapribedsideReportsMainPage reportpage = PageFactory.initElements(IEDriver.ieDriver, CapribedsideReportsMainPage.class ); 
	/*WebElement element;
	Select sel;
	 public void selectReport(String a) throws InterruptedException
	    {
	    	
		 element = reportpage.selectReportDropdown();
	     sel = new Select(element);
	     sel.selectByVisibleText(a);
	    	
	    }*/
	
}
