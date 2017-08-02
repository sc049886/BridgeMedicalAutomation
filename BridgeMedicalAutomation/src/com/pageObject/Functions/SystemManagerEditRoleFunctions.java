package com.pageObject.Functions;

import org.openqa.selenium.support.PageFactory;

import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObjects.SystemManagerEditRolePage;

public class SystemManagerEditRoleFunctions {
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	SystemManagerEditRolePage editRole = PageFactory.initElements(IEDriver.ieDriver, SystemManagerEditRolePage.class);

	public void checkMayMayAccessBrowseTransfusionHistoryCheckbox() {
		try {
			seleniumFunctions.waitForElement(editRole.checkBoxAccessBrowseTransfusionHistory);
			if (editRole.checkBoxAccessBrowseTransfusionHistory.isSelected()) {
				Thread.sleep(1000);
			} else {
				editRole.checkBoxAccessBrowseTransfusionHistory.click();
			}
		} catch (Exception e) {
			System.out.print(
					"SystemManagerEditRoleFunctions-checkMayMayAccessBrowseTransfusionHistoryCheckbox :Method is failed");
		}

	}

	public void uncheckMayMayAccessBrowseTransfusionHistoryCheckbox() {
		try {
			seleniumFunctions.waitForElement(editRole.checkBoxAccessBrowseTransfusionHistory);
			if (editRole.checkBoxAccessBrowseTransfusionHistory.isSelected()) {
				editRole.checkBoxAccessBrowseTransfusionHistory.click();

			} else {
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.print(
					"SystemManagerEditRoleFunctions-uncheckMayMayAccessBrowseTransfusionHistoryCheckbox :Method is failed");
		}

	}

	public void checkMayStartTransfusionWithCosignatureCheckbox() {
		try {
			seleniumFunctions.waitForElement(editRole.checkBoxMayStartTransfusionWithCosignature);
			if (editRole.checkBoxMayStartTransfusionWithCosignature.isSelected()) {
				Thread.sleep(1000);
			} else {
				editRole.checkBoxMayStartTransfusionWithCosignature.click();
			}
		} catch (Exception e) {
			System.out.print(
					"SystemManagerEditRoleFunctions-checkMayStartTransfusionWithCosignatureCheckbox :Method is failed");
		}

	}

	public void uncheckMayStartTransfusionWithCosignatureCheckbox() {
		try {
			seleniumFunctions.waitForElement(editRole.checkBoxMayStartTransfusionWithCosignature);
			if (editRole.checkBoxMayStartTransfusionWithCosignature.isSelected()) {
				editRole.checkBoxMayStartTransfusionWithCosignature.click();
			}

		} catch (Exception e) {
			System.out.print(
					"SystemManagerEditRoleFunctions-uncheckMayStartTransfusionWithCosignatureCheckbox :Method is failed");
		}

	}

	public void checkMayStartTransfusionWithoutCosignatureCheckbox() {
		try {
			seleniumFunctions.waitForElement(editRole.checkBoxMayStartTransfusionWithoutCosignature);
			if (editRole.checkBoxMayStartTransfusionWithoutCosignature.isSelected()) {
				Thread.sleep(1000);
			} else {
				editRole.checkBoxMayStartTransfusionWithoutCosignature.click();
			}
		} catch (Exception e) {
			System.out.print(
					"SystemManagerEditRoleFunctions-checkMayStartTransfusionWithoutCosignatureCheckbox :Method is failed");
		}

	}

	public void uncheckMayStartTransfusionWithoutCosignatureCheckbox() {
		try {
			seleniumFunctions.waitForElement(editRole.checkBoxMayStartTransfusionWithoutCosignature);
			if (editRole.checkBoxMayStartTransfusionWithoutCosignature.isSelected()) {
				editRole.checkBoxMayStartTransfusionWithoutCosignature.click();
			}

		} catch (Exception e) {
			System.out.print(
					"SystemManagerEditRoleFunctions-uncheckMayStartTransfusionWithoutCosignatureCheckbox :Method is failed");
		}

	}

	public void uncheckMayHoldtTransfusionCheckbox() {
		try {
			seleniumFunctions.waitForElement(editRole.checkBoxHoldTransfusion);
			if (editRole.checkBoxHoldTransfusion.isSelected()) {
				editRole.checkBoxHoldTransfusion.click();
			}

		} catch (Exception e) {
			System.out.print("SystemManagerEditRoleFunctions-uncheckMayHoldtTransfusionCheckbox :Method is failed");
		}

	}

	public void checkboxMayAccessAdministerDerivativesWithoutCosignatureCheckbox() {
		try {
			seleniumFunctions.waitForElement(editRole.checkboxMayAccessAdministerDerivativesWithoutCosignature);
			if (editRole.checkboxMayAccessAdministerDerivativesWithoutCosignature.isSelected()) {
				Thread.sleep(1000);
			} else {
				editRole.checkboxMayAccessAdministerDerivativesWithoutCosignature.click();
			}

		} catch (Exception e) {
			System.out.print(
					"SystemManagerEditRoleFunctions-checkboxMayAccessAdministerDerivativesWithoutCosignatureCheckbox :Method is failed");
		}

	}

	public void checkboxMayAccessAdministerDerivativesWithCosignatureCheckbox() {
		try {
			seleniumFunctions.waitForElement(editRole.checkboxMayAccessAdministerDerivativesWithoutCosignature);
			if (editRole.checkboxMayAccessAdministerDerivativesWithCosignature.isSelected()) {
				Thread.sleep(1000);
			} else {
				editRole.checkboxMayAccessAdministerDerivativesWithCosignature.click();
			}

		} catch (Exception e) {
			System.out.print(
					"SystemManagerEditRoleFunctions-checkboxMayAccessAdministerDerivativesWithCosignatureCheckbox :Method is failed");
		}

	}

	public void checkboxMayAccessChangeBloodTypeWithoutCosignature() {
		try {
			seleniumFunctions.waitForElement(editRole.checkBoxMayAccessChangeBloodTypeWithoutCosignature);
			if (editRole.checkBoxMayAccessChangeBloodTypeWithoutCosignature.isSelected()) {
				Thread.sleep(1000);
			} else {
				editRole.checkBoxMayAccessChangeBloodTypeWithoutCosignature.click();
			}

		} catch (Exception e) {
			System.out.print(
					"SystemManagerEditRoleFunctions-checkboxMayAccessChangeBloodTypeWithoutCosignature :Method is failed");
		}

	}

	public void checkboxMayAccessChangeBloodTypeWithCosignature() {
		try {
			seleniumFunctions.waitForElement(editRole.checkBoxMayAccessChangeBloodTypeWithCosignature);
			if (editRole.checkBoxMayAccessChangeBloodTypeWithCosignature.isSelected()) {
				Thread.sleep(1000);
			} else {
				editRole.checkBoxMayAccessChangeBloodTypeWithCosignature.click();
			}

		} catch (Exception e) {
			System.out.print(
					"SystemManagerEditRoleFunctions-checkboxMayAccessChangeBloodTypeWithCosignature :Method is failed");
		}

	}

	public void checkMayStartRapidTransfusionWithoutCosignatureChackbox() {
		try {
			seleniumFunctions.waitForElement(editRole.checkBoxMayStartRapidTransfusionWithoutCosignature);
			if (editRole.checkBoxMayStartRapidTransfusionWithoutCosignature.isSelected()) {
				Thread.sleep(1000);
			} else {
				editRole.checkBoxMayStartRapidTransfusionWithoutCosignature.click();
			}

		} catch (Exception e) {
			System.out.print(
					"SystemManagerEditRoleFunctions-checkMayStartRapidTransfusionWithoutCosignatureChackbox :Method is failed");
		}

	}

	public void uncheckMayStartRapidTransfusionWithoutCosignatureChackbox() {
		try {
			seleniumFunctions.waitForElement(editRole.checkBoxMayStartRapidTransfusionWithoutCosignature);
			if (editRole.checkBoxMayStartRapidTransfusionWithoutCosignature.isSelected()) {
				editRole.checkBoxMayStartRapidTransfusionWithoutCosignature.click();
			} else {
				Thread.sleep(1000);
			}

		} catch (Exception e) {
			System.out.print(
					"SystemManagerEditRoleFunctions-checkMayStartRapidTransfusionWithoutCosignatureChackbox :Method is failed");
		}

	}

	public void checkMayStartRapidTransfusionWithCosignatureChackbox() {
		try {
			seleniumFunctions.waitForElement(editRole.checkBoxMayStartRapidTransfusionWithCosignature);
			if (editRole.checkBoxMayStartRapidTransfusionWithCosignature.isSelected()) {
				Thread.sleep(1000);
			} else {
				editRole.checkBoxMayStartRapidTransfusionWithCosignature.click();

			}

		} catch (Exception e) {
			System.out.print(
					"SystemManagerEditRoleFunctions-checkMayStartRapidTransfusionWithoutCosignatureChackbox :Method is failed");
		}

	}

	public void uncheckMayStartRapidTransfusionWithCosignatureChackbox() {
		try {
			seleniumFunctions.waitForElement(editRole.checkBoxMayStartRapidTransfusionWithCosignature);
			if (editRole.checkBoxMayStartRapidTransfusionWithCosignature.isSelected()) {
				editRole.checkBoxMayStartRapidTransfusionWithCosignature.click();
			} else {

				Thread.sleep(1000);
			}

		} catch (Exception e) {
			System.out.print(
					"SystemManagerEditRoleFunctions-checkMayStartRapidTransfusionWithoutCosignatureChackbox :Method is failed");
		}

	}

	public void checkMayCorrectTransfusionChackbox() {
		try {
			seleniumFunctions.waitForElement(editRole.checkBoxMayCorrectTransfusion);
			if (editRole.checkBoxMayCorrectTransfusion.isSelected()) {
				Thread.sleep(1000);
			} else {
				editRole.checkBoxMayCorrectTransfusion.click();

			}

		} catch (Exception e) {
			System.out.print("SystemManagerEditRoleFunctions-checkMayCorrectTransfusionChackbox :Method is failed");
		}

	}

	public void uncheckMayCorrectTransfusionChackbox() {
		try {
			seleniumFunctions.waitForElement(editRole.checkBoxMayCorrectTransfusion);
			if (editRole.checkBoxMayCorrectTransfusion.isSelected()) {
				editRole.checkBoxMayCorrectTransfusion.click();

			} else {

				Thread.sleep(1000);
			}

		} catch (Exception e) {
			System.out.print("SystemManagerEditRoleFunctions-checkMayCorrectTransfusionChackbox :Method is failed");
		}

	}

	public void clickConfirmButton() {
		try {
			seleniumFunctions.waitForElement(editRole.buttonConfirm);
			editRole.buttonConfirm.click();

		} catch (Exception e) {
			System.out.print("SystemManagerEditRoleFunctions-clickConfirmButton :Method is failed");
		}

	}

	public void clickCancelButton() {
		try {
			seleniumFunctions.waitForElement(editRole.buttonCancel);
			editRole.buttonCancel.click();

		} catch (Exception e) {
			System.out.print("SystemManagerEditRoleFunctions-clickCancelButton :Method is failed");
		}

	}

}
