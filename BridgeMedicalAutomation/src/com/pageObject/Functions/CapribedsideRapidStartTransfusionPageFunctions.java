package com.pageObject.Functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideRapidStartTransfusionPage;

public class CapribedsideRapidStartTransfusionPageFunctions {

	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideRapidStartTransfusionPage rapidStartTransfusionPage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideRapidStartTransfusionPage.class);

	public void selectDonorCenterCode(String centerCode) {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.donorCenterCodeDropdown);
			seleniumFunctions.selectValueByVisibleText(rapidStartTransfusionPage.donorCenterCodeDropdown, centerCode);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: selectDonorCenterCode method Failed " + e);
		}

	}
	public void verifyDonorCenterCodeDisplay() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.donorCenterCodeDropdown);
			Assert.assertTrue(rapidStartTransfusionPage.donorCenterCodeDropdown.isDisplayed(),
					"donorCenterCodeDropdown is displayed");

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: donorCenterCodeDropdown method Failed " + e);
		}

	}

	public void enterDonorUnitNumber(String unitNumber) {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.donorUnitNumberTextbox);
			rapidStartTransfusionPage.donorUnitNumberTextbox.sendKeys(unitNumber);

		} catch (Exception e) {
			System.out
					.println("CapribedsideRapidStartTransfusionPageFunctions: enterDonorUnitNumber method Failed " + e);
		}

	}
	public void scanDonorUnitNumber(String unitNumber) {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.donorUnitNumberTextbox);
			Actions actions = new Actions(IEDriver.ieDriver);
			actions.keyDown(Keys.ALT).perform();
			rapidStartTransfusionPage.donorUnitNumberTextbox.sendKeys("[");
			rapidStartTransfusionPage.donorUnitNumberTextbox.sendKeys(unitNumber);
			//seleniumFunctions.pressEnter();
			actions.keyDown(Keys.ALT).perform();
			rapidStartTransfusionPage.donorUnitNumberTextbox.sendKeys("]");

		} catch (Exception e) {
			System.out
					.println("CapribedsideRapidStartTransfusionPageFunctions: scanDonorUnitNumber method Failed " + e);
		}

	}

	public void selectDonorBloodProduct(String bloodProduct) {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.donorBloodProductDropDown);
			seleniumFunctions.selectValueByVisibleText(rapidStartTransfusionPage.donorBloodProductDropDown,
					bloodProduct);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: selectDonorBloodProduct method Failed " + e);
		}

	}
	public void scanDonorBloodProduct(String donorBloodProduct) {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.donorBloodProductDropDown);
			Actions actions = new Actions(IEDriver.ieDriver);
			actions.keyDown(Keys.ALT).perform();
			rapidStartTransfusionPage.donorBloodProductDropDown.sendKeys("[");
			rapidStartTransfusionPage.donorBloodProductDropDown.sendKeys(donorBloodProduct);
			actions.keyDown(Keys.ALT).perform();
			rapidStartTransfusionPage.donorBloodProductDropDown.sendKeys("]");

		} catch (Exception e) {
			System.out
					.println("CapribedsideRapidStartTransfusionPageFunctions: scanDonorBloodProduct method Failed " + e);
		}

	}

	public void clickBloodProductAttribute() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.bloodProductAttribute);
			rapidStartTransfusionPage.bloodProductAttribute.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: clickBloodProductAttribute method Failed " + e);
		}

	}

	public void checkAntiCMVNegativeBloodProductAttributeCheckbox() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.antiCMVNegativeBloodProductAttributeCheckbox);
			rapidStartTransfusionPage.antiCMVNegativeBloodProductAttributeCheckbox.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: checkAntiCMVNegativeBloodProductAttributeCheckbox method Failed "
							+ e);
		}

	}

	public void checkIrradiatedBloodProductAttributeCheckbox() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.irradiatedBloodProductAttributeCheckbox);
			rapidStartTransfusionPage.irradiatedBloodProductAttributeCheckbox.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: checkIrradiatedBloodProductAttributeCheckbox method Failed "
							+ e);
		}

	}

	public void clickSaveBloodAttributeButton() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.saveBloodAttributeButton);
			rapidStartTransfusionPage.saveBloodAttributeButton.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: clickSaveBloodAttributeButton method Failed " + e);
		}

	}

	public void enterDonorBloodProductExpirationDate(String bloodProductExpirationDate) {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.donorBloodProductExipreDateTextbox);
			rapidStartTransfusionPage.donorBloodProductExipreDateTextbox.clear();
			rapidStartTransfusionPage.donorBloodProductExipreDateTextbox.sendKeys(bloodProductExpirationDate);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: enterDonorBloodProductExpirationDate method Failed "
							+ e);
		}

	}

	public void selectDonorBloodType(String donorBloodType) {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.donorBloodTypeDropDown);
			seleniumFunctions.selectValueByVisibleText(rapidStartTransfusionPage.donorBloodTypeDropDown,
					donorBloodType);

		} catch (Exception e) {
			System.out
					.println("CapribedsideRapidStartTransfusionPageFunctions: selectDonorBloodType method Failed " + e);
		}

	}

	public void enterDonorComment(String donorComment) {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.donorComments);
			rapidStartTransfusionPage.donorComments.sendKeys(donorComment);

		} catch (Exception e) {
			System.out.println("CapribedsideRapidStartTransfusionPageFunctions: enterDonorComment method Failed " + e);
		}

	}

	public void clickDonorContinueButton() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.donorContinueButton);
			rapidStartTransfusionPage.donorContinueButton.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: clickDonorContinueButton method Failed " + e);
		}

	}

	public void clickDOnorExitButton() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.donorExitButton);
			rapidStartTransfusionPage.donorExitButton.click();

		} catch (Exception e) {
			System.out
					.println("CapribedsideRapidStartTransfusionPageFunctions: clickDOnorExitButton method Failed " + e);
		}

	}

	// Function for Hazard verification
	public void verifyDonorBloodTypeIsNotAllowedForPatientErrorMessage() {
		try {
			seleniumFunctions
					.waitForElement(rapidStartTransfusionPage.donorBloodTypeIsNotAllowedForPatientErrorMessage);
			Assert.assertTrue(rapidStartTransfusionPage.donorBloodTypeIsNotAllowedForPatientErrorMessage.isDisplayed(),
					"donorBloodTypeIsNotAllowedForPatientErrorMessage is Displayed");

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: verifyDonorBloodTypeIsNotAllowedForPatientErrorMessage method Failed "
							+ e);
		}

	}

	public void verifyBloodTypeMissmatchPopup() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.bloodTypeMissmatchPopup);
			Assert.assertTrue(rapidStartTransfusionPage.bloodTypeMissmatchPopup.isDisplayed(),
					"verifyBloodTypeMissmatchPopup is Displayed");

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: verifyBloodTypeMissmatchPopup method Failed " + e);
		}

	}

	public void clickYesButtonDonorBloodTypeMissMatchPopup() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.yesButtonDonorBloodTypeMissMatchPopup);
			rapidStartTransfusionPage.yesButtonDonorBloodTypeMissMatchPopup.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: clickYesButtonDonorBloodTypeMissMatchPopup method Failed "
							+ e);
		}

	}

	public void clickNoButtonDonorBloodTypeMissMatchPopup() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.noButtonDonorBloodTypeMissMatchPopup);
			rapidStartTransfusionPage.noButtonDonorBloodTypeMissMatchPopup.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: clickNoButtonDonorBloodTypeMissMatchPopup method Failed "
							+ e);
		}

	}

	public void enterUesrId(String userId) {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.cosignUserIdTextBox);
			rapidStartTransfusionPage.cosignUserIdTextBox.sendKeys(userId);

		} catch (Exception e) {
			System.out.println("CapribedsideRapidStartTransfusionPageFunctions: enterUesrId method Failed " + e);
		}

	}

	public void enterPassword(String password) {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.cosignPasswordTextBox);
			rapidStartTransfusionPage.cosignPasswordTextBox.sendKeys(password);

		} catch (Exception e) {
			System.out.println("CapribedsideRapidStartTransfusionPageFunctions: enterPassword method Failed " + e);
		}

	}

	public void clickCosignContinueButton() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.cosignContinueButton);
			rapidStartTransfusionPage.cosignContinueButton.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: clickCosignContinueButton method Failed " + e);
		}

	}

	public void clickCosignExitButton() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.cosignExitButton);
			rapidStartTransfusionPage.cosignExitButton.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: clickCosignExitButton method Failed " + e);
		}

	}

	public void verifyCosignUserIdOrPasswordInvalidErrorMessage() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.cosignUserIdOrPasswordInvalidErrorMessage);
			Assert.assertTrue(rapidStartTransfusionPage.cosignUserIdOrPasswordInvalidErrorMessage.isDisplayed(),
					"cosignUserIdOrPasswordInvalidErrorMessage is Displayed");

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: verifyCosignUserIdOrPasswordInvalidErrorMessage method Failed "
							+ e);
		}

	}

	public void clickStartRapidTransfusionButton() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.startRapidTransfusionButton);
			rapidStartTransfusionPage.startRapidTransfusionButton.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: clickStartRapidTransfusionButton method Failed "
							+ e);
		}

	}

	public void clickExitRapidTransfusionButton() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.exitRapidTransfusionButton);
			rapidStartTransfusionPage.exitRapidTransfusionButton.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: clickExitRapidTransfusionButton method Failed "
							+ e);
		}

	}

	public void clickPrintRapidTransfusionReportButton() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.printRapidTransfusionReportButton);
			rapidStartTransfusionPage.printRapidTransfusionReportButton.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: clickPrintRapidTransfusionReportButton method Failed "
							+ e);
		}

	}

	public void clickCancelPrintRapidTransfusionReportButton() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.cancelPrintRapidTransfusionReportButton);
			rapidStartTransfusionPage.cancelPrintRapidTransfusionReportButton.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: clickPrintRapidTransfusionReportButton method Failed "
							+ e);
		}

	}

	public void clickLogoutlink() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.logoutLink);
			rapidStartTransfusionPage.logoutLink.click();

		} catch (Exception e) {
			System.out.println("CapribedsideRapidStartTransfusionPageFunctions: clickLogoutlink method Failed " + e);
		}

	}

	public void clickYesButtonLogoutPopup() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.yesButtonLogoutPopup);
			rapidStartTransfusionPage.yesButtonLogoutPopup.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: clickYesButtonLogoutPopup method Failed " + e);
		}

	}

	public void clickNoButtonLogoutPopup() {
		try {
			seleniumFunctions.waitForElement(rapidStartTransfusionPage.noButtonLogoutPopup);
			rapidStartTransfusionPage.noButtonLogoutPopup.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideRapidStartTransfusionPageFunctions: clickNoButtonLogoutPopup method Failed " + e);
		}

	}

}
