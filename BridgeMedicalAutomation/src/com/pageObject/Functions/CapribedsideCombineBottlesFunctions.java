package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideCombineBottlesPage;

public class CapribedsideCombineBottlesFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideCombineBottlesPage combineBottlesPage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideCombineBottlesPage.class);
	public void enterBottleNumber(String bottleNumber) {
		try {
			seleniumFunctions.waitForElement(combineBottlesPage.bottleNumberTextbox);
			combineBottlesPage.bottleNumberTextbox.sendKeys(bottleNumber);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterBottleNumber method Failed " + e);
		}

	}
	public void enterComment(String comment) {
		try {
			//seleniumFunctions.waitForElement(combineBottlesPage.commentTextbox);
			combineBottlesPage.commentTextbox.sendKeys(comment);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterComment method Failed " + e);
		}

	}
	public void clickConfirmButton() {
		try {
			seleniumFunctions.waitForElement(combineBottlesPage.confirmButton);
			combineBottlesPage.confirmButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickConfirmButton method Failed " + e);
		}

	}public void clickPrepareButton() {
		try {
			seleniumFunctions.waitForElement(combineBottlesPage.prepareButton);
			combineBottlesPage.prepareButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickPrepareButton method Failed " + e);
		}

	}public void clickExitButton() {
		try {
			seleniumFunctions.waitForElement(combineBottlesPage.exitButton);
			combineBottlesPage.exitButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickExitButton method Failed " + e);
		}

	}
	public void verifyBottleMayNotBeCombinedForThisPatienWarningMessage() {
		try {
			seleniumFunctions.waitForElement(combineBottlesPage.bottleMayNotBeCombinedForThisPatienWarningMessage);
			Assert.assertTrue(combineBottlesPage.bottleMayNotBeCombinedForThisPatienWarningMessage.isDisplayed());

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: verifyBottleMayNotBeCombinedForThisPatienWarningMessage method Failed " + e);
		}

	}
	public void clcikAcknowledgeButtonBottleMayNotBeCombinedForThisPatienWarningPopup() {
		try {
			seleniumFunctions.waitForElement(combineBottlesPage.acknowledgeButtonBottleMayNotBeCombinedForThisPatienWarningPopup);
			combineBottlesPage.acknowledgeButtonBottleMayNotBeCombinedForThisPatienWarningPopup.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clcikAcknowledgeButtonBottleMayNotBeCombinedForThisPatienWarningPopup method Failed " + e);
		}

	}
	
	public void verifyBottleNotReceivedErrorMessage() {
		try {
			seleniumFunctions.waitForElement(combineBottlesPage.bottleNotReceivedErrorMessage);
			Assert.assertTrue(combineBottlesPage.bottleNotReceivedErrorMessage.isDisplayed());

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: verifyBottleNotReceivedErrorMessage method Failed " + e);
		}

	}

}
