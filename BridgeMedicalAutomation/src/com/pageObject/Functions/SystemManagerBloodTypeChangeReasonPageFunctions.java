package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;
import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.SystemManagerBloodTypeChangeReasonPage;


/*
 * Yet to implement explicit wait
 * 
*/



public class SystemManagerBloodTypeChangeReasonPageFunctions 
{
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	SystemManagerBloodTypeChangeReasonPage bloodtypechangepage = PageFactory.initElements(IEDriver.ieDriver, SystemManagerBloodTypeChangeReasonPage.class );
	
	//Method to create Reason for blood type change.
	public void createReasonForBloodTypeChange(String code,String name,String description) 
	{		
		try{
		seleniumFunctions.waitForElement(bloodtypechangepage.textboxCodeCreateReason);
		bloodtypechangepage.textboxCodeCreateReason.sendKeys(code);
		bloodtypechangepage.textboxNameCreateReason.sendKeys(name);
		bloodtypechangepage.textboxDescriptionCreateReason.sendKeys(description);
		bloodtypechangepage.buttonConfirmCreateReason.click();
		}
		catch(Exception e)
		{
			System.out.println("can't create reason for blood type change reason \n"+ e );
		}
	}	
	public void clickConfirmButton() 
	{		
		try{
			seleniumFunctions.waitForElement(bloodtypechangepage.buttonConfirmCreateReason);
		bloodtypechangepage.buttonConfirmCreateReason.click();
		
		}
		catch(Exception e)
		{
			System.out.println("SystemManagerBloodTypeChangeReasonPageFunctions-clickConfirmButton Method Failed"+ e );
		}
	}
	public void clickBackLink() 
	{		
		try{
			seleniumFunctions.waitForElement(bloodtypechangepage.linkBack);
		bloodtypechangepage.linkBack.click();
		
		}
		catch(Exception e)
		{
			System.out.println("SystemManagerBloodTypeChangeReasonPageFunctions-clickBackLink Method Failed"+ e );
		}
	}
}
