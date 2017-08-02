package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.SystemManagerReactionSignsAndSymptomsPage;

public class SystemManagerReactionSignsAndSymptomsPageFunctions 
{
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	SystemManagerReactionSignsAndSymptomsPage reactionsignspage=  PageFactory.initElements(IEDriver.ieDriver, SystemManagerReactionSignsAndSymptomsPage.class );

	public void createReactionSignsAndSymptoms(String signName,String description) throws Throwable
	{
		seleniumFunctions.waitForElement(reactionsignspage.linkCreateReactionSigns);
		reactionsignspage.linkCreateReactionSigns.click();
		seleniumFunctions.waitForElement(reactionsignspage.textBoxDescriptionCreateReactionSigns);
		reactionsignspage.textBoxDescriptionCreateReactionSigns.sendKeys(signName);
		seleniumFunctions.waitForElement(reactionsignspage.textBoxDescriptionCreateReactionSigns);
		reactionsignspage.textBoxDescriptionCreateReactionSigns.sendKeys(description);
		seleniumFunctions.waitForElement(reactionsignspage.submitCreateReactionSigns);
		reactionsignspage.submitCreateReactionSigns.click();
		seleniumFunctions.waitForElement(reactionsignspage.linkCreateReactionSigns);
		
	}
}
