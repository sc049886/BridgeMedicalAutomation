package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridge.utilities.IEDriver;
import com.pageObjects.SystemManagerBreastMilkSettingsPage;

public class SystemManagerBreastMilkSettingsPageFunctions 
{
	WebElement element;
	Select sel;
	SystemManagerBreastMilkSettingsPage breastmailsettingspage =  PageFactory.initElements(IEDriver.driver, SystemManagerBreastMilkSettingsPage.class );
			
	public void selectFreshExpTimeUnit(String a) throws InterruptedException
    {
		element= breastmailsettingspage.textBoxFreshExpTimeLengthUnits();
    	sel = new Select(element);
    	sel.selectByVisibleText(a);	
    }
	
	public void selectFrozenExpTimeUnit(String a) throws InterruptedException
	{
		 element= breastmailsettingspage.textBoxFrozenExpTimeLengthUnits();
	     sel = new Select(element);
	     sel.selectByVisibleText(a);
	}
	 
	public void selectThawedExpTimeUnit(String a) throws InterruptedException
	{
		element = breastmailsettingspage.textBoxThawedExpTimeLengthUnits();
		sel = new Select(element);
		sel.selectByVisibleText(a);  	
    }
}
