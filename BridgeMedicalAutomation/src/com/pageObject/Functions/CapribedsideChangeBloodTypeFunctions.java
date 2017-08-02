package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideChangeBloodTypePage;

import multiScreenShot.MultiScreenShot;

public class CapribedsideChangeBloodTypeFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	// IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideChangeBloodTypePage changeBloodTypePage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideChangeBloodTypePage.class);
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/", "CapribedsideChangeBloodTypeFunctions");

	public void selectNewBloodType(String newBloodType) {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.newBloodTypeDropdown);
			seleniumFunctions.selectValueByVisibleText(changeBloodTypePage.newBloodTypeDropdown, newBloodType);

		} catch (Exception e) {
			System.out.println("CapribedsideChangeBloodTypeFunctions: selectNewBloodType method Failed " + e);
		}

	}

	public void verifyNewBloodTypeDropDownDisplay() {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.newBloodTypeDropdown);
			Assert.assertTrue(changeBloodTypePage.newBloodTypeDropdown.isDisplayed(),
					"newBloodTypeDropdown is displayed");

		} catch (Exception e) {
			System.out.println(
					"CapribedsideChangeBloodTypeFunctions: verifyNewBloodTypeDropDownDisplay method Failed " + e);
		}

	}

	public void selectConfirmNewBloodType(String confirmNewBloodType) {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.confirmNewBloodTypeDropdown);
			seleniumFunctions.selectValueByVisibleText(changeBloodTypePage.confirmNewBloodTypeDropdown,
					confirmNewBloodType);

		} catch (Exception e) {
			System.out.println("CapribedsideChangeBloodTypeFunctions: selectConfirmNewBloodType method Failed " + e);
		}

	}

	public void verifyConfirmBloodTypeDropDownDisplay() {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.confirmNewBloodTypeDropdown);
			Assert.assertTrue(changeBloodTypePage.confirmNewBloodTypeDropdown.isDisplayed(),
					"confirmNewBloodTypeDropdown is displayed");

		} catch (Exception e) {
			System.out.println(
					"CapribedsideChangeBloodTypeFunctions: verifyConfirmBloodTypeDropDownDisplay method Failed " + e);
		}

	}

	public void selectReasonBloodChange(String reasonBloodChange) {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.reasonForBloodTypeChangeDropdown);
			seleniumFunctions.selectValueByVisibleText(changeBloodTypePage.reasonForBloodTypeChangeDropdown,
					reasonBloodChange);

		} catch (Exception e) {
			System.out.println("CapribedsideChangeBloodTypeFunctions: selectReasonBloodChange method Failed " + e);
		}

	}

	public void clickReasonForBloodChangeDropDown() {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.reasonForBloodTypeChangeDropdown);
			changeBloodTypePage.reasonForBloodTypeChangeDropdown.click();

		} catch (Exception e) {
			System.out.println(
					"CapribedsideChangeBloodTypeFunctions: clickReasonForBloodChangeDropDown method Failed " + e);
		}

	}

	public void verifyReasonForChangeBloodTypeDropDownDisplay() {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.reasonForBloodTypeChangeDropdown);
			Assert.assertTrue(changeBloodTypePage.reasonForBloodTypeChangeDropdown.isDisplayed(),
					"verifyReasonForChangeBloodTypeDropDownDisplay is displayed");

		} catch (Exception e) {
			System.out.println(
					"CapribedsideChangeBloodTypeFunctions: verifyReasonForChangeBloodTypeDropDownDisplay method Failed "
							+ e);
		}

	}

	public void enterUserId(String userId) {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.userIDTextbox);
			changeBloodTypePage.userIDTextbox.sendKeys(userId);
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("CapribedsideChangeBloodTypeFunctions: enterUserId method Failed " + e);
		}

	}

	public void enterPassword(String password) {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.passwordTextbox);
			changeBloodTypePage.passwordTextbox.sendKeys(password);
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("CapribedsideChangeBloodTypeFunctions: enterPassword method Failed " + e);
		}

	}
	public void navigateToEnterPasswordTextBox() {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.passwordTextbox);
			changeBloodTypePage.passwordTextbox.click();
			Thread.sleep(1000);

		} catch (Exception e) {
			System.out.println("CapribedsideChangeBloodTypeFunctions: navigateToEnterPasswordTextBox method Failed " + e);
		}

	}
	public void clickConfirmButton() {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.confirmButton);
			changeBloodTypePage.confirmButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideChangeBloodTypeFunctions: clickConfirmButton method Failed " + e);
		}

	}

	public void clickExitButton() {
		try {
			seleniumFunctions.waitForElement(changeBloodTypePage.exitButton);
			changeBloodTypePage.exitButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideChangeBloodTypeFunctions: clickExitButton method Failed " + e);
		}

	}

	public String getCurrentBloodType() {
		{
			// String actualBloodType;
			String currentBloodType = changeBloodTypePage.currentBloodTypeVisibleText.getText();
			System.out.println(currentBloodType);
			return currentBloodType;
		}
		// return null;
	}

	public void changeBloodType(String bloodType,String confirmBloodType,String reasonForChange) throws Throwable {
		selectNewBloodType(bloodType);
		selectConfirmNewBloodType(confirmBloodType);
		clickReasonForBloodChangeDropDown();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		selectReasonBloodChange(reasonForChange);
	}
}
