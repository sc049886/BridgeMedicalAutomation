package regressionTestPlans;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.Constants;
import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObject.Functions.CapribedsideChangeBloodTypeFunctions;
import com.pageObject.Functions.CapribedsideLoginFunctions;
import com.pageObject.Functions.CapribedsidePatientMainMenuFunctions;
import com.pageObject.Functions.CapribedsideRapidStartTransfusionPageFunctions;
import com.pageObject.Functions.CapribedsideSelectPatientFunctions;
import com.pageObject.Functions.SystemManagerEditBloodProductPageFunctions;
import com.pageObject.Functions.SystemManagerEditPocPageFunctions;
import com.pageObject.Functions.SystemManagerEditRoleFunctions;
import com.pageObject.Functions.SystemManagerLoginPageFunctions;
import com.pageObject.Functions.SystemManagerMainPageFunction;
import com.pageObject.Functions.SystemManagerPointsOfCareFunctions;
import com.pageObject.Functions.SystemManagerRolesFunctions;
import com.pageObject.Functions.SystemManagerTransfusionSettingsPageFunctions;
import com.pageObject.Functions.SystemmanagerSelectBloodProductPageFunctions;

import multiScreenShot.MultiScreenShot;

public class BRDGTXA_VR_RapidTansfusion {
	SystemManagerLoginPageFunctions systemManager = new SystemManagerLoginPageFunctions(Constants.systemManagerUrl);
	SystemManagerMainPageFunction systemManagerMainMenu = new SystemManagerMainPageFunction();
	SystemManagerRolesFunctions rolesFunctions = new SystemManagerRolesFunctions();
	SystemManagerEditRoleFunctions editRoleFunctions = new SystemManagerEditRoleFunctions();
	SystemManagerPointsOfCareFunctions selectPoc = new SystemManagerPointsOfCareFunctions();
	SystemManagerEditPocPageFunctions editPoc = new SystemManagerEditPocPageFunctions();
	CommonFunctions commonFunctions = new CommonFunctions();
	SeleniumFunctions sleniumFunctions = new SeleniumFunctions();
	SystemManagerTransfusionSettingsPageFunctions transfusionSettings = new SystemManagerTransfusionSettingsPageFunctions();
	SystemmanagerSelectBloodProductPageFunctions selectBloodProductFunctions = new SystemmanagerSelectBloodProductPageFunctions();
	SystemManagerEditBloodProductPageFunctions editBloodProduct = new SystemManagerEditBloodProductPageFunctions();
	// CapribedsideSelectPatientFunctions selectPatientFunctions = new
	// CapribedsideSelectPatientFunctions();
	String unitNumber = commonFunctions.currentDate(Constants.dateFormatForUnitNumber, 0);
	String currentDate = commonFunctions.currentDate(Constants.FORMAT_STANDARD_DATE, 0);
	String futureDate = commonFunctions.currentDate(Constants.FORMAT_STANDARD_DATE, 4);
	String pastDate = commonFunctions.currentDate(Constants.FORMAT_STANDARD_DATE, -4);
	String unitNumberForISBT = commonFunctions.currentDate(Constants.FORMAT_HL7_LONG_DATE_TIME, 0);
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/", "BRDGTXA_VR_RapidTansfusion");

