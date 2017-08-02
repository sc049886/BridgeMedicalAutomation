package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.pageObjects.SystemManagerReactionInstructionPage;

public class SystemManagerReactionInstructionPageFunctions
{
	SystemManagerReactionInstructionPage reactioninstrpage = PageFactory.initElements(IEDriver.driver, SystemManagerReactionInstructionPage.class );
			
	public void createReactionInstruction(String reactionName,String description) throws Throwable
	{
		reactioninstrpage.linkCreateReactionInstruction().click();
		Thread.sleep(2000);
		reactioninstrpage.textBoxNameCreateReactionInstruction().sendKeys(reactionName);
		Thread.sleep(2000);
		reactioninstrpage.textBoxDescriptionCreateReactionInstruction().sendKeys(description);
		Thread.sleep(2000);
		reactioninstrpage.buttonConfirmCreateReactionInstruction().click();
		
	}

}
