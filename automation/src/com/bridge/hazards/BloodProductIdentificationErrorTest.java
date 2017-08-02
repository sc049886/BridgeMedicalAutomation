package com.bridge.hazards;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.bridge.utilities.BloodTransfusionCommonFunctionality;
import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.pageObject.Functions.SystemManagerEditPocPageFunctions;
import com.pageObjects.CapribedsideAdministerBottlesPage;
import com.pageObjects.CapribedsideLoginPage;
import com.pageObjects.CapribedsidePatientMainPage;
import com.pageObjects.CapribedsideStartTransfusionPage;
import com.pageObjects.SystemManagerEditPocPage;
import com.pageObjects.SystemManagerMainPage;
import com.pageObjects.SystemManagerPointsOfCarePage;
import com.relevantcodes.extentreports.LogStatus;

import multiScreenShot.MultiScreenShot;


public class BloodProductIdentificationErrorTest 
{
	String FilePath = "C:\\Temp\\BloodProductIdentificationErrorTest.html";
	String TestName = "PatientIdentificationErrorTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","BloodProductIdentificationErrorTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	CommonFunctions communfunction = new CommonFunctions();
    CapribedsideAdministerBottlesPage cap = new CapribedsideAdministerBottlesPage();
    CapribedsideLoginPage login = new CapribedsideLoginPage();
	SystemManagerMainPage sysManagerMainPage = new SystemManagerMainPage();
	SystemManagerPointsOfCarePage selectPoc = new SystemManagerPointsOfCarePage();
	SystemManagerEditPocPage editPoc = new SystemManagerEditPocPage();
	SystemManagerEditPocPageFunctions editpocpagefunctions = new SystemManagerEditPocPageFunctions();
	CapribedsidePatientMainPage mainPage = new CapribedsidePatientMainPage();
	CapribedsideStartTransfusionPage stTransPage = new CapribedsideStartTransfusionPage();
	BloodTransfusionCommonFunctionality transfusionCommonFunctionalities = new BloodTransfusionCommonFunctionality();
    //private static ScreenRecorder screenRecorder;
    String unitNo= communfunction.uniqueNumber(-1);
    //String unitNo = uniqueNo;
    String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedsideUrl = "http://10.162.106.174/TransSpec2016010410/CapriBedside/Login.aspx";
	String superuser = "Superuser";
	String password = "123";
	String secondaryIdentifierOptionNone = "None";
    @BeforeTest
	final void startRecording() throws Throwable
	{
    	/* Code for screen record
	GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
	this.screenRecorder = new ScreenRecorder(gc,
	new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
	new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,DepthKey, 24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f,KeyFrameIntervalKey, 15 * 60),new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)),null);
	this.screenRecorder.start();
	*/
	 iedriver.callDriver(sysmanUrl);
 	  Thread.sleep(1000);
 	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 	  communfunction.login(sysmanUrl, superuser, password);
 	  communfunction.waitForElement("PointsOfCare_cmdButton");
 	  sysManagerMainPage.button_PointsOfCare().click();
 	  communfunction.waitForElement("dlPoc__ctl13_editLink");
 	  selectPoc.editPocPeds().click();
 	  communfunction.waitForElement("lnkPreChecks");
	  editPoc.linkModifyChecksTransfusionSettings().click();
	  Thread.sleep(2000);
	  boolean b1 = editPoc.checkboxCheckTheOriginalTransfusionOrder().isSelected();
	  if(b1)
	  {
		 
		  editPoc.checkboxCheckTheOriginalTransfusionOrder().click(); 
	  }
	 
	  editPoc.linkBackModifyChecksTransfusionSettings().click();
	  editpocpagefunctions.selectUtilizeSecondaryIdentifier(secondaryIdentifierOptionNone);
	  editpocpagefunctions.selectYesOrNoForCheckCenterCode("Yes");
	  editPoc.buttonConfirm().click();
	  //communfunction.waitForElement("lnkPreChecks");
	  selectPoc.close();
	  
	}
    
