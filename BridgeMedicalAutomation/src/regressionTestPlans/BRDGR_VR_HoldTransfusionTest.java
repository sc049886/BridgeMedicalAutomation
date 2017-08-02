package regressionTestPlans;
import static org.monte.media.FormatKeys.EncodingKey;
import static org.monte.media.FormatKeys.FrameRateKey;
import static org.monte.media.FormatKeys.KeyFrameIntervalKey;
import static org.monte.media.FormatKeys.MIME_AVI;
import static org.monte.media.FormatKeys.MediaTypeKey;
import static org.monte.media.FormatKeys.MimeTypeKey;
import static org.monte.media.VideoFormatKeys.CompressorNameKey;
import static org.monte.media.VideoFormatKeys.DepthKey;
import static org.monte.media.VideoFormatKeys.ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE;
import static org.monte.media.VideoFormatKeys.QualityKey;

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.Constants;
import com.bridge.utilities.IEDriver;
import com.bridge.utilities.SeleniumFunctions;
import com.pageObject.Functions.CapribedsideBrowseTransfusionHistoryPageFunctions;
import com.pageObject.Functions.CapribedsideHoldTransfusionFunctions;
import com.pageObject.Functions.CapribedsideLoginFunctions;
import com.pageObject.Functions.CapribedsidePatientMainMenuFunctions;
import com.pageObject.Functions.CapribedsideSelectPatientFunctions;
import com.pageObject.Functions.CapribedsideStartTransfusionFunctions;
import com.pageObject.Functions.SystemManagerEditPocPageFunctions;
import com.pageObject.Functions.SystemManagerEditRoleFunctions;
import com.pageObject.Functions.SystemManagerLoginPageFunctions;
import com.pageObject.Functions.SystemManagerMainPageFunction;
import com.pageObject.Functions.SystemManagerPointsOfCareFunctions;
import com.pageObject.Functions.SystemManagerRolesFunctions;

import multiScreenShot.MultiScreenShot;

public class BRDGR_VR_HoldTransfusionTest {

	SystemManagerLoginPageFunctions systemManager = new SystemManagerLoginPageFunctions(Constants.systemManagerUrl);
	SystemManagerMainPageFunction systemManagerMainMenu = new SystemManagerMainPageFunction();
	SystemManagerRolesFunctions rolesFunctions = new SystemManagerRolesFunctions();
	SystemManagerEditRoleFunctions editRoleFunctions = new SystemManagerEditRoleFunctions();
	SystemManagerPointsOfCareFunctions selectPoc = new SystemManagerPointsOfCareFunctions();
	SystemManagerEditPocPageFunctions editPoc = new SystemManagerEditPocPageFunctions();
	CommonFunctions commonFunctions = new CommonFunctions();
	SeleniumFunctions sleniumFunctions = new SeleniumFunctions();
	// CapribedsideSelectPatientFunctions selectPatientFunctions = new
	// CapribedsideSelectPatientFunctions();
	String unitNumber = commonFunctions.currentDate(Constants.dateFormatForUnitNumber, 0);
	String currentDate = commonFunctions.currentDate(Constants.regularDateFormat, 0);
	String futureDate = commonFunctions.currentDate(Constants.regularDateFormat, 4);
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/", "BRDGRegressionHoldTransfusionTest");
	private static ScreenRecorder screenRecorder;

