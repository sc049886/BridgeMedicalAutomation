package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.pageObjects.SystemManagerReactionSignsAndSymptomsPage;

public class SystemManagerReactionSignsAndSymptomsPageFunctions 
{
	
	SystemManagerReactionSignsAndSymptomsPage reactionsignspage=  PageFactory.initElements(IEDriver.driver, SystemManagerReactionSignsAndSymptomsPage.class );

	public void createReactionSignsAndSymptoms(String signName,String description) throws Throwable
	{
		reactionsignspage.linkCreateReactionSigns().click();
		Thread.sleep(2000);
		reactionsignspage.textBoxDescriptionCreateReactionSigns().sendKeys(signName);
		Thread.sleep(2000);
		reactionsignspage.textBoxDescriptionCreateReactionSigns().sendKeys(description);
		Thread.sleep(2000);
		reactionsignspage.buttonConfirmCreateReactionSigns().click();
		Thread.sleep(2000);
	}
}
