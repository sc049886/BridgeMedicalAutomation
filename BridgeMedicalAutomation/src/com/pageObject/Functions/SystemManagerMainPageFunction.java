package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.SystemManagerMainPage;

public class SystemManagerMainPageFunction 
{
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	SystemManagerMainPage menuPage = PageFactory.initElements(IEDriver.ieDriver,SystemManagerMainPage.class );
	
	public void clickBreastMilkSettings()
	{
		seleniumFunctions.waitForElement(menuPage.buttonBreastMilkSettings);
		menuPage.getButtonBreastMilkSettings().click();
	}
	public void clickRolesButton()
	{
		seleniumFunctions.waitForElement(menuPage.buttonRoles);
		menuPage.buttonRoles.click();
	}
	public void clickUsersButton()
	{
		seleniumFunctions.waitForElement(menuPage.buttonUsers);
		menuPage.buttonUsers.click();
	}
	public void clickPointOfCareButton() 
	{
		try {
			seleniumFunctions.waitForElement(menuPage.buttonPointsOfCare);
			menuPage.buttonPointsOfCare.click();
		} catch (Exception e) {
			System.out.print("SystemManagerMainPageFunction-clickpointOfCareButton : Method is failed");
		}

	}
	public void clickTransfusionSettingsButton() 
	{
		try {
			seleniumFunctions.waitForElement(menuPage.buttonTransfusionSettings);
			menuPage.buttonTransfusionSettings.click();
		} catch (Exception e) {
			System.out.print("SystemManagerMainPageFunction-clickTransfusionSettingsButton : Method is failed");
		}

	}
	
}
