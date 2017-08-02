package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideHoldTransfusionPage;

public class CapribedsideHoldTransfusionFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideHoldTransfusionPage holdTransfusionPage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideHoldTransfusionPage.class);

	public void enterUnitNumber(String unitNumber) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.unitNumberTextbox);
			holdTransfusionPage.unitNumberTextbox.sendKeys(unitNumber);

		} catch (Exception e) {
			System.out.println("CapribedsideHoldTransfusionFunctions: enterUnitNumber method Failed " + e);
		}

	}

	public void selectBloodProduct(String bloodProduct) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.bloodProductDroDown);
			seleniumFunctions.selectValueByVisibleText(holdTransfusionPage.bloodProductDroDown, bloodProduct);
		} catch (Exception e) {
			System.out
					.print("CapribedsideHoldTransfusionFunctions-selectBloodProduct :Method is failed");
		}

	}

	public void clickYesButtonExitHoldPopup() {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.yesButtonExitHoldPopup);
			holdTransfusionPage.yesButtonExitHoldPopup.click();

		} catch (Exception e) {
			System.out.println("CapribedsideHoldTransfusionFunctions: clickYesButtonExitHoldPopup method Failed " + e);
		}

	}

	public void clickNoButtonExitHoldPopup() {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.noButtonExitHoldPopup);
			holdTransfusionPage.noButtonExitHoldPopup.click();

		} catch (Exception e) {
			System.out.println("CapribedsideHoldTransfusionFunctions: clickNoButtonExitHoldPopup method Failed " + e);
		}

	}

	public void clickContinueButton() {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.continueButton);
			holdTransfusionPage.continueButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideHoldTransfusionFunctions: clickContinueButton method Failed " + e);
		}

	}

	public void clickExitButton() {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.exitButton);
			holdTransfusionPage.exitButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideHoldTransfusionFunctions: clickExitButton method Failed " + e);
		}

	}

	public void enterStartHoldDateAndTime(String startHoldDate) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.startHoldDateAndTimeTextbox);
			holdTransfusionPage.startHoldDateAndTimeTextbox.clear();
			holdTransfusionPage.startHoldDateAndTimeTextbox.sendKeys(startHoldDate);

		} catch (Exception e) {
			System.out.println("CapribedsideHoldTransfusionFunctions: enterStartHoldDateAndTimeTextbox method Failed " + e);
		}

	}

	public void selectReasonForHold(String reasonForHold) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.reasonForHoldDropdown);
			seleniumFunctions.selectValueByVisibleText(holdTransfusionPage.reasonForHoldDropdown, reasonForHold);

		} catch (Exception e) {
			System.out.println("CapribedsideHoldTransfusionFunctions: selectReasonForHold method Failed " + e);
		}

	}

	public void enterEndHoldDateAndTime(String endHoldDate) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.endHoldDateAndTimeTextbox);
			holdTransfusionPage.endHoldDateAndTimeTextbox.sendKeys(endHoldDate);

		} catch (Exception e) {
			System.out.println("CapribedsideHoldTransfusionFunctions: enterEndHoldDateAndTime method Failed " + e);
		}

	}

	public void enterComment(String comment) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.commentTextbox);
			holdTransfusionPage.commentTextbox.clear();
			holdTransfusionPage.commentTextbox.sendKeys(comment);

		} catch (Exception e) {
			System.out.println("CapribedsideHoldTransfusionFunctions: enterComment method Failed " + e);
		}

	}
	public void clickContinueHoldButton() {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.continueButtonHoldPage);
			holdTransfusionPage.continueButtonHoldPage.click();

		} catch (Exception e) {
			System.out.println("CapribedsideHoldTransfusionFunctions: clickContinueHoldButton method Failed " + e);
		}

	}
	public void clickExitHoldButton( ) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.exitButtonHoldPage);
			holdTransfusionPage.exitButtonHoldPage.click();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println("CapribedsideHoldTransfusionFunctions: clickExitHoldButton method Failed " + e);
		}

	}
	public void clickPrintButton( ) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.printButton);
			holdTransfusionPage.printButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideHoldTransfusionFunctions: clickPrintButton method Failed " + e);
		}

	}
	public void clickCancelPrintButton() {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.cancelPrintButton);
			holdTransfusionPage.cancelPrintButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideHoldTransfusionFunctions: clickCancelPrintButton method Failed " + e);
		}

	}
	public void verifyErrorMessageStartHoldAndTimeFieldRequiresValue( ) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.startHoldAndTimeFieldRequiresValueErrorMessage);
			Assert.assertTrue(holdTransfusionPage.startHoldAndTimeFieldRequiresValueErrorMessage.isDisplayed(), "Error message startHoldAndTimeFieldRequiresValue is  displayed");
		    System.out.println(holdTransfusionPage.startHoldAndTimeFieldRequiresValueErrorMessage.getText());
		} catch (Exception e) {
			System.out.println("CapribedsideHoldTransfusionFunctions: verifyErrorMessageStartHoldAndTimeFieldRequiresValue method Failed " + e);
		}

	}
	public void veriyErrorMessageReasonForHoldRequire( ) {
		try {
			seleniumFunctions.waitForElement(holdTransfusionPage.reasonForHoldRequiresErrorMessage);
			Assert.assertTrue(holdTransfusionPage.reasonForHoldRequiresErrorMessage.isDisplayed(), "Error message reasonForHoldRequiresErrorMessage is  displayed");
			System.out.println(holdTransfusionPage.reasonForHoldRequiresErrorMessage.getText());
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: veriyErrorMessageReasonForHoldRequire method Failed " + e);
		}

	}

}
