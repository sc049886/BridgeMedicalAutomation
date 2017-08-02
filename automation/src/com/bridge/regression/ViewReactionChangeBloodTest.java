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
import java.util.concurrent.TimeUnit;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.BloodTransfusionCommonFunctionality;
import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.pageObjects.CapribedsideAdministerDerivativesPage;
import com.pageObjects.CapribedsideBrowseTransfusionHistoryPage;
import com.pageObjects.CapribedsideChangeBloodTypePage;
import com.pageObjects.CapribedsideHoldTransfusionPage;
import com.pageObjects.CapribedsideLoginPage;
import com.pageObjects.CapribedsidePatientMainPage;
import com.pageObjects.CapribedsideStartTransfusionPage;
import com.pageObjects.CapribedsideViewReactionInformationPage;
import com.pageObjects.SystemManagerBloodTypeChangeReasonPage;
import com.pageObjects.SystemManagerEditRolePage;
import com.pageObjects.SystemManagerMainPage;
import com.pageObjects.SystemManagerReactionInstructionPage;
import com.pageObjects.SystemManagerReactionSignsAndSymptomsPage;
import com.pageObjects.SystemManagerRolesPage;
import com.pageObjects.SystemManagerTransfusionSettingsPage;

import multiScreenShot.MultiScreenShot;

public class ViewReactionChangeBloodTest 
{
	String username="superuser";
    String password="123";
	String FilePath = "C:\\Temp\\ViewReactionChangeBloodTest.html";
	String TestName = "ViewReactionChangeBloodTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","ViewReactionChangeBloodTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	CapribedsideLoginPage login = new CapribedsideLoginPage();
	SystemManagerMainPage sysManagerMainPage = new SystemManagerMainPage();
	CommonFunctions common = new CommonFunctions();
	CapribedsidePatientMainPage patientMenu = new  CapribedsidePatientMainPage();
	CapribedsideStartTransfusionPage stTransPage = new CapribedsideStartTransfusionPage();
	BloodTransfusionCommonFunctionality transCommon = new BloodTransfusionCommonFunctionality();
	SystemManagerRolesPage roles = new SystemManagerRolesPage();
	SystemManagerEditRolePage editRole = new SystemManagerEditRolePage();
	CapribedsideHoldTransfusionPage holdTransPage = new CapribedsideHoldTransfusionPage();
	SystemManagerTransfusionSettingsPage transSettings = new SystemManagerTransfusionSettingsPage();
	CapribedsideBrowseTransfusionHistoryPage browseTransHistory = new CapribedsideBrowseTransfusionHistoryPage();
	CapribedsideAdministerDerivativesPage administerDerivative = new CapribedsideAdministerDerivativesPage();
	SystemManagerBloodTypeChangeReasonPage reasonChangeBloodType = new SystemManagerBloodTypeChangeReasonPage();
	SystemManagerReactionInstructionPage reactionInstruction = new SystemManagerReactionInstructionPage();
	SystemManagerReactionSignsAndSymptomsPage reactionSigns = new SystemManagerReactionSignsAndSymptomsPage();
	CapribedsideViewReactionInformationPage viewReaction = new CapribedsideViewReactionInformationPage();
	BloodTransfusionCommonFunctionality bloodTransCommnon = new  BloodTransfusionCommonFunctionality();
	CapribedsideChangeBloodTypePage changeBT = new CapribedsideChangeBloodTypePage();
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedside = "http://10.162.106.174/TransSpec2016010410/CapriBedside/Login.aspx";
	String superuser = "Superuser";
	String user2 = "jj";
	String patientA = "1010123";
	//String user1 = "rohan";
	String bloodOpos = "O pos";
	String bloodApos = "A pos";
    String bloodAneg = "A neg";
    String bloodBpos = "B pos";
    private static ScreenRecorder screenRecorder;
	
