package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridge.utilities.IEDriver;
import com.pageObjects.SystemManagerTransfusionSettingsPage;

public class SystemManagerTransfusionSettingsPageFunctions 
{
	WebElement element;
	Select sel;
	SystemManagerTransfusionSettingsPage transfusionsettings =  PageFactory.initElements(IEDriver.driver, SystemManagerTransfusionSettingsPage.class );

	public void selectOptionForDisplayBloodTypeMismatchQuestion(String a)
	{
		element = transfusionsettings.displayBloodTypeMismatchQuestion();
    	sel = new Select(element);
    	sel.selectByValue(a);
	}

	public void selectOptionForPropmtForPatientBloodType(String a)
	{
		element = transfusionsettings.propmtForPatientBloodType();
    	sel = new Select(element);
    	sel.selectByVisibleText(a);
	}
	
	public void selectOptionForExpirationMessage(String a)
	{
		element = transfusionsettings.expirationMessage();
    	sel = new Select(element);
    	sel.selectByValue(a);
	}
	
	
	
}
