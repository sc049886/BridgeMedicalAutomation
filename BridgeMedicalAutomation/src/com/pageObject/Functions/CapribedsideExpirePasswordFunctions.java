package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideExpiredPasswordPage;

public class CapribedsideExpirePasswordFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideExpiredPasswordPage expiredPasswordPage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideExpiredPasswordPage.class);

	public void enterNewPassword(String newPassword) {
		try {
			seleniumFunctions.waitForElement(expiredPasswordPage.newPasswordTextbox);
			expiredPasswordPage.newPasswordTextbox.sendKeys(newPassword);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterNewPassword method Failed " + e);
		}

	}

	public void enterConfirmPassword(String confirmPassword) {
		try {
			seleniumFunctions.waitForElement(expiredPasswordPage.confirmPasswordTextbox);
			expiredPasswordPage.confirmPasswordTextbox.sendKeys(confirmPassword);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterNewPassword method Failed " + e);
		}

	}

	public void clcikOkButton() {
		try {
			seleniumFunctions.waitForElement(expiredPasswordPage.okButton);
			expiredPasswordPage.okButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clcikOkButton method Failed " + e);
		}

	}

	public void clickCancelButton() {
		try {
			seleniumFunctions.waitForElement(expiredPasswordPage.cancelButton);
			expiredPasswordPage.cancelButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickCancelButton method Failed " + e);
		}

	}

}