	@BeforeTest
	public void systemManagerSettingsTest() throws InterruptedException, IOException, AWTException {

		// IEDriver.iEDriver(Constants.capribedsideUrl);
		systemManager.adminLogin();
		systemManagerMainMenu.clickPointOfCareButton();
		selectPoc.clickEditPed();
		editPoc.selectOptionForCheckCenterCodes(Constants.optionYes);
		editPoc.selectOptionForRequireCosignature(Constants.optionYes);
		editPoc.selectOptionForDisplayCommentsInRapidStartTransfusion(Constants.optionYes);
		editPoc.clickConfirmButton();
		selectPoc.clickEditGenMed();
		editPoc.selectOptionForCheckCenterCodes(Constants.optionNo);
		editPoc.selectOptionForRequireCosignature(Constants.optionYes);
		editPoc.selectOptionForDisplayCommentsInRapidStartTransfusion(Constants.optionYes);
		editPoc.clickConfirmButton();
		selectPoc.clickBackLink();
		systemManagerMainMenu.clickTransfusionSettingsButton();
		transfusionSettings.clickBloodProductsLink();
		selectBloodProductFunctions.clickCRTEditLink();
		editBloodProduct.selectOptionForExpirationCheck(Constants.expirationCheckByDate);
		editBloodProduct.selectOptionForISBT_128_BloodProduct(Constants.optionNo);
		editBloodProduct.clickBloodProductAttributeLink();
		editBloodProduct.checkAntiCMVNegativeCheckbox();
		editBloodProduct.checkIrradateCheckbox();
		editBloodProduct.clickBackButtonAttributePage();
		editBloodProduct.confirmButtonBloodProductAttribute();
		selectBloodProductFunctions.clickWBEditLink();
		//selectBloodProductFunctions.clickISBTWBEditLink();
		editBloodProduct.selectOptionForExpirationCheck(Constants.expirationCheckByDate);
		editBloodProduct.selectOptionForISBT_128_BloodProduct(Constants.optionNo);
		editBloodProduct.clickBloodProductAttributeLink();
		editBloodProduct.checkAntiCMVNegativeCheckbox();
		editBloodProduct.checkIrradateCheckbox();
		editBloodProduct.clickBackButtonAttributePage();
		editBloodProduct.confirmButtonBloodProductAttribute();
		editBloodProduct.clickBackButtonAttributePage();
		transfusionSettings.selectOptionDisplayBloodTypeMismatchQuestions(Constants.bloodTypeMismatchQuestion);
		transfusionSettings.selectOptionForPropmtForPatientBloodType(Constants.optionYes);
		transfusionSettings.selectOptionForExpirationMessage(Constants.expirationMessageStop);
		transfusionSettings.clickConfirmButton();
		systemManagerMainMenu.clickRolesButton();
		rolesFunctions.clickEditSystemAdminitserLink();
		editRoleFunctions.checkMayStartRapidTransfusionWithoutCosignatureChackbox();
		editRoleFunctions.clickConfirmButton();
		rolesFunctions.clickEditTransfusionistLink();
		editRoleFunctions.checkMayStartRapidTransfusionWithCosignatureChackbox();
		editRoleFunctions.clickConfirmButton();
		rolesFunctions.clickEditStudentNurseLink();
		editRoleFunctions.uncheckMayStartRapidTransfusionWithoutCosignatureChackbox();
		editRoleFunctions.uncheckMayStartRapidTransfusionWithCosignatureChackbox();
		editRoleFunctions.clickConfirmButton();
		rolesFunctions.clickBackButton();
		IEDriver.ieDriver.quit();
		// IEDriver.ieDriver.quit();
	}

