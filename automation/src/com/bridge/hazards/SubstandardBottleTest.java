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

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.CapribedsideNavigation;
import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.pageObject.Functions.CapribedsideBrowseBottleHistoryPageFunctions;
import com.pageObject.Functions.SystemManagerBreastMilkSettingsPageFunctions;
import com.pageObjects.CapribedsideAdministerBottlesPage;
import com.pageObjects.CapribedsideBrowseBottleHistoryPage;
import com.pageObjects.CapribedsideDischargeBottlesPage;
import com.pageObjects.CapribedsideLoginPage;
import com.pageObjects.CapribedsidePatientMainPage;
import com.pageObjects.CapribedsidePrepareBottlesPage;
import com.pageObjects.CapribedsideReceiveBottlesPage;
import com.pageObjects.CapribedsideSelectPatientPage;
import com.pageObjects.DonorMilkMainPage;
import com.pageObjects.DonorMilkReceiveDonorBottlePage;
import com.pageObjects.SystemManagerBreastMilkSettingsPage;
import com.pageObjects.SystemManagerMainPage;
import com.relevantcodes.extentreports.LogStatus;

import multiScreenShot.MultiScreenShot;

public class SubstandardBottleTest extends CapribedsideNavigation 
{
	String FilePath = "C:\\Temp\\SubstandardBottleTest.html";
	String TestName = "PatientIdentificationErrorTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","SubstandardBottleTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	CommonFunctions commonfunctions = new CommonFunctions();
    CapribedsideAdministerBottlesPage administerBottle = new CapribedsideAdministerBottlesPage();
    CapribedsideSelectPatientPage selectPatient = new CapribedsideSelectPatientPage();
    DonorMilkMainPage milkManagement = new DonorMilkMainPage();
    DonorMilkReceiveDonorBottlePage receiveDonorBottle = new DonorMilkReceiveDonorBottlePage();
    SystemManagerBreastMilkSettingsPage breastMilkSettings = new SystemManagerBreastMilkSettingsPage();
	SystemManagerBreastMilkSettingsPageFunctions breastmilksettingspage = new SystemManagerBreastMilkSettingsPageFunctions();
    SystemManagerMainPage sysMain = new SystemManagerMainPage();
    CapribedsidePatientMainPage patientMenu = new CapribedsidePatientMainPage();
    CapribedsidePrepareBottlesPage prepareBottle = new CapribedsidePrepareBottlesPage();
    CapribedsideDischargeBottlesPage dischargeBottle = new CapribedsideDischargeBottlesPage();
    CapribedsideBrowseBottleHistoryPage browseBottleHistory = new CapribedsideBrowseBottleHistoryPage();
    CapribedsideBrowseBottleHistoryPageFunctions browsebottlehistoryfunction = new CapribedsideBrowseBottleHistoryPageFunctions();
    CapribedsideLoginPage login = new CapribedsideLoginPage();
    String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
    String patientA ="635201";
    String bottle_no= commonfunctions.uniqueNumber(-1);
    String bottle = bottle_no;
    String onedayago= commonfunctions.currentDate("MM/dd/yyyy HH:mm",-1);
    String uniqueDonorBottleID = commonfunctions.currentDate("MM/dd/yyMMddHHmm",0);
    String donorBottle = "zz"+uniqueDonorBottleID+"-101";
    private static ScreenRecorder screenRecorder;
	@BeforeTest
	public void preSettingTest() throws Throwable
	{ /*
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
    	this.screenRecorder = new ScreenRecorder(gc,
    	new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
    	new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
    	CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,DepthKey, 24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f,KeyFrameIntervalKey, 15 * 60),new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)),null);
    	this.screenRecorder.start();
    	*/
		//commonfunctions.startScreenRecord();
		  iedriver.callDriver(sysmanUrl);
		  commonfunctions.waitForElement("UserId");
		  login.txt_box_username().sendKeys("superuser");
		  login.txt_box_password().sendKeys("123");
		  login.button_login().click();
		  commonfunctions.waitForElement("breastMilk_cmdButton");
		  sysMain.button_BreastMilkSettings().click();
		  commonfunctions.waitForElement("txtBottleRefExpHours");
		  breastMilkSettings.textBoxFreshExpTimeLength().clear();
		  breastMilkSettings.textBoxFreshExpTimeLength().sendKeys("1");
		  //Thread.sleep(2000);
		  breastmilksettingspage.selectFreshExpTimeUnit("days");
		 // Thread.sleep(2000);
		  breastMilkSettings.textBoxFrozenExpTimeLength().clear();
		  breastMilkSettings.textBoxFrozenExpTimeLength().sendKeys("1");
		  //Thread.sleep(2000);
		  breastmilksettingspage.selectFrozenExpTimeUnit("days");
		  //Thread.sleep(1000);
		  breastMilkSettings.textBoxThawedExpTimeLength().clear();
		  breastMilkSettings.textBoxThawedExpTimeLength().sendKeys("1");
		  //Thread.sleep(2000);
		  breastmilksettingspage.selectThawedExpTimeUnit("days");
		  //Thread.sleep(2000);
		  breastMilkSettings.btnConfirm().click();
		  commonfunctions.waitForElement("header_cmdLogout");
		  sysMain.linkLogout().click();
		  iedriver.close();
	}
  @Test()
  public void substandardBottleTest() throws InterruptedException, IOException 
  {
	    CapribedsidePatientMainPage.button_ReceiveBottles().click();
	    commonfunctions.waitForElement("txtPatientId");
		//fun.waitForElement(Capribedside_page_ReceiveBottles.getTextPatientId());
		CapribedsideReceiveBottlesPage.txt_box_BottlePatientID().sendKeys(patientA);
		CapribedsideReceiveBottlesPage.txt_box_BottlePatientID().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		 commonfunctions.waitForElement("txtBottleNumber");
		CapribedsideReceiveBottlesPage.txt_box_Bottlenumber().sendKeys(bottle);
		CapribedsideReceiveBottlesPage.txt_box_Bottlenumber().sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		if (CapribedsideReceiveBottlesPage.button_BottlenumberWarningYes().isDisplayed()){
			CapribedsideReceiveBottlesPage.button_BottlenumberWarningYes().click();
		}
		commonfunctions.waitForElement("dpCollectionDate_foo");
		CapribedsideReceiveBottlesPage.txt_box_CollectedDateTime().clear();
		CapribedsideReceiveBottlesPage.txt_box_CollectedDateTime().sendKeys(onedayago);
		CapribedsideReceiveBottlesPage.dropDwn_StorageState().selectByValue("Fresh");
		CapribedsideReceiveBottlesPage.button_Confirm().click();
		commonfunctions.waitForElement("modalErrorConfirm_cmdOK");
		CapribedsideReceiveBottlesPage.button_Warning_popup_Yes().click();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(iedriver.driver);
		commonfunctions.waitForElement("cmdCancel");
		CapribedsideReceiveBottlesPage.button_Exit().click();
		commonfunctions.waitForElement("cmdPrepareBottles_cmdButton");
		patientMenu.button_PrepareBottles().click();
	    Thread.sleep(1000);
	    multiScreens.multiScreenShot(iedriver.driver);
	    commonfunctions.waitForElement("txtBottleNumber");
	    prepareBottle.txt_box_BottleNumber().sendKeys(bottle,Keys.ENTER);
	    Thread.sleep(1000);
	    commonfunctions.waitForElement("divModalErrorConfirm");
	    Assert.assertEquals(prepareBottle.warning_popUp().isDisplayed(),true);
	    Thread.sleep(1000);
	    multiScreens.multiScreenShot(iedriver.driver);
	    prepareBottle.button_Warning_popUp_Yes().click();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(iedriver.driver);
	    /*
	    boolean popUp = prepareBottle.warning_popUp().isDisplayed();
	    if(popUp)
	 
	 {
		 System.out.println("Warning Message is Displayed");
		 multiScreens.multiScreenShot(iedriver.driver);
		 prepareBottle.button_Warning_popUp_Yes().click();
		 Thread.sleep(1000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 
	 }
	 else
	 {
		 System.out.println("Warning Message is Displayed");
	 }
	 
	*/
	     prepareBottle.button_Exit().click();
	     commonfunctions.waitForElement("cmdDispenseBottles_cmdButton");
	     patientMenu.button_AdministerBottles().click();
	     commonfunctions.waitForElement("txtBottleNumber");
    	 administerBottle.txt_box_bottlenumber().sendKeys(bottle,Keys.ENTER);
    	 commonfunctions.waitForElement("divModalErrorConfirm");
    	 //
    	 Assert.assertEquals(administerBottle.Warning_popup().isDisplayed(),true);
    	 Thread.sleep(2000);
    	 multiScreens.multiScreenShot(iedriver.driver);
		 administerBottle.button_Warning_popup_Yes().click();
    	 /*
    	 boolean popUp1 = administerBottle.Warning_popup().isDisplayed();
    	 
    	 if(popUp1)
    	 {
    		 System.out.println("Waring Popup is Displayed");
    		 multiScreens.multiScreenShot(iedriver.driver);
    		 Thread.sleep(2000);
    		 administerBottle.button_Warning_popup_Yes().click();
    	 }
    	 else
    	 {
    		 System.out.println("Warning Popup is not Displayed");
    		 multiScreens.multiScreenShot(iedriver.driver);
    	 }
    	*/
		 commonfunctions.waitForElement("cmdCancel");
    	 administerBottle.button_Exit().click();
    	 commonfunctions.waitForElement("cmdDischargeBottles_cmdButton");
    	 patientMenu.button_DischargeBottles().click();
    	 commonfunctions.waitForElement("txtBottleNumber");
    	 dischargeBottle.txt_box_bottlenumber().sendKeys(bottle,Keys.ENTER);
    	 commonfunctions.waitForElement("divModalErrorConfirm");
    	 //
    	 Assert.assertEquals(dischargeBottle.Warning_popup().isDisplayed(),true);
    	 Thread.sleep(1000);
    	 multiScreens.multiScreenShot(iedriver.driver);
		 dischargeBottle.button_Warning_popup_Yes().click();
		 commonfunctions.waitForElement("cmdCancel");
		 dischargeBottle.button_Exit().click();
    	 /*
    	 boolean warPopup = dischargeBottle.Warning_popup().isDisplayed();
    	 if(warPopup)
    	 {
    		 System.out.println("Warning popup is Displayed");
    		 multiScreens.multiScreenShot(iedriver.driver);
    		 Thread.sleep(2000);
    		 dischargeBottle.button_Warning_popup_Yes().click();
    		 Thread.sleep(2000);
    		 dischargeBottle.button_Exit().click();
    	 }
    	 else
    	 {
    		 System.out.print("Warning popup is not Displayed");
    		 multiScreens.multiScreenShot(iedriver.driver);
    	 }
    	 */
		 commonfunctions.waitForElement("cmdBrowseBottleHistory_cmdButton");
    	 patientMenu.button_BrowseBottleHistory().click();
    	 commonfunctions.waitForElement("FinalStatusFilter");
    	 browsebottlehistoryfunction.dropDwn_FinalStatus().selectByVisibleText("Discharged");
    	 Thread.sleep(1000);
    	 multiScreens.multiScreenShot(iedriver.driver);
    	 iedriver.extent_Test().log(LogStatus.PASS, "Step 06 Passed");
    	 browseBottleHistory.button_Back().click();
    	 commonfunctions.waitForElement("PatientDetails_cmdChangePatient");
    	 patientMenu.changePatientButton().click();
    	 commonfunctions.waitForElement("header_cmdDonorLink");
    	 selectPatient.linkMilkMgmt().click();
    	 commonfunctions.waitForElement("cmdReceiveBottles_cmdButton");
    	 milkManagement.receiveDonorBottleButton().click();
    	 commonfunctions.waitForElement("txtDonorMilkNumber");
    	 receiveDonorBottle.donorBottleNumber().sendKeys(donorBottle,Keys.ENTER);
    	 Thread.sleep(2000);
    	 multiScreens.multiScreenShot(iedriver.driver);
    	 commonfunctions.waitForElement("modalErrorConfirm_cmdOK");
    	 receiveDonorBottle.buttonYesExpireBottleWarning().click();
    	 commonfunctions.waitForElement("txtCalories");
    	 receiveDonorBottle.kiloCalories().sendKeys("60");
    	 receiveDonorBottle.buttonConfirm().click();
    	 receiveDonorBottle.buttonExit().click();
    	 commonfunctions.waitForElement("header_cmdHomeLink");
    	 milkManagement.homeLink().click();
    	 commonfunctions.waitForElement("txtPatientId");
    	 //
    	 commonfunctions.scanpatientid(patientA);
    	 patientMenu.button_PrepareBottles().click();
 	    Thread.sleep(1000);
 	    multiScreens.multiScreenShot(iedriver.driver);
 	   commonfunctions.waitForElement("txtBottleNumber");
 	    prepareBottle.txt_box_BottleNumber().sendKeys(donorBottle,Keys.ENTER);
 	    Thread.sleep(1000);
 	   commonfunctions.waitForElement("modalErrorConfirm_modalErrorConfirmPopup");
 	    //
 	   Assert.assertEquals(prepareBottle.donorWarning_popUp().isDisplayed(),true);
 	     Thread.sleep(2000);
 	     multiScreens.multiScreenShot(iedriver.driver);
		 prepareBottle.buttondonorWarningpopUpYes().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 prepareBottle.buttondonorWarningpopUpYes().click();
 	   /*
 	    boolean donorpopUp = prepareBottle.donorWarning_popUp().isDisplayed();
 	    if(donorpopUp)
 	 
 	 {
 		 System.out.println("Warning donor popup is displayed is Displayed");
 		 multiScreens.multiScreenShot(iedriver.driver);
 		 Thread.sleep(2000);
 		 prepareBottle.buttondonorWarningpopUpYes().click();
 		 Thread.sleep(2000);
 		 multiScreens.multiScreenShot(iedriver.driver);
 		 prepareBottle.buttondonorWarningpopUpYes().click();
 		 
 	 }
 	 else
 	 {
 		 System.out.println("Warning Message is not Displayed");
 	 }
 	 */
		 commonfunctions.waitForElement("cmdCancel");
 	     prepareBottle.button_Exit().click();
 	     commonfunctions.waitForElement("cmdDispenseBottles_cmdButton");
 	     patientMenu.button_AdministerBottles().click();
 	     commonfunctions.waitForElement("txtBottleNumber");
     	 administerBottle.txt_box_bottlenumber().sendKeys(donorBottle,Keys.ENTER);
     	 commonfunctions.waitForElement("errorLabel");
     	 //
     	 Assert.assertEquals(administerBottle.donorBottleErrorMessage().isDisplayed(),true);
     	 /*
     	 boolean donorBottleErrorMag = administerBottle.donorBottleErrorMessage().isDisplayed();
     	 
     	 if(donorBottleErrorMag)
     	 {
     		 System.out.println("Error message : "+donorBottleErrorMag+" Is displayed.");
     		 Thread.sleep(2000);
     		 multiScreens.multiScreenShot(iedriver.driver);
     		 
     	 }
     	 else
     	 {
     		 System.out.println("Warning Popup is not Displayed");
     		 Thread.sleep(2000);
     		 multiScreens.multiScreenShot(iedriver.driver);
     	 }
     	 */
     	 administerBottle.button_Exit().click();
     	 commonfunctions.waitForElement("cmdDischargeBottles_cmdButton");
     	 patientMenu.button_DischargeBottles().click();
     	 commonfunctions.waitForElement("txtBottleNumber");
     	 dischargeBottle.txt_box_bottlenumber().sendKeys(donorBottle,Keys.ENTER);
     	 commonfunctions.waitForElement("divModalErrorConfirm");
     	 //boolean donorwarPopup = dischargeBottle.Warning_popup().isDisplayed();
     	 Assert.assertEquals(dischargeBottle.Warning_popup().isDisplayed(),true);
     	 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 dischargeBottle.button_Warning_popup_Yes().click();
		 commonfunctions.waitForElement("modalErrorConfirm_cmdButton1");
		 multiScreens.multiScreenShot(iedriver.driver);
		 dischargeBottle.button_Warning_popup_Yes().click();
		 commonfunctions.waitForElement("cmdCancel");
		 dischargeBottle.button_Exit().click();
     	 /*
     	 if(donorwarPopup)
     	 {
     		 System.out.println("Warning popup is Displayed");
     		 Thread.sleep(2000);
     		 multiScreens.multiScreenShot(iedriver.driver);
     		 dischargeBottle.button_Warning_popup_Yes().click();
     		 Thread.sleep(2000);
     		 multiScreens.multiScreenShot(iedriver.driver);
     		 dischargeBottle.button_Warning_popup_Yes().click();
     		 Thread.sleep(2000);
     		 dischargeBottle.button_Exit().click();
     	 }
     	 else
     	 {
     		 System.out.print("Warning popup is not Displayed");
     		 multiScreens.multiScreenShot(iedriver.driver);
     	 }
     	 */
		 commonfunctions.waitForElement("cmdBrowseBottleHistory_cmdButton");
     	 patientMenu.button_BrowseBottleHistory().click();
     	 commonfunctions.waitForElement("FinalStatusFilter");
     	browsebottlehistoryfunction.dropDwn_FinalStatus().selectByVisibleText("Discharged");
    	 //
    	 iedriver.extent_Reports().endTest(iedriver.extent_Test());
    	 iedriver.extent_Reports().flush();
    	 iedriver.extent_Reports().close();
    	 
    	 
     }
  @AfterTest
  public void postTest() throws Throwable
  {
	  iedriver.callDriver(sysmanUrl);
	  CapribedsideLoginPage login = new CapribedsideLoginPage();
	  commonfunctions.waitForElement("UserId");
	  login.txt_box_username().sendKeys("superuser");
	  login.txt_box_password().sendKeys("123");
	  login.button_login().click();
	  commonfunctions.waitForElement("breastMilk_cmdButton");
	  sysMain.button_BreastMilkSettings().click();
	  commonfunctions.waitForElement("txtBottleRefExpHours");
	  breastMilkSettings.textBoxFreshExpTimeLength().clear();
	  breastMilkSettings.textBoxFreshExpTimeLength().sendKeys("3");
	  breastmilksettingspage.selectFreshExpTimeUnit("days");
	  breastMilkSettings.textBoxFrozenExpTimeLength().clear();
	  breastMilkSettings.textBoxFrozenExpTimeLength().sendKeys("3");
	  breastmilksettingspage.selectFrozenExpTimeUnit("days");
	  breastMilkSettings.textBoxThawedExpTimeLength().clear();
	  breastMilkSettings.textBoxThawedExpTimeLength().sendKeys("3");
	  breastmilksettingspage.selectThawedExpTimeUnit("days");
	  breastMilkSettings.btnConfirm().click();
	  commonfunctions.waitForElement("header_cmdLogout");
	  sysMain.linkLogout().click();
	  iedriver.close();
	 // this.screenRecorder.stop();
	  commonfunctions.stopScreenRecord();
  }
}
