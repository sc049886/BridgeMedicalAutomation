package com.bridge.regression;

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
import java.util.concurrent.TimeUnit;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.pageObject.Functions.SystemManagerEditPocPageFunctions;
import com.pageObjects.CapribedsideAdministerDerivativesPage;
import com.pageObjects.CapribedsideBrowseTransfusionHistoryPage;
import com.pageObjects.CapribedsideLoginPage;
import com.pageObjects.CapribedsidePatientMainPage;
import com.pageObjects.SystemManagerEditPocPage;
import com.pageObjects.SystemManagerEditRolePage;
import com.pageObjects.SystemManagerMainPage;
import com.pageObjects.SystemManagerPointsOfCarePage;
import com.pageObjects.SystemManagerRolesPage;

import multiScreenShot.MultiScreenShot;

public class AdministerDerivativesTest 
{
	String FilePath = "C:\\Temp\\AdministerDerivativesTest.html";
	String TestName = "AdministerDerivativesTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","AdministerDerivativesTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	CapribedsideLoginPage login = new CapribedsideLoginPage();
	SystemManagerMainPage sysManagerMainPage = new SystemManagerMainPage();
	CommonFunctions common = new CommonFunctions();
	CapribedsidePatientMainPage patientMenu = new  CapribedsidePatientMainPage();
	CapribedsidePatientMainPage mainPage = new CapribedsidePatientMainPage();
	SystemManagerRolesPage roles = new SystemManagerRolesPage();
	SystemManagerEditRolePage editRole = new SystemManagerEditRolePage();
	CapribedsideBrowseTransfusionHistoryPage browseTransHistory = new CapribedsideBrowseTransfusionHistoryPage();
	CapribedsideAdministerDerivativesPage administerDerivative = new CapribedsideAdministerDerivativesPage();
	SystemManagerEditPocPage editPoc = new SystemManagerEditPocPage();
	SystemManagerEditPocPageFunctions editpocpagefunctions = new SystemManagerEditPocPageFunctions();
	SystemManagerPointsOfCarePage selectPoc = new SystemManagerPointsOfCarePage();
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedside = "http://10.162.106.174/TransSpec2016010410/CapriBedside/Login.aspx";
	String superuser = "Superuser";
	String password = "123";
	String user1 = "jj";
	String patientA = "635201";
	String Yes = "Yes";
	String No = "No";
    String secondaryIdentifierOptionNone = "None";
    private static ScreenRecorder screenRecorder;
	
