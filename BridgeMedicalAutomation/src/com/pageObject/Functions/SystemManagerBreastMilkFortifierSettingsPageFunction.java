package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.SystemManagerBreastMilkFortifierSettingsPage;

public class SystemManagerBreastMilkFortifierSettingsPageFunction 
{
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	SystemManagerBreastMilkFortifierSettingsPage fortifierSettings = PageFactory.initElements(IEDriver.ieDriver,SystemManagerBreastMilkFortifierSettingsPage.class);
	
	public void clickEditFirstFortifier()
	{
		seleniumFunctions.waitForElement(fortifierSettings.editFirstFortifierlink);
		fortifierSettings.editFirstFortifierlink.click();
	}
	
	public void clickEditSecondFortifier()
	{
		seleniumFunctions.waitForElement(fortifierSettings.editSecondFortifierlink);
		fortifierSettings.editSecondFortifierlink.click();
	}
	public void clickEditThirdFortifier()
	{
		seleniumFunctions.waitForElement(fortifierSettings.editThirdFortifierlink);
		fortifierSettings.editThirdFortifierlink.click();
	}
	
	public void selectPromptForLot(String promptValue)
	{	
		try {
			seleniumFunctions.waitForElement(fortifierSettings.selectPromptForLot);
			seleniumFunctions.selectValueByVisibleText(fortifierSettings.selectPromptForLot, promptValue);
		} catch (Exception e) {
			System.out.print("SystemManagerBreastMilkFortifierSettingsPageFunction-selectPromptForLot :Method is failed");
		}
	 }
	
	public void selectPromptForExpiration(String promptValue)
	{	
		try {
			seleniumFunctions.waitForElement(fortifierSettings.selectPromptForExpiration);
			seleniumFunctions.selectValueByVisibleText(fortifierSettings.selectPromptForExpiration, promptValue);
		} catch (Exception e) {
			System.out.print("SystemManagerBreastMilkFortifierSettingsPageFunction-selectPromptForExpiration :Method is failed");
		}
	 }
	
	public void selectPromptForVolume(String promptValue)
	{	
		try {
			seleniumFunctions.waitForElement(fortifierSettings.selectPromptForVolume);
			seleniumFunctions.selectValueByVisibleText(fortifierSettings.selectPromptForVolume, promptValue);
		} catch (Exception e) {
			System.out.print("SystemManagerBreastMilkFortifierSettingsPageFunction-selectPromptForVolume :Method is failed");
		}
	 }
	
	public void selectFortUsedWith(String promptValue)
	{	
		try {
			seleniumFunctions.waitForElement(fortifierSettings.SelectFortifierUsedWith);
			seleniumFunctions.selectValueByVisibleText(fortifierSettings.SelectFortifierUsedWith, promptValue);
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.print("SystemManagerBreastMilkFortifierSettingsPageFunction-selectFortUsedWith :Method is failed");
		}
	 }
	
	public void clickSaveButton()
	{
		try {
			seleniumFunctions.waitForElement(fortifierSettings.buttonSave);
			fortifierSettings.buttonSave.click();
		} catch (Exception e) {
			System.out.print("SystemManagerBreastMilkFortifierSettingsPageFunction-selectFortUsedWith :Method is failed");
		}
	}
	
	public void editFortifier(String promptForLot, String promptForExp, String usedWith, String promptForVolume)
	{
		selectPromptForLot(promptForLot);
		selectPromptForExpiration(promptForExp);
		selectPromptForVolume(promptForVolume);
		selectFortUsedWith(usedWith);
		clickSaveButton();
	}
}
