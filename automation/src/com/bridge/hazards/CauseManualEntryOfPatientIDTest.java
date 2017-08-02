package com.bridge.hazards;

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
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.bridge.utilities.MilkManagementCommonFunctionality;
import com.pageObjects.CapribedsideCollectSpecimenPage;
import com.pageObjects.CapribedsideConfirmPatientPage;
import com.pageObjects.CapribedsidePatientMainPage;
import com.pageObjects.CapribedsideReceiveBottlesPage;
import com.pageObjects.CapribedsideSelectPatientPage;
import com.pageObjects.CapribedsideStartTransfusionPage;
import com.pageObjects.SystemManagerEditPocPage;
import com.pageObjects.SystemManagerMainPage;
import com.pageObjects.SystemManagerPointsOfCarePage;
import com.relevantcodes.extentreports.LogStatus;

import multiScreenShot.MultiScreenShot;

public class CauseManualEntryOfPatientIDTest 
{
	String FilePath = "C:\\Temp\\CauseManualEntryOfPatientIDTest.html";
	String TestName = "CauseManualEntryOfPatientIDTest";
	String patientA = "635201";
	String patientB = "635202";
	String sysMgrUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedsideUrl = "http://10.162.106.174/TransSpec2016010410/Capribedside/Login.aspx";
	String username="superuser";
    String password="123";
    
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","CauseManualEntryOfPatientIDTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	CapribedsideSelectPatientPage selPatient = new CapribedsideSelectPatientPage();
	CapribedsidePatientMainPage mainPatPage = new CapribedsidePatientMainPage();
	CapribedsideConfirmPatientPage conPatPage = new CapribedsideConfirmPatientPage();
	CapribedsideStartTransfusionPage transPage = new CapribedsideStartTransfusionPage();
	CapribedsideCollectSpecimenPage colSpecPage = new CapribedsideCollectSpecimenPage();
	CommonFunctions commonfunctions = new CommonFunctions();
	SystemManagerEditPocPage peds = new SystemManagerEditPocPage();
	SystemManagerPointsOfCarePage pocPage = new SystemManagerPointsOfCarePage();
    MilkManagementCommonFunctionality commonFunctionsMilkManagement = new MilkManagementCommonFunctionality();
    SystemManagerMainPage mainMenu = new SystemManagerMainPage();
    CapribedsideReceiveBottlesPage receiveBottle = new CapribedsideReceiveBottlesPage();

