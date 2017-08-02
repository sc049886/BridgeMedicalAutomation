package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideBrowseBottleHistoryPage;

public class CapribedsideBrowseBottleHistoryFunctions {

	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);

	CapribedsideBrowseBottleHistoryPage browsebottlehistory = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideBrowseBottleHistoryPage.class);

	public void clickBackButton() {
		try {
			seleniumFunctions.waitForElement(browsebottlehistory.backButton);
			browsebottlehistory.backButton.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickBackButton method Failed " + e);
		}

	}

	public void clickSortReceivedColumnLink() {
		try {
			seleniumFunctions.waitForElement(browsebottlehistory.sortReceivedColumnLink);
			browsebottlehistory.sortReceivedColumnLink.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickSortReceivedColumnLink method Failed " + e);
		}

	}

	public void clickEditDividedBottleLink() {
		try {
			seleniumFunctions.waitForElement(browsebottlehistory.editDevidedBottleLink);
			browsebottlehistory.editDevidedBottleLink.click();

		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: clickEditDividedBottleLink method Failed " + e);
		}

	}

	public void selectFinalStatusFilter(String finalStatus) {
		try {
			seleniumFunctions.waitForElement(browsebottlehistory.finalStatusFilter);
			seleniumFunctions.selectValueByVisibleText(browsebottlehistory.finalStatusFilter, finalStatus);
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: selectFinalStatusFilter method Failed " + e);

		}

	}

	public void selectStorageStateFilter(String storageState) {
		try {
			seleniumFunctions.waitForElement(browsebottlehistory.storageStateFilter);
			seleniumFunctions.selectValueByVisibleText(browsebottlehistory.storageStateFilter, storageState);
		} catch (Exception e) {
			System.out.println("BabyMatchSelectPatientFunctions: selectStorageStateFilter method Failed " + e);

		}

	}



}
