package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.BabyMatchManagePatientInformationPage;

public class BabyMatchManagePatientInformationFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	BabyMatchManagePatientInformationPage managePatientInformation = PageFactory.initElements(IEDriver.ieDriver,
			BabyMatchManagePatientInformationPage.class);
	// Function to click on EditMother link

	public void clickEditMotherLink() {
		try {
			seleniumFunctions.waitForElement(managePatientInformation.editMotherLink);
			managePatientInformation.editMotherLink.click();
		} catch (Exception e) {
			System.out.println("BabyMatchManagePatientInformationFunctions - clickEditMotherLink method failed" + e);
		}

	}

	// Enter Correct Mother Name
	public void enterCorrectMotherName(String name) {
		try {
			seleniumFunctions.waitForElement(managePatientInformation.correctMotherNameTextBox);
			managePatientInformation.correctMotherNameTextBox.sendKeys(name);
		} catch (Exception e) {
			System.out.println("BabyMatchManagePatientInformationFunctions - clickEditMotherLink method failed" + e);
		}

	}

	public void enterCorrectMotherID(String id) {
		try {
			seleniumFunctions.waitForElement(managePatientInformation.correctMotherIDTextBox);
			managePatientInformation.correctMotherIDTextBox.sendKeys(id);
		} catch (Exception e) {
			System.out.println("BabyMatchManagePatientInformationFunctions - clickEditMotherLink method failed" + e);
		}
	}

	public void clickConfirmButton() {
		try {
			seleniumFunctions.waitForElement(managePatientInformation.confirmButton);
			managePatientInformation.confirmButton.click();
		} catch (Exception e) {
			System.out.println("BabyMatchManagePatientInformationFunctions - clickEditMotherLink method failed" + e);
		}

	}

	public void clickExitButton() {
		try {
			seleniumFunctions.waitForElement(managePatientInformation.exitButton);
			managePatientInformation.exitButton.click();
		}

		catch (Exception e) {
			System.out.println("BabyMatchManagePatientInformationFunctions - clickEditMotherLink method failed" + e);
		}
	}

}
