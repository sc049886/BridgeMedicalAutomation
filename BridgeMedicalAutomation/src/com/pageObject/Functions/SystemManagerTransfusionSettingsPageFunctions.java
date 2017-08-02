package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.SystemManagerTransfusionSettingsPage;

public class SystemManagerTransfusionSettingsPageFunctions 
{
	WebElement element;
	Select sel;
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	SystemManagerTransfusionSettingsPage transfusionsettings =  PageFactory.initElements(IEDriver.ieDriver, SystemManagerTransfusionSettingsPage.class );

	public void selectOptionForDisplayBloodTypeMismatchQuestion(String a)
	{
		seleniumFunctions.waitForElement(transfusionsettings.displayBloodTypeMismatchQuestion);
		element = transfusionsettings.displayBloodTypeMismatchQuestion;
    	sel = new Select(element);
    	sel.selectByValue(a);
	}

	public void selectOptionForPropmtForPatientBloodType(String a)
	{
		element = transfusionsettings.propmtForPatientBloodType;
    	sel = new Select(element);
    	sel.selectByVisibleText(a);
	}
	
	public void selectOptionForExpirationMessage(String option)
	{
		/*element = transfusionsettings.expirationMessage;
    	sel = new Select(element);
    	sel.selectByValue(a);*/
    	try {
			seleniumFunctions.waitForElement(transfusionsettings.expirationMessage);
			seleniumFunctions.selectValueByVisibleText(transfusionsettings.expirationMessage,
					option);

		} catch (Exception e) {
			System.out.println("SystemManagerTransfusionSettingsPageFunctions: selectOptionForExpirationMessage method Failed " + e);
		}
	}
	public void selectOptionDisplayBloodTypeMismatchQuestions(String option) {
		try {
			seleniumFunctions.waitForElement(transfusionsettings.displayBloodTypeMismatchQuestion);
			seleniumFunctions.selectValueByVisibleText(transfusionsettings.displayBloodTypeMismatchQuestion,
					option);

		} catch (Exception e) {
			System.out.println("SystemManagerTransfusionSettingsPageFunctions: clickBloodTypeChangeReasonLink method Failed " + e);
		}

	}
	public void clickBloodProductsLink() {
		try {
			seleniumFunctions.waitForElement(transfusionsettings.linkBloodProducts);
			transfusionsettings.linkBloodProducts.click();

		} catch (Exception e) {
			System.out.println("SystemManagerTransfusionSettingsPageFunctions: clickBloodProductsLink method Failed " + e);
		}

	}
	public void clickBloodTypeChangeReasonLink() {
		try {
			seleniumFunctions.waitForElement(transfusionsettings.linkBloodTypeChangeReasons);
			transfusionsettings.linkBloodTypeChangeReasons.click();

		} catch (Exception e) {
			System.out.println("SystemManagerTransfusionSettingsPageFunctions: clickBloodTypeChangeReasonLink method Failed " + e);
		}

	}
	public void clickReactionInstructionLink() {
		try {
			seleniumFunctions.waitForElement(transfusionsettings.linkReactionInstructions);
			transfusionsettings.linkReactionInstructions.click();

		} catch (Exception e) {
			System.out.println("SystemManagerTransfusionSettingsPageFunctions: clickReactionInstructionLink method Failed " + e);
		}

	}
	public void clickReactionSignsAndSymptomsLink() {
		try {
			seleniumFunctions.waitForElement(transfusionsettings.linkReactionSignsAndSymptoms);
			transfusionsettings.linkReactionSignsAndSymptoms.click();

		} catch (Exception e) {
			System.out.println("SystemManagerTransfusionSettingsPageFunctions: clickReactionSignsAndSymptomsLink method Failed " + e);
		}

	}
	public void clickConfirmButton() {
		try {
			seleniumFunctions.waitForElement(transfusionsettings.buttonConfirm);
			transfusionsettings.buttonConfirm.click();

		} catch (Exception e) {
			System.out.println("SystemManagerTransfusionSettingsPageFunctions: clickConfirmButton method Failed " + e);
		}

	}

	
	
	
}
