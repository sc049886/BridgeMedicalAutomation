package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.Constants;
import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.DonorMilkMainMenuPage;

public class DonorMilkMainMenuFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	DonorMilkMainMenuPage donorMilkMainMenuPage = PageFactory.initElements(IEDriver.ieDriver,
			DonorMilkMainMenuPage.class);

	public void clickReceiveDonorBottlesButton() {
		try {
			seleniumFunctions.waitForElement(donorMilkMainMenuPage.receiveDonorBottleButton);
			donorMilkMainMenuPage.receiveDonorBottleButton.click();

		} catch (Exception e) {
			System.out.println("DonorMilkMainMenuFunctions: clickReceiveDonorBottlesButton method Failed " + e);
		}

	}

	public void clickPrintDonorLabelsButton() {
		try {
			seleniumFunctions.waitForElement(donorMilkMainMenuPage.printDonorLabelsButton);
			donorMilkMainMenuPage.printDonorLabelsButton.click();

		} catch (Exception e) {
			System.out.println("DonorMilkMainMenuFunctions: clickPrintDonorLabelsButton method Failed " + e);
		}

	}

	public void clickReserveOrReleaseButton() {
		try {
			seleniumFunctions.waitForElement(donorMilkMainMenuPage.reserveOrReleaseButton);
			donorMilkMainMenuPage.reserveOrReleaseButton.click();

		} catch (Exception e) {
			System.out.println("DonorMilkMainMenuFunctions: clickReserveOrReleaseButton method Failed " + e);
		}

	}

	public void clickCombineDonorMilkButton() {
		try {
			seleniumFunctions.waitForElement(donorMilkMainMenuPage.combineDonorMilkButton);
			donorMilkMainMenuPage.combineDonorMilkButton.click();

		} catch (Exception e) {
			System.out.println("DonorMilkMainMenuFunctions: clickCombineDonorMilkButton method Failed " + e);
		}

	}

	public void clickBrowseBottleHistoryButton() {
		try {
			seleniumFunctions.waitForElement(donorMilkMainMenuPage.browseBottleHistoryButton);
			donorMilkMainMenuPage.browseBottleHistoryButton.click();

		} catch (Exception e) {
			System.out.println("DonorMilkMainMenuFunctions: clickBrowseBottleHistoryButton method Failed " + e);
		}

	}

	public void clickAvailablePatientBottleButton() {
		try {
			seleniumFunctions.waitForElement(donorMilkMainMenuPage.availablePatientBottleButton);
			donorMilkMainMenuPage.availablePatientBottleButton.click();

		} catch (Exception e) {
			System.out.println("DonorMilkMainMenuFunctions: clickAvailablePatientBottleButton method Failed " + e);
		}

	}

	public void clickStateChangeButton() {
		try {
			seleniumFunctions.waitForElement(donorMilkMainMenuPage.stateChangeButton);
			donorMilkMainMenuPage.stateChangeButton.click();

		} catch (Exception e) {
			System.out.println("DonorMilkMainMenuFunctions: clickStateChangeButton method Failed " + e);
		}

	}

	public void clickPrintFormulaLabelsButton() {
		try {
			seleniumFunctions.waitForElement(donorMilkMainMenuPage.printFormulaLabelsButton);
			donorMilkMainMenuPage.printFormulaLabelsButton.click();

		} catch (Exception e) {
			System.out.println("DonorMilkMainMenuFunctions: clickPrintFormulaLabelsButton method Failed " + e);
		}

	}

	public void clickBrowseFormulaBottleHistoryButton() {
		try {
			seleniumFunctions.waitForElement(donorMilkMainMenuPage.browseFormulaBottleHistoryButton);
			donorMilkMainMenuPage.browseFormulaBottleHistoryButton.click();

		} catch (Exception e) {
			System.out.println("DonorMilkMainMenuFunctions: clickBrowseFormulaBottleHistoryButton method Failed " + e);
		}

	}

	public void clickHomeLink() {
		try {
			seleniumFunctions.waitForElement(donorMilkMainMenuPage.homeLink);
			donorMilkMainMenuPage.homeLink.click();

		} catch (Exception e) {
			System.out.println("DonorMilkMainMenuFunctions: clickHomeLink method Failed " + e);
		}

	}

	public void clickLogoutLink() {
		try {
			seleniumFunctions.waitForElement(donorMilkMainMenuPage.logoutLink);
			donorMilkMainMenuPage.logoutLink.click();

		} catch (Exception e) {
			System.out.println("DonorMilkMainMenuFunctions: clickLogoutLink method Failed " + e);
		}

	}

	public void clickHelpLink() {
		try {
			seleniumFunctions.waitForElement(donorMilkMainMenuPage.helpLink);
			donorMilkMainMenuPage.helpLink.click();

		} catch (Exception e) {
			System.out.println("DonorMilkMainMenuFunctions: clickHelpLink method Failed " + e);
		}

	}

}
