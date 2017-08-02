package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemManagerEditRolePage {

	@FindBy(id = "cBoxListTransfusion_0")
	public WebElement checkBoxAccessBrowseTransfusionHistory;
	@FindBy(id = "cBoxListTransfusion_16")
	public WebElement checkBoxMayCorrectTransfusion;
	@FindBy(id = "cBoxListTransfusion_18")
	public WebElement checkBoxMayCorrectVitals;
	@FindBy(id = "cBoxListTransfusion_2")
	public WebElement checkBoxMayStartTransfusionWithoutCosignature;
	@FindBy(id = "cBoxListTransfusion_3")
	public WebElement checkBoxMayStartTransfusionWithCosignature;
	@FindBy(id = "cBoxListTransfusion_4")
	public WebElement checkBoxMayStartRapidTransfusionWithoutCosignature;
	@FindBy(id = "cBoxListTransfusion_5")
	public WebElement checkBoxMayStartRapidTransfusionWithCosignature;
	@FindBy(id = "cBoxListTransfusion_6")
	public WebElement checkBoxHoldTransfusion;
	@FindBy(id = "cBoxListTransfusion_7")
	public WebElement checkBoxMayEndTransfusion;
	@FindBy(id = "cBoxListTransfusion_8")
	public WebElement checkBoxMaySuperviseTransfusion;
	@FindBy(id = "cBoxListTransfusion_9")
	public WebElement checkBoxMayCosignTransfusion;
	@FindBy(id = "cBoxListTransfusion_10")
	public WebElement checkBoxMayAccessChangeBloodTypeWithCosignature;
	@FindBy(id = "cBoxListTransfusion_11")
	public WebElement checkBoxMayAccessChangeBloodTypeWithoutCosignature;
	@FindBy(id = "cmdOKUp")
	public WebElement buttonConfirm;
	@FindBy(id = "btnCancelUp")
	public WebElement buttonCancel;

	@FindBy(id = "cBoxListTransfusion_24")
	public WebElement checkboxMayAccessAdministerDerivativesWithoutCosignature;
	@FindBy(id = "cBoxListTransfusion_25")
	public WebElement checkboxMayAccessAdministerDerivativesWithCosignature;

	/*
	 * @FindBy (id = "cBoxListTransfusion_25") public WebElement
	 * checkboxMayAccessAdministerDerivativesWithCosignature;
	 */

}
