package com.pageObject.Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.CapribedsideBrowseTransfusionHistoryPage;

import junit.framework.Assert;

public class CapribedsideBrowseTransfusionHistoryPageFunctions {

	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	// IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
	CapribedsideBrowseTransfusionHistoryPage browsetranshistorypage = PageFactory.initElements(IEDriver.ieDriver,
			CapribedsideBrowseTransfusionHistoryPage.class);

	public void clickGeneralButton() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.generalButton);
			browsetranshistorypage.generalButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: clickGeneralButton method Failed " + e);
		}

	}

	public void clickReactionButton() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.reactionButton);
			browsetranshistorypage.reactionButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: clickReactionButton method Failed " + e);
		}

	}

	public void clickVitalsButton() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.vitalsButton);
			browsetranshistorypage.vitalsButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: clickVitalsButton method Failed " + e);
		}

	}

	public void clickChecksButton() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.checksButton);
			browsetranshistorypage.checksButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: clickChecksButton method Failed " + e);
		}
	}

	public void clickHoldButton() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.holdButton);
			browsetranshistorypage.holdButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: clickHoldButton method Failed " + e);
		}
	}

	public void clickBackButtonFromInfoPage() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.backButtonInformationPage);
			browsetranshistorypage.backButtonInformationPage.click();

		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: clickBackButtonFromInfoPage method Failed " + e);
		}
	}

	public void enterEndTransfusionDateEditTransfusion(String endTransfusionDate) {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.endTransfusionDateTextBox);
			browsetranshistorypage.endTransfusionDateTextBox.clear();
			browsetranshistorypage.endTransfusionDateTextBox.sendKeys(endTransfusionDate);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideBrowseTransfusionHistoryPageFunctions: enterEndTransfusionDateEditTransfusion method Failed " + e);
		}
	}
	public void enterVolumeEditTransfusion(String volumeAfterEdit) {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.volumeTransfusedTextBox);
			browsetranshistorypage.volumeTransfusedTextBox.clear();
			browsetranshistorypage.volumeTransfusedTextBox.sendKeys(volumeAfterEdit);

		} catch (Exception e) {
			System.out.println(
					"CapribedsideBrowseTransfusionHistoryPageFunctions: enterVolumeEditTransfusion method Failed " + e);
		}
	}

	public void selectStorageStateFilter(String bloodProduct) {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.bloodProductDropDown);
			seleniumFunctions.selectValueByVisibleText(browsetranshistorypage.bloodProductDropDown, bloodProduct);
		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: selectStorageStateFilter method Failed " + e);

		}

	}

	public void enterValueForVolumeTransfused(String volume) {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.volumeTransfusedTextBox);
			browsetranshistorypage.volumeTransfusedTextBox.sendKeys(volume);
		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: enterValueForVolumeTransfused method Failed " + e);

		}

	}

	public void selectBloodProductEditTransfusion(String bloodProduct) {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.bloodProductDropDown);
			seleniumFunctions.selectValueByVisibleText(browsetranshistorypage.bloodProductDropDown, bloodProduct);
			//browsetranshistorypage.confirmEditTransfusionButton.click();
		} catch (Exception e) {
			System.out
					.println("CapribedsideBrowseTransfusionHistoryPageFunctions: selectBloodProductEditTransfusion method Failed " + e);

		}

	}
	public void clickConfirmButtonEditTransfusion() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.confirmEditTransfusionButton);
			browsetranshistorypage.confirmEditTransfusionButton.click();
		} catch (Exception e) {
			System.out
					.println("CapribedsideBrowseTransfusionHistoryPageFunctions: clickConfirmButtonFrEditTransfusion method Failed " + e);

		}

	}

	public void clickExitButtonOfEditTransfusion() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.exitEditTransfusionButton);
			browsetranshistorypage.exitEditTransfusionButton.click();
		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: clickExitButtonFrEditTransfusion method Failed " + e);

		}

	}

	public void enterAdministerDateForBloodPlasmaDerivative(String administerDate) {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.administerDateTimeTextBox);
			browsetranshistorypage.administerDateTimeTextBox.clear();
			browsetranshistorypage.administerDateTimeTextBox.sendKeys(administerDate);
		} catch (Exception e) {
			System.out.println(
					"CapribedsideBrowseTransfusionHistoryPageFunctions: enterAdministerDateForBloodPlasmaDerivative method Failed " + e);

		}

	}

	public void clickConfirmButtonEditBloodplasmaDerivative() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.confirmEditBloodPlasmaDerivativeButton);
			browsetranshistorypage.confirmEditBloodPlasmaDerivativeButton.click();
		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: clickExitButtonFrEditTransfusion method Failed " + e);

		}

	}

	public void clickExitButtonEditBloodplasmaDerivative() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.exitEditBloodPlasmaDerivativeButton);
			browsetranshistorypage.exitEditBloodPlasmaDerivativeButton.click();
		} catch (Exception e) {
			System.out.println(
					"CapribedsideBrowseTransfusionHistoryPageFunctions: clickExitButtonEditBloodplasmaDerivative method Failed " + e);

		}

	}

	// Functions for Reaction Post Transfusion.
	public void checkElevatedTemperatureCheckbox() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.elevatedTemperatureCheckBox);
			if (browsetranshistorypage.elevatedTemperatureCheckBox.isSelected()) {
				Thread.sleep(1000);
			} else {
				browsetranshistorypage.elevatedTemperatureCheckBox.click();
			}

		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: checkElevatedTemperatureCheckbox method Failed " + e);

		}

	}

	public void checkAnaphylaxisCheckbox() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.anaphylaxisCheckBox);
			if (browsetranshistorypage.anaphylaxisCheckBox.isSelected()) {
				Thread.sleep(1000);
			} else {
				browsetranshistorypage.anaphylaxisCheckBox.click();
			}

		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: checkAnaphylaxisCheckbox method Failed " + e);

		}

	}

	public void checkHypotensionCheckbox() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.hypotensionCheckBox);
			if (browsetranshistorypage.hypotensionCheckBox.isSelected()) {
				Thread.sleep(1000);
			} else {
				browsetranshistorypage.hypotensionCheckBox.click();
			}

		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: checkHypotensionCheckbox method Failed " + e);

		}

	}

	public void checkReducedUrineOutputCheckbox() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.reducedUrinOutputCheckbox);
			if (browsetranshistorypage.reducedUrinOutputCheckbox.isSelected()) {
				Thread.sleep(1000);
			} else {
				browsetranshistorypage.reducedUrinOutputCheckbox.click();
			}

		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: checkHypotensionCheckbox method Failed " + e);

		}

	}

	public void checkFailureToClotCheckbox() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.failureToClotCheckbox);
			if (browsetranshistorypage.failureToClotCheckbox.isSelected()) {
				Thread.sleep(1000);
			} else {
				browsetranshistorypage.failureToClotCheckbox.click();
			}

		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: checkFailureToClotCheckbox method Failed " + e);

		}

	}

	public void checkDyspeneaNauseaCheckbox() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.dyspneaNauseaCheckBox);
			if (browsetranshistorypage.dyspneaNauseaCheckBox.isSelected()) {
				Thread.sleep(1000);
			} else {
				browsetranshistorypage.dyspneaNauseaCheckBox.click();
			}

		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: checkDyspeneaNauseaCheckbox method Failed " + e);

		}

	}

	public void checkUticariaChillsCheckbox() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.uticariaChillsCheckbox);
			if (browsetranshistorypage.uticariaChillsCheckbox.isSelected()) {
				Thread.sleep(1000);
			} else {
				browsetranshistorypage.uticariaChillsCheckbox.click();
			}

		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: checkDyspeneaNauseaCheckbox method Failed " + e);

		}

	}

	public void clickContinueButtonPostTransfusionReaction() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.confirmPostTransfusionButton);
			browsetranshistorypage.confirmPostTransfusionButton.click();

		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: checkDyspeneaNauseaCheckbox method Failed " + e);

		}

	}

	public void clickExitButtonPostTransfusionReaction() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.exitPostTransfusionButton);
			browsetranshistorypage.exitPostTransfusionButton.click();
		} catch (Exception e) {
			System.out.println(
					"CapribedsideBrowseTransfusionHistoryPageFunctions: clickExitButtonPostTransfusionReaction method Failed " + e);

		}

	}

	// Functions for reaction instruction page.
	public void verifyReactionInstructionHeader() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.exitPostTransfusionButton);
			Assert.assertTrue(browsetranshistorypage.exitPostTransfusionButton.isDisplayed());
		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: verifyReactionInstructionHeader method Failed " + e);

		}

	}

	public void clickConfirmReactionInstructionButton() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.confirmReactionInstructionButton);
			browsetranshistorypage.confirmReactionInstructionButton.click();
		} catch (Exception e) {
			System.out.println(
					"CapribedsideBrowseTransfusionHistoryPageFunctions: clickConfirmButtonReactionInstruction method Failed " + e);

		}

	}

	public void clickExitReactionInstructionButton() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.exitReactionInstructionButton);
			browsetranshistorypage.exitReactionInstructionButton.click();
		} catch (Exception e) {
			System.out
					.println("CapribedsideBrowseTransfusionHistoryPageFunctions: clickExitReactionInstructionButton method Failed " + e);

		}

	}
	public void clickCancelPrintButton() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.cancelPostTransfusionReportButton);
			browsetranshistorypage.cancelPostTransfusionReportButton.click();
		} catch (Exception e) {
			System.out
					.println("CapribedsideBrowseTransfusionHistoryPageFunctions: clickExitReactionInstructionButton method Failed " + e);

		}

	}

	public void clickBackButtonBrowseTransfusionHistoryPage() {
		try {
			seleniumFunctions.waitForElement(browsetranshistorypage.backButtonBrowseTransfusionHistoryPage);
			browsetranshistorypage.backButtonBrowseTransfusionHistoryPage.click();
		} catch (Exception e) {
			System.out.println(
					"CapribedsideBrowseTransfusionHistoryPageFunctions: clickBackButtonBrowseTransfusionHistoryPage method Failed " + e);

		}

	}

	public void clickInfoIconOfTransfusion(String unitNumber) {
		try {
			seleniumFunctions.waitForElement(IEDriver.ieDriver
					.findElement(By.xpath("//tr[td[contains(text(),'" + unitNumber + "')]]/td/a/img")));
			IEDriver.ieDriver.findElement(By.xpath("//tr[td[contains(text(),'" + unitNumber + "')]]/td/a/img")).click();
		} catch (Exception e) {
			System.out.println("CapribedsideBrowseTransfusionHistoryPageFunctions: clickInfoIcon method Failed " + e);

		}

	}

	// iedriver.driver.findElement(By.xpath("//tr[1][td[contains(text(),'Test01')]]/td/a/img")).click();
	
	public void clickInfoIconOfAdministeredDerivative() {
		try {
			seleniumFunctions.waitForElement(
					IEDriver.ieDriver.findElement(By.xpath("//tr[1][td[contains(text(),'Test')]]/td/a/img")));
			IEDriver.ieDriver.findElement(By.xpath("//tr[1][td[contains(text(),'Test')]]/td/a/img")).click();
		} catch (Exception e) {
			System.out.println(
					"CapribedsideBrowseTransfusionHistoryPageFunctions: clickInfoIconOfAdministeredDerivative method Failed " + e);

		}

	}

	public void clickEditIcon(String unitNumber) {
		try {
			seleniumFunctions.waitForElement(IEDriver.ieDriver.findElement(
					By.xpath("//tr[td[contains(text(),'" + unitNumber + "')]]/td/a[@class='icon-pencil icon-large']")));
			IEDriver.ieDriver.findElement(By.xpath("//tr[td[contains(text(),'" + unitNumber + "')]]/td/a[@class='icon-pencil icon-large']"))
					.click();
		} catch (Exception e) {
			System.out.println(
					"CapribedsideBrowseTransfusionHistoryPageFunctions: clickEditIcon method Failed " + e);

		}

	}
	
	public void clickInfoIconEndedColumn(String unitNumber) {
		try {
			seleniumFunctions.waitForElement(IEDriver.ieDriver.findElement(By.xpath("//tr[td[contains(text(),'" + unitNumber + "')]]/td[4]/Span/a")));
			IEDriver.ieDriver.findElement(By.xpath("//tr[td[contains(text(),'" + unitNumber + "')]]/td[4]/Span/a"))
					.click();
		} catch (Exception e) {
			System.out.println(
					"CapribedsideBrowseTransfusionHistoryPageFunctions: clickInfoIconEndedColumn method Failed " + e);

		}

	}
	public void clickInfoIconProductNameColumn(String unitNumber) {
		try {
			seleniumFunctions.waitForElement(IEDriver.ieDriver.findElement(By.xpath("//tr[td[contains(text(),'" + unitNumber + "')]]/td[5]/Span/a")));
			IEDriver.ieDriver.findElement(By.xpath("//tr[td[contains(text(),'" + unitNumber + "')]]/td[5]/Span/a"))
					.click();
		} catch (Exception e) {
			System.out.println(
					"CapribedsideBrowseTransfusionHistoryPageFunctions: clickInfoIconEndedColumn method Failed " + e);

		}

	}
	public void clickInfoIconVolumeColumn(String unitNumber) {
		try {
			seleniumFunctions.waitForElement(IEDriver.ieDriver.findElement(By.xpath("//tr[td[contains(text(),'" + unitNumber + "')]]/td[6]/Span/a")));
			IEDriver.ieDriver.findElement(By.xpath("//tr[td[contains(text(),'" + unitNumber + "')]]/td[6]/Span/a"))
					.click();
		} catch (Exception e) {
			System.out.println(
					"CapribedsideBrowseTransfusionHistoryPageFunctions: clickInfoIconEndedColumn method Failed " + e);

		}

	}
	//iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'" + unitNo2 + "')]]/td[7]/a")).click();
	public void clickNoHyperlinkReactionsColumn(String unitNumber) {
		try {
			seleniumFunctions.waitForElement(IEDriver.ieDriver.findElement(By.xpath("//tr[td[contains(text(),'" + unitNumber + "')]]/td[7]/a")));
			IEDriver.ieDriver.findElement(By.xpath("//tr[td[contains(text(),'" + unitNumber + "')]]/td[7]/a"))
					.click();
		} catch (Exception e) {
			System.out.println(
					"CapribedsideBrowseTransfusionHistoryPageFunctions: clickNoHyperlinkReactionsColumn method Failed " + e);

		}

	}
	//IEDriver.ieDriver.findElement(By.xpath("//tr[2][td[contains(text(),'Test01')]]/td[1]/a")).click();
	public void clickEditIconOfAdministerDerivative(String Test ) {
		try {
			seleniumFunctions.waitForElement(IEDriver.ieDriver.findElement(By.xpath("//tr[2][td[contains(text(),'"+Test+"')]]/td[1]/a")));
			IEDriver.ieDriver.findElement(By.xpath("//tr[2][td[contains(text(),'"+Test+"')]]/td[1]/a"))
					.click();
		} catch (Exception e) {
			System.out.println(
					"CapribedsideBrowseTransfusionHistoryPageFunctions: clickEditIconOfAdministerDerivative method Failed " + e);

		}

	}
	//iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'" + unitNo4 + "')]]/td[5]/Span/a")).click();
}