	@AfterTest
	final void stopRecording() throws Exception
	{
	//this.screenRecorder.stop();
	iedriver.driver.quit();
	}
	
    
  @Test
  public void IdentificationErrorTest() throws Throwable 
  {
	
	
	  iedriver.callDriver(capribedsideUrl);
 	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 	  communfunction.waitForElement("UserId");
 	  communfunction.login(capribedsideUrl,superuser, password);
 	  communfunction.waitForElement("txtPatientId");
 	  communfunction.scanpatientid("635201");
	  communfunction.waitForElement("cmdStartTransfusion_cmdButton");
	  Actions act = new Actions(iedriver.driver); 
	  mainPage.startTransfusionButton().click();
	  communfunction.waitForElement("txtPatientId");
	  transfusionCommonFunctionalities.scanRacipientPatientID("*635201");
	  Thread.sleep(1000);
	  communfunction.waitForElement("txtPatientName");
	  transfusionCommonFunctionalities.scanRacipientPatientName("TIMMONS, BABY BOY");
	  communfunction.waitForElement("txtUnitNumber");
	 stTransPage.scanRacipientUnitNumber().sendKeys(unitNo);
	 act.sendKeys(Keys.ENTER).perform();
	 communfunction.waitForElement("lstBloodType");
	 Thread.sleep(1000);
	 transfusionCommonFunctionalities.selectPatientBloodType(1);
	 act.sendKeys(Keys.ENTER).perform();
	 //communfunction.waitForElement("cmdOK");
	 Thread.sleep(1000);
	 stTransPage.racipientContinueButton().click();
	 Thread.sleep(2000);
	 multiScreens.multiScreenShot(iedriver.driver);
	 iedriver.extent_Test().log(LogStatus.PASS, "Step 01 Passed");
	 communfunction.waitForElement("lstCenterCode");
	 transfusionCommonFunctionalities.donorCenterCodeDropDown(2);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(1000);
	 communfunction.waitForElement("txtUnitNumber");
	 stTransPage.donorScanUnitNumber().sendKeys("234");
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 multiScreens.multiScreenShot(iedriver.driver);
	 iedriver.extent_Test().log(LogStatus.PASS, "Step 02 Passed");
	 communfunction.waitForElement("StartTransfusionEvent_UnitNumber");
	 String expected = "This unit number does not match the unit number on the crossmatch recipient label";
	// String actual = stTransPage.donorUnitNumberMissmatchErrorMsg().getText();
	 Assert.assertEquals(stTransPage.donorUnitNumberMissmatchErrorMsg().isDisplayed(), true);
	 //transfusionCommonFunctionalities.donorUnitNumberMissMatchErrorMsg();
	 Thread.sleep(1000);
	 stTransPage.donorScanUnitNumber().clear();
	 stTransPage.donorScanUnitNumber().sendKeys(unitNo);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 multiScreens.multiScreenShot(iedriver.driver);
	 iedriver.extent_Test().log(LogStatus.PASS, "Step 03 Passed");
	 transfusionCommonFunctionalities.scanDonorBloodProduct("=<E0053V003");
	 communfunction.waitForElement("StartTransfusionEvent_BloodProduct");
	 //multiScreens.multiScreenShot(iedriver.driver);
	 iedriver.extent_Test().log(LogStatus.PASS, "Step 04 Passed");
	 Assert.assertEquals(stTransPage.donorBloodProductErrorMsg().isDisplayed(), true);
	 //transfusionCommonFunctionalities.donorNonExistingBloodProdScanErrorMsg();
	 multiScreens.multiScreenShot(iedriver.driver);
	 transfusionCommonFunctionalities.donorBloodProduct(4);
	 act.sendKeys(Keys.ENTER).perform();
	 communfunction.waitForElement("dpExpirationDate_foo");
	 String nextDate = communfunction.currentDate("MM/dd/yyyy HH:mm",+2);
	 stTransPage.donorBloodProductExipreDate().sendKeys(nextDate);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 multiScreens.multiScreenShot(iedriver.driver);
	 iedriver.extent_Test().log(LogStatus.PASS, "Step 05 Passed");
	 //communfunction.waitForElement("lstBloodType");
	 transfusionCommonFunctionalities.donorBloodType(4);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(1000);
	 communfunction.waitForElement("_vitals_txtTemperature");
	 stTransPage.vitalsTempTextBoxFar().clear();
	 communfunction.waitForElement("_vitals_txtTemperature");
	 stTransPage.vitalsTempTextBoxFar().sendKeys("95");
	 communfunction.waitForElement("_vitals_lstTemperatureSite");
	 transfusionCommonFunctionalities.vitalsTempSite(2);
	 Thread.sleep(1000);
	 communfunction.waitForElement("_vitals_txtHeartRate");
	 stTransPage.vitalsHeartRateTextBox().clear();
	 communfunction.waitForElement("_vitals_txtHeartRate");
	 stTransPage.vitalsHeartRateTextBox().sendKeys("82");
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(1000);
	 communfunction.waitForElement("_vitals_txtSystolic");
	 stTransPage.vitalsSystolicBloodPressureTextBox().clear();
	 communfunction.waitForElement("_vitals_txtSystolic");
	 stTransPage.vitalsSystolicBloodPressureTextBox().sendKeys("120");
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(1000);
	 communfunction.waitForElement("_vitals_txtDiastolic");
	 stTransPage.vitalsDiastolicBloodPressureTextBox().clear();
	 communfunction.waitForElement("_vitals_txtDiastolic");
	 stTransPage.vitalsDiastolicBloodPressureTextBox().sendKeys("83");
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(1000);
	 communfunction.waitForElement("_vitals_txtRespirations");
	 stTransPage.vitalsRespirationTextBox().clear();
	 communfunction.waitForElement("_vitals_txtRespirations");
	 stTransPage.vitalsRespirationTextBox().sendKeys("18");
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(1000);
	 communfunction.waitForElement("_vitals_txtOxygenSaturation");
	 stTransPage.vitalsOxygenSaturationTextBox().clear();
	 communfunction.waitForElement("_vitals_txtOxygenSaturation");
	 stTransPage.vitalsOxygenSaturationTextBox().sendKeys("92");
	 communfunction.waitForElement("_vitals_cont");
	 stTransPage.vitalsContinueButton().click();
	 Thread.sleep(1000);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(1000);
	 communfunction.waitForElement("grdChecks__ctl2_checkboxSelect");
	 stTransPage.checksOriginalTransOrderCheckBox().click();
	 stTransPage.checksSecondOrderVerificationTextBox().sendKeys("Nancy");
	 stTransPage.checksSignedConsentCheckBox().click();
	 stTransPage.checksContinueButton().click();
	 communfunction.waitForElement("cmdOK");
	 stTransPage.startStartButton().click();
	 communfunction.waitForElement("btnReturn");
	 stTransPage.printCancelButton().click();
	 communfunction.waitForElement("cmdStartTransfusion_cmdButton");
	 mainPage.startTransfusionButton().click();
	 communfunction.waitForElement("txtPatientId");
	 transfusionCommonFunctionalities.scanRacipientPatientID("*635201");
	 Thread.sleep(1000);
	 communfunction.waitForElement("txtPatientName");
	 transfusionCommonFunctionalities.scanRacipientPatientName("TIMMONS, BABY BOY");
	 Thread.sleep(1000);
	 communfunction.waitForElement("txtUnitNumber");
	 stTransPage.scanRacipientUnitNumber().sendKeys(unitNo);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(1000);
	 communfunction.waitForElement("lstBloodType");
	 transfusionCommonFunctionalities.selectPatientBloodType(1);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(1000);
	 communfunction.waitForElement("cmdOK");
	 stTransPage.racipientContinueButton().click();
	 communfunction.waitForElement("lstCenterCode");
	 transfusionCommonFunctionalities.donorCenterCodeDropDown(2);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(1000);
	 communfunction.waitForElement("txtUnitNumber");
	 stTransPage.donorScanUnitNumber().sendKeys(unitNo);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 multiScreens.multiScreenShot(iedriver.driver);
	 communfunction.waitForElement("lstBloodProduct");
	 transfusionCommonFunctionalities.donorBloodProduct(4);
	 act.sendKeys(Keys.ENTER).perform();
	 communfunction.waitForElement("StartTransfusionEvent_UnitNumber");
	 Assert.assertEquals(stTransPage.transfusionIsAlreadyInProgressErrorMsg().isDisplayed(), true);
	 //transfusionCommonFunctionalities.transfusionisAlreadyInProgressErrorMsg();
	 multiScreens.multiScreenShot(iedriver.driver);
	 Thread.sleep(2000);
	 iedriver.extent_Test().log(LogStatus.PASS, "Step 06 Passed");
	 stTransPage.linkLogout().click();
	 communfunction.waitForElement("header__modalConfirm_cmdOK");
	 stTransPage.btnYesLogoutPopup().click();
	 Thread.sleep(1000);
	 //iedriver.driver.quit();
	 iedriver.extent_Reports().endTest(iedriver.extent_Test());
	 iedriver.extent_Reports().flush();
	 iedriver.extent_Reports().close();
	 
	 
 }
  
	 
	 
	 
	 
	 
	 
	 
}