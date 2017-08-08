package regressionTestPlans;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.Constants;
import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObject.Functions.CapribedsideAdministerDerivativesFunctions;
import com.pageObject.Functions.CapribedsideLoginFunctions;
import com.pageObject.Functions.CapribedsidePatientMainMenuFunctions;
import com.pageObject.Functions.CapribedsideSelectPatientFunctions;
import com.pageObject.Functions.SystemManagerEditPocPageFunctions;
import com.pageObject.Functions.SystemManagerEditRoleFunctions;
import com.pageObject.Functions.SystemManagerLoginPageFunctions;
import com.pageObject.Functions.SystemManagerMainPageFunction;
import com.pageObject.Functions.SystemManagerPointsOfCareFunctions;
import com.pageObject.Functions.SystemManagerRolesFunctions;
import com.pageObject.Functions.SystemManagerTransfusionSettingsPageFunctions;

import multiScreenShot.MultiScreenShot;

public class BRDG_VR_AdministerDerivative {
	SystemManagerLoginPageFunctions systemManager = new SystemManagerLoginPageFunctions(Constants.systemManagerUrl);
	SystemManagerMainPageFunction systemManagerMainMenu = new SystemManagerMainPageFunction();
	SystemManagerRolesFunctions rolesFunctions = new SystemManagerRolesFunctions();
	SystemManagerEditRoleFunctions editRoleFunctions = new SystemManagerEditRoleFunctions();
	SystemManagerPointsOfCareFunctions selectPoc = new SystemManagerPointsOfCareFunctions();
	SystemManagerEditPocPageFunctions editPoc = new SystemManagerEditPocPageFunctions();
	CommonFunctions commonFunctions = new CommonFunctions();
	SeleniumFunctions sleniumFunctions = new SeleniumFunctions();
	SystemManagerTransfusionSettingsPageFunctions transfusionSettings = new SystemManagerTransfusionSettingsPageFunctions();
	String futureExpiryDate = commonFunctions.currentDate(Constants.FORMAT_STANDARD_DATE, 4);
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/", "BRDG_VR_AdministerDerivative");

	@BeforeTest
	public void preSettingTest() {
		systemManager.adminLogin(); //
		// systemManagerMainMenu.clickTransfusionSettingsButton();
		systemManagerMainMenu.clickRolesButton();
		rolesFunctions.clickEditSystemAdminitserLink(); // editRoleFunctions.
		editRoleFunctions.checkboxMayAccessAdministerDerivativesWithoutCosignatureCheckbox();
		editRoleFunctions.clickConfirmButton();
		rolesFunctions.clickEditTransfusionistLink();
		editRoleFunctions.checkboxMayAccessAdministerDerivativesWithCosignatureCheckbox();
		editRoleFunctions.clickConfirmButton();
		rolesFunctions.clickBackButton();
		systemManagerMainMenu.clickTransfusionSettingsButton();
		transfusionSettings.clickBloodPlasmaDerivativeLink();
		IEDriver.ieDriver.quit();

	}

