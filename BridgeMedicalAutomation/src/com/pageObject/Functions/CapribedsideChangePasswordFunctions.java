package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideChangePasswordPage;

public class CapribedsideChangePasswordFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideChangePasswordPage changePasswordPage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideChangePasswordPage.class);

	public void enterUserId(String userId) {
		try {
			seleniumFunctions.waitForElement(changePasswordPage.currentUserIDTextbox);
			changePasswordPage.currentUserIDTextbox.sendKeys(userId);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterUserId method Failed " + e);
		}

	}

	public void enterPassword(String password) {
		try {
			seleniumFunctions.waitForElement(changePasswordPage.confirmPasswordTextbox);
			changePasswordPage.confirmPasswordTextbox.sendKeys(password);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterUserId method Failed " + e);
		}

	}

	public void enterNewPassword(String newPassword) {
		try {
			seleniumFunctions.waitForElement(changePasswordPage.newPasswordTextbox);
			changePasswordPage.newPasswordTextbox.sendKeys(newPassword);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterNewPassword method Failed " + e);
		}

	}

	public void enterConfirmPassword(String confirmPassword) {
		try {
			seleniumFunctions.waitForElement(changePasswordPage.confirmPasswordTextbox);
			changePasswordPage.confirmPasswordTextbox.sendKeys(confirmPassword);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterConfirmPassword method Failed " + e);
		}

	}

	public void clickOkButton() {
		try {
			seleniumFunctions.waitForElement(changePasswordPage.OkButton);
			changePasswordPage.OkButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickOkButton method Failed " + e);
		}

	}

	public void clickCancelButton() {
		try {
			seleniumFunctions.waitForElement(changePasswordPage.cancelButton);
			changePasswordPage.cancelButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickCancelButton method Failed " + e);
		}

	}
}
