package com.pageObject.Functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.SystemManagerEditPocPage;

public class SystemManagerEditPocPageFunctions {

	SystemManagerEditPocPage editpocpage = PageFactory.initElements(IEDriver.ieDriver, SystemManagerEditPocPage.class);
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	WebElement element;
	Select sel;

	public void selectUtilizeSecondaryIdentifier(String a) {
		element = editpocpage.utilizeSecondaryIdentifier;
		sel = new Select(element);
		sel.selectByVisibleText(a);
	}

	public void selectOptionForCheckCenterCodes(String option) {
		try {
			seleniumFunctions.waitForElement(editpocpage.checkCenterCode);
			seleniumFunctions.selectValueByVisibleText(editpocpage.checkCenterCode, option);

		} catch (Exception e) {
			System.out.println("SystemManagerEditPocPageFunctions: selectConfirmNewBloodType method Failed " + e);
		}

	}

	public void selectOptionForTurnOffSecondaryIdCheckForTxWristband(String a) {
		element = editpocpage.turnOffSecondaryIdCheckForTxWristband;
		sel = new Select(element);
		sel.selectByVisibleText(a);
	}

	public void selectOptionRequireScanningInEndTransfusion(String a) {
		element = editpocpage.checkCenterCode;
		sel = new Select(element);
		sel.selectByValue(a);
	}

	public void selectYesOrNoForCheckCenterCode(String a) {
		element = editpocpage.checkCenterCode;
		sel = new Select(element);
		sel.selectByValue(a);
	}

	public void selectOptionForCheckPatientName(String a) {
		element = editpocpage.checkPatientName;
		sel = new Select(element);
		sel.selectByValue(a);
	}

	public void selectOptionForDisplayCommentsInStartTransfusion(String a) {
		element = editpocpage.checkDisplayCommentsInStartTransfusion;
		sel = new Select(element);
		sel.selectByValue(a);
	}

	public void selectOptionForRequireCosignOnBloodTypeMismatch(String a) {
		element = editpocpage.displayBothCelsiusAndFahrenheitFieldsForTemperature;
		sel = new Select(element);
		sel.selectByVisibleText(a);
	}

	public void selectOptionForRequireCosignature(String a) {
		element = editpocpage.requireCosignature;
		sel = new Select(element);
		sel.selectByValue(a);
	}

	public void selectOptionForDisplayCommentsInRapidStartTransfusion(String a) {
		element = editpocpage.displayCommentsInRapidStartTransfusion;
		sel = new Select(element);
		sel.selectByValue(a);
	}

	public void selectOptionPromptForUnitNumberDivisionField(String a) {
		element = editpocpage.promptForUnitNumberDivisionField;
		sel = new Select(element);
		sel.selectByValue(a);
	}

	public void selectOptionPromptForVolume(String option) {
		try {
			/*
			 * element = editpocpage.promptForVolume; sel = new Select(element);
			 * sel.selectByValue(a);
			 */
			seleniumFunctions.waitForElement(editpocpage.promptForVolume);
			seleniumFunctions.selectValueByVisibleText(editpocpage.promptForVolume, option);

		}

		catch (Exception e) {
			System.out.println("SystemManagerEditPocPageFunctions: selectConfirmNewBloodType method Failed " + e);
		}
	}

	public void selectOptionForCollectVitalSignsOnStartTransfusion(String a) {
		element = editpocpage.displayCommentsInRapidStartTransfusion;
		sel = new Select(element);
		sel.selectByValue(a);
	}

	public void selectOptionForCollectVitalSignsOnEndTransfusion(String a) {
		element = editpocpage.collectVitalSignsOnEndTransfusion;
		sel = new Select(element);
		sel.selectByVisibleText(a);
	}

	public void selectOptionForDisplayHeartRateSite(String a) {
		element = editpocpage.displayHeartRateSite;
		sel = new Select(element);
		sel.selectByVisibleText(a);
	}

	public void selectOptionForDisplayBloodPressureMethod(String a) {
		element = editpocpage.displayBloodPressureMethod;
		sel = new Select(element);
		sel.selectByVisibleText(a);
	}

	public void selectOptionForDisplayBothCelsiusAndFahrenheitFieldsForTemperature(String a) {
		element = editpocpage.displayBothCelsiusAndFahrenheitFieldsForTemperature;
		sel = new Select(element);
		sel.selectByVisibleText(a);
	}

	public void clickConfirmButton() {
		try {
			seleniumFunctions.waitForElement(editpocpage.buttonConfirm);
			editpocpage.buttonConfirm.click();

		} catch (Exception e) {
			System.out.println("SystemManagerPointsOfCareFunctions: clickConfirmButton method Failed " + e);
		}
	}

	public void clickCancelButton() {
		try {
			seleniumFunctions.waitForElement(editpocpage.buttonCancel);
			editpocpage.buttonCancel.click();

		} catch (Exception e) {
			System.out.println("SystemManagerEditPocPageFunctions: clickCancelButton method Failed " + e);
		}
	}
}
