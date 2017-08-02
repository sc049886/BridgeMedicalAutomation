package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideViewReactionInformationPage;

public class CapribedsideViewReactionInformationFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideViewReactionInformationPage viewReactionInformationPage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideViewReactionInformationPage.class);

	public void clickBackButton() {
		try {
			seleniumFunctions.waitForElement(viewReactionInformationPage.backButton);
			viewReactionInformationPage.backButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideViewReactionInformationFunctions: clickBackButton method Failed " + e);
		}

	}

}
