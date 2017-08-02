package com.pageObject.Functions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.bridge.utilities.IEDriver;
import com.pageObjects.CapribedsideAdministerBottlesPage;

public class CapribedsideAdministerBottlesFunctions {

	CapribedsideAdministerBottlesPage administerBottle = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideAdministerBottlesPage.class);

	/*************
	
	 *  Method to enter bottleID to Administer
	 
	 *************/
	public void enterBottleID(String bottleID) {
		try {
			administerBottle.bottleNumberTextBox.clear();
			administerBottle.bottleNumberTextBox.sendKeys(bottleID);
		} catch (Exception e) {
			System.out.println("Administer Bottle Page: unable to enter bottleID" + e);
		}
	}

	// Method to enter volume to Administer
	public void enterVoluem(String volume) {
		try {
			administerBottle.volumeTextBox.clear();
			administerBottle.volumeTextBox.sendKeys(volume);
		} catch (Exception e) {
			System.out.println("Administer Bottle Page: unable to enter volume" + e);
		}
	}

	// Method to verify warning popup
	public void verifyWarningPopup() {
		try {
			Assert.assertTrue(administerBottle.warningPopup.isDisplayed());
		} catch (Exception e) {
			System.out.println("Administer Bottle Page: Warning popup is not displayed" + e);
		}
	}

	// Method to click yes button from warning popup.
	public void clickWarninPopupYesButton() {
		try {
			administerBottle.warningPopupYesButton.click();
		} catch (Exception e) {
			System.out.println(
					"Administer Bottle Page: Not able to click Yes button from warning popup" + e.getStackTrace());
		}
	}

	// Method to click no button from warning popup.
	public void clickWarninPopupNoButton() {
		try {
			administerBottle.warningPopupNoButton.click();
		} catch (Exception e) {
			System.out.println(
					"Administer Bottle Page: Not able to click No button from warning popup" + e.getStackTrace());
		}
	}

	// Method to verify error meaage when we enter donor bottle to administer.
	public void verifyDonorBottleErrorMessage() {

		try {
			Assert.assertTrue(administerBottle.donorBottleErrorMessage.isDisplayed());
		} catch (Exception e) {
			Reporter.log(
					"Administer Bottle Page-verifyDonorBottleErrorMessage: Dornor Bottle error message is not displayed");
			System.out.println("Administer Bottle Page: Dornor Bottle error message is not displayed" + e);
		}
	}

	// Method to click on confirm button.
	public void clickConfirmButton() {
		try {
			administerBottle.confirmButton.click();
		} catch (Exception e) {
			System.out.println("Administer Bottle Page: Unable to click Confirm button" + e.getStackTrace());
		}
	}

	// Method to click on exit button.
	public void clickExitButton() {
		try {
			administerBottle.exitButton.click();
		} catch (Exception e) {
			System.out.println("Administer Bottle Page: Unable to click Exit button" + e.getStackTrace());
		}
	}

	public void verifyBottleConnotBeAdministerForThisPatientErrorMsg() {

		try {
			Assert.assertTrue(administerBottle.bottleConnotBeAdministerForThisPatientErrorMsg.isDisplayed());
		} catch (Exception e) {
			System.out.println("Administer Bottle Page: Bottle Connot be Administer For This Patient error message is not displayed"+ e);
		}
	}
	
	public void verifyBottleNotReceivedErrorMsg() {

		try {
			Assert.assertTrue(administerBottle.bottleNotReceivedErrorMessage.isDisplayed());
		} catch (Exception e) {
			System.out.println("Administer Bottle Page-verifyBottleNotReceivedErrorMsg: Bottle not be received error message is not displayed"+ e);
		}
	}

}
