package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideDischargeBottlesPage;

import junit.framework.Assert;

public class CapribedsideDischargeBottlesFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideDischargeBottlesPage dischargeBottlesPage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideDischargeBottlesPage.class);

	public void enterBottleNumber(String bottleNumberToDischarge) {
		try {
			seleniumFunctions.waitForElement(dischargeBottlesPage.bottleNumberTextbox);
			dischargeBottlesPage.bottleNumberTextbox.sendKeys(bottleNumberToDischarge);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterBottleNumber method Failed " + e);
		}

	}

	public void verifyWarningPopup() {
		try {
			seleniumFunctions.waitForElement(dischargeBottlesPage.warningPopup);
			Assert.assertTrue(dischargeBottlesPage.warningPopup.isDisplayed());

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: verifyWarningPopup method Failed " + e);
		}

	}

	public void clickYesButtonWarningPopup() {
		try {
			seleniumFunctions.waitForElement(dischargeBottlesPage.yesButtonWarningPopup);
			dischargeBottlesPage.yesButtonWarningPopup.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickYesButtonWarningPopup method Failed " + e);
		}

	}

	public void clickNoButtonWarningPopup() {
		try {
			seleniumFunctions.waitForElement(dischargeBottlesPage.noButtonWarningPopup);
			dischargeBottlesPage.noButtonWarningPopup.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickNoButtonWarningPopup method Failed " + e);
		}

	}

	public void clickExitButton() {
		try {
			seleniumFunctions.waitForElement(dischargeBottlesPage.exitButton);
			dischargeBottlesPage.exitButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickExitButton method Failed " + e);
		}

	}

	public void verifyBottleMayNotBeDischargeToThisPatientErrorMsg() {
		try {
			seleniumFunctions.waitForElement(dischargeBottlesPage.bottleMayNotBeDischargeToThisPatientErrorMsg);
			Assert.assertTrue(dischargeBottlesPage.bottleMayNotBeDischargeToThisPatientErrorMsg.isDisplayed());

		} catch (Exception e) {
			System.out.println(
					"BabyMatchSelectPatientFunctions: verifyBottleMayNotBeDischargeToThisPatientErrorMsg method Failed "
							+ e);
		}

	}

	public void clickAcknowledgeButtonBottleMayNotBeDischargeToThisPatientPopup() {
		try {
			seleniumFunctions
					.waitForElement(dischargeBottlesPage.acknowledgeButtonBottleMayNotBeDischargeToThisPatientPopup);
			dischargeBottlesPage.acknowledgeButtonBottleMayNotBeDischargeToThisPatientPopup.click();

		} catch (Exception e) {
			System.out.println(
					"BabyMatchSelectPatientFunctions: clickAcknowledgeButtonBottleMayNotBeDischargeToThisPatientPopup method Failed "
							+ e);
		}

	}

	public void verifyBottleNotReceivedErrorMessage() {
		try {
			seleniumFunctions.waitForElement(dischargeBottlesPage.bottleNotReceivedErrorMessage);
			Assert.assertTrue(dischargeBottlesPage.bottleNotReceivedErrorMessage.isDisplayed());

		} catch (Exception e) {
			System.out
					.println("BabyMatchSelectPatientFunctions: verifyBottleNotReceivedErrorMessage method Failed " + e);
		}

	}

}
