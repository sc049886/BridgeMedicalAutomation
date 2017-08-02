package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.BabyMatchSelectPatientPage;

import junit.framework.Assert;

public class BabyMatchSelectPatientFunctions {

	// Constants constants = new Constants();
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.babyMatchUrl);
	BabyMatchSelectPatientPage babyMatchSelectPatient = PageFactory.initElements(IEDriver.ieDriver,
			BabyMatchSelectPatientPage.class);

	/*
	 * Method to Enter PatientID
	 */
	public void enetrPatientID(String patientID) {
		try {
			seleniumFunctions.waitForElement(babyMatchSelectPatient.patientIDTextBox);
			babyMatchSelectPatient.patientIDTextBox.clear();
			babyMatchSelectPatient.patientIDTextBox.sendKeys();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enetrPatientID method Failed " + e);
		}

	}

	/*
	 * Method to Enter RecipientID
	 */
	public void enetrRecipientID(String recipientID) {
		try {
			seleniumFunctions.waitForElement(babyMatchSelectPatient.racipientIDTextBox);
			babyMatchSelectPatient.racipientIDTextBox.clear();
			babyMatchSelectPatient.racipientIDTextBox.sendKeys();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enetrRecipientID method Failed " + e);

		}

	}

	public void clickContinue() {
		try {
			seleniumFunctions.waitForElement(babyMatchSelectPatient.continueButton);
			babyMatchSelectPatient.continueButton.click();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickContinue method Failed " + e);

		}

	}

	public void clickConfirmButtonFromPopup() {
		try {
			seleniumFunctions.waitForElement(babyMatchSelectPatient.confirmButtonFromPopup);
			babyMatchSelectPatient.confirmButtonFromPopup.click();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickConfirmButtonFromPopup method Failed " + e);

		}

	}

	public void verifyMatchFailedPopup() {
		try {
			seleniumFunctions.waitForElement(babyMatchSelectPatient.titleMatchFailedPopup);
			Assert.assertTrue(babyMatchSelectPatient.titleMatchFailedPopup.isDisplayed());
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: verifyMatchFailedPopup method Failed " + e);

		}

	}

	public void clickManagePatientInfoLink() {
		try {
			seleniumFunctions.waitForElement(babyMatchSelectPatient.managePatientInfoLink);
			babyMatchSelectPatient.managePatientInfoLink.click();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickManagePatientInfoLink method Failed " + e);

		}

	}

	public void selectToLocation(String toLocation) {
		try {
			seleniumFunctions.waitForElement(babyMatchSelectPatient.toLocationDropDown);
			seleniumFunctions.selectValueByVisibleText(babyMatchSelectPatient.toLocationDropDown, toLocation);
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: selectToLocation method Failed " + e);

		}

	}

	public void selectFromLocation(String fromLocation) {
		try {
			seleniumFunctions.waitForElement(babyMatchSelectPatient.fromLocationDropDown);
			seleniumFunctions.selectValueByVisibleText(babyMatchSelectPatient.fromLocationDropDown, fromLocation);
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: selectFromLocation method Failed " + e);

		}

	}

	public void clickCancelButton() {
		try {
			seleniumFunctions.waitForElement(babyMatchSelectPatient.cancelButton);
			babyMatchSelectPatient.cancelButton.click();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: selectFromLocation method Failed " + e);

		}

	}

	public void verifyInvalidPatientIDAlertMessage() {
		try {
			seleniumFunctions.waitForElement(babyMatchSelectPatient.invalidPatientIDAlertMessage);
			Assert.assertTrue(babyMatchSelectPatient.invalidPatientIDAlertMessage.isDisplayed());
		} catch (Exception e) {
			System.out
					.println("BabyMatchSelectPatientFunctions: verifyInvalidPatientIDAlertMessage method Failed " + e);

		}

	}

	public void clickAcknowledgeButtonMatchFailedPopup() {
		try {
			seleniumFunctions.waitForElement(babyMatchSelectPatient.acknowledgeButtonMatchFailedPopup);
			babyMatchSelectPatient.acknowledgeButtonMatchFailedPopup.click();
		} catch (Exception e) {
			System.out.println(
					"BabyMatchSelectPatientFunctions: clickAcknowledgeButtonMatchFailedPopup method Failed " + e);

		}

	}

	public void clickLogoutLink() {
		try {
			seleniumFunctions.waitForElement(babyMatchSelectPatient.logoutLink);
			babyMatchSelectPatient.logoutLink.click();
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickLogoutLink method Failed " + e);

		}

	}
}
