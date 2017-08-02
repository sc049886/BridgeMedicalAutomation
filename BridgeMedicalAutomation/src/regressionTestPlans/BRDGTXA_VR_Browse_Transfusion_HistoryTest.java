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
import com.pageObject.Functions.CapribedsideAdministerDerivativesFunctions;
import com.pageObject.Functions.CapribedsideBrowseTransfusionHistoryPageFunctions;
import com.pageObject.Functions.CapribedsideEndTransfusionPageFunctions;
import com.pageObject.Functions.CapribedsideHoldTransfusionFunctions;
import com.pageObject.Functions.CapribedsideLoginFunctions;
import com.pageObject.Functions.CapribedsidePatientMainMenuFunctions;
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

public class BRDGTXA_VR_Browse_Transfusion_HistoryTest {

	SystemManagerLoginPageFunctions systemManager = new SystemManagerLoginPageFunctions(Constants.systemManagerUrl);
	SystemManagerMainPageFunction systemManagerMainMenu = new SystemManagerMainPageFunction();
	SystemManagerRolesFunctions rolesFunctions = new SystemManagerRolesFunctions();
	SystemManagerEditRoleFunctions editRoleFunctions = new SystemManagerEditRoleFunctions();
	SystemManagerPointsOfCareFunctions selectPoc = new SystemManagerPointsOfCareFunctions();
	SystemManagerEditPocPageFunctions editPoc = new SystemManagerEditPocPageFunctions();
	CommonFunctions commonFunctions = new CommonFunctions();
	SeleniumFunctions seleniumFunctions = new SeleniumFunctions();
	SystemManagerTransfusionSettingsPageFunctions transfusionSettings = new SystemManagerTransfusionSettingsPageFunctions();
	SystemmanagerSelectBloodProductPageFunctions selectBloodProductFunctions = new SystemmanagerSelectBloodProductPageFunctions();
	SystemManagerEditBloodProductPageFunctions editBloodProduct = new SystemManagerEditBloodProductPageFunctions();
	// CapribedsideSelectPatientFunctions selectPatientFunctions = new
	// CapribedsideSelectPatientFunctions();
	String unitNumber_1 = commonFunctions.currentDate(Constants.dateFormatForUnitNumber, 0);
	String unitNumber_2 = commonFunctions.currentDate(Constants.dateFormatForUnitNumber, 1);
	String unitNumber_3 = commonFunctions.currentDate(Constants.dateFormatForUnitNumber, 2);
	String unitNumber_4 = commonFunctions.currentDate(Constants.dateFormatForUnitNumber, 3);
	
	String futureDate = commonFunctions.currentDate(Constants.FORMAT_STANDARD_DATE, 4);
	String pastDate = commonFunctions.currentDate(Constants.FORMAT_STANDARD_DATE, -4);
	String unitNumberForISBT = commonFunctions.currentDate(Constants.FORMAT_HL7_LONG_DATE_TIME, 0);
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/", "BRDGTXA_VR_Browse_Transfusion_HistoryTest");
	//private static ScreenRecorder screenRecorder;

	@BeforeTest
	public void systemManagerSettingsTest() throws InterruptedException, IOException, AWTException {

		// IEDriver.iEDriver(Constants.capribedsideUrl);
		/*GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
		this.screenRecorder = new ScreenRecorder(gc,
		new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
		new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
		CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,DepthKey, 24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f,KeyFrameIntervalKey, 15 * 60),new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)),null);
		this.screenRecorder.start();*/
		systemManager.adminLogin();
		systemManagerMainMenu.clickPointOfCareButton();
		selectPoc.clickEditPed();
		editPoc.selectOptionPromptForVolume(Constants.optionYes);
		editPoc.clickConfirmButton();
		selectPoc.clickBackLink();
		systemManagerMainMenu.clickRolesButton();
		rolesFunctions.clickEditStudentNurseLink();
		editRoleFunctions.uncheckMayMayAccessBrowseTransfusionHistoryCheckbox();
		editRoleFunctions.uncheckMayCorrectTransfusionChackbox();
		editRoleFunctions.clickConfirmButton();
		rolesFunctions.clickEditSystemAdminitserLink();
		editRoleFunctions.checkMayMayAccessBrowseTransfusionHistoryCheckbox();
		editRoleFunctions.checkMayCorrectTransfusionChackbox();
		editRoleFunctions.clickConfirmButton();
		rolesFunctions.clickEditTransfusionistLink();
		editRoleFunctions.checkMayMayAccessBrowseTransfusionHistoryCheckbox();
		editRoleFunctions.checkMayCorrectTransfusionChackbox();
		editRoleFunctions.clickConfirmButton();
		rolesFunctions.clickBackButton();
		IEDriver.ieDriver.quit();
		// IEDriver.ieDriver.quit();
	}