	@BeforeTest
	public void systemManagerPreSettingTest() throws Throwable
	{
		
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
		this.screenRecorder = new ScreenRecorder(gc,
		new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
		new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
		CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,DepthKey, 24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f,KeyFrameIntervalKey, 15 * 60),new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)),null);
		this.screenRecorder.start();
		
		  iedriver.callDriver(sysmanUrl);
		  Thread.sleep(1000);
		  common.login(sysmanUrl,superuser, password);
		  Thread.sleep(2000);
		  sysManagerMainPage.button_Roles().click();
		  Thread.sleep(2000);
		  roles.editTransfusionist().click();
		  Thread.sleep(2000);
		  boolean b1 = editRole.checkBoxMayAccessChangeBloodTypeWithCosignature().isSelected();
		  if(!b1)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxMayAccessChangeBloodTypeWithCosignature().click(); 
		  }
		 
		  Thread.sleep(3000);
		  editRole.buttonConfirm().click();
		  /*
		  sysManagerMainPage.button_TransfusionSettings().click();
		  Thread.sleep(2000);
		 
		  transSettings.linkBloodTypeChangeReasons().click();
		  Thread.sleep(2000);
		  reasonChangeBloodType.linkCreateBloodTypeChangeReasons().click();
		  Thread.sleep(2000);
		  reasonChangeBloodType.createReasonForBloodTypeChange("Test03", "Test03", "Reason 03");
		  Thread.sleep(2000);
		  reasonChangeBloodType.linkCreateBloodTypeChangeReasons().click();
		  Thread.sleep(2000);
		  reasonChangeBloodType.createReasonForBloodTypeChange("Test02", "Test02", "Reason 02");
		  Thread.sleep(2000);
		  reasonChangeBloodType.linkCreateBloodTypeChangeReasons().click();
		  Thread.sleep(2000);
		  reasonChangeBloodType.createReasonForBloodTypeChange("Test01", "Test01", "Reason 01");
		  Thread.sleep(2000);
		  reasonChangeBloodType.linkBack().click();
		  Thread.sleep(2000);
		  transSettings.linkReactionInstructions().click();
		  Thread.sleep(2000);
		 
		  reactionInstruction.createReactionInstruction("Reaction06", "Test Reaction06");
		  Thread.sleep(2000);
		
		  reactionInstruction.createReactionInstruction("Reaction05", "Test Reaction05");
		  Thread.sleep(2000);
		  
		  reactionInstruction.createReactionInstruction("Reaction04", "Test Reaction04");
		  Thread.sleep(2000); 
		
		  reactionInstruction.createReactionInstruction("Reaction03", "Test Reaction03");
		  Thread.sleep(2000); 
		  
		  reactionInstruction.createReactionInstruction("Reaction02", "Test Reaction02");
		  Thread.sleep(2000);
		 
		  reactionInstruction.createReactionInstruction("Reaction01", "Test Reaction01");
		  Thread.sleep(2000);
		 
		  reactionInstruction.linkBack().click();
		  Thread.sleep(2000);
		   
		  transSettings.linkReactionSignsAndSymptoms().click();
		  Thread.sleep(2000);
		  reactionSigns.createReactionSignsAndSymptoms("Tes03", "Test Sign 03");
		  Thread.sleep(1000);
		  reactionSigns.createReactionSignsAndSymptoms("Tes03", "Test Sign 03");
		  Thread.sleep(1000);
		  reactionSigns.createReactionSignsAndSymptoms("Tes03", "Test Sign 03");
		  	*/
		  
		  Thread.sleep(2000);
		  iedriver.close();
		
	}

  @Test
  public void mainTest() throws Throwable 
  {
	  //Step 1
	  common.login(capribedside,username,password);
	  common.scanpatientid(patientA);
	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  Thread.sleep(2000);
	  //Step 2
	  patientMenu.viewReactionInformationButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 3
	  viewReaction.buttonBack().click();
	  Thread.sleep(2000);
	  patientMenu.changeBloodTypeButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 4
	  String currentBloodType = changeBT.currentBloodType().getText();
	  if(currentBloodType.equals(bloodOpos))
	  {
	  bloodTransCommnon.changeBTNewBloodType(bloodApos);
 	  Thread.sleep(1000);
 	  bloodTransCommnon.changeBTConfirmNewBloodType(bloodApos);
 	  Thread.sleep(1000);
 	  multiScreens.multiScreenShot(iedriver.driver);
	  }
	  else
	  {
		  bloodTransCommnon.changeBTNewBloodType(bloodOpos);
	 	  Thread.sleep(1000);
	 	  bloodTransCommnon.changeBTConfirmNewBloodType(bloodOpos);
	 	  Thread.sleep(1000);
	 	  multiScreens.multiScreenShot(iedriver.driver);
		  
	  }
 	  //Step 5
 	  bloodTransCommnon.changeBTReasonForBloodTypeChange(2);
 	  Thread.sleep(1000);
 	  /*
 	  Actions act = new Actions(iedriver.driver);
 	  changeBT.textBoxUserID().sendKeys("cerner");
 	  act.sendKeys(Keys.ENTER).perform();
 	  Thread.sleep(1000);
 	  changeBT.textBoxPassword().sendKeys(password);
 	  Thread.sleep(1000);
 	  */
 	  changeBT.btnConfirm().click();
 	  Thread.sleep(2000);
 	  multiScreens.multiScreenShot(iedriver.driver);
 	  //Stpe 6
 	  changeBT.linkLogout().click();
 	  Thread.sleep(2000);
 	 common.login(capribedside, user2, password);
 	  Thread.sleep(2000);
	  common.scanpatientid(patientA);
	  //Step 7
	  patientMenu.viewReactionInformationButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 8
	  viewReaction.buttonBack().click();
	  Thread.sleep(2000);
	  patientMenu.changeBloodTypeButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 9
	  String currentBloodTypeNow = changeBT.currentBloodType().getText();
	  if(currentBloodTypeNow.equals(bloodOpos))
	  {
	  bloodTransCommnon.changeBTNewBloodType(bloodApos);
 	  Thread.sleep(1000);
 	  bloodTransCommnon.changeBTConfirmNewBloodType(bloodApos);
 	  Thread.sleep(1000);
 	  multiScreens.multiScreenShot(iedriver.driver);
	  }
	  else
	  {
		  bloodTransCommnon.changeBTNewBloodType(bloodOpos);
	 	  Thread.sleep(1000);
	 	  bloodTransCommnon.changeBTConfirmNewBloodType(bloodOpos);
	 	  Thread.sleep(1000);
	 	  multiScreens.multiScreenShot(iedriver.driver);
		  
	  }
	  /*
	  Thread.sleep(1000);
	  bloodTransCommnon.changeBTNewBloodType(bloodOpos);
 	  Thread.sleep(1000);
 	  bloodTransCommnon.changeBTConfirmNewBloodType(bloodOpos);
 	  Thread.sleep(2000);
 	  multiScreens.multiScreenShot(iedriver.driver);
 	  changeBT.reasonForBloodTypeChange().click();
 	  Thread.sleep(2000);
 	  multiScreens.multiScreenShot(iedriver.driver);
 	  */
 	  //Step 10
 	  bloodTransCommnon.changeBTReasonForBloodTypeChange(4);
 	  Thread.sleep(1000);
 	  //Step 11
 	  Actions act = new Actions(iedriver.driver);
 	  changeBT.textBoxUserID().sendKeys("cerner");
 	  act.sendKeys(Keys.ENTER).perform();
 	  Thread.sleep(1000);
 	  changeBT.textBoxPassword().sendKeys("123");
 	  Thread.sleep(2000);
 	  multiScreens.multiScreenShot(iedriver.driver);
 	  changeBT.btnConfirm().click();
 	  Thread.sleep(2000);
 	  multiScreens.multiScreenShot(iedriver.driver);
 	  changeBT.linkLogout().click();
 	  iedriver.driver.close();
 	  this.screenRecorder.stop();
 	  
	  
	  
  }
}
