package regressionTestPlans;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.Constants;
import com.bridge.utilities.IEDriver;
import com.pageObject.Functions.CapribedsideChangeBloodTypeFunctions;
import com.pageObject.Functions.CapribedsideLoginFunctions;
import com.pageObject.Functions.CapribedsidePatientMainMenuFunctions;
import com.pageObject.Functions.CapribedsideSelectPatientFunctions;
import com.pageObject.Functions.CapribedsideViewReactionInformationFunctions;
import com.pageObject.Functions.SystemManagerBloodTypeChangeReasonPageFunctions;
import com.pageObject.Functions.SystemManagerEditRoleFunctions;
import com.pageObject.Functions.SystemManagerLoginPageFunctions;
import com.pageObject.Functions.SystemManagerMainPageFunction;
import com.pageObject.Functions.SystemManagerReactionInstructionPageFunctions;
import com.pageObject.Functions.SystemManagerRolesFunctions;
import com.pageObject.Functions.SystemManagerTransfusionSettingsPageFunctions;

import multiScreenShot.MultiScreenShot;

public class BRDGTXA_VR_ViewReactionChangeBloodTest {
	SystemManagerLoginPageFunctions systemManager = new SystemManagerLoginPageFunctions(Constants.systemManagerUrl);
	SystemManagerMainPageFunction systemManagerMainMenu = new SystemManagerMainPageFunction();
	SystemManagerRolesFunctions rolesFunctions = new SystemManagerRolesFunctions();
	SystemManagerEditRoleFunctions editRoleFunctions = new SystemManagerEditRoleFunctions();
	SystemManagerTransfusionSettingsPageFunctions transfusionSettings = new SystemManagerTransfusionSettingsPageFunctions();
	SystemManagerBloodTypeChangeReasonPageFunctions bloodTypeChnageReasonFunctions = new SystemManagerBloodTypeChangeReasonPageFunctions();
	SystemManagerReactionInstructionPageFunctions reactionInstructionFunctions = new SystemManagerReactionInstructionPageFunctions();
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/", "BRDGTXA_VR_ViewReactionChangeBloodTest");
	// CapribedsideLoginFunctions capribedsideLogin = new
	// CapribedsideLoginFunctions();

	@BeforeTest
	public void systemManagerSettings() {
		systemManager.adminLogin(); //
		// systemManagerMainMenu.clickTransfusionSettingsButton();
		systemManagerMainMenu.clickRolesButton();
		rolesFunctions.clickEditSystemAdminitserLink();
		editRoleFunctions.checkboxMayAccessChangeBloodTypeWithoutCosignature();
		editRoleFunctions.clickConfirmButton();
		rolesFunctions.clickEditTransfusionistLink();
		editRoleFunctions.checkboxMayAccessChangeBloodTypeWithCosignature();
		editRoleFunctions.clickConfirmButton();
		rolesFunctions.clickBackButton();
		systemManagerMainMenu.clickTransfusionSettingsButton();
		transfusionSettings.clickBloodTypeChangeReasonLink();
		bloodTypeChnageReasonFunctions.clickBackLink();
		transfusionSettings.clickReactionInstructionLink();
		reactionInstructionFunctions.clickBackLink();
		transfusionSettings.clickConfirmButton();
		IEDriver.ieDriver.close();

	}

