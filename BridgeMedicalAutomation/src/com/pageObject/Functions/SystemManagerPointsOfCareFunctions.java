package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.SystemManagerPointsOfCarePage;

public class SystemManagerPointsOfCareFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	SystemManagerPointsOfCarePage pointOfCarePage = PageFactory.initElements(IEDriver.ieDriver,
			SystemManagerPointsOfCarePage.class);

	public void clickEditPed() {
		try {
			seleniumFunctions.waitForElement(pointOfCarePage.editPocPeds);
			pointOfCarePage.editPocPeds.click();

		} catch (Exception e) {
			System.out.println("SystemManagerPointsOfCareFunctions: clickEditPed method Failed " + e);
		}

	}
	public void clickEditGenMed() {
		try {
			seleniumFunctions.waitForElement(pointOfCarePage.editPocGenMed);
			pointOfCarePage.editPocGenMed.click();

		} catch (Exception e) {
			System.out.println("SystemManagerPointsOfCareFunctions: clickEditGenMed method Failed " + e);
		}

	}
	public void clickBackLink() {
		try {
			seleniumFunctions.waitForElement(pointOfCarePage.buttonBack);
			pointOfCarePage.buttonBack.click();

		} catch (Exception e) {
			System.out.println("SystemManagerPointsOfCareFunctions: clickEditGenMed method Failed " + e);
		}

	}

}
