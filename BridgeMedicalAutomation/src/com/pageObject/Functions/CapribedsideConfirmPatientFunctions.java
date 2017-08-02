package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideConfirmPatientPage;

public class CapribedsideConfirmPatientFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideConfirmPatientPage confirmPatientPage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideConfirmPatientPage.class);
	
	public void enterPatientId(String patientId) {
		try {
			seleniumFunctions.waitForElement(confirmPatientPage.confirmPatientIdTextbox);
			confirmPatientPage.confirmPatientIdTextbox.sendKeys(patientId);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterPatientId method Failed " + e);
		}

	}
	public void clickContinueButton() {
		try {
			seleniumFunctions.waitForElement(confirmPatientPage.continueButton);
			confirmPatientPage.continueButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickContinueButton method Failed " + e);
		}

	}
	public void clickExitButton( ) {
		try {
			seleniumFunctions.waitForElement(confirmPatientPage.exitButton);
			confirmPatientPage.exitButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickExitButton method Failed " + e);
		}

	}

}