	@Test
	public void viewReactionChangeBloodTypeTest() throws Throwable {
		/*
		 * Step 1:
		 */
		IEDriver.iEDriver(Constants.capribedsideUrl);
		CapribedsideLoginFunctions capribedsideLogin = new CapribedsideLoginFunctions();
		capribedsideLogin.capribedsideLogin(Constants.ADMIN_USERNAME, Constants.ADMIN_PASSWORD);
		CapribedsideSelectPatientFunctions selectPatientFunctions = new CapribedsideSelectPatientFunctions();
		selectPatientFunctions.scanPatientid(Constants.idPateintA);
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		CapribedsidePatientMainMenuFunctions patientMainMenu = new CapribedsidePatientMainMenuFunctions();
		patientMainMenu.verifyChangeBloodTypeButton();
		patientMainMenu.verifyViewReactionInformationButtonDisplay();
		/*
		 * Step 2:
		 */
		patientMainMenu.clickViewReactionInformationButton();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 3:
		 */
		CapribedsideViewReactionInformationFunctions viewReactionFunctions = new CapribedsideViewReactionInformationFunctions();
		viewReactionFunctions.clickBackButton();
		patientMainMenu.clickChangeBloodTypeButton();
		CapribedsideChangeBloodTypeFunctions changeBloodType = new CapribedsideChangeBloodTypeFunctions();
		changeBloodType.verifyNewBloodTypeDropDownDisplay();
		changeBloodType.verifyConfirmBloodTypeDropDownDisplay();
		changeBloodType.verifyReasonForChangeBloodTypeDropDownDisplay();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		String currentBloodType = changeBloodType.getCurrentBloodType();
		System.out.println("Current BT " + currentBloodType);
		/*
		 * Step 4-5:
		 */
		if (currentBloodType.equals(Constants.bloodTypeOpos)) {
			changeBloodType.changeBloodType(Constants.bloodTypeOneg, Constants.bloodTypeOneg,
					Constants.reasonForBloodTypeChange);
			/*
			 * changeBloodType.selectNewBloodType(Constants.bloodTypeOneg);
			 * changeBloodType.selectConfirmNewBloodType(Constants.bloodTypeOneg
			 * ); changeBloodType.clickReasonForBloodChangeDropDown();
			 * Thread.sleep(2000);
			 * multiScreens.multiScreenShot(IEDriver.ieDriver);
			 * changeBloodType.selectReasonBloodChange(Constants.
			 * reasonForBloodTypeChange);
			 */
			changeBloodType.clickConfirmButton();
			Thread.sleep(2000);
			multiScreens.multiScreenShot(IEDriver.ieDriver);
		} else {
			changeBloodType.changeBloodType(Constants.bloodTypeOpos, Constants.bloodTypeOpos,
					Constants.reasonForBloodTypeChange);
			/*
			 * changeBloodType.selectNewBloodType(Constants.bloodTypeOpos);
			 * changeBloodType.selectConfirmNewBloodType(Constants.bloodTypeOpos
			 * ); changeBloodType.clickReasonForBloodChangeDropDown();
			 * Thread.sleep(2000);
			 * multiScreens.multiScreenShot(IEDriver.ieDriver);
			 * changeBloodType.selectReasonBloodChange(Constants.
			 * reasonForBloodTypeChange);
			 */
			changeBloodType.clickConfirmButton();
			Thread.sleep(2000);
			multiScreens.multiScreenShot(IEDriver.ieDriver);
		}
		/*
		 * Step 6:
		 */
		patientMainMenu.clickLogoutLink();
		capribedsideLogin.capribedsideLogin(Constants.transfusionist, Constants.ADMIN_PASSWORD);
		selectPatientFunctions.scanPatientid(Constants.idPateintA);
		patientMainMenu.verifyChangeBloodTypeButton();
		patientMainMenu.verifyViewReactionInformationButtonDisplay();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 7:
		 */
		patientMainMenu.clickViewReactionInformationButton();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 8:
		 */
		viewReactionFunctions.clickBackButton();
		patientMainMenu.clickChangeBloodTypeButton();
		changeBloodType.verifyNewBloodTypeDropDownDisplay();
		changeBloodType.verifyConfirmBloodTypeDropDownDisplay();
		changeBloodType.verifyReasonForChangeBloodTypeDropDownDisplay();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 9-10:
		 */
		String currentBloodTypeUserB = changeBloodType.getCurrentBloodType();
		System.out.println("Current BT " + currentBloodTypeUserB);
		if (!currentBloodTypeUserB.equals(Constants.bloodTypeOpos)) {
			changeBloodType.changeBloodType(Constants.bloodTypeOpos, Constants.bloodTypeOpos,
					Constants.reasonForBloodTypeChange);
			/*
			 * changeBloodType.selectNewBloodType(Constants.bloodTypeOneg);
			 * changeBloodType.selectConfirmNewBloodType(Constants.bloodTypeOneg
			 * ); changeBloodType.clickReasonForBloodChangeDropDown();
			 * Thread.sleep(2000);
			 * multiScreens.multiScreenShot(IEDriver.ieDriver);
			 * changeBloodType.selectReasonBloodChange(Constants.
			 * reasonForBloodTypeChange);
			 */

		} else {
			changeBloodType.changeBloodType(Constants.bloodTypeOneg, Constants.bloodTypeOneg,
					Constants.reasonForBloodTypeChange);
			/*
			 * changeBloodType.selectNewBloodType(Constants.bloodTypeOpos);
			 * changeBloodType.selectConfirmNewBloodType(Constants.bloodTypeOpos
			 * ); changeBloodType.clickReasonForBloodChangeDropDown();
			 * Thread.sleep(2000);
			 * multiScreens.multiScreenShot(IEDriver.ieDriver);
			 * changeBloodType.selectReasonBloodChange(Constants.
			 * reasonForBloodTypeChange);
			 */
		}
		/*
		 * Step 11:
		 */
		changeBloodType.enterUserId(Constants.ADMIN_USERNAME);
		changeBloodType.navigateToEnterPasswordTextBox();
		changeBloodType.enterPassword(Constants.ADMIN_PASSWORD);
		Thread.sleep(2000);
		changeBloodType.clickConfirmButton();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		IEDriver.ieDriver.close();

	}

	@AfterTest
	public void postTest() {
		IEDriver.ieDriver.quit();
	}
}
