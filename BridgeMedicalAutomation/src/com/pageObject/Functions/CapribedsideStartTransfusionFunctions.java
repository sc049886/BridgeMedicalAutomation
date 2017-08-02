package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideStartTransfusionPage;

public class CapribedsideStartTransfusionFunctions {

	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideStartTransfusionPage startTransfusionPage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideStartTransfusionPage.class);

	public void enterMrn(String mrn) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.mrnIdTextbox);
			startTransfusionPage.mrnIdTextbox.sendKeys(mrn);
			// seleniumFunctions.selectValueByVisibleText(startTransfusionPage.donorCenterCodeDropdown,
			// centerCode);

		} catch (Exception e) {
			System.out.println("CapribedsideStartTransfusionPageFunctions: selectDonorCenterCode method Failed " + e);
		}

	}

	public void clickContinueButtonMrnPage() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.mrnContinueButton);
			startTransfusionPage.mrnContinueButton.click();
			// seleniumFunctions.selectValueByVisibleText(startTransfusionPage.donorCenterCodeDropdown,
			// centerCode);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: clickContinueButtonMrnPage method Failed " + e);
		}
	}

	public void clickExitButtonMrnPage() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.mrnExitButton);
			startTransfusionPage.mrnExitButton.click();
		} catch (Exception e) {
			System.out.println("CapribedsideStartTransfusionPageFunctions: clickExitButtonMrnPage method Failed " + e);
		}
	}

	public void checkPreCheckVerifyDobCheckBox() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.preCheckVerifyDobCheckBox);
			startTransfusionPage.preCheckVerifyDobCheckBox.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: checkPreCheckVerifyDobCheckBox method Failed " + e);
		}
	}

	public void checkPreCheckFilterNumberCheckbox() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.preCheckFilterNumberCheckbox);
			startTransfusionPage.preCheckFilterNumberCheckbox.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: checkPreCheckFilterNumberCheckbox method Failed " + e);
		}
	}

	public void checkpreCheckCheckTheOriginalTransfusionOrder() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.preCheckCheckTheOriginalTransfusionOrder);
			startTransfusionPage.preCheckCheckTheOriginalTransfusionOrder.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: checkpreCheckCheckTheOriginalTransfusionOrder method Failed "
							+ e);
		}
	}

	public void checkPreCheckContinueButton() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.preCheckContinueButton);
			startTransfusionPage.preCheckContinueButton.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: checkPreCheckContinueButton method Failed " + e);
		}
	}

	public void checkPreCheckExitButton() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.preCheckExitButton);
			startTransfusionPage.preCheckExitButton.click();
		} catch (Exception e) {
			System.out.println("CapribedsideStartTransfusionPageFunctions: checkPreCheckExitButton method Failed " + e);
		}
	}

	public void enterRecipientPatientIDTextbox(String recipientPatientId) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.recipientPatientIDTextbox);
			startTransfusionPage.recipientPatientIDTextbox.sendKeys(recipientPatientId);
		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: enterRecipientPatientIDTextbox method Failed " + e);
		}
	}

	public void enterRecipientMrn(String recipientMrn) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.recipientMrnTextbox);
			startTransfusionPage.recipientMrnTextbox.sendKeys(recipientMrn);
		} catch (Exception e) {
			System.out.println("CapribedsideStartTransfusionPageFunctions: enterRecipientMrn method Failed " + e);
		}
	}

	public void enterRecipientPatientName(String recipientPatientName) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.recipientPatientNameTextbox);
			startTransfusionPage.recipientPatientNameTextbox.sendKeys(recipientPatientName);
		} catch (Exception e) {
			System.out
					.println("CapribedsideStartTransfusionPageFunctions: enterRecipientPatientName method Failed " + e);
		}
	}

	public void enterRecipientUnitNumber(String recipientUnitNumber) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.recipientUnitNumberTextbox);
			startTransfusionPage.recipientUnitNumberTextbox.sendKeys(recipientUnitNumber);
		} catch (Exception e) {
			System.out
					.println("CapribedsideStartTransfusionPageFunctions: enterRecipientUnitNumber method Failed " + e);
		}
	}

	public void enterRecipientUnitDivisionNumber(String recipientUnitDivisionNumber) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.recipientUnitDivisionNumberTextbox);
			startTransfusionPage.recipientUnitDivisionNumberTextbox.sendKeys(recipientUnitDivisionNumber);
		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: enterRecipientUnitDivisionNumber method Failed " + e);
		}
	}

	public void selectRecipientBloodType(String recipientBloodType) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.recipientBloodTypeDropDown);
			seleniumFunctions.selectValueByVisibleText(startTransfusionPage.recipientBloodTypeDropDown,
					recipientBloodType);
		} catch (Exception e) {
			System.out
					.println("CapribedsideStartTransfusionPageFunctions: selectRecipientBloodType method Failed " + e);
		}
	}

	public void enterRecipientComment(String recipientPageComment) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.recipientCommentTextBox);
			startTransfusionPage.recipientCommentTextBox.sendKeys(recipientPageComment);
		} catch (Exception e) {
			System.out.println("CapribedsideStartTransfusionPageFunctions: enterRecipientComment method Failed " + e);
		}
	}

	public void clickRecipientContinueButton() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.recipientContinueButton);
			startTransfusionPage.recipientContinueButton.click();
		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: clickRecipientContinueButton method Failed " + e);
		}
	}

	public void clickRecipientExitButton() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.recipientExitButton);
			startTransfusionPage.recipientExitButton.click();
		} catch (Exception e) {
			System.out
					.println("CapribedsideStartTransfusionPageFunctions: clickRecipientExitButton method Failed " + e);
		}
	}

	// Donor Page

	public void selectDonorCenterCode(String centerCode) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.donorCenterCodeDropDown);
			seleniumFunctions.selectValueByVisibleText(startTransfusionPage.donorCenterCodeDropDown, centerCode);

		} catch (Exception e) {
			System.out.println("CapribedsideStartTransfusionPageFunctions: selectDonorCenterCode method Failed " + e);
		}

	}

	public void enterDonorUnitNumber(String unitNumber) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.donorUnitNumberTextbox);
			startTransfusionPage.donorUnitNumberTextbox.sendKeys(unitNumber);

		} catch (Exception e) {
			System.out.println("CapribedsideStartTransfusionPageFunctions: enterDonorUnitNumber method Failed " + e);
		}

	}

	public void enterDonorUnitDivisionNumber(String unitDivisionNumber) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.donorUnitDivisionTextbox);
			startTransfusionPage.donorUnitDivisionTextbox.sendKeys(unitDivisionNumber);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: enterDonorUnitDivisionNumber method Failed " + e);
		}

	}

	public void selectDonorBloodProduct(String bloodProduct) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.donorBloodProductDropDown);
			seleniumFunctions.selectValueByVisibleText(startTransfusionPage.donorBloodProductDropDown, bloodProduct);

		} catch (Exception e) {
			System.out.println("CapribedsideStartTransfusionPageFunctions: selectDonorBloodProduct method Failed " + e);
		}

	}

	public void selectDonorBloodProductDivision(String donorBloodProductDivision) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.donorBloodProductDeivisionExist);
			startTransfusionPage.donorUnitDivisionTextbox.sendKeys(donorBloodProductDivision);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: selectDonorBloodProductDivision method Failed " + e);
		}

	}

	public void clickIsbtDonorBloodProductLookupLink() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.isbtDonorBloodProductLookupLink);
			startTransfusionPage.isbtDonorBloodProductLookupLink.click();
		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: clickIsbtDonorBloodProductLookupLink method Failed "
							+ e);
		}

	}

	/*
	 * public void clickBloodProductAttribute() { try {
	 * seleniumFunctions.waitForElement(startTransfusionPage.
	 * bloodProductAttribute);
	 * rapidStartTransfusionPage.bloodProductAttribute.click();
	 * 
	 * } catch (Exception e) { System.out.println(
	 * "CapribedsideRapidStartTransfusionPageFunctions: clickBloodProductAttribute method Failed "
	 * + e); }
	 * 
	 * }
	 */

	public void checkAntiCMVNegativeBloodProductAttributeCheckbox() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.antiCMVNegativeBloodProductAttributeCheckbox);
			startTransfusionPage.antiCMVNegativeBloodProductAttributeCheckbox.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: checkAntiCMVNegativeBloodProductAttributeCheckbox method Failed "
							+ e);
		}

	}

	public void checkIrradiatedBloodProductAttributeCheckbox() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.irradiatedBloodProductAttributeCheckbox);
			startTransfusionPage.irradiatedBloodProductAttributeCheckbox.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: checkIrradiatedBloodProductAttributeCheckbox method Failed "
							+ e);
		}

	}

	public void clickSaveBloodAttributeButton() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.saveBloodAttributeButton);
			startTransfusionPage.saveBloodAttributeButton.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: clickSaveBloodAttributeButton method Failed " + e);
		}

	}

	public void selectDonorBloodProductDonationType(String donorBloodProductDonationType) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.donorBloodProductDonationTypeDropdown);
			seleniumFunctions.selectValueByVisibleText(startTransfusionPage.donorBloodProductDonationTypeDropdown,
					donorBloodProductDonationType);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: selectDonorBloodProductDonationType method Failed "
							+ e);
		}

	}

	public void enterDonorBloodProductDivision(String donorBloodProductDivision) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.donorBloodProductDevisionTextbox);
			startTransfusionPage.donorBloodProductDevisionTextbox.sendKeys(donorBloodProductDivision);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: enterDonorBloodProductDivision method Failed " + e);
		}

	}

	public void enterDonorBloodProductExpirationDate(String bloodProductExpirationDate) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.donorBloodProductExipreDateTextbox);
			startTransfusionPage.donorBloodProductExipreDateTextbox.sendKeys(bloodProductExpirationDate);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: enterDonorBloodProductExpirationDate method Failed "
							+ e);
		}

	}

	public void selectDonorBloodType(String donorBloodType) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.donorBloodTypeDropDown);
			seleniumFunctions.selectValueByVisibleText(startTransfusionPage.donorBloodTypeDropDown, donorBloodType);

		} catch (Exception e) {
			System.out.println("CapribedsideStartTransfusionPageFunctions: selectDonorBloodType method Failed " + e);
		}

	}

	/*
	 * public void enterDonorComment(String donorComment) { try {
	 * seleniumFunctions.waitForElement(startTransfusionPage.donorComments);
	 * rapidStartTransfusionPage.donorComments.sendKeys(donorComment);
	 * 
	 * } catch (Exception e) { System.out.
	 * println("CapribedsideRapidStartTransfusionPageFunctions: enterDonorComment method Failed "
	 * + e); }
	 * 
	 * }
	 */
	public void clickDonorContinueButton() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.donorContinueButton);
			startTransfusionPage.donorContinueButton.click();

		} catch (Exception e) {
			System.out
					.println("CapribedsideStartTransfusionPageFunctions: clickDonorContinueButton method Failed " + e);
		}

	}

	public void clickDonorExitButton() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.donorExitButton);
			startTransfusionPage.donorExitButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideStartTransfusionPageFunctions: clickDonorExitButton method Failed " + e);
		}

	}
	// Cosign Page Functions

	public void selectCosignBloodBankPermission(String bloodBankPermission) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.cosignBloodBankPermission);
			seleniumFunctions.selectValueByVisibleText(startTransfusionPage.cosignBloodBankPermission,
					bloodBankPermission);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: selectCosignBloodBankPermission method Failed " + e);
		}

	}

	public void selectCosignAgreeBloodTypeSubtitution(String AgreeBloodTypeSubstitution) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.cosignAgreeBloodTypeSubtitution);
			seleniumFunctions.selectValueByVisibleText(startTransfusionPage.cosignAgreeBloodTypeSubtitution,
					AgreeBloodTypeSubstitution);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: selectCosignAgreeBloodTypeSubtitution method Failed "
							+ e);
		}

	}

	public void selectcosignReasonForBloodTypeSubtitution(String reasonForBloodTypeSubstitution) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.cosignReasonForBloodTypeSubtitution);
			seleniumFunctions.selectValueByVisibleText(startTransfusionPage.cosignReasonForBloodTypeSubtitution,
					reasonForBloodTypeSubstitution);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: selectcosignReasonForBloodTypeSubtitution method Failed "
							+ e);
		}

	}

	public void enterUesrId(String userId) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.cosignUserIdTextBox);
			startTransfusionPage.cosignUserIdTextBox.sendKeys(userId);

		} catch (Exception e) {
			System.out.println("CapribedsideStartTransfusionPageFunctions: enterUesrId method Failed " + e);
		}

	}

	public void enterPassword(String password) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.cosignPasswordTextBox);
			startTransfusionPage.cosignPasswordTextBox.sendKeys(password);

		} catch (Exception e) {
			System.out.println("CapribedsideStartTransfusionPageFunctions: enterPassword method Failed " + e);
		}

	}

	public void clickCosignContinueButton() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.cosignContinueButton);
			startTransfusionPage.cosignContinueButton.click();

		} catch (Exception e) {
			System.out
					.println("CapribedsideStartTransfusionPageFunctions: clickCosignContinueButton method Failed " + e);
		}

	}

	public void clickCosignExitButton() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.cosignExitButton);
			startTransfusionPage.cosignExitButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideStartTransfusionPageFunctions: clickCosignExitButton method Failed " + e);
		}

	}

	public void verifyCosignUserIdOrPasswordInvalidErrorMessage() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.cosignUserIdOrPasswordInvalidErrorMessage);
			Assert.assertTrue(startTransfusionPage.cosignUserIdOrPasswordInvalidErrorMessage.isDisplayed(),
					"cosignUserIdOrPasswordInvalidErrorMessage is Displayed");

		} catch (Exception e) {
			System.out.println(
					"CapribedsideStartTransfusionPageFunctions: verifyCosignUserIdOrPasswordInvalidErrorMessage method Failed "
							+ e);
		}

	}

	// Vitals page functions
	public void enterTemperatureVitalsPage(String temperature) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.vitalsTemperatureFahrenheitTextbox);
			startTransfusionPage.vitalsTemperatureFahrenheitTextbox.clear();
			startTransfusionPage.vitalsTemperatureFahrenheitTextbox.sendKeys(temperature);

		} catch (Exception e) {
			System.out
					.println("CapribedsideEndTransfusionPageFunctions: enterTemperatureVitalsPage method Failed " + e);
		}

	}

	public void selectTemperatureSite(String temperatureSite) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.vitalsTemperatureSiteDropdown);
			seleniumFunctions.selectValueByVisibleText(startTransfusionPage.vitalsTemperatureSiteDropdown,
					temperatureSite);

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: selectTemperatureSite method Failed " + e);
		}

	}

	public void enterVitalsHeartRate(String heartRate) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.vitalsHeartRateTextbox);
			startTransfusionPage.vitalsHeartRateTextbox.clear();
			startTransfusionPage.vitalsHeartRateTextbox.sendKeys(heartRate);

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: enterVitalsHeartRate method Failed " + e);
		}

	}

	public void enterVitalsSystolicBloodPressure(String systolicBloodPressure) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.vitalsSystolicBloodPressureTextbox);
			startTransfusionPage.vitalsSystolicBloodPressureTextbox.clear();
			startTransfusionPage.vitalsSystolicBloodPressureTextbox.sendKeys(systolicBloodPressure);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: enterVitalsSystolicBloodPressure method Failed " + e);
		}

	}

	public void enterVitalsDiastolicBloodPressure(String diastolicBloodPressure) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.vitalsDiastolicBloodPressureTextbox);
			startTransfusionPage.vitalsDiastolicBloodPressureTextbox.clear();
			startTransfusionPage.vitalsDiastolicBloodPressureTextbox.sendKeys(diastolicBloodPressure);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: enterVitalsSystolicBloodPressure method Failed " + e);
		}

	}

	public void checkVitalsPalpCheckBox() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.vitalsPalpCheckBox);
			startTransfusionPage.vitalsPalpCheckBox.click();

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: checkVitalsPalpCheckBox method Failed " + e);
		}

	}

	public void enterVitalsRespiration(String respirationValue) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.vitalsRespirationTextbox);
			startTransfusionPage.vitalsRespirationTextbox.clear();
			startTransfusionPage.vitalsRespirationTextbox.sendKeys(respirationValue);

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: enterVitalsRespiration method Failed " + e);
		}

	}

	public void enterVitalsOxygenSaturation(String oxygenSaturationValue) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.vitalsOxygenSaturationTextBox);
			startTransfusionPage.vitalsOxygenSaturationTextBox.clear();
			startTransfusionPage.vitalsOxygenSaturationTextBox.sendKeys(oxygenSaturationValue);

		} catch (Exception e) {
			System.out
					.println("CapribedsideEndTransfusionPageFunctions: enterVitalsOxygenSaturation method Failed " + e);
		}

	}

	public void enterVitalsComments(String vitalsComments) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.vitalsCommentTextBox);
			startTransfusionPage.vitalsCommentTextBox.sendKeys(vitalsComments);

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: enterVitalsComments method Failed " + e);
		}

	}

	public void clickVitalsContinueButton() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.vitalsContinueButton);
			startTransfusionPage.vitalsContinueButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: clickVitalsContinueButton method Failed " + e);
		}

	}

	public void clickVitalsExitButton() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.vitalsExitButton);
			startTransfusionPage.vitalsExitButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: clickVitalsContinueButton method Failed " + e);
		}
	}

	public void checkOriginalTransOrderCheckBox() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.checksOriginalTransOrderCheckBox);
			startTransfusionPage.checksOriginalTransOrderCheckBox.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: checkOriginalTransOrderCheckBox method Failed " + e);
		}
	}

	public void enterSecondOrderVerification(String orderVerificationBy) {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.checksSecondOrderVerificationTextBox);
			startTransfusionPage.checksSecondOrderVerificationTextBox.sendKeys(orderVerificationBy);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: enterSecondOrderVerification method Failed " + e);
		}
	}

	public void checkSignedConsentCheckBox() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.checksSignedConsentCheckBox);
			startTransfusionPage.checksSignedConsentCheckBox.click();

		} catch (Exception e) {
			System.out
					.println("CapribedsideEndTransfusionPageFunctions: checkSignedConsentCheckBox method Failed " + e);
		}
	}

	public void clickChecksContinueButton() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.checksContinueButton);
			startTransfusionPage.checksContinueButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: clickChecksContinueButton method Failed " + e);
		}
	}

	public void clickChecksExitButton() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.checksExitButton);
			startTransfusionPage.checksExitButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: clickChecksExitButton method Failed " + e);
		}
	}

	public void clickExitButtonStartTransfusionPage() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.exitButtonStartTransfusionPage);
			startTransfusionPage.exitButtonStartTransfusionPage.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: clickExitButtonStartTransfusionPage method Failed " + e);
		}
	}

	public void clickStartButtonStartTransfusionPage() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.startButtonStartTransfusionPage);
			startTransfusionPage.startButtonStartTransfusionPage.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: clickStartButtonStartTransfusionPage method Failed " + e);
		}
	}

	public void clickPrintButtonPrintReportPage() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.printButtonPrintReportPage);
			startTransfusionPage.printButtonPrintReportPage.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: clickPrintButtonPrintReportPage method Failed " + e);
		}
	}

	public void clickCancelButtonPrintReportPage() {
		try {
			seleniumFunctions.waitForElement(startTransfusionPage.cancelButtonPrintReportPage);
			startTransfusionPage.cancelButtonPrintReportPage.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: clickCancelButtonPrintReportPage method Failed " + e);
		}
	}
	/*
	 * public void scanRacipientMRN(String a) throws InterruptedException {
	 * 
	 * actions= new Actions(IEDriver.ieDriver);
	 * actions.keyDown(Keys.ALT).perform();
	 * starttranspage.textboxRacipientMRN().sendKeys("["); Thread.sleep(1000);
	 * starttranspage.textboxRacipientMRN().sendKeys(a); Thread.sleep(1000);
	 * actions.keyDown(Keys.ALT).perform();
	 * starttranspage.textboxRacipientMRN().sendKeys("]"); //Thread.sleep(1000);
	 * }
	 * 
	 * 
	 * public void scanRacipientISBTUnitNumber(String a) throws
	 * InterruptedException { actions= new Actions(IEDriver.ieDriver);
	 * actions.keyDown(Keys.ALT).perform();
	 * starttranspage.scanRacipientUnitNumber().sendKeys("[");
	 * //Thread.sleep(1000);
	 * starttranspage.scanRacipientUnitNumber().sendKeys(a);
	 * //Thread.sleep(1000); actions.keyDown(Keys.ALT).perform();
	 * starttranspage.scanRacipientUnitNumber().sendKeys("]"); }
	 * 
	 * public void scanDonorUnitNumber(String a) throws InterruptedException {
	 * actions= new Actions(IEDriver.ieDriver);
	 * actions.keyDown(Keys.ALT).perform();
	 * starttranspage.donorScanUnitNumber().sendKeys("["); Thread.sleep(1000);
	 * starttranspage.donorScanUnitNumber().sendKeys(a); Thread.sleep(1000);
	 * actions.keyDown(Keys.ALT).perform();
	 * starttranspage.donorScanUnitNumber().sendKeys("]"); }
	 * 
	 * public void scanDonorUnitDivision(String a) throws InterruptedException {
	 * actions= new Actions(IEDriver.ieDriver);
	 * actions.keyDown(Keys.ALT).perform();
	 * starttranspage.donorUnitDivision().sendKeys("["); //Thread.sleep(1000);
	 * starttranspage.donorUnitDivision().sendKeys(a); //Thread.sleep(1000);
	 * actions.keyDown(Keys.ALT).perform();
	 * starttranspage.donorUnitDivision().sendKeys("]"); }
	 * 
	 * public void selectDonorBloodProduct(String a) throws InterruptedException
	 * { element = starttranspage.donorBloodProductDeivisionExist(); sel = new
	 * Select(element); sel.selectByVisibleText(a); }
	 * 
	 * public void scanDonorBloodProduct(String a) throws InterruptedException {
	 * actions= new Actions(IEDriver.ieDriver);
	 * actions.keyDown(Keys.ALT).perform();
	 * starttranspage.donorBloodProductDropDown().sendKeys("[");
	 * //Thread.sleep(1000);
	 * starttranspage.donorBloodProductDropDown().sendKeys(a);
	 * //Thread.sleep(1000); actions.keyDown(Keys.ALT).perform();
	 * starttranspage.donorBloodProductDropDown().sendKeys("]");
	 * //Thread.sleep(1000); }
	 * 
	 * public void scanDonorBloodProductLookupfield(String a) throws
	 * InterruptedException { actions= new Actions(IEDriver.ieDriver);
	 * actions.keyDown(Keys.ALT).perform();
	 * starttranspage.isbtDonorBloodProductLookup().sendKeys("[");
	 * //Thread.sleep(1000);
	 * starttranspage.isbtDonorBloodProductLookup().sendKeys(a);
	 * //Thread.sleep(1000); actions.keyDown(Keys.ALT).perform();
	 * starttranspage.isbtDonorBloodProductLookup().sendKeys("]");
	 * //Thread.sleep(1000); }
	 * 
	 * public void selectDonorBloodProductDonationType(int a) { element =
	 * starttranspage.donorBloodProductDonationType(); sel = new
	 * Select(element); sel.selectByIndex(a); }
	 * 
	 * public void selectDonorBloodType(String a) throws InterruptedException {
	 * element = starttranspage.donorBloodTypeDropDown(); sel = new
	 * Select(element); sel.selectByVisibleText(a); }
	 */
}
