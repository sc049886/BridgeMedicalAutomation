package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsidePrepareBottlesPage;

public class CapribedsidePrepareBottlesFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsidePrepareBottlesPage prepareBottlesPage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsidePrepareBottlesPage.class);

	public void enterBottleNumber(String bottleNumber) {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.bottleNumberTextbox);
			prepareBottlesPage.bottleNumberTextbox.sendKeys(bottleNumber);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterBottleNumber method Failed " + e);
		}

	}

	public void enterExpirationDater(String expirationDate) {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.expirationDateTextbox);
			prepareBottlesPage.expirationDateTextbox.sendKeys(expirationDate);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterExpirationDater method Failed " + e);
		}

	}

	public void enterThawDate(String thawDate) {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.thawDateTextbox);
			prepareBottlesPage.thawDateTextbox.sendKeys(thawDate);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterThawDate method Failed " + e);
		}

	}

	public void clickDivideLink() {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.divideLink);
			prepareBottlesPage.divideLink.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickDivideLink method Failed " + e);
		}

	}

	public void checkCancelFortifiersCheckbox() {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.cancelFortifiersCheckbox);
			prepareBottlesPage.cancelFortifiersCheckbox.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: checkCancelFortifiersCheckbox method Failed " + e);
		}

	}

	public void checkDisposeCheckbox() {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.disposeCheckbox);
			prepareBottlesPage.disposeCheckbox.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: checkDisposeCheckbox method Failed " + e);
		}

	}

	public void checkReprintLableCheckbox() {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.reprintLableCheckbox);
			prepareBottlesPage.reprintLableCheckbox.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: checkReprintLableCheckbox method Failed " + e);
		}

	}

	public void enterComment(String comments) {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.commentsTextbox);
			prepareBottlesPage.commentsTextbox.sendKeys(comments);

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: enterComment method Failed " + e);
		}

	}

	public void clickConfirmButton() {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.confirmButton);
			prepareBottlesPage.confirmButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickConfirmButton method Failed " + e);
		}

	}

	public void clickExitButton() {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.exitButton);
			prepareBottlesPage.exitButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickExitButton method Failed " + e);
		}

	}

	public void verifyWarningPopup() {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.warningPopup);
			Assert.assertTrue(prepareBottlesPage.warningPopup.isDisplayed(), "Warning Popup is Displayed");

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: verifyWarningPopup method Failed " + e);
		}

	}

	public void clickYesButtonWarningPopup() {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.yesButtonWarningPopup);
			prepareBottlesPage.yesButtonWarningPopup.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickYesButtonWarningPopup method Failed " + e);
		}

	}

	public void clickNoButtonWarningPopup() {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.noButtonWarningPopup);
			prepareBottlesPage.noButtonWarningPopup.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickNoButtonWarningPopup method Failed " + e);
		}

	}

	public void verifyDonorWarningPopup() {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.donorWarningPopup);
			Assert.assertTrue(prepareBottlesPage.donorWarningPopup.isDisplayed(), "Donor Warning Popup is displayed");

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: verifyDonorWarningPopup method Failed " + e);
		}

	}

	public void clickYesButtonDonorWarningPopup() {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.yesButtonDonorWarningPopup);
			prepareBottlesPage.yesButtonDonorWarningPopup.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickYesButtonDonorWarningPopup method Failed " + e);
		}

	}

	public void clickNoButtonDonorWarningPopup() {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.noButtonDonorWarningPopup);
			prepareBottlesPage.noButtonDonorWarningPopup.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickNoButtonDonorWarningPopup method Failed " + e);
		}

	}

	public void verifyBottleNotRecievedErrorMessage() {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.bottleNotReceivedErrorMessage);
			Assert.assertTrue(prepareBottlesPage.bottleNotReceivedErrorMessage.isDisplayed(), "Bottlenot received error message is displayed");

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: verifyBottleNotRecievedErrorMessage method Failed " + e);
		}
	}

	public void clickPrintDividedBottleButton() {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.printDividedBottleButton);
			prepareBottlesPage.printDividedBottleButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickPrintDividedBottleButton method Failed " + e);
		}
	}

	public void clickCancelPrintDivideBottleButton() {
		try {
			seleniumFunctions.waitForElement(prepareBottlesPage.cancelPrintDivideBottleButton);
			prepareBottlesPage.cancelPrintDivideBottleButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickCancelPrintDivideBottleButton method Failed " + e);
		}
	}

}
