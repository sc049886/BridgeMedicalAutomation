package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.bridge.utilities.IEDriver;
import com.pageObjects.SystemManagerLoginSettingsPage;

public class SystemManagerLoginSettingsPageFunctions 
{

	SystemManagerLoginSettingsPage loginsettingspage = PageFactory.initElements(IEDriver.driver, SystemManagerLoginSettingsPage.class );
	WebElement element;
	Select sel;
	public void selectForceChangePassword(String s) throws InterruptedException
    {
    	element = loginsettingspage.forceChangePassword();
    	sel = new Select(element);
    	sel.selectByVisibleText(s);
    }
	
	public void selectPasswordAttemptsBefore(String s) throws InterruptedException
    {
		element =loginsettingspage.passwordAttemptsBefore();
    	sel = new Select(element);
    	sel.selectByVisibleText(s);
    }
	
	public void selectSessionTimeOutDuration_BabyMatch(String s) throws InterruptedException
    {
    	element = loginsettingspage.sessionTimeoutDurationBabyMatch();
    	sel = new Select(element);
    	sel.selectByVisibleText(s);
    }
	
	public void selectSessionTimeOutDuration_SysMan(String s) throws InterruptedException
    {
    	element = loginsettingspage.sessionTimeoutDurationSystemManager();
    	sel = new Select(element);
    	sel.selectByVisibleText(s);
    }
	
	public void selectSessionTimeOutDuration_Transfusion(String s) throws InterruptedException
    {
    	element= loginsettingspage.sessionTimeoutDurationTransfusion();
    	sel = new Select(element);
    	sel.selectByVisibleText(s);
    }
	
	public void selectSessionTimeOutDuration_General(String s) throws InterruptedException
    {
    	element =loginsettingspage.sessionTimeoutDuration();
    	sel = new Select(element);
    	sel.selectByVisibleText(s);
    }
	
	public void selectUnlockDuration(String s) throws InterruptedException
    {
    	element = loginsettingspage.unlockDuration();
    	sel = new Select(element);
    	sel.selectByVisibleText(s);
    	
    }
}
