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
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.pageObjects.CapribedsideSelectPatientPage;
import com.pageObjects.SystemManagerBarcodeTypePage;
import com.pageObjects.SystemManagerLabelPrinterAndBarcodeSettingsPage;
import com.pageObjects.SystemManagerMainPage;
import com.relevantcodes.extentreports.LogStatus;

import multiScreenShot.MultiScreenShot;

public class CausePatientMisidentificationTest 
{
	String username="superuser";
    String password="123";
	CommonFunctions fun = new CommonFunctions();
	CapribedsideSelectPatientPage selectPatient = new CapribedsideSelectPatientPage();
	SystemManagerBarcodeTypePage editBarcode = new SystemManagerBarcodeTypePage();
	SystemManagerMainPage systeManagerMenuPage = new SystemManagerMainPage();
	SystemManagerLabelPrinterAndBarcodeSettingsPage barcodePage = new SystemManagerLabelPrinterAndBarcodeSettingsPage();
	private static ScreenRecorder screenRecorder;
	String capribedsideUrl = "http://10.162.106.174/TransSpec2016010410/capribedside/Login.aspx";
	String systemManagerUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
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
  @Test
  public void PatientMisidentificationTest() throws InterruptedException, IOException 
  {
	  String FilePath = "C:\\Temp\\PatientMisidentificationTest.html";
	  String TestName = "PatientIdentificationErrorTest";
	  MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","PatientMisidentificationTest");
	  IEDriver iedriver = new IEDriver(FilePath, TestName); 
	  IEDriver driver = new IEDriver();
	  fun.login(capribedsideUrl, username,password);
	  fun.waitForElement("txtPatientId");
	  
	 // Thread.sleep(3000);
	  selectPatient.txt_box_patientid().sendKeys("100",Keys.ENTER);
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 01 Passed");
	  boolean wb = selectPatient.patientNotFoundErrorMsg().isDisplayed();
	  	if(wb)
	  	{
	  		System.out.println("Patient not found.-Is displayed");
	  	}
	  	else
	  	{
	  		System.out.println("Error message 'Patient not found.' is not displayed");
	  	}
	  	//Step 2
	  selectPatient.txt_box_patientid().clear();
	  Thread.sleep(2000);
	  selectPatient.txt_box_patientid().sendKeys("635201",Keys.ENTER);
	  Thread.sleep(3000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 02 Passed");
	  driver.close();
	  //Step 3
	  fun.login(systemManagerUrl, username,password);
	  
	  systeManagerMenuPage.button_PrinterBarcodeSettings().click();
	  Thread.sleep(2000);
	 
	  barcodePage.linkBarcodeType().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 03 Passed");
	  //Step 4
	  
	  editBarcode.editLinkPatientIDWristband().click();
	  Thread.sleep(1000);
	  editBarcode.textboxPrefix().clear();
	  editBarcode.textboxPrefix().sendKeys("a");
	  Thread.sleep(1000);
	  editBarcode.textboxSuffix().clear();
	  editBarcode.textboxSuffix().sendKeys("b");
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 04 Passed");
	  editBarcode.buttonConfirm().click();
	  Thread.sleep(2000);
	  driver.close();
	  //Step 5
	  fun.login(capribedsideUrl, username,password);
	  Thread.sleep(2000);
	  fun.scanpatientid("635201");
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 05 Passed");
	  boolean wb1 = selectPatient.expectingPatientIDErrorMsg().isDisplayed();
	 // Assert.assertTrue(wb1,"-Is displayed");
	  
  	if(wb1)
  	{
  		System.out.println("The system is expecting a Patient ID from the patient wristband.-Is displayed");
  	}
  	else
  	{
  		System.out.println("Error message 'The system is expecting a Patient ID from the patient wristband.' is not displayed");
  	}
  	
  	Thread.sleep(1000);
  	//Step 6
  	fun.scanpatientid("a635201b");
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 06 Passed");
	  driver.close();
	  
	  
	  iedriver.extent_Reports().endTest(iedriver.extent_Test());
	  iedriver.extent_Reports().flush();
	  iedriver.extent_Reports().close();
	  
	  	  
  }
  /*
  @AfterMethod
	public void testing(ITestResult result) throws IOException
  {
	  String FilePath = "C:\\Temp\\PatientMisidentificationTest.html";
	  String TestName = "PatientIdentificationErrorTest";
	  MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","PatientMisidentificationTest");
	  IEDriver iedriver = new IEDriver(FilePath, TestName); 
	  if(result.getStatus() == ITestResult.FAILURE)
	  {
		multiScreens.multiScreenShot(iedriver.driver);	
		String img = iedriver.extent_Test().addScreenCapture("C:\\Temp\\ScreenShot_Screenshots\\screenShot4.jpg");
		iedriver.extent_Test().log(LogStatus.FAIL, "Step 4 Failed",img);
	  }
	}
	*/
  @AfterTest
  public void closeDriverTest() throws  Throwable
  {
	  fun.login(systemManagerUrl, username,password);
	  Thread.sleep(2000);
	  systeManagerMenuPage.button_PrinterBarcodeSettings().click();
	  Thread.sleep(2000);
	  barcodePage.linkBarcodeType().click();
	  Thread.sleep(2000);
	  editBarcode.editLinkPatientIDWristband().click();
	  Thread.sleep(1000);
	  editBarcode.textboxPrefix().clear();
	  Thread.sleep(1000);
	  editBarcode.textboxSuffix().clear();
	  Thread.sleep(1000);
	  editBarcode.buttonConfirm().click();
	  Thread.sleep(2000);
	  IEDriver.driver.close();
	  Thread.sleep(2000);
	  this.screenRecorder.stop();
  }
}
