package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideStateChangePage;

public class CapribedsideStateChangeFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideStateChangePage stateChangePage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideStateChangePage.class);

	public void enterBottleNumber(String bottleNumber) {
		try {
			seleniumFunctions.waitForElement(stateChangePage.bottleNumberTextbox);
			stateChangePage.bottleNumberTextbox.sendKeys(bottleNumber);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterBottleNumber method Failed " + e);
		}

	}

	public void clickExitButton() {
		try {
			seleniumFunctions.waitForElement(stateChangePage.exitButton);
			stateChangePage.exitButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickExitButton method Failed " + e);
		}

	}

	public void verifyExpectingPatientIDErrorMessage() {
		try {
			seleniumFunctions.waitForElement(stateChangePage.warningBottleMayNotBeChangedForThisPatient);
			Assert.assertTrue(stateChangePage.warningBottleMayNotBeChangedForThisPatient.isDisplayed(),
					"Warning Bottle may not be changed for this patient is displayed");

		} catch (Exception e) {
			System.out.println(
					"BabyMatchSelectPatientFunctions: verifyExpectingPatientIDErrorMessage method Failed " + e);
		}

	}

	public void clickAcknowledgeButtonBottleMayNotBeChangedForThisPatientPopup() {
		try {
			seleniumFunctions.waitForElement(stateChangePage.acknowledgeButtonBottleMayNotBeChangedForThisPatientPopup);
			stateChangePage.acknowledgeButtonBottleMayNotBeChangedForThisPatientPopup.click();

		} catch (Exception e) {
			System.out.println(
					"BabyMatchSelectPatientFunctions: clickAcknowledgeButtonBottleMayNotBeChangedForThisPatientPopup method Failed "
							+ e);
		}

	}

	public void verifyBottleNotReceivedErrorMessage() {
		try {
			seleniumFunctions.waitForElement(stateChangePage.bottleNotReceivedErrorMessage);
			Assert.assertTrue(stateChangePage.bottleNotReceivedErrorMessage.isDisplayed(),
					"Bottle Not Received Error Message is displayed");

		} catch (Exception e) {
			System.out
					.println("BabyMatchSelectPatientFunctions: verifyBottleNotReceivedErrorMessage method Failed " + e);
		}

	}

}