	/*
	private static ScreenRecorder screenRecorder;
	 @BeforeTest
		final void startRecording() throws Throwable
		{
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
		this.screenRecorder = new ScreenRecorder(gc,
		new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
		new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
		CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,DepthKey, 24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f,KeyFrameIntervalKey, 15 * 60),new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)),null);
		this.screenRecorder.start();
		}
		*/
  @Test(priority=0)
  public void manualEntryOfPatientIDTest() throws InterruptedException, IOException 
  {
	  commonfunctions.waitForElement("txtPatientId");
	  selPatient.txt_box_patientid().sendKeys(patientA,Keys.ENTER);
	  //Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 01 Passed");
	  commonfunctions.waitForElement("cmdStartTransfusion_cmdButton");
	  mainPatPage.startTransfusionButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 02 Passed");
	  commonfunctions.waitForElement("txtPatientId");
	  conPatPage.confirmPatientID().sendKeys(patientA);
	  Thread.sleep(1000);
	  conPatPage.continueButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 03 Passed");
	  commonfunctions.waitForElement("cmdCancel");
	  transPage.startExitButton().click();
	  commonfunctions.waitForElement("_modalConfirm_cmdOK");
	  transPage.buttonYesExitTransPopup().click();
	  commonfunctions.waitForElement("cmdCollectSpecimens_cmdButton");//Expicit wait
	  mainPatPage.buttonCollectSpecimens().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 04 Passed");
	  Thread.sleep(2000);
	  colSpecPage.buttonExit().click();
	  Thread.sleep(2000);
	  colSpecPage.buttonYesExitPopup().click();
	  Thread.sleep(2000);
	  mainPatPage.changePatientButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 05 Passed");
	  selPatient.txt_box_patientid().sendKeys(patientB,Keys.ENTER);
	  Thread.sleep(2000);
	//multiScreens.multiScreenShot(iedriver.driver);
	  mainPatPage.button_ReceiveBottles().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 06 Passed");
	  conPatPage.confirmPatientID().sendKeys(patientB);
	  Thread.sleep(2000);
	  conPatPage.continueButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 07 Passed");
	  receiveBottle.linkLogout().click();
	  //mainPatPage.button_logout().click();
	  Thread.sleep(2000);
	  receiveBottle.btnYesLogoutPopup().click();
	  //recBotPage.buttonYesLogoutPopup().click();
	  iedriver.close();
	  Thread.sleep(2000);
	  commonfunctions.login(sysMgrUrl,username, password);
	  Thread.sleep(2000);
	  mainMenu.button_PointsOfCare().click();
	  Thread.sleep(2000);
	  pocPage.linkEditPeds().click();
	  Thread.sleep(2000);
	  WebElement wb = peds.requireScanInRecieveBtl();
	  Select sel = new Select(wb);
	  Thread.sleep(2000);
	  sel.selectByValue("Yes");
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 08 Passed");
	  peds.buttonConfirm().click();
	  Thread.sleep(2000);
	  iedriver.close();
	  Thread.sleep(2000);
	  //LoginToCapribedside login = new LoginToCapribedside();
	 // login.preExecutionTest();
	  commonfunctions.login(capribedsideUrl, username,password);
	  Thread.sleep(2000);
	  selPatient.txt_box_patientid().sendKeys(patientA,Keys.ENTER);
	  //multiScreens.multiScreenShot(iedriver.driver);
	  Thread.sleep(2000);
	  mainPatPage.button_ReceiveBottles().click();
	  Thread.sleep(2000);
	  conPatPage.confirmPatientID().sendKeys(patientA);
	  Thread.sleep(2000);
	  conPatPage.continueButton().click();
	  Thread.sleep(2000);
	  receiveBottle.txt_box_BottlePatientID().sendKeys(patientA,Keys.ENTER);
	  Thread.sleep(2000);
	  Assert.assertEquals(receiveBottle.manualEntryErrorMsg().isDisplayed(), true);
	  commonFunctionsMilkManagement.manualEntryErrorMsg();
	  receiveBottle.txt_box_BottlePatientID().clear();
	  commonfunctions.scanpatientid(patientA);
	  Thread.sleep(2000);
	  //iedriver.extent_Test().log(LogStatus.PASS, "Step 09 Passed");
	  //recBotPage.
	  receiveBottle.linkLogout().click();
	  //mainPatPage.button_logout().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 09 Passed");
	  receiveBottle.btnYesLogoutPopup().click();
	  //recBotPage.buttonYesLogoutPopup().click();
	  Thread.sleep(2000);
	  iedriver.close();
	  iedriver.extent_Reports().endTest(iedriver.extent_Test());
	  iedriver.extent_Reports().flush();
	  iedriver.extent_Reports().close();
	
	  
  }
 
	  
  
  @AfterTest()
  public void systemManagerPostSettingsTest() throws InterruptedException, IOException
  {
	  
	  commonfunctions.login(sysMgrUrl, username,password);
	  SystemManagerMainPage mainMenu = new SystemManagerMainPage();
	  mainMenu.button_PointsOfCare().click();
	  Thread.sleep(2000);
	  SystemManagerPointsOfCarePage pocPage = new SystemManagerPointsOfCarePage();
	  pocPage.linkEditPeds().click();
	  Thread.sleep(2000);
	 // PedsPocPage peds = new PedsPocPage();
	  WebElement wb = peds.requireScanInRecieveBtl();
	  Select sel = new Select(wb);
	  Thread.sleep(2000);
	  sel.selectByValue("No");
	  Thread.sleep(2000);
	  peds.buttonConfirm().click();
	  Thread.sleep(2000);
	  iedriver.close();
	  Thread.sleep(2000);
	  //this.screenRecorder.stop();
	  
	 
  }

  
  
	  
}

	  
  
  
  

