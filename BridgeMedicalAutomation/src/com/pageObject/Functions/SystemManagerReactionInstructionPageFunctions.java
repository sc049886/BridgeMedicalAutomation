package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.SystemManagerReactionInstructionPage;

public class SystemManagerReactionInstructionPageFunctions
{
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	SystemManagerReactionInstructionPage reactioninstrpage = PageFactory.initElements(IEDriver.ieDriver, SystemManagerReactionInstructionPage.class );
			
	public void createReactionInstruction(String reactionName,String description) throws Throwable
	{
		seleniumFunctions.waitForElement(reactioninstrpage.linkCreateReactionInstruction);
		reactioninstrpage.linkCreateReactionInstruction.click();
		seleniumFunctions.waitForElement(reactioninstrpage.textBoxNameOfReactionInstruction);
		reactioninstrpage.textBoxNameOfReactionInstruction.sendKeys(reactionName);
		reactioninstrpage.textBoxDescriptionReactionInstruction.sendKeys(description);
		reactioninstrpage.submitReactionInstruction.click();
		seleniumFunctions.waitForElement(reactioninstrpage.backLink);
	}
	public void clickBackLink() 
	{		
		try{
			seleniumFunctions.waitForElement(reactioninstrpage.backLink);
			reactioninstrpage.backLink.click();
		
		}
		catch(Exception e)
		{
			System.out.println("SystemManagerBloodTypeChangeReasonPageFunctions-clickBackLink Method Failed"+ e );
		}
	}

}