	@Test
	public void bloodPlasmaTest() throws InterruptedException, IOException {
		/*
		 * Step 1:----"---Action---"Login to Capribedside with user 1. Scan a
		 * patient in Peds. "---Expected Result---"Main menu page is displayed.
		 * 
		 */
		IEDriver.iEDriver(Constants.capribedsideUrl);
		CapribedsideLoginFunctions capribedsideLogin = new CapribedsideLoginFunctions();
		capribedsideLogin.capribedsideLogin(Constants.ADMIN_USERNAME, Constants.ADMIN_PASSWORD);
		CapribedsideSelectPatientFunctions selectPatientFunctions = new CapribedsideSelectPatientFunctions();
		selectPatientFunctions.scanPatientid(Constants.idPateintA);
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		CapribedsidePatientMainMenuFunctions patientMainMenu = new CapribedsidePatientMainMenuFunctions();
		/*
		 * Step 2:----"---Action---"Click on Administer Derivatives
		 * "---Expected Result---"Administer Derivative page is displayed with
		 * “*Select blood plasma derivative” dropdown menu having Blood plasma
		 * derivative A in it.
		 * 
		 */
		patientMainMenu.clickAdministerDerivativeButton();
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 3:----"---Action---"Select Blood plasma derivative A.
		 * "---Expected Result---"All created attribute fields displayed with
		 * Administer Date/Time.
		 * 
		 */
		CapribedsideAdministerDerivativesFunctions administerDerivativeFunctions = new CapribedsideAdministerDerivativesFunctions();
		administerDerivativeFunctions.selectBloodPlasmaDerivative(Constants.bloodPlasmaDerivativeValue);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 4:----"---Action---"Enter correct patient ID, Patient Name,
		 * Patient Blood Type, MRN number. Enter numeric value for Manufacturer,
		 * Lot#, Serial Number, Volume, Quantity and IU Concentration, Valid
		 * Expiry Date Click on Continue. "---Expected Result---"Verify that
		 * Blood Plasma Derivative is administered.
		 * 
		 */
		administerDerivativeFunctions.enterPatientID(Constants.idPateintA);
		administerDerivativeFunctions.enterPatientName(Constants.namePateintA);
		administerDerivativeFunctions.selectPatientBloodType(Constants.bloodTypeOpos);
		administerDerivativeFunctions.enterManufacturer("Manufacturer_A");
		administerDerivativeFunctions.enterLotNumber("AB01");
		administerDerivativeFunctions.enterSerialNumber("SN01");
		administerDerivativeFunctions.enterExpireDate(futureExpiryDate);
		administerDerivativeFunctions.enterVolume("30");
		administerDerivativeFunctions.enterQuantity("20");
		administerDerivativeFunctions.selectInjectionSite(Constants.injectionSite);
		administerDerivativeFunctions.enterIUConcentration("70");
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		administerDerivativeFunctions.clickConfirmButton();
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 5:----"---Action---"Logout and login to Capribedside with user
		 * 2. Scan a patient in Peds. "---Expected Result---"Main menu page is
		 * displayed
		 * 
		 */
		patientMainMenu.clickLogoutLink();
		capribedsideLogin.capribedsideLogin(Constants.transfusionist, Constants.ADMIN_PASSWORD);
		selectPatientFunctions.scanPatientid(Constants.idPateintA);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 6:----"---Action---"Click on Administer Derivatives button and
		 * Select Blood plasma derivative A from drop down “*Select blood plasma
		 * derivative”. "---Expected Result---"All included attribute fields
		 * displayed with Administer Date/Time.
		 * 
		 */
		patientMainMenu.clickAdministerDerivativeButton();
		administerDerivativeFunctions.selectBloodPlasmaDerivative(Constants.bloodPlasmaDerivativeValue);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 7:----"---Action---"Enter correct patient ID, Patient Name,
		 * Patient Blood Type, MRN number. Enter numeric value for Manufacturer,
		 * Lot#, Serial Number, Volume, Quantity and IU Concentration. Select
		 * Valid Expiry Date Click on Continue.
		 * "---Expected Result---"Cosignature Page with User ID and Password
		 * field is displayed
		 * 
		 */
		administerDerivativeFunctions.enterPatientID(Constants.idPateintA);
		administerDerivativeFunctions.enterPatientName(Constants.namePateintA);
		administerDerivativeFunctions.selectPatientBloodType(Constants.bloodTypeOpos);
		administerDerivativeFunctions.enterManufacturer("Manufacturer_A");
		administerDerivativeFunctions.enterLotNumber("AB01");
		administerDerivativeFunctions.enterSerialNumber("SN01");
		administerDerivativeFunctions.enterExpireDate(futureExpiryDate);
		administerDerivativeFunctions.enterVolume("30");
		administerDerivativeFunctions.enterQuantity("20");
		administerDerivativeFunctions.selectInjectionSite(Constants.injectionSite);
		administerDerivativeFunctions.enterIUConcentration("70");
		administerDerivativeFunctions.clickConfirmButton();
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 8:----"---Action---"Enter User ID and password and Click on
		 * Continue "---Expected Result---"Selected Blood plasma with entered
		 * values for attributes administered. Main menu page displayed.
		 * 
		 */
		administerDerivativeFunctions.enterUserName(Constants.cosignUserID);
		administerDerivativeFunctions.enterPassword(Constants.ADMIN_PASSWORD);
		administerDerivativeFunctions.clickConfirmButton();
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 9:----"---Action---"Enter User ID and password and Click on
		 * Continue "---Expected Result---"Selected Blood plasma with entered
		 * values for attributes administered. Main menu page displayed.
		 * 
		 */
		patientMainMenu.clickBrowseTransfusionHistoryButton();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);

		IEDriver.ieDriver.quit();

	}
}
