package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class CapribedsideAdministerDerivativesPage {

	@FindBy(id = "lstDerivatives")
	public WebElement bloodPlasmaDerivativeDropDown;

	public WebElement getBloodPlasmaDerivativeDropDown() {
		return bloodPlasmaDerivativeDropDown;
	}

	@FindBy(id = "grdAttributes__ctl2_textAttribute")
	public WebElement patientIDTextBox;

	public WebElement getPatientIDTextBox() {
		return patientIDTextBox;
	}

	@FindBy(id = "grdAttributes__ctl3_textAttribute")
	public WebElement patientNameTextBox;

	public WebElement getPatientNameTextBox() {
		return patientNameTextBox;
	}

	@FindBy(id = "grdAttributes__ctl4_listAttribute")
	public WebElement patientBloodTypeDropDown;

	public WebElement getPatientBloodTypeDropDown() {
		return patientBloodTypeDropDown;
	}

	@FindBy(id = "grdAttributes__ctl5_textAttribute")
	public WebElement manufacturerTextBox;

	public WebElement getManufacturerTextBox() {
		return manufacturerTextBox;
	}

	@FindBy(id = "grdAttributes__ctl6_textAttribute")
	public WebElement lotNumberTextBox;

	public WebElement getLotNumberTextBox() {
		return lotNumberTextBox;
	}

	@FindBy(id = "grdAttributes__ctl7_textAttribute")
	public WebElement serialNumberTextBox;//iuConcentrationTextBox;

	

	@FindBy(id = "grdAttributes__ctl8_dateAttribute_foo")
	public WebElement expiresTextBox;//injectionSiteDropDown;

	

	@FindBy(id = "grdAttributes__ctl9_textAttribute")
	public WebElement volumeTextBox;

	public WebElement getSerialNumberTextBox() {
		return serialNumberTextBox;
	}

	@FindBy(id = "grdAttributes__ctl10_textAttribute")
	public WebElement quantityTextBox;

	public WebElement getVolumeTextBox() {
		return volumeTextBox;
	}

	@FindBy(id = "grdAttributes__ctl11_listAttribute")
	public WebElement injectionSiteDropDown;

	public WebElement getExpiresTextBox() {
		return expiresTextBox;
	}

	@FindBy(id = "grdAttributes__ctl12_textAttribute")
	public WebElement iuConcentrationTextBox;

	public WebElement getQuantityTextBox() {
		return quantityTextBox;
	}

	// Cosignature Section Elements

	@FindBy(id = "txtLoginId")
	public WebElement userIdTextBox;

	public WebElement getUserIDTextBox() {
		return userIdTextBox;
	}

	@FindBy(id = "txtPassword")
	public WebElement passwordTextBox;

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	@FindBy(id = "cmdConfirm")
	public WebElement confirmButton;

	public WebElement getContinueButton() {
		return confirmButton;
	}

	@FindBy(id = "cmdCancel")
	public WebElement exitButton;

	public WebElement getCancelButton() {
		return exitButton;
	}

	// Logout process

	@FindBy(id = "header_cmdLogout")
	public WebElement linkLogOut;

	public WebElement getLinkLogOut() {
		return linkLogOut;
	}

	@FindBy(id = "header__modalConfirm_cmdOK")
	public WebElement logOutPopupYesButton;

	public WebElement getLogOutPopupYesButton() {
		return logOutPopupYesButton;
	}

	@FindBy(id = "header__modalConfirm_cmdCancel")
	public WebElement logOutPopupNoButton;

	public WebElement getLogOutPopupNoButton() {
		return logOutPopupNoButton;
	}

	/*
	 * 
	 * public void admisnisterDerivative(String derivative,String
	 * bloodType,String patientID,String patientName,String manufacturer,String
	 * lotNo,String iuConcentration,String injectionSite,String
	 * serialNumber,String volume,String quantity) throws InterruptedException {
	 * CapribedsideLoginPage login = new CapribedsideLoginPage();
	 * SystemManagerMainPage sysManagerMainPage = new SystemManagerMainPage();
	 * CommonFunctions common = new CommonFunctions();
	 * CapribedsidePatientMainPage patientMenu = new
	 * CapribedsidePatientMainPage(); CapribedsidePatientMainPage mainPage = new
	 * CapribedsidePatientMainPage(); SystemManagerRolesPage roles = new
	 * SystemManagerRolesPage(); SystemManagerEditRolePage editRole = new
	 * SystemManagerEditRolePage(); CapribedsideBrowseTransfusionHistoryPage
	 * browseTransHistory = new CapribedsideBrowseTransfusionHistoryPage();
	 * CapribedsideAdministerDerivativesPage administerDerivative = new
	 * CapribedsideAdministerDerivativesPage();
	 * CapribedsideAdministerDerivativesPageFunctions adminsterdirpagefunctions
	 * = new CapribedsideAdministerDerivativesPageFunctions();
	 * 
	 * String nextDate = common.currentDate("MM/dd/yyyy HH:mm",+2);
	 * 
	 * Assert.assertEquals(administerDerivative.dropdownBloodPlasmaDerivative().
	 * isEnabled(),true); Thread.sleep(1000);
	 * adminsterdirpagefunctions.selectBloodPlasmaDerivative(derivative);
	 * Thread.sleep(3000); administerDerivative.patientID().sendKeys(patientID);
	 * Thread.sleep(2000);
	 * administerDerivative.patientName().sendKeys(patientName);
	 * Thread.sleep(2000);
	 * adminsterdirpagefunctions.selectPatientBloodType(bloodType);
	 * Thread.sleep(2000);
	 * administerDerivative.manufacturer().sendKeys(manufacturer);
	 * Thread.sleep(2000); administerDerivative.lotNumber().sendKeys(lotNo);
	 * Thread.sleep(2000);
	 * administerDerivative.iuConcentration().sendKeys(iuConcentration);
	 * Thread.sleep(2000);
	 * adminsterdirpagefunctions.selectInjectionSite(injectionSite);
	 * Thread.sleep(2000);
	 * administerDerivative.serialNumber().sendKeys(serialNumber);
	 * Thread.sleep(2000); administerDerivative.volume().sendKeys(volume);
	 * Thread.sleep(2000); administerDerivative.Expires().sendKeys(nextDate);
	 * Thread.sleep(2000); administerDerivative.quantity().sendKeys(quantity);
	 * Thread.sleep(2000); administerDerivative.buttonContinue().click();
	 * 
	 * }
	 */

}