	@BeforeTest
	public void systemManagerSettingsTest() throws InterruptedException, IOException, AWTException {

		// IEDriver.iEDriver(Constants.capribedsideUrl);
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
		this.screenRecorder = new ScreenRecorder(gc,
		new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
		new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
		CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,DepthKey, 24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f,KeyFrameIntervalKey, 15 * 60),new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)),null);
		this.screenRecorder.start();
		systemManager.adminLogin();
		systemManagerMainMenu.clickRolesButton();
		rolesFunctions.clickEditSystemAdminitserLink();
		editRoleFunctions.checkMayStartTransfusionWithoutCosignatureCheckbox();
		editRoleFunctions.clickConfirmButton();
		rolesFunctions.clickEditTransfusionistLink();
		editRoleFunctions.uncheckMayStartTransfusionWithoutCosignatureCheckbox();
		editRoleFunctions.checkMayStartTransfusionWithCosignatureCheckbox();
		editRoleFunctions.uncheckMayHoldtTransfusionCheckbox();
		editRoleFunctions.clickConfirmButton();
		rolesFunctions.clickBackButton();
		systemManagerMainMenu.clickPointOfCareButton();
		selectPoc.clickEditPed();
		editPoc.selectOptionForCheckPatientName(Constants.optionYes);
		editPoc.clickConfirmButton();
		IEDriver.ieDriver.quit();

		// IEDriver.ieDriver.quit();

	}

	@Test
	public void holdTransfusionTest() throws InterruptedException, IOException {
		// IEDriver ieDriver = new IEDriver(Constants.capribedsideUrl);
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
		patientMainMenu.verifyStartTransfusionButtonDisplay();
		patientMainMenu.verifyBrowseTransfusionHistoryButtonDisplay();
		patientMainMenu.verifyViewReactionInformationButtonDisplay();
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step ----- 2 '--Action--'- Click on Start transfusion. Start a
		 * transfusion. Complete the process. '--Expected Result--'-Main menu
		 * page with ‘Transfusion started mm/dd/yyyy hh:mm’ displayed below
		 * Start Transfusion tab, and Hold Transfusion tab is active. -----2
		 */
		patientMainMenu.clickStartTransfusionButton();
		CapribedsideStartTransfusionFunctions startTransfusionFunctions = new CapribedsideStartTransfusionFunctions();
		startTransfusionFunctions.enterRecipientPatientIDTextbox(Constants.idPateintA);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.enterRecipientPatientName(Constants.namePateintA);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.enterRecipientUnitNumber(unitNumber);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.selectRecipientBloodType(Constants.bloodTypeOpos);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.clickRecipientContinueButton();
		startTransfusionFunctions.selectDonorCenterCode(Constants.donorCenterCode);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.enterDonorUnitNumber(unitNumber);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.selectDonorBloodProduct(Constants.bloodProductPD1);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.enterDonorBloodProductExpirationDate(futureDate);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.selectDonorBloodType(Constants.bloodTypeOpos);
		sleniumFunctions.pressEnter();
		// startTransfusionFunctions.clickDonorContinueButton();
		commonFunctions.recordVitals();
		startTransfusionFunctions.checkOriginalTransOrderCheckBox();
		startTransfusionFunctions.enterSecondOrderVerification(Constants.secondOrderVerificationBy);
		startTransfusionFunctions.checkSignedConsentCheckBox();
		startTransfusionFunctions.clickChecksContinueButton();
		startTransfusionFunctions.clickStartButtonStartTransfusionPage();
		startTransfusionFunctions.clickCancelButtonPrintReportPage();
		Thread.sleep(1000);
		patientMainMenu.verifyTransfusionStartedTagDisplay();
		patientMainMenu.verifyHoldTransfusionButtonDisplay();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step ----- 3 '--Action--'- Click on Hold transfusion tab. '--Expected
		 * Result--'d *Blood product dropdown field, dithered Continue and Exit
		 * button. A list of active transfusions with started date and time,
		 * Unit #, Blood product and Blood type is also displayed. Step -----3
		 */
		patientMainMenu.clickHoldTransfusionButton();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		CapribedsideHoldTransfusionFunctions holdTransfusionFunctions = new CapribedsideHoldTransfusionFunctions();
		/*
		 * Step ------ 4 Action- Enter the unit number of recently started
		 * transfusion Expected Result- Entered unit number accepted and Blood
		 * product field is active.
		 * 
		 */
		holdTransfusionFunctions.enterUnitNumber(unitNumber);
		sleniumFunctions.pressEnter();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step ------ 5 "---Action---"- Select same blood product used while
		 * starting the transfusion and Click on Continue.
		 * "--Expected Result--"- Hold page with- dithered Start Transfusion
		 * Date and Time: mm/dd/yyyy hh:mm, active *Start Hold Date and Time
		 * field, active Reason for Hold dropdown, active End Hold Date and Time
		 * field, active Comments field, active Continue and Exit button is
		 * displayed.
		 * 
		 */
		holdTransfusionFunctions.selectBloodProduct(Constants.bloodProductPD1);
		sleniumFunctions.pressEnter();
		holdTransfusionFunctions.clickContinueButton();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step ------ 6 "--Action--"- Click on Exit and then on yes. Click on
		 * Hold transfusion tab. "--Expected Result--" - Unit/Product page is
		 * displayed with active *Unit number field, dithered *Blood product
		 * dropdown field, dithered Continue and Exit button. A list of active
		 * transfusions with started date and time, Unit #, Blood product and
		 * Blood type is also displayed.
		 * 
		 */
		holdTransfusionFunctions.clickExitHoldButton();
		holdTransfusionFunctions.clickYesButtonExitHoldPopup();
		patientMainMenu.clickHoldTransfusionButton();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		//--------------
		/*
		 * Step ------ 7 "--Action--"- Select the recently started transfusion
		 * and click on Continue. "--Expected Result--" - Hold page with-
		 * dithered Start Transfusion Date and Time: mm/dd/yyyy hh:mm, active
		 * *Start Hold Date and Time field, active Reason for Hold dropdown,
		 * active End Hold Date and Time field, active Comments field, active
		 * Continue and Exit button is displayed.
		 * 
		 */
		holdTransfusionFunctions.enterUnitNumber(unitNumber);
		sleniumFunctions.pressEnter();
		holdTransfusionFunctions.selectBloodProduct(Constants.bloodProductPD1);
		sleniumFunctions.pressEnter();
		holdTransfusionFunctions.clickContinueButton();
		holdTransfusionFunctions.verifyErrorMessageStartHoldAndTimeFieldRequiresValue();
		holdTransfusionFunctions.veriyErrorMessageReasonForHoldRequire();
		holdTransfusionFunctions.clickContinueHoldButton();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step ------ 8 "--Action--"- Select Start Hold Date and Time in
		 * future. Click on Continue. "--Expected Result--" - 2 messages –‘Hold
		 * transfusions cannot occur more than 5 hours after the start of the
		 * transfusion.’ and ‘Reason For Hold field requires a value.’ is
		 * displayed.
		 * 
		 */
		holdTransfusionFunctions.enterStartHoldDateAndTime(futureDate);
		holdTransfusionFunctions.clickContinueHoldButton();
		holdTransfusionFunctions.verifyErrorMessageStartHoldAndTimeFieldRequiresValue();
		holdTransfusionFunctions.veriyErrorMessageReasonForHoldRequire();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step ------ 9 "--Action--"- Select a reason and click on Continue.
		 * "--Expected Result--" - Message ‘Hold transfusions cannot occur more
		 * than 5 hours after the start of the transfusion.’ is displayed.
		 * 
		 */
		holdTransfusionFunctions.enterStartHoldDateAndTime(futureDate);
		holdTransfusionFunctions.selectReasonForHold(Constants.reasonForHold);
		holdTransfusionFunctions.clickContinueHoldButton();
		holdTransfusionFunctions.verifyErrorMessageStartHoldAndTimeFieldRequiresValue();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step ------ 10 "--Action--"- Enter End Hold Date and Time and
		 * ‘<Script>alert("Hi")</script>’ in Comments field.
		 * "--Expected Result--" -2 Messages ‘Hold transfusions cannot occur
		 * more than 5 hours after the start of the transfusion.’ And ‘Comment
		 * contains invalid characters.’ are displayed
		 * 
		 */
		// IEDriver.ieDriver.navigate().refresh();
		holdTransfusionFunctions.enterStartHoldDateAndTime(futureDate);
		holdTransfusionFunctions.selectReasonForHold(Constants.reasonForHold);
		holdTransfusionFunctions.enterComment(Constants.invalidComment);
		holdTransfusionFunctions.clickContinueHoldButton();
		holdTransfusionFunctions.verifyErrorMessageStartHoldAndTimeFieldRequiresValue();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step ------ 11 "--Action--"- Correct the Start Hold Date and Time (in
		 * between the start transfusion date and time and current date and
		 * time). Enter ‘testing’ as comments and click on Continue.
		 * "--Expected Result--" -Transfusion Report form is displayed with
		 * option to Cancel and Print.
		 * 
		 */
		// IEDriver.ieDriver.navigate().refresh();
		//-----------
		String presentDateTime = commonFunctions.currentDate(Constants.regularDateFormat, 0);
		//holdTransfusionFunctions.selectReasonForHold(Constants.reasonForHold);
		holdTransfusionFunctions.enterStartHoldDateAndTime(presentDateTime);
		holdTransfusionFunctions.enterComment(Constants.validComment);
		holdTransfusionFunctions.clickContinueHoldButton();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step ------ 12 "--Action--"- Click on Cancel Print.
		 * "--Expected Result--" -Home page is displayed.
		 * 
		 */
		holdTransfusionFunctions.clickCancelPrintButton();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step ------ 13 "--Action--"- Go to Browse Transfusion History > info
		 * of recently holded transfusion > Holds tab "--Expected Result--" Hold
		 * Started, Hold Ended, Reason, Additional Info/Comment and User are
		 * displayed.
		 * 
		 */
		patientMainMenu.clickBrowseTransfusionHistoryButton();
		Thread.sleep(2000);
		IEDriver.ieDriver.findElement(By.xpath("//tr[td[contains(text(),'" + unitNumber + "')]]/td/a/img")).click();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);

		/*
		 * Step ------ 14 "--Action--"- Go to Hold Transfusion. Select same unit
		 * number and blood product. Only enter the start hold date and time and
		 * a reason for Reason for hold field. Click on Confirm.
		 * "--Expected Result--" Main Menu page displayed with ‘Transfusion
		 * started mm/dd/yyyy hh:mm’ below Start transfusion tab and ‘Hold
		 * started mm/dd/yyyy hh:mm’ below Hold Transfusion tab..
		 * 
		 */
		CapribedsideBrowseTransfusionHistoryPageFunctions browseTransfusionHistory = new CapribedsideBrowseTransfusionHistoryPageFunctions();
		browseTransfusionHistory.clickHoldButton();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		browseTransfusionHistory.clickBackButtonFromInfoPage();
		browseTransfusionHistory.clickBackButtonBrowseTransfusionHistoryPage();
		patientMainMenu.clickHoldTransfusionButton();
		holdTransfusionFunctions.enterUnitNumber(unitNumber);
		sleniumFunctions.pressEnter();
		holdTransfusionFunctions.selectBloodProduct(Constants.bloodProductPD1);
		sleniumFunctions.pressEnter();
		holdTransfusionFunctions.clickContinueButton();
		/*
		 * String presentDateTimeB =
		 * commonFunctions.currentDate(Constants.regularDateFormat, 0);
		 * holdTransfusionFunctions.enterStartHoldDateAndTime(presentDateTimeB);
		 * holdTransfusionFunctions.selectReasonForHold(Constants.reasonForHold)
		 * ; holdTransfusionFunctions.clickContinueHoldButton();
		 * Thread.sleep(2000); multiScreens.multiScreenShot(IEDriver.ieDriver);
		 * holdTransfusionFunctions.clickCancelPrintButton();
		 * Thread.sleep(2000); multiScreens.multiScreenShot(IEDriver.ieDriver);
		 */
		/*
		 * Step ------ 15 "--Action--"- Go to Browse Transfusion History > info
		 * of recently holded transfusion > Holds tab "--Expected Result--" 2
		 * hold events with Hold Started, Hold Ended (if any), Reason,
		 * Additional Info/Comment (if any) and User are displayed.
		 * 
		 */
		/*
		 * patientMainMenu.clickBrowseTransfusionHistoryButton();
		 * Thread.sleep(2000);
		 * IEDriver.ieDriver.findElement(By.xpath("//tr[td[contains(text(),'" +
		 * unitNumber + "')]]/td/a/img")).click(); Thread.sleep(2000);
		 * multiScreens.multiScreenShot(IEDriver.ieDriver);
		 */
		/*
		 * Step ------ 16 "--Action--"- Go to Hold Transfusion.
		 * "--Expected Result--" Hold page with- dithered Start Transfusion Date
		 * and Time: mm/dd/yyyy hh:mm, dithered *Start Hold Date and Time field,
		 * dithered Reason for Hold dropdown, active End Hold Date and Time
		 * field, active Comments field, active Continue and Exit button is
		 * displayed.
		 * 
		 */
		/*
		 * browseTransfusionHistory.clickHoldButton(); Thread.sleep(2000);
		 * multiScreens.multiScreenShot(IEDriver.ieDriver);
		 * browseTransfusionHistory.clickBackButtonFromInfoPage();
		 * browseTransfusionHistory.clickBackButtonBrowseTransfusionHistoryPage(
		 * ); patientMainMenu.clickHoldTransfusionButton();
		 * holdTransfusionFunctions.enterUnitNumber(unitNumber);
		 * sleniumFunctions.pressEnter();
		 * holdTransfusionFunctions.selectBloodProduct(Constants.bloodProductPD1
		 * ); sleniumFunctions.pressEnter();
		 * holdTransfusionFunctions.clickContinueButton();
		 */
		/*
		 * Step ------ 17 "--Action--"- Enter end hold date and time. Enter
		 * comments and click on Confirm. "--Expected Result--" Transfusion
		 * Report Form displayed.
		 * 
		 */
		String tomorrowsDate = commonFunctions.currentDate(Constants.regularDateFormat, 1);
		holdTransfusionFunctions.enterEndHoldDateAndTime(tomorrowsDate);
		holdTransfusionFunctions.enterComment(Constants.validComment);
		holdTransfusionFunctions.clickContinueHoldButton();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step ------ 18 "--Action--"- Enter end hold date and time. Enter
		 * comments and click on Confirm. "--Expected Result--" Transfusion
		 * Report Form displayed.
		 * 
		 */
		holdTransfusionFunctions.clickCancelPrintButton();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step ------ 19 "--Action--"- Go to Browse Transfusion History > info
		 * of recently holded transfusion > Holds tab "--Expected Result--" 2
		 * hold events with Hold Started, Hold Ended, Reason, Additional
		 * Info/Comment and User are displayed.
		 * 
		 */
		patientMainMenu.clickBrowseTransfusionHistoryButton();
		Thread.sleep(2000);
		IEDriver.ieDriver.findElement(By.xpath("//tr[td[contains(text(),'" + unitNumber + "')]]/td/a/img")).click();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		browseTransfusionHistory.clickHoldButton();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(IEDriver.ieDriver);
		/*
		 * Step ------ 20 "--Action--"- Logout and login with User 2
		 * "--Expected Result--" Main Menu page displayed with active Start
		 * transfusion, Browse Transfusion History and View Reaction
		 * Information.
		 * 
		 */
		browseTransfusionHistory.clickBackButtonFromInfoPage();
		browseTransfusionHistory.clickBackButtonBrowseTransfusionHistoryPage();
		patientMainMenu.clickLogoutLink();
		capribedsideLogin.capribedsideLogin(Constants.transfusionist, Constants.ADMIN_PASSWORD);
		selectPatientFunctions.scanPatientid(Constants.idPateintA);
		Thread.sleep(2000);
		patientMainMenu.clickStartTransfusionButton();
		startTransfusionFunctions.enterRecipientPatientIDTextbox(Constants.idPateintA);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.enterRecipientPatientName(Constants.namePateintA);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.enterRecipientUnitNumber(unitNumber);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.selectRecipientBloodType(Constants.bloodTypeOpos);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.clickRecipientContinueButton();
		startTransfusionFunctions.selectDonorCenterCode(Constants.donorCenterCode);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.enterDonorUnitNumber(unitNumber);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.selectDonorBloodProduct(Constants.bloodProductPD1);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.enterDonorBloodProductExpirationDate(futureDate);
		sleniumFunctions.pressEnter();
		startTransfusionFunctions.selectDonorBloodType(Constants.bloodTypeOpos);
		sleniumFunctions.pressEnter();
		// startTransfusionFunctions.clickDonorContinueButton();
		startTransfusionFunctions.enterUesrId(Constants.cosignUserID);
		startTransfusionFunctions.enterUesrId(Constants.ADMIN_PASSWORD);
		startTransfusionFunctions.clickCosignContinueButton();
		commonFunctions.recordVitals();
		startTransfusionFunctions.checkOriginalTransOrderCheckBox();
		startTransfusionFunctions.enterSecondOrderVerification(Constants.secondOrderVerificationBy);
		startTransfusionFunctions.checkSignedConsentCheckBox();
		startTransfusionFunctions.clickChecksContinueButton();
		startTransfusionFunctions.clickStartButtonStartTransfusionPage();
		Thread.sleep(2000);
		startTransfusionFunctions.clickCancelButtonPrintReportPage();
		IEDriver.ieDriver.quit();
		this.screenRecorder.stop();

	}

	@AfterTest
	public void afterTest() throws IOException {
		//this.screenRecorder.stop();
		//IEDriver.ieDriver.quit();

	}
}
