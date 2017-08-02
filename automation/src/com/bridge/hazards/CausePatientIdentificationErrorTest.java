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
import java.util.concurrent.TimeUnit;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.bridge.utilities.MilkManagementCommonFunctionality;
import com.pageObjects.CapribedsideAdministerBottlesPage;
import com.pageObjects.CapribedsideCombineBottlesPage;
import com.pageObjects.CapribedsideConfirmPatientPage;
import com.pageObjects.CapribedsideDischargeBottlesPage;
import com.pageObjects.CapribedsidePatientMainPage;
import com.pageObjects.CapribedsidePrepareBottlesPage;
import com.pageObjects.CapribedsideReceiveBottlesPage;
import com.pageObjects.CapribedsideSelectPatientPage;
import com.pageObjects.CapribedsideStateChangePage;
import com.relevantcodes.extentreports.LogStatus;

import multiScreenShot.MultiScreenShot;

public class CausePatientIdentificationErrorTest extends IEDriver
{
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String FilePath = "C:\\Temp\\CausePatientIdentificationErrorTest.html";
	String TestName = "PatientIdentificationErrorTest";
	String username="superuser";
    String password="123";
    String patientA="635201";
    String patientB = "635203";
    String capribedsideUrl = "http://10.162.106.174/TransSpec2016010410/capribedside/Login.aspx";
    
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","CausePatientIdentificationErrorTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	CommonFunctions commonFunction = new CommonFunctions();
    CapribedsideAdministerBottlesPage cap = new CapribedsideAdministerBottlesPage();
    CapribedsideSelectPatientPage selectPatient = new CapribedsideSelectPatientPage();
    MilkManagementCommonFunctionality milkCommon = new MilkManagementCommonFunctionality();
    CapribedsidePatientMainPage patientMenu = new CapribedsidePatientMainPage();
    CapribedsideConfirmPatientPage confirmPatient = new CapribedsideConfirmPatientPage();
    CapribedsideStateChangePage stateChange = new CapribedsideStateChangePage();
    CapribedsidePrepareBottlesPage prepareBottle = new CapribedsidePrepareBottlesPage();
    CapribedsideCombineBottlesPage combineBottles = new CapribedsideCombineBottlesPage();
    CapribedsideDischargeBottlesPage dischargeBottle = new CapribedsideDischargeBottlesPage();
   
    String bottle= commonFunction.uniqueNumber(-1);
    String currentDate = commonFunction.currentDate("MM/dd/yyyy HH:mm",0);
    
