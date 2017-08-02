package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.SystemManagerSelectBloodProductPage;

public class SystemmanagerSelectBloodProductPageFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	//IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	SystemManagerSelectBloodProductPage selectBloodProduct = PageFactory.initElements(IEDriver.ieDriver,
			SystemManagerSelectBloodProductPage.class);
	public void clickCRTEditLink() {
		try {
			seleniumFunctions.waitForElement(selectBloodProduct.editLinkForCRT);
			selectBloodProduct.editLinkForCRT.click();

		} catch (Exception e) {
			System.out.println("SystemmanagerSelectBloodProductPageFunctions: clickCRTEditLink method Failed " + e);
		}

	}
	public void clickISBTWBEditLink() {
		try {
			seleniumFunctions.waitForElement(selectBloodProduct.editLinkForISBTWB);
			selectBloodProduct.editLinkForISBTWB.click();

		} catch (Exception e) {
			System.out.println("SystemmanagerSelectBloodProductPageFunctions: clickISBTWBEditLink method Failed " + e);
		}

	}
	public void clickWBEditLink() {
		try {
			seleniumFunctions.waitForElement(selectBloodProduct.editLinkForWB);
			selectBloodProduct.editLinkForWB.click();

		} catch (Exception e) {
			System.out.println("SystemmanagerSelectBloodProductPageFunctions: clickWBEditLink method Failed " + e);
		}

	}
	

}