	@BeforeTest
	public void preSettingsTest() throws Throwable
	{
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
		this.screenRecorder = new ScreenRecorder(gc,
		new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
		new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
		CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,DepthKey, 24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f,KeyFrameIntervalKey, 15 * 60),new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)),null);
		this.screenRecorder.start();
	  iedriver.callDriver(sysmanUrl);
  	  Thread.sleep(1000);
  	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  	  common.login(sysmanUrl,superuser, password);
  	  Thread.sleep(2000);
  	  sysManagerMainPage.button_PointsOfCare().click();
  	  Thread.sleep(2000);
  	  selectPoc.editPocPeds().click();
	  Thread.sleep(2000);
	
	  
	  editpocpagefunctions.selectYesOrNoForCheckCenterCode(Yes);
  	  Thread.sleep(2000);
  	editpocpagefunctions.selectOptionForCheckPatientName(Yes);
      Thread.sleep(2000);
      /*
      editPoc.selectOptionRequireScanningInEndTransfusion(Yes);
      Thread.sleep(2000);
      editPoc.selectOptionForRequireCosignature(Yes);
  	  Thread.sleep(2000);
  	  editPoc.selectOptionForRequireCosignOnBloodTypeMismatch(Yes);
  	  Thread.sleep(2000);
  	  editPoc.selectOptionPromptForVolume(Yes);
  	  Thread.sleep(2000);
  	  */
      editpocpagefunctions.selectUtilizeSecondaryIdentifier(secondaryIdentifierOptionNone);
  	  Thread.sleep(2000);
  	  editPoc.secondaryIdName().clear();
  	  //editPoc.secondaryIdName().sendKeys("MRN");
  	  Thread.sleep(2000);
  	  editPoc.secondaryIdFormat().clear();
  	  Thread.sleep(1000);
  	  //editPoc.secondaryIdFormat().sendKeys("CCC");
  	  Thread.sleep(2000);
  	editpocpagefunctions.selectOptionForTurnOffSecondaryIdCheckForTxWristband(Yes);
  	  Thread.sleep(2000);
  	editpocpagefunctions.selectOptionForDisplayCommentsInStartTransfusion(Yes);
  	  Thread.sleep(2000);
  	  editPoc.buttonConfirm().click();
  	  Thread.sleep(2000);
  	  selectPoc.button_Back().click();
  	  Thread.sleep(2000);
  	  sysManagerMainPage.button_TransfusionSettings().click();
  	  Thread.sleep(2000);
  	  iedriver.close();
	}
	
  @Test
  public void AdministerDerivativesTest() throws InterruptedException 
  {
	  //Step 1
	  iedriver.callDriver(capribedside);
	  Thread.sleep(1000);
	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  login.txt_box_username().sendKeys(superuser);
	  Thread.sleep(1000);
	  login.txt_box_password().sendKeys(password);
	  Thread.sleep(1000);
	  login.button_login().click();
	  Thread.sleep(1000);
	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  common.scanpatientid(patientA);
	  Thread.sleep(2000);
	  //Step 2
	  patientMenu.administerDerivativeButton().click();
	  Thread.sleep(2000);
	  //Step 4
	  administerDerivative.admisnisterDerivative("Test02","O pos", patientA, "TIMMONS, BABY BOY", "001", "01", "96", "Left Arm", "01", "75", "80");
	  Thread.sleep(2000);
	  //Step 5
	  patientMenu.button_logout().click();
	  login.txt_box_username().sendKeys(user1);
	  Thread.sleep(1000);
	  login.txt_box_password().sendKeys(password);
	  Thread.sleep(1000);
	  login.button_login().click();
	  Thread.sleep(2000);
	  common.scanpatientid(patientA);
	  Thread.sleep(2000);
	  //Step 6
	  patientMenu.administerDerivativeButton().click();
	  Thread.sleep(2000);
	  //Step 07
	  administerDerivative.admisnisterDerivative("Test02","O pos", patientA, "TIMMONS, BABY BOY", "002", "02", "98", "Right Arm", "02", "85", "90");
	  Thread.sleep(2000);
	  //Step 08
	  //Step 09
	  administerDerivative.userId().sendKeys(superuser);
	  Thread.sleep(2000);
	  administerDerivative.password().sendKeys(password);
	  Thread.sleep(2000);
	  administerDerivative.buttonContinue().click();
	  Thread.sleep(2000);
	  //Step 10
	  patientMenu.browseTransfusinHistoryButton().click();
	  Thread.sleep(2000);
	  iedriver.driver.close();
	  
	  /*
	  Assert.assertEquals(administerDerivative.dropdownBloodPlasmaDerivative().isEnabled(),true);
	  Thread.sleep(1000);
	  administerDerivative.selectBloodPlasmaDerivative("Test02");
	  Thread.sleep(3000);
	  administerDerivative.patientID().sendKeys("635201");
	  Thread.sleep(2000);
	  administerDerivative.patientName().sendKeys("TIMMONS, BABY BOY");
	  Thread.sleep(2000);
	  administerDerivative.selectPatientBloodType("O pos");
	  Thread.sleep(2000);
	  administerDerivative.manufacturee().sendKeys("001");
	  Thread.sleep(2000);
	  administerDerivative.lotNumber().sendKeys("01");
	  Thread.sleep(2000);
	  administerDerivative.iuConcentration().sendKeys("96");
	  Thread.sleep(2000);
	  administerDerivative.selectInjectionSite("Left Arm");
	  Thread.sleep(2000);
	  administerDerivative.serialNumber().sendKeys("01");
	  Thread.sleep(2000);
	  administerDerivative.volume().sendKeys("75");
	  Thread.sleep(2000);
	  administerDerivative.Expires().sendKeys(nextDate);
	  Thread.sleep(2000);
	  administerDerivative.quantity().sendKeys("80");
	  Thread.sleep(2000);
	  administerDerivative.buttonContinue().click();
	  */
	  
  }
  @AfterTest
  public void postTest() throws IOException
  {
	  this.screenRecorder.stop();
  }
}
