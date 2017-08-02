package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.pageObjects.SystemManagerBloodTypeChangeReasonPage;

public class SystemManagerBloodTypeChangeReasonPageFunctions {

	SystemManagerBloodTypeChangeReasonPage bloodtypechangepage = PageFactory.initElements(IEDriver.driver, SystemManagerBloodTypeChangeReasonPage.class );
			
	//Method to create Reason for blood type change.
	public void createReasonForBloodTypeChange(String code,String name,String description) throws InterruptedException
	{
		bloodtypechangepage.textboxCodeCreateReason().sendKeys(code);
		Thread.sleep(2000);
		bloodtypechangepage.textboxNameCreateReason().sendKeys(name);
		Thread.sleep(2000);
		bloodtypechangepage.textboxDescriptionCreateReason().sendKeys(description);
		Thread.sleep(2000);
		bloodtypechangepage.buttonConfirmCreateReason().click();
	}	
}