    private static ScreenRecorder screenRecorder;
    @BeforeTest
    public void capribedsideNavigationTest() throws InterruptedException, IOException, AWTException
    {
    	GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
		this.screenRecorder = new ScreenRecorder(gc,
		new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
		new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
		CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,DepthKey, 24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f,KeyFrameIntervalKey, 15 * 60),new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)),null);
		this.screenRecorder.start();
    	iedriver.extent_Reports();
		iedriver.extent_Test();
		
    }
  @Test
  public void PatientIdentificationErrorTest() throws InterruptedException, IOException
  {
	  commonFunction.login(capribedsideUrl, username,password);	
	  Thread.sleep(2000);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  Actions act = new Actions(driver);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 01 Passed");
	  Thread.sleep(3000);
	  //Step 2
	  selectPatient.txt_box_patientid().sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  milkCommon.patientNotFoundErrorMsg();
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 02 Passed");
	  //System.out.println("Step 2 executed Successfully");
	  //Step 3
	  Thread.sleep(2000);
	  selectPatient.txt_box_patientid().sendKeys("191919",Keys.ENTER);
	  Thread.sleep(3000);
	  milkCommon.patientNotFoundErrorMsg();
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 03 Passed");
	  System.out.println("Step 3 executed Successfully");
	  //Step 4
	  Thread.sleep(2000);
	  selectPatient.txt_box_patientid().clear();
	  selectPatient.txt_box_patientid().sendKeys(patientA,Keys.ENTER);
	  Thread.sleep(3000);
	  String expUrl = "http://10.162.106.174/TransSpec2016010407/capribedside/Main.aspx";
	  String actUrl = driver.getCurrentUrl();
	  if(expUrl.equals(actUrl))
	  {
		  System.out.println("Step 4 is passed home page is displayed "+actUrl);
		 // multiScreens.multiScreenShot(iedriver.driver);
	  }
	  else
	  {
		  System.out.println("Step 4 is failed home page is not displayed");
	  }
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 04 Passed");
	  //Step 5
	  patientMenu.button_ReceiveBottles().click();;
	  Thread.sleep(2000);
	  confirmPatient.confirmPatientID().sendKeys(patientA,Keys.ENTER);
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 05 Passed");
	  System.out.println("Step 5 executed Successfully");
	  //Step 6
	  CapribedsideReceiveBottlesPage receiveBtl = new CapribedsideReceiveBottlesPage();
	  receiveBtl.txt_box_BottlePatientID().sendKeys(patientB,Keys.ENTER);
	  Thread.sleep(2000);
	  milkCommon.patientNotMatchErrorMsg();
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 06 Passed");
	  System.out.println("Step 6 executed Successfully");
	  //Step 7
	  receiveBtl.txt_box_BottlePatientID().clear();
	  receiveBtl.txt_box_BottlePatientID().sendKeys(patientA,Keys.ENTER);
	  Thread.sleep(2000);
	  CapribedsideReceiveBottlesPage.txt_box_Bottlenumber().sendKeys(bottle);
		CapribedsideReceiveBottlesPage.txt_box_Bottlenumber().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		if (CapribedsideReceiveBottlesPage.button_BottlenumberWarningYes().isDisplayed()){
			CapribedsideReceiveBottlesPage.button_BottlenumberWarningYes().click();
		}
		Thread.sleep(3000);
		CapribedsideReceiveBottlesPage.txt_box_CollectedDateTime().clear();
		CapribedsideReceiveBottlesPage.txt_box_CollectedDateTime().sendKeys(currentDate);
		Thread.sleep(1000);
		CapribedsideReceiveBottlesPage.dropDwn_StorageState().selectByValue("Fresh");
		Thread.sleep(2000);
		CapribedsideReceiveBottlesPage.button_Confirm().click();
		Thread.sleep(3000);
		//Capribedside_page_ReceiveBottles.button_Warning_popup_Yes().click();
		//multiScreens.multiScreenShot(iedriver.driver);
		Thread.sleep(1000);
		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 07 Passed");
		Thread.sleep(3000);
		CapribedsideReceiveBottlesPage.button_Exit().click();
		Thread.sleep(3000);
		System.out.println("Step 7 executed Successfully");
		//Step 8
		patientMenu.changePatientButton().click();
		Thread.sleep(1000);
		selectPatient.txt_box_patientid().sendKeys(patientB,Keys.ENTER);
		Thread.sleep(3000);
		multiScreens.multiScreenShot(iedriver.driver);
		  iedriver.extent_Test().log(LogStatus.PASS, "Step 08 Passed");
		System.out.println("Step 8 executed Successfully");
		//Step 9
		/*mainPage.button_ReceiveBottles().click();;
		Thread.sleep(2000);
		confirmPage.confirmPatientID().sendKeys(patientB,Keys.ENTER);
		Thread.sleep(2000);
		receiveBtl.txt_box_BottlePatientID().sendKeys(patientB,Keys.ENTER);
		Thread.sleep(2000);
		
		receiveBtl.txt_box_Bottlenumber().sendKeys(bottle,Keys.ENTER);
		Thread.sleep(3000);
		milkCmn.duplicateBottleErrorMsg();
		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 09 Passed");
		Thread.sleep(3000);
		receiveBtl.button_Exit().click();
		Thread.sleep(3000);
		*/
		patientMenu.button_PrepareBottles().click();
		Thread.sleep(2000);
		confirmPatient.confirmPatientID().sendKeys(patientB,Keys.ENTER);
		Thread.sleep(2000);
		prepareBottle.txt_box_BottleNumber().sendKeys(bottle);
		 act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 09 Passed");
		prepareBottle.button_Exit().click();
		System.out.println("Step 9 executed Successfully");
		//Step 10
		patientMenu.button_AdministerBottles().click();
		Thread.sleep(3000);
		CapribedsideAdministerBottlesPage admBottle = new CapribedsideAdministerBottlesPage();
		admBottle.txt_box_bottlenumber().sendKeys(bottle,Keys.ENTER);
		Thread.sleep(2000);
		milkCommon.bottleConnotBeAdministerForThisPatientErrorMsg();
		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 10 Passed");
		Thread.sleep(2000);
		System.out.println("Step 10 executed Successfully");
		//Step 11
		admBottle.button_Exit().click();
		Thread.sleep(3000);
		patientMenu.button_DischargeBottles().click();
		Thread.sleep(2000);
		dischargeBottle.txt_box_bottlenumber().sendKeys(bottle,Keys.ENTER);
		Thread.sleep(2000);
		milkCommon.bottleMayNotBeDischargeToThisPatientErrorMsg();
		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 11 Passed");
		Thread.sleep(2000);
		System.out.println("Step 11 executed Successfully");
		//Step 12
		dischargeBottle.buttonAckBottleMayNotBeDischargeToThisPatPopup().click();
		Thread.sleep(2000);
		dischargeBottle.button_Exit().click();
		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 12 Passed");
		System.out.println("Step 12 executed Successfully");
		//Step 13
		patientMenu.button_CombineBottles().click();
		Thread.sleep(2000);
		combineBottles.txt_box_BottleNumber().sendKeys(bottle,Keys.ENTER);
		Thread.sleep(2000);
		combineBottles.bottleMayNotBeCombinedForThisPatienWarnMsg();
		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 13 Passed");
		Thread.sleep(2000);
		System.out.println("Step 13 executed Successfully");
		//Step 14
		combineBottles.ackButtonBottleMayNotBeCombinedForThisPatienWarnPopup().click();
		Thread.sleep(2000);
		combineBottles.button_Exit().click();
		Thread.sleep(2000);
		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 14 Passed");
		System.out.println("Step 14 executed Successfully");
		//Step 15
		Thread.sleep(2000);
		patientMenu.button_StateChange().click();
		Thread.sleep(2000);
		stateChange.txt_box_BottleNumber().sendKeys(bottle,Keys.ENTER);
		Thread.sleep(1000);
		milkCommon.warningBottleMayNotBezChangedForThisPatient();
		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 15 Passed");
		System.out.println("Step 15 executed Successfully");
		Thread.sleep(2000);
		//Step 16
		stateChange.ackButtonBottleMayNotBezChangedForThisPatientPopup().click();
		Thread.sleep(2000);
		stateChange.button_Exit().click();
		Thread.sleep(1000);
		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 16 Passed");
		System.out.println("Step 16 executed Successfully");
		Thread.sleep(2000);
		//Step 17
		patientMenu.changePatientButton().click();
		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 17 Passed");
		Thread.sleep(2000);
		System.out.println("Step 17 executed Successfully");
		//Step 18
		selectPatient.txt_box_patientid().sendKeys(patientA,Keys.ENTER);
		Thread.sleep(3000);
		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 18 Passed");
		System.out.println("Step 18 executed Successfully");
		 iedriver.extent_Reports().endTest(iedriver.extent_Test());
		 iedriver.extent_Reports().flush();
		 iedriver.extent_Reports().close();
  }
  
  @AfterTest
  public void closeDriverTest() throws  Throwable
  {
	  driver.close();
	  Thread.sleep(2000);
	  this.screenRecorder.stop();
  }
}
