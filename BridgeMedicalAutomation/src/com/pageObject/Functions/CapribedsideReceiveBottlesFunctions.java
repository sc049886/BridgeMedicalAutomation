package com.pageObject.Functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideReceiveBottlesPage;
import com.pageObjects.CapribedsideSelectPatientPage;

public class CapribedsideReceiveBottlesFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	CapribedsideReceiveBottlesPage receiveBottlesPage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideReceiveBottlesPage.class);

	public void enterPatientId(String patientId) {
		try {
			seleniumFunctions.waitForElement(receiveBottlesPage.bottlePatientIdTextbox);
			receiveBottlesPage.bottlePatientIdTextbox.sendKeys(patientId);

		} catch (Exception e) {
			System.out.println("CapribedsideReceiveBottlesFunctions: enterPatientId method Failed " + e);
		}

	}
	public void scanpatientid(String patientID) throws InterruptedException {

		Actions actions = new Actions(IEDriver.ieDriver);
		actions.keyDown(Keys.ALT).perform();
		receiveBottlesPage.bottlePatientIdTextbox.sendKeys("[");
		receiveBottlesPage.bottlePatientIdTextbox.sendKeys(patientID);
		actions.keyDown(Keys.ALT).perform();
		receiveBottlesPage.bottlePatientIdTextbox.sendKeys("]");
		Thread.sleep(1000);
	}
	public void clickYesButtonBottleNumberWarningPopup() {
		try {
			seleniumFunctions.waitForElement(receiveBottlesPage.yesButtonBottleNumberWarningPopup);
			receiveBottlesPage.yesButtonBottleNumberWarningPopup.click();

		} catch (Exception e) {
			System.out.println("CapribedsideReceiveBottlesFunctions: clickYesButtonBottleNumberWarningPopup method Failed " + e);
		}

	}
	public void clickNoButtonBottleNumberWarningPopup() {
		try {
			seleniumFunctions.waitForElement(receiveBottlesPage.noButtonBottleNumberWarningPopup);
			receiveBottlesPage.noButtonBottleNumberWarningPopup.click();

		} catch (Exception e) {
			System.out.println("CapribedsideReceiveBottlesFunctions: clickNoButtonBottleNumberWarningPopup method Failed " + e);
		}

	}
	public void enterCollectionDateTime(String collectionDateTime) {
		try {
			seleniumFunctions.waitForElement(receiveBottlesPage.collectedDateTimeTextbox);
			receiveBottlesPage.collectedDateTimeTextbox.sendKeys(collectionDateTime);

		} catch (Exception e) {
			System.out.println("CapribedsideReceiveBottlesFunctions: enterCollectionDateTime method Failed " + e);
		}

	}
	public void selectStorageState(String storageState) {
		try {
			seleniumFunctions.waitForElement(receiveBottlesPage.storageStateDropdown);
			seleniumFunctions.selectValueByVisibleText(receiveBottlesPage.storageStateDropdown,storageState);

		} catch (Exception e) {
			System.out.println("CapribedsideReceiveBottlesFunctions: selectStorageState method Failed " + e);
		}

	}
	public void enterComment(String comment) {
		try {
			seleniumFunctions.waitForElement(receiveBottlesPage.commentsTextbox);
			receiveBottlesPage.commentsTextbox.sendKeys(comment);

		} catch (Exception e) {
			System.out.println("CapribedsideReceiveBottlesFunctions: enterComment method Failed " + e);
		}

	}
	public void clickConfirmButton() {
		try {
			seleniumFunctions.waitForElement(receiveBottlesPage.confirmButton);
			receiveBottlesPage.confirmButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideReceiveBottlesFunctions: clickConfirmButton method Failed " + e);
		}

	}
	public void clickExitButton() {
		try {
			seleniumFunctions.waitForElement(receiveBottlesPage.exitButton);
			receiveBottlesPage.exitButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideReceiveBottlesFunctions: clickExitButton method Failed " + e);
		}

	}
	public void verifyExpiredBottleConfirmPopup() {
		try {
			seleniumFunctions.waitForElement(receiveBottlesPage.expiredBottleConfirmPopup);
			Assert.assertTrue(receiveBottlesPage.expiredBottleConfirmPopup.isDisplayed(), "Expired Bottle Popup is Displayed");

		} catch (Exception e) {
			System.out.println("CapribedsideReceiveBottlesFunctions: verifyExpiredBottleConfirmPopup method Failed " + e);
		}

	}
	public void clickYesButtonExpiredBottleConfirmPopup() {
		try {
			seleniumFunctions.waitForElement(receiveBottlesPage.yesButtonExpiredBottleConfirmPopup);
			receiveBottlesPage.yesButtonExpiredBottleConfirmPopup.click();

		} catch (Exception e) {
			System.out.println("CapribedsideReceiveBottlesFunctions: clickYesButtonExpiredBottleConfirmPopup method Failed " + e);
		}

	}
	public void clickNoButtonExpiredBottleConfirmPopup() {
		try {
			seleniumFunctions.waitForElement(receiveBottlesPage.noButtonExpiredBottleConfirmPopup);
			receiveBottlesPage.noButtonExpiredBottleConfirmPopup.click();

		} catch (Exception e) {
			System.out.println("CapribedsideReceiveBottlesFunctions: clickNoButtonExpiredBottleConfirmPopup method Failed " + e);
		}

	}
	public void verifyPatientNotMatchErrorMessage() {
		try {
			seleniumFunctions.waitForElement(receiveBottlesPage.patientNotMatchErrorMessage);
			Assert.assertTrue(receiveBottlesPage.patientNotMatchErrorMessage.isDisplayed(), "Patient Not Match Error Message is Displayed");

		} catch (Exception e) {
			System.out.println("CapribedsideReceiveBottlesFunctions: verifyPatientNotMatchErrorMessage method Failed " + e);
		}

	}
	public void verifyDuplicateBottleErrorMessage() {
		try {
			seleniumFunctions.waitForElement(receiveBottlesPage.duplicateBottleErrorMessage);
			Assert.assertTrue(receiveBottlesPage.duplicateBottleErrorMessage.isDisplayed(), "Duplicate Bottle Error Message is Displayed");

		} catch (Exception e) {
			System.out.println("CapribedsideReceiveBottlesFunctions: verifyDuplicateBottleErrorMessage method Failed " + e);
		}

	}
	public void verifyManualEntryErrorMessage() {
		try {
			seleniumFunctions.waitForElement(receiveBottlesPage.manualEntryErrorMessage);
			Assert.assertTrue(receiveBottlesPage.manualEntryErrorMessage.isDisplayed(), "Manual Entry Error Message is Displayed");

		} catch (Exception e) {
			System.out.println("CapribedsideReceiveBottlesFunctions: verifyManualEntryErrorMessage method Failed " + e);
		}

	}
	public void clickLogoutLink() {
		try {
			seleniumFunctions.waitForElement(receiveBottlesPage.logoutLink);
			receiveBottlesPage.logoutLink.click();

		} catch (Exception e) {
			System.out.println("CapribedsideReceiveBottlesFunctions: clickLogoutLink method Failed " + e);
		}

	}

}
