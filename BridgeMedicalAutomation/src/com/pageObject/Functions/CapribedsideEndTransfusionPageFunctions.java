package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideEndTransfusionPage;

public class CapribedsideEndTransfusionPageFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideEndTransfusionPage endtransfusionpage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideEndTransfusionPage.class);

	public void enterUnitNumber(String unitNumber) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.unitNumberTextbox);
			endtransfusionpage.unitNumberTextbox.sendKeys(unitNumber);

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: enterUnitNumber method Failed " + e);
		}

	}

	public void enterUnitNumberDivision(String unitNumberDivision) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.unitNumberDivisionTextbox);
			endtransfusionpage.unitNumberDivisionTextbox.sendKeys(unitNumberDivision);

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: enterUnitNumberDivision method Failed " + e);
		}

	}

	public void selectBloodProduct(String bloodProdcut) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.bloodProductDropDown);
			seleniumFunctions.selectValueByVisibleText(endtransfusionpage.bloodProductDropDown, bloodProdcut);

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: selectBloodProduct method Failed " + e);
		}

	}

	public void clickContinueButtonUnitProductSection() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.continueButtonUnitProductSection);
			endtransfusionpage.continueButtonUnitProductSection.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: clickContinueButtonUnitProductSection method Failed "
							+ e);
		}

	}

	public void clickExitButtonUnitProductSection() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.exitButtonUnitProductSection);
			endtransfusionpage.continueButtonUnitProductSection.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: clickExitButtonUnitProductSection method Failed " + e);
		}

	}

	public void clickEndTransfusionDateTimeLinkVolumePage() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.changeEndTransfusionDateTimeLinkVolumePage);
			endtransfusionpage.changeEndTransfusionDateTimeLinkVolumePage.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: clickEndTransfusionDateTimeLinkVolumePage method Failed "
							+ e);
		}

	}

	public void enterEndTransfusionDateTime(String endTransfusionDateTime) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.endTransfusionDateTimeTextboxVolumePage);
			endtransfusionpage.endTransfusionDateTimeTextboxVolumePage.sendKeys(endTransfusionDateTime);

		} catch (Exception e) {
			System.out
					.println("CapribedsideEndTransfusionPageFunctions: enterEndTransfusionDateTime method Failed " + e);
		}

	}

	public void enterVolumeTransferred(String volumeTransferred) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.volumeTransferredTextbox);
			endtransfusionpage.volumeTransferredTextbox.clear();
			endtransfusionpage.volumeTransferredTextbox.sendKeys(volumeTransferred);

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: enterVolumeTransferred method Failed " + e);
		}

	}

	public void selectTransfusionReaction(String transfusionReaction) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.transfusionReactionDropdown);
			seleniumFunctions.selectValueByVisibleText(endtransfusionpage.transfusionReactionDropdown,
					transfusionReaction);

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: selectTransfusionReaction method Failed " + e);
		}

	}

	public void enterCommentVolumePage(String comment) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.endTransfusionCommentTextboxVolumePage);
			endtransfusionpage.endTransfusionCommentTextboxVolumePage.sendKeys(comment);

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: enterCommentVolumePage method Failed " + e);
		}

	}

	public void clickContinueVolumePage() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.continueVolumePage);
			endtransfusionpage.continueVolumePage.click();

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: clickContinueVolumePage method Failed " + e);
		}

	}

	public void clickCancelVolumePage() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.cancelVolumePage);
			endtransfusionpage.cancelVolumePage.click();

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: clickVolumePage method Failed " + e);
		}

	}

	public void checkElevatedTemperatureChackbox() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.elevatedTempCheckbox);
			endtransfusionpage.elevatedTempCheckbox.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: checkElevatedTemperatureChackbox method Failed " + e);
		}

	}

	public void checkAnaphylaxisChackbox() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.anaphylaxisTempCheckbox);
			endtransfusionpage.anaphylaxisTempCheckbox.click();

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: checkAnaphylaxisChackbox method Failed " + e);
		}

	}

	public void checkHypotensionOrPainChackbox() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.hypotensionOrPainCheckbox);
			endtransfusionpage.hypotensionOrPainCheckbox.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: checkHypotensionOrPainChackbox method Failed " + e);
		}

	}

	public void enterCommentForClinicalSignsAndSymptoms(String clinicalSignsComment) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.commentTextboxClinicalSignsAndSymptomsPage);
			endtransfusionpage.commentTextboxClinicalSignsAndSymptomsPage.sendKeys(clinicalSignsComment);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: enterCommentForClinicalSignsAndSymptoms method Failed "
							+ e);
		}

	}

	public void clickContinueButtonClinicalSignsAndSymptomsPage() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.continueButtonClinicalSignsAndSymptomsPage);
			endtransfusionpage.continueButtonClinicalSignsAndSymptomsPage.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: clickContinueButtonClinicalSignsAndSymptomsPage method Failed "
							+ e);
		}

	}

	public void clickExitButtonClinicalSignsAndSymptomsPage() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.exitButtonClinicalSignsAndSymptomsPage);
			endtransfusionpage.exitButtonClinicalSignsAndSymptomsPage.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: clickExitButtonClinicalSignsAndSymptomsPage method Failed "
							+ e);
		}

	}

	public void clickContinueButtonReactionInstructionsPage() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.continueButtonReactionInstructionsPage);
			endtransfusionpage.continueButtonReactionInstructionsPage.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: clickContinueButtonReactionInstructionsPage method Failed "
							+ e);
		}

	}

	public void clickExitButtonReactionInstructionsPage() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.exitButtonReactionInstructionsPage);
			endtransfusionpage.exitButtonReactionInstructionsPage.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: clickExitButtonClinicalSignsAndSymptomsPage method Failed "
							+ e);
		}

	}

	public void enterTemperatureVitalsPage(String temperature) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.vitalsTemperatureFahrenheitTextbox);
			endtransfusionpage.vitalsTemperatureFahrenheitTextbox.sendKeys(temperature);

		} catch (Exception e) {
			System.out
					.println("CapribedsideEndTransfusionPageFunctions: enterTemperatureVitalsPage method Failed " + e);
		}

	}

	public void selectTemperatureSite(String temperatureSite) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.vitalsTemperatureSiteDropdown);
			seleniumFunctions.selectValueByVisibleText(endtransfusionpage.vitalsTemperatureSiteDropdown,
					temperatureSite);

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: selectTemperatureSite method Failed " + e);
		}

	}

	public void enterVitalsHeartRate(String heartRate) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.vitalsHeartRateTextbox);
			endtransfusionpage.vitalsHeartRateTextbox.sendKeys(heartRate);

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: enterVitalsHeartRate method Failed " + e);
		}

	}

	public void enterVitalsSystolicBloodPressure(String systolicBloodPressure) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.vitalsSystolicBloodPressureTextbox);
			endtransfusionpage.vitalsSystolicBloodPressureTextbox.sendKeys(systolicBloodPressure);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: enterVitalsSystolicBloodPressure method Failed " + e);
		}

	}

	public void enterVitalsDiastolicBloodPressure(String diastolicBloodPressure) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.vitalsDiastolicBloodPressureTextbox);
			endtransfusionpage.vitalsDiastolicBloodPressureTextbox.sendKeys(diastolicBloodPressure);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: enterVitalsSystolicBloodPressure method Failed " + e);
		}

	}

	public void checkVitalsPalpCheckBox() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.vitalsPalpCheckBox);
			endtransfusionpage.vitalsPalpCheckBox.click();

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: checkVitalsPalpCheckBox method Failed " + e);
		}

	}

	public void enterVitalsRespiration(String respirationValue) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.vitalsRespirationTextbox);
			endtransfusionpage.vitalsRespirationTextbox.sendKeys(respirationValue);

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: enterVitalsRespiration method Failed " + e);
		}

	}

	public void enterVitalsOxygenSaturation(String oxygenSaturationValue) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.vitalsOxygenSaturationTextBox);
			endtransfusionpage.vitalsOxygenSaturationTextBox.sendKeys(oxygenSaturationValue);

		} catch (Exception e) {
			System.out
					.println("CapribedsideEndTransfusionPageFunctions: enterVitalsOxygenSaturation method Failed " + e);
		}

	}

	public void enterVitalsComments(String vitalsComments) {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.vitalsCommentTextBox);
			endtransfusionpage.vitalsCommentTextBox.sendKeys(vitalsComments);

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: enterVitalsComments method Failed " + e);
		}

	}

	public void clickVitalsContinueButton() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.vitalsContinueButton);
			endtransfusionpage.vitalsContinueButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: clickVitalsContinueButton method Failed " + e);
		}

	}

	public void clickVitalsExitButton() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.vitalsExitButton);
			endtransfusionpage.vitalsExitButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: clickVitalsContinueButton method Failed " + e);
		}

	}

	public void clickPrintButton() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.printButton);
			endtransfusionpage.printButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: clickPrintButton method Failed " + e);
		}

	}

	public void clickCancelPrintButton() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.cancelPrintButton);
			endtransfusionpage.cancelPrintButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: clickCancelPrintButton method Failed " + e);
		}

	}

	public void clickYesButtonUnitNumberDoesNotMatchRecordedTransfusion() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.yesButtonUnitNumberDoesNotMatchRecordedTransfusion);
			endtransfusionpage.yesButtonUnitNumberDoesNotMatchRecordedTransfusion.click();

		} catch (Exception e) {
			System.out.println("CapribedsideEndTransfusionPageFunctions: clickCancelPrintButton method Failed " + e);
		}

	}

	public void clickNoButtonUnitNumberDoesNotMatchRecordedTransfusion() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.noButtonUnitNumberDoesNotMatchRecordedTransfusion);
			endtransfusionpage.noButtonUnitNumberDoesNotMatchRecordedTransfusion.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: clickNoButtonUnitNumberDoesNotMatchRecordedTransfusion method Failed "
							+ e);
		}

	}

	public void clickYesButtonBloodProdDoesNotMatchRecordedTransfusion() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.yesButtonBloodProdDoesNotMatchRecordedTransfusion);
			endtransfusionpage.yesButtonBloodProdDoesNotMatchRecordedTransfusion.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: clickYesButtonBloodProdDoesNotMatchRecordedTransfusion method Failed "
							+ e);
		}

	}

	public void clickNoButtonBloodProdDoesNotMatchRecordedTransfusion() {
		try {
			seleniumFunctions.waitForElement(endtransfusionpage.noButtonBloodProdDoesNotMatchRecordedTransfusion);
			endtransfusionpage.noButtonBloodProdDoesNotMatchRecordedTransfusion.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideEndTransfusionPageFunctions: clickNoButtonBloodProdDoesNotMatchRecordedTransfusion method Failed "
							+ e);
		}

	}

	/*
	 * public void selectBlodProduct(int a) { element =
	 * endtransfusionpage.dropDownBloodProduct(); sel = new Select(element);
	 * sel.selectByIndex(a); }
	 * 
	 * public void selectTransfusionReactionAnswer(String a) { element =
	 * endtransfusionpage.dropdownTransfusionReaction(); sel = new
	 * Select(element); sel.selectByValue(a); }
	 * 
	 * public void selectVitalsTempSite(int a) throws InterruptedException {
	 * element = endtransfusionpage.vitalsTempSiteTextBox(); sel = new
	 * Select(element); sel.selectByIndex(a);
	 * 
	 * }
	 */
}