	@Test
	public void browseTransfusionHistoryTest() throws Throwable {
		IEDriver.iEDriver(Constants.capribedsideUrl);
		CapribedsideLoginFunctions capribedsideLogin = new CapribedsideLoginFunctions();
		/*
		 * Step 1 ------"Login to Capribedside as User1 scan patient A, Start
		 * Transfusion,BrowseTransfusion and View Reaction Information Buttons
		 * are active"-----Step 1
		 */
		capribedsideLogin.capribedsideLogin(Constants.studentNurse, Constants.ADMIN_PASSWORD);
		// systemManager.adminLogin();
		CapribedsideSelectPatientFunctions selectPatientFunctions = new CapribedsideSelectPatientFunctions();
		selectPatientFunctions.scanPatientid(Constants.idPateintA);
		Thread.sleep(2000);
		CapribedsidePatientMainMenuFunctions patientMainMenu = new CapribedsidePatientMainMenuFunctions();
		patientMainMenu.verifyBrowseTransfusionHistoryButtonDisplay();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 2:
		 */
		
		patientMainMenu.clickLogoutLink();
		capribedsideLogin.capribedsideLogin(Constants.ADMIN_USERNAME, Constants.ADMIN_PASSWORD);
		selectPatientFunctions.scanPatientid(Constants.idPateintA);
		patientMainMenu.verifyBrowseTransfusionHistoryButtonDisplay();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 3
		 */
		// Transfusion T1
		commonFunctions.startTransfusion(Constants.idPateintA, Constants.namePateintA, unitNumber_1,
				Constants.bloodTypeOpos, Constants.bloodProductPD1, futureDate);
		// Transfusion T2
		commonFunctions.startTransfusion(Constants.idPateintA, Constants.namePateintA, unitNumber_2,
				Constants.bloodTypeOpos, Constants.bloodProductPD1, futureDate);
		// Transfusion T3
		commonFunctions.startTransfusion(Constants.idPateintA, Constants.namePateintA, unitNumber_3,
				Constants.bloodTypeOpos, Constants.bloodProductPD1, futureDate);
		
		//Hold Transfusion T1:
		patientMainMenu.clickHoldTransfusionButton();
		CapribedsideHoldTransfusionFunctions holdTransfusionFunctions = new CapribedsideHoldTransfusionFunctions();
		holdTransfusionFunctions.enterUnitNumber(unitNumber_1);
		seleniumFunctions.pressEnter();
		holdTransfusionFunctions.selectBloodProduct(Constants.bloodProductPD1);
		seleniumFunctions.pressEnter();
		//holdTransfusionFunctions.clickContinueHoldButton();
		String currentDate = commonFunctions.currentDate(Constants.regularDateFormat, 0);
		holdTransfusionFunctions.enterStartHoldDateAndTime(currentDate);
		holdTransfusionFunctions.selectReasonForHold(Constants.reasonForHold);
		holdTransfusionFunctions.clickContinueHoldButton();
		holdTransfusionFunctions.clickCancelPrintButton();
		
		//End Transfusion T2:
		patientMainMenu.clickEndTransfusionButton();
		CapribedsideEndTransfusionPageFunctions endTransfusion = new CapribedsideEndTransfusionPageFunctions();
		endTransfusion.enterUnitNumber(unitNumber_2);
		seleniumFunctions.pressEnter();
		endTransfusion.selectBloodProduct(Constants.bloodProductPD1);
		seleniumFunctions.pressEnter();
		endTransfusion.enterVolumeTransferred(Constants.volumeTransfused);
		endTransfusion.selectTransfusionReaction(Constants.optionNo);
		Thread.sleep(1000);
		endTransfusion.clickContinueVolumePage();
		commonFunctions.recordVitals();
		endTransfusion.clickCancelPrintButton();
		
		//End Transfusion T4:
		patientMainMenu.clickEndTransfusionButton();
		endTransfusion.enterUnitNumber(unitNumber_4);
		seleniumFunctions.pressEnter();
		endTransfusion.clickYesButtonUnitNumberDoesNotMatchRecordedTransfusion();
		endTransfusion.selectBloodProduct(Constants.bloodProductPD1);
		seleniumFunctions.pressEnter();
		endTransfusion.enterVolumeTransferred(Constants.volumeTransfused);
		endTransfusion.selectTransfusionReaction(Constants.optionNo);
		Thread.sleep(1000);
		endTransfusion.clickContinueVolumePage();
		commonFunctions.recordVitals();
		endTransfusion.clickCancelPrintButton();
		
		//Administer Derivative A1.
		patientMainMenu.clickAdministerDerivativeButton();
		CapribedsideAdministerDerivativesFunctions administerDerivative = new CapribedsideAdministerDerivativesFunctions();
		administerDerivative.selectBloodPlasmaDerivative(Constants.bloodPlasmaDerivativeValue_2);
		Thread.sleep(1000);
		administerDerivative.clickConfirmButton();
		//-------------*/
		/*
		 * Step 4
		 */
		patientMainMenu.clickBrowseTransfusionHistoryButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		CapribedsideBrowseTransfusionHistoryPageFunctions browseTransfusionHistory = new CapribedsideBrowseTransfusionHistoryPageFunctions();
		browseTransfusionHistory.clickInfoIconOfTransfusion(unitNumber_1);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 5
		 */
		browseTransfusionHistory.clickReactionButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 6
		 */
		browseTransfusionHistory.clickVitalsButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 7
		 */
		browseTransfusionHistory.clickChecksButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 8
		 */
		browseTransfusionHistory.clickHoldButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 9
		 */
		browseTransfusionHistory.clickBackButtonFromInfoPage();
		browseTransfusionHistory.clickInfoIconOfTransfusion(unitNumber_3);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 10
		 */
		browseTransfusionHistory.clickReactionButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 11
		 */
		browseTransfusionHistory.clickVitalsButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 12
		 */
		browseTransfusionHistory.clickChecksButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 13
		 */
		browseTransfusionHistory.clickHoldButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 14
		 */
		browseTransfusionHistory.clickBackButtonFromInfoPage();
		browseTransfusionHistory.clickInfoIconOfTransfusion(unitNumber_2);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 15
		 */
		browseTransfusionHistory.clickReactionButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 16
		 */
		browseTransfusionHistory.clickVitalsButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 17
		 */
		browseTransfusionHistory.clickChecksButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 18
		 */
		browseTransfusionHistory.clickHoldButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 19
		 */
		browseTransfusionHistory.clickBackButtonFromInfoPage();
		browseTransfusionHistory.clickInfoIconOfAdministeredDerivative();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 20
		 */
		browseTransfusionHistory.clickBackButtonFromInfoPage();
		browseTransfusionHistory.clickInfoIconOfTransfusion(unitNumber_4);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 21
		 */
		browseTransfusionHistory.clickReactionButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 22
		 */
		browseTransfusionHistory.clickVitalsButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 23
		 */
		browseTransfusionHistory.clickChecksButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 24
		 */
		browseTransfusionHistory.clickHoldButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 25
		 */
		System.out.println("Done");
		browseTransfusionHistory.clickBackButtonFromInfoPage();
		browseTransfusionHistory.clickEditIcon(unitNumber_4);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 26
		 */
		String currentDate_1 = commonFunctions.currentDate(Constants.regularDateFormat, 0);
		browseTransfusionHistory.enterEndTransfusionDateEditTransfusion(currentDate_1);
		browseTransfusionHistory.enterVolumeEditTransfusion(Constants.volumeTransfusedAfterEdit);
		Thread.sleep(1000);
		browseTransfusionHistory.clickConfirmButtonEditTransfusion();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 27
		 */
		browseTransfusionHistory.clickInfoIconEndedColumn(unitNumber_4);
		browseTransfusionHistory.clickInfoIconVolumeColumn(unitNumber_4);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 28
		 */
		browseTransfusionHistory.clickInfoIconOfTransfusion(unitNumber_4);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		
		/*
		 * Step 29
		 */
		browseTransfusionHistory.clickBackButtonFromInfoPage();
		Thread.sleep(1000);
		browseTransfusionHistory.clickEditIconOfAdministerDerivative("Test");
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		//IEDriver.ieDriver.findElement(By.xpath("//tr[2][td[contains(text(),'Test01')]]/td[1]/a")).click();
		/*
		 * Step 30
		 */
		String currentDate_2 = commonFunctions.currentDate(Constants.regularDateFormat, 0);
		browseTransfusionHistory.enterAdministerDateForBloodPlasmaDerivative(currentDate_2);
		browseTransfusionHistory.clickConfirmButtonEditBloodplasmaDerivative();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 31
		 */
		browseTransfusionHistory.clickInfoIconOfAdministeredDerivative();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 32
		 */
		browseTransfusionHistory.clickBackButtonFromInfoPage();
		browseTransfusionHistory.clickBackButtonBrowseTransfusionHistoryPage();
		patientMainMenu.clickLogoutLink();
		capribedsideLogin.capribedsideLogin(Constants.transfusionist, Constants.ADMIN_PASSWORD);
		selectPatientFunctions.scanPatientid(Constants.idPateintA);
		patientMainMenu.clickBrowseTransfusionHistoryButton();
		browseTransfusionHistory.clickEditIcon(unitNumber_4);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 33
		 */
		String currentDate_3 = commonFunctions.currentDate(Constants.regularDateFormat, 0);
		browseTransfusionHistory.enterEndTransfusionDateEditTransfusion(currentDate_3);
		browseTransfusionHistory.selectBloodProductEditTransfusion(Constants.bloodProductCRT);
		browseTransfusionHistory.enterVolumeEditTransfusion(Constants.volumeTransfusedAfterEdit_2);
		Thread.sleep(1000);
		browseTransfusionHistory.clickConfirmButtonEditTransfusion();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 34
		 */
		browseTransfusionHistory.clickInfoIconEndedColumn(unitNumber_4);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 35
		 */
		browseTransfusionHistory.clickInfoIconProductNameColumn(unitNumber_4);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 36
		 */
		browseTransfusionHistory.clickNoHyperlinkReactionsColumn(unitNumber_2);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 37
		 */
		browseTransfusionHistory.checkAnaphylaxisCheckbox();
		browseTransfusionHistory.checkElevatedTemperatureCheckbox();
		Thread.sleep(2000);
		browseTransfusionHistory.clickContinueButtonPostTransfusionReaction();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 38
		 */
		browseTransfusionHistory.clickContinueButtonPostTransfusionReaction();
		commonFunctions.recordVitals();
		//IEDriver.ieDriver.quit();
		browseTransfusionHistory.clickCancelPrintButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step 39
		 */
		browseTransfusionHistory.clickInfoIconOfTransfusion(unitNumber_2);
		browseTransfusionHistory.clickReactionButton();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		
	
	}
	@AfterTest
	public void postTest() throws Throwable
	{
		
		IEDriver.ieDriver.quit();
	}
}
