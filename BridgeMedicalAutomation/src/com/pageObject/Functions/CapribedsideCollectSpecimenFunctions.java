package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideCollectSpecimenPage;

public class CapribedsideCollectSpecimenFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideCollectSpecimenPage collectSpecimenPage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideCollectSpecimenPage.class);

	public void checkOrderMetabolicCheckbox() {
		try {
			seleniumFunctions.waitForElement(collectSpecimenPage.orderMetabolicCheckbox);
			collectSpecimenPage.orderMetabolicCheckbox.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: checkOrderMetabolicCheckbox method Failed " + e);
		}

	}

	public void clickChangeDateTimeButton() {
		try {
			seleniumFunctions.waitForElement(collectSpecimenPage.changeDateTimeButton);
			collectSpecimenPage.changeDateTimeButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickChangeDateTimeButton method Failed " + e);
		}

	}

	public void clickExitButton() {
		try {
			seleniumFunctions.waitForElement(collectSpecimenPage.exitButton);
			collectSpecimenPage.exitButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickExitButton method Failed " + e);
		}

	}

	public void clickYesButtonExitPopup() {
		try {
			seleniumFunctions.waitForElement(collectSpecimenPage.yesButtonExitPopup);
			collectSpecimenPage.yesButtonExitPopup.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickYesButtonExitPopup method Failed " + e);
		}

	}

	public void clickNoButtonExitPopup() {
		try {
			seleniumFunctions.waitForElement(collectSpecimenPage.noButtonExitPopup);
			collectSpecimenPage.noButtonExitPopup.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickNoButtonExitPopup method Failed " + e);
		}

	}

}