	@Test
	public void rapidTransfusion() throws Throwable {
		IEDriver.iEDriver(Constants.capribedsideUrl);
		CapribedsideLoginFunctions capribedsideLogin = new CapribedsideLoginFunctions();
		/*
		 * Step 1 ------"Login to Capribedside as User1 scan patient A, Start
		 * Transfusion,BrowseTransfusion and View Reaction Information Buttons
		 * are active"-----Step 1
		 */
		capribedsideLogin.capribedsideLogin(Constants.ADMIN_USERNAME, Constants.ADMIN_PASSWORD);
		// systemManager.adminLogin();
		CapribedsideSelectPatientFunctions selectPatientFunctions = new CapribedsideSelectPatientFunctions();
		selectPatientFunctions.scanPatientid(Constants.idPateintA);
		Thread.sleep(2000);
		CapribedsidePatientMainMenuFunctions patientMainMenu = new CapribedsidePatientMainMenuFunctions();
		patientMainMenu.clickChangeBloodTypeButton();
		CapribedsideChangeBloodTypeFunctions changeBloodType = new CapribedsideChangeBloodTypeFunctions();
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		String currentBloodType = changeBloodType.getCurrentBloodType();
		System.out.println("Current BT " + currentBloodType);
		if (!currentBloodType.equals(Constants.bloodTypeOpos)) {
			changeBloodType.changeBloodType(Constants.bloodTypeOpos, Constants.bloodTypeOpos,
					Constants.reasonForBloodTypeChange);
			Thread.sleep(1000);
			changeBloodType.clickConfirmButton();
		} else {
			changeBloodType.clickExitButton();
		}

		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 2:
		 */
		patientMainMenu.clickRapidStartTransfusionButton();
		CapribedsideRapidStartTransfusionPageFunctions rapidTransfusionFunction = new CapribedsideRapidStartTransfusionPageFunctions();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		rapidTransfusionFunction.verifyDonorCenterCodeDisplay();
		/*
		 * Step 3:
		 */

		rapidTransfusionFunction.selectDonorCenterCode(Constants.donorCenterCode);
		sleniumFunctions.pressEnter();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 4:
		 */
		rapidTransfusionFunction.enterDonorUnitNumber(unitNumber);
		sleniumFunctions.pressEnter();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 5:
		 */
		rapidTransfusionFunction.selectDonorBloodProduct(Constants.bloodProductCRT);
		sleniumFunctions.pressEnter();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 6:
		 */
		rapidTransfusionFunction.checkAntiCMVNegativeBloodProductAttributeCheckbox();
		rapidTransfusionFunction.checkIrradiatedBloodProductAttributeCheckbox();
		rapidTransfusionFunction.clickSaveBloodAttributeButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 7:
		 */
		rapidTransfusionFunction.enterDonorBloodProductExpirationDate(pastDate);
		sleniumFunctions.pressEnter();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 8:
		 */
		rapidTransfusionFunction.enterDonorBloodProductExpirationDate(futureDate);
		sleniumFunctions.pressEnter();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 9
		 */
		rapidTransfusionFunction.selectDonorBloodType(Constants.bloodTypeOpos);
		sleniumFunctions.pressEnter();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 10
		 */
		rapidTransfusionFunction.enterDonorComment(Constants.validComment);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 11:
		 */
		rapidTransfusionFunction.clickDonorContinueButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 12:
		 */
		rapidTransfusionFunction.clickStartRapidTransfusionButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 13:
		 */
		rapidTransfusionFunction.clickCancelPrintRapidTransfusionReportButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 14
		 */
		rapidTransfusionFunction.clickLogoutlink();
		rapidTransfusionFunction.clickYesButtonLogoutPopup();
		capribedsideLogin.capribedsideLogin(Constants.transfusionist, Constants.ADMIN_PASSWORD);
		selectPatientFunctions.scanPatientid(Constants.idPateintB);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 15:
		 */
		patientMainMenu.clickRapidStartTransfusionButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 16:
		 */

		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * String unitNumberISBT = "=A"+unitNumberForISBT;
		 * System.out.println(unitNumberISBT); String ISBTunitNumber =
		 * "=A123406032401";
		 */
		String unitNumberB = commonFunctions.currentDate(Constants.dateFormatForUnitNumber, 0);
		rapidTransfusionFunction.enterDonorUnitNumber(unitNumberB);
		sleniumFunctions.pressEnter();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);

		/*
		 * Step 17:
		 */
		rapidTransfusionFunction.selectDonorBloodProduct(Constants.bloodProductISBTWB);
		sleniumFunctions.pressEnter();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 18:
		 */
		rapidTransfusionFunction.checkAntiCMVNegativeBloodProductAttributeCheckbox();
		rapidTransfusionFunction.checkIrradiatedBloodProductAttributeCheckbox();
		rapidTransfusionFunction.clickSaveBloodAttributeButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 19:NA
		 */
		/*
		 * Step 20:
		 */
		rapidTransfusionFunction.enterDonorBloodProductExpirationDate(pastDate);
		sleniumFunctions.pressEnter();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 21:
		 */
		rapidTransfusionFunction.enterDonorBloodProductExpirationDate(futureDate);
		sleniumFunctions.pressEnter();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 22:
		 */
		rapidTransfusionFunction.selectDonorBloodType(Constants.bloodTypeOpos);
		sleniumFunctions.pressEnter();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 23:
		 */
		rapidTransfusionFunction.enterDonorComment(Constants.validComment);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 24:
		 */
		rapidTransfusionFunction.clickDonorContinueButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 25:
		 */
		rapidTransfusionFunction.clickCosignContinueButton();
		rapidTransfusionFunction.verifyCosignUserIdOrPasswordInvalidErrorMessage();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 26:
		 */
		rapidTransfusionFunction.enterUesrId(Constants.ADMIN_USERNAME);
		rapidTransfusionFunction.enterPassword(Constants.ADMIN_PASSWORD);
		rapidTransfusionFunction.clickCosignContinueButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 27:
		 */
		rapidTransfusionFunction.clickStartRapidTransfusionButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 28:
		 */
		rapidTransfusionFunction.clickCancelPrintRapidTransfusionReportButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 29:
		 */
		rapidTransfusionFunction.clickLogoutlink();
		rapidTransfusionFunction.clickYesButtonLogoutPopup();
		capribedsideLogin.capribedsideLogin(Constants.studentNurse, Constants.ADMIN_PASSWORD);
		selectPatientFunctions.scanPatientid(Constants.idPateintA);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		

	}
	@AfterTest
	public void postTest()
	{
		IEDriver.ieDriver.quit();
	}
}
