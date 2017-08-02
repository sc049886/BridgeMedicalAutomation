package com.pageObject.Functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideSelectPatientPage;

public class CapribedsideSelectPatientFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	CapribedsideSelectPatientPage selectPatientPage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideSelectPatientPage.class);

	public void enterPatientId(String patientId) {
		try {
			seleniumFunctions.waitForElement(selectPatientPage.patientIdTextbox);
			selectPatientPage.patientIdTextbox.sendKeys(patientId);

		} catch (Exception e) {
			System.out.println("CapribedsideSelectPatientFunctions: enterPatientId method Failed " + e);
		}

	}

	public void scanPatientid(String patientID) {
		try {
			seleniumFunctions.waitForElement(selectPatientPage.patientIdTextbox);
			Actions actions = new Actions(IEDriver.ieDriver);
			actions.keyDown(Keys.ALT).perform();
			selectPatientPage.patientIdTextbox.sendKeys("[");
			selectPatientPage.patientIdTextbox.sendKeys(patientID);
			actions.keyDown(Keys.ALT).perform();
			selectPatientPage.patientIdTextbox.sendKeys("]");

		} catch (Exception e) {
			System.out.println("CapribedsideSelectPatientFunctions: scanPatientid method Failed " + e);
		}

	}

	public void verifyErrorMessage() {
		try {
			seleniumFunctions.waitForElement(selectPatientPage.ErrorMsg);
			Assert.assertTrue(selectPatientPage.ErrorMsg.isDisplayed(), "Error message is displayed");

		} catch (Exception e) {
			System.out.println("CapribedsideSelectPatientFunctions: verifyErrorMessage method Failed " + e);
		}

	}

	public void clickLogoutLink() {
		try {
			seleniumFunctions.waitForElement(selectPatientPage.logoutLink);
			selectPatientPage.logoutLink.click();

		} catch (Exception e) {
			System.out.println("CapribedsideSelectPatientFunctions: clickLogoutLink method Failed " + e);
		}

	}

	public void clickMilkManagementLink() {
		try {
			seleniumFunctions.waitForElement(selectPatientPage.milkManagementLink);
			selectPatientPage.milkManagementLink.click();

		} catch (Exception e) {
			System.out.println("CapribedsideSelectPatientFunctions: milkManagementLink method Failed " + e);
		}

	}

	public void clickReportsLink() {
		try {
			seleniumFunctions.waitForElement(selectPatientPage.reportsLink);
			selectPatientPage.reportsLink.click();

		} catch (Exception e) {
			System.out.println("CapribedsideSelectPatientFunctions: clickReportsLink method Failed " + e);
		}

	}

	public void verifyPatientNotFoundErrorMessage() {
		try {
			seleniumFunctions.waitForElement(selectPatientPage.patientNotFoundErrorMessage);
			Assert.assertTrue(selectPatientPage.patientNotFoundErrorMessage.isDisplayed(),
					"Patient Not Found Error message is displayed");

		} catch (Exception e) {
			System.out.println(
					"CapribedsideSelectPatientFunctions: verifyPatientNotFoundErrorMessage method Failed " + e);
		}

	}

	public void verifyExpectingPatientIDErrorMessage() {
		try {
			seleniumFunctions.waitForElement(selectPatientPage.expectingPatientIDErrorMessage);
			Assert.assertTrue(selectPatientPage.expectingPatientIDErrorMessage.isDisplayed(),
					"Expecting patient id Error message is displayed");

		} catch (Exception e) {
			System.out.println(
					"CapribedsideSelectPatientFunctions: verifyPatientNotFoundErrorMessage method Failed " + e);
		}

	}

}
