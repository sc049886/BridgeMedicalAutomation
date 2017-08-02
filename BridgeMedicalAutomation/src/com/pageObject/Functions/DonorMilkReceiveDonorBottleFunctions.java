package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.DonorMilkReceiveDonorBottlePage;

public class DonorMilkReceiveDonorBottleFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	DonorMilkReceiveDonorBottlePage receiveDonorBottlesPage = PageFactory.initElements(IEDriver.ieDriver,
			DonorMilkReceiveDonorBottlePage.class);

	public void eneterDonorBottleNumber(String donorBottleNumber) {
		try {
			seleniumFunctions.waitForElement(receiveDonorBottlesPage.donorBottleNumberTextbox);
			receiveDonorBottlesPage.donorBottleNumberTextbox.sendKeys(donorBottleNumber);

		} catch (Exception e) {
			System.out.println("DonorMilkReceiveDonorBottleFunctions: eneterDonorBottleNumber method Failed " + e);
		}

	}

	public void enterExpireDate(String expireDate) {
		try {
			seleniumFunctions.waitForElement(receiveDonorBottlesPage.expireDateTextbox);
			receiveDonorBottlesPage.expireDateTextbox.sendKeys(expireDate);

		} catch (Exception e) {
			System.out.println("DonorMilkReceiveDonorBottleFunctions: enterExpireDate method Failed " + e);
		}

	}

	public void enterKiloCalories(String calories) {
		try {
			seleniumFunctions.waitForElement(receiveDonorBottlesPage.kiloCaloriesTextbox);
			receiveDonorBottlesPage.kiloCaloriesTextbox.sendKeys(calories);

		} catch (Exception e) {
			System.out.println("DonorMilkReceiveDonorBottleFunctions: enterKiloCalories method Failed " + e);
		}

	}

	public void clickConfirmButton() {
		try {
			seleniumFunctions.waitForElement(receiveDonorBottlesPage.confirmButton);
			receiveDonorBottlesPage.confirmButton.click();

		} catch (Exception e) {
			System.out.println("DonorMilkReceiveDonorBottleFunctions: clickConfirmButton method Failed " + e);
		}

	}

	public void clickExitButton() {
		try {
			seleniumFunctions.waitForElement(receiveDonorBottlesPage.exitButton);
			receiveDonorBottlesPage.exitButton.click();

		} catch (Exception e) {
			System.out.println("DonorMilkReceiveDonorBottleFunctions: clickExitButton method Failed " + e);
		}

	}

	public void clickYesButtonExpireBottleWarning() {
		try {
			seleniumFunctions.waitForElement(receiveDonorBottlesPage.yesButtonExpireBottleWarning);
			receiveDonorBottlesPage.yesButtonExpireBottleWarning.click();

		} catch (Exception e) {
			System.out.println("DonorMilkReceiveDonorBottleFunctions: clickExitButton method Failed " + e);
		}

	}

	public void clickNoButtonExpireBottleWarning() {
		try {
			seleniumFunctions.waitForElement(receiveDonorBottlesPage.noButtonExpireBottleWarning);
			receiveDonorBottlesPage.noButtonExpireBottleWarning.click();

		} catch (Exception e) {
			System.out.println(
					"DonorMilkReceiveDonorBottleFunctions: clickNoButtonExpireBottleWarning method Failed " + e);
		}

	}

	/*
	 * public void scanDonorBottleID(String a) throws InterruptedException {
	 * actions= new Actions(IEDriver.ieDriver);
	 * actions.keyDown(Keys.ALT).perform();
	 * donormilkrecievepage.donorBottleNumber().sendKeys("[");
	 * //Thread.sleep(1000);
	 * donormilkrecievepage.donorBottleNumber().sendKeys(a);
	 * //Thread.sleep(1000); actions.keyDown(Keys.ALT).perform();
	 * donormilkrecievepage.donorBottleNumber().sendKeys("]");
	 * //Thread.sleep(1000); }
	 */
}
