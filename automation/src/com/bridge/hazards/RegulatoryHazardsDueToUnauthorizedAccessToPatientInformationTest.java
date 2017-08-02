package com.bridge.hazards;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.pageObject.Functions.SystemManagerLoginSettingsPageFunctions;
import com.pageObjects.CapribedsideCollectSpecimenPage;
import com.pageObjects.CapribedsideExpiredPasswordPage;
import com.pageObjects.CapribedsideLoginPage;
import com.pageObjects.CapribedsidePatientMainPage;
import com.pageObjects.CapribedsideSelectPatientPage;
import com.pageObjects.SystemManagerLoginSettingsPage;
import com.pageObjects.SystemManagerMainPage;
import com.pageObjects.SystemManagerUsersPage;
import com.relevantcodes.extentreports.LogStatus;

import multiScreenShot.MultiScreenShot;

public class RegulatoryHazardsDueToUnauthorizedAccessToPatientInformationTest 
{
	String username="superuser";
    String password="123";
	String FilePath = "C:\\Temp\\RegulatoryHazardsDueToUnauthorizedAccessToPatientInformationTest.html";
	String TestName = "PatientIdentificationErrorTest";
	
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","RegulatoryHazardsDueToUnauthorizedAccessToPatientInformationTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	CapribedsidePatientMainPage mainPatPage = new CapribedsidePatientMainPage();
	CapribedsideSelectPatientPage selectPatient = new CapribedsideSelectPatientPage();
	CommonFunctions commonfunctions = new CommonFunctions();
	CapribedsideLoginPage login = new CapribedsideLoginPage();
	CapribedsideCollectSpecimenPage collectSpecimen = new CapribedsideCollectSpecimenPage();
	SystemManagerMainPage systemManagerMainMenu = new SystemManagerMainPage();
	SystemManagerLoginSettingsPage logset = new SystemManagerLoginSettingsPage();
	SystemManagerLoginSettingsPageFunctions loginsettingspagefunctions = new SystemManagerLoginSettingsPageFunctions();
	CapribedsideExpiredPasswordPage expPass = new CapribedsideExpiredPasswordPage();
	SystemManagerUsersPage userPage = new SystemManagerUsersPage();
	//LoginToCapribedside1 capribedside = new LoginToCapribedside1();
	//Capribedside_page_Login login = new Capribedside_page_Login();
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedsideUrl = "http://10.162.106.174/TransSpec2016010410/capribedside/Login.aspx";
	String patientA = "1010124";
	String patientB = "635201";
	String user2 = "mary";
	String user3 = "ronald";
	String user4 = "john";
	String user5 = "sara";
	
  @Test
  public void regulatoryHazardsTest() throws InterruptedException, IOException 
  {
	  commonfunctions.login(capribedsideUrl, username,password);
	  //Step 1
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 01 Passed");
	  //Step 2
	  commonfunctions.scanpatientid(patientA);
	  commonfunctions.waitForElement("cmdCollectSpecimens_cmdButton");
	  mainPatPage.buttonCollectSpecimens().click();
	  commonfunctions.waitForElement("DataGrid1__ctl4_checkboxSelect");
	  collectSpecimen.checkBoxOrderMetabolic().click();
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  commonfunctions.waitForElement("header_cmdLogout");
	  collectSpecimen.linkLogout().click();
	  commonfunctions.waitForElement("header__modalConfirm_cmdOK");
	  collectSpecimen.buttonYeslogoutPopup().click();
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 02 Passed");
	  //Step 3
	  commonfunctions.waitForElement("UserId");
	  login.txt_box_username().sendKeys(user2);
	  login.txt_box_password().sendKeys("123");
	  login.button_login().click();
	  commonfunctions.waitForElement("txtPatientId");
	  commonfunctions.scanpatientid(patientA);
	  commonfunctions.waitForElement("cmdCollectSpecimens_cmdButton");
	  mainPatPage.buttonCollectSpecimens().click();
	  commonfunctions.waitForElement("DataGrid1__ctl4_checkboxSelect");
	  collectSpecimen.checkBoxOrderMetabolic().click();
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  collectSpecimen.linkLogout().click();
	  commonfunctions.waitForElement("header__modalConfirm_cmdOK");
	  collectSpecimen.buttonYeslogoutPopup().click();
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 03 Passed");
	  //Step 4
	  commonfunctions.waitForElement("UserId");
	  login.txt_box_username().sendKeys(user3);
	  login.txt_box_password().clear();
	  login.txt_box_password().sendKeys("123");
	  login.button_login().click();
	  commonfunctions.waitForElement("txtPatientId");
	  commonfunctions.scanpatientid(patientA);
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  mainPatPage.button_logout().click();
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 04 Passed");
	  //Step 5
	  commonfunctions.waitForElement("UserId");
	  login.txt_box_username().sendKeys(user4);
	  login.txt_box_password().sendKeys("1234");
	  login.button_login().click();
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  Thread.sleep(1000);
	  String errMsg = login.errMsgNoPrivilegeToAccessBridgeMedical().getText();
	  System.out.println(errMsg);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 05 Passed");
	  //step 6
	  commonfunctions.waitForElement("UserId");
	  login.txt_box_username().clear();
	  login.txt_box_username().sendKeys(user5);
	  login.txt_box_password().clear();
	  login.txt_box_password().sendKeys("123");
	  login.button_login().click();
	  commonfunctions.waitForElement("txtPatientId");
	  commonfunctions.scanpatientid(patientB);
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  commonfunctions.waitForElement("header_cmdLogout");
	  mainPatPage.button_logout().click();
	  iedriver.close();
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 06 Passed");
	  //Step 7
	  commonfunctions.login(sysmanUrl, username,password);
	  commonfunctions.waitForElement("userLogin_cmdButton");
	  systemManagerMainMenu.button_LoginSettings().click();
	  commonfunctions.waitForElement("lstPasswordExpiration");
	  loginsettingspagefunctions.selectForceChangePassword("every day");
	  logset.btnConfirm().click();
	  commonfunctions.waitForElement("header_cmdLogout");
	  systemManagerMainMenu.linkLogout().click();
	  iedriver.close();
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 07 Passed");
	  //Stpe 8
	  
	  commonfunctions.login(capribedsideUrl, username,password);
	  /*
	  capribedside.preExecutionTest();
	  Thread.sleep(1000);
	  login.txt_box_username().sendKeys("Superuser");
	  Thread.sleep(1000);
	  login.txt_box_password().sendKeys("123");
	  Thread.sleep(1000);
	  login.button_login().click();
	  */
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 08 Passed");
	  //Stpe 9
	  commonfunctions.waitForElement("NewPassword");
	  expPass.textBoxNewPassword().sendKeys("12345");
	  expPass.textBoxConfirmPassword().sendKeys("12345");
	  expPass.btnOK().click();;
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  commonfunctions.waitForElement("header_cmdLogout");
	  mainPatPage.button_logout().click();
	  iedriver.close();
	  Thread.sleep(2000);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 09 Passed");
	  //Step 10
	  commonfunctions.login(capribedsideUrl, username,password);
  }
  @AfterTest
  public void restorChangesTest() throws InterruptedException
  {
	  //Sysman restoring changes..
	  
	  iedriver.callDriver(sysmanUrl);
	  commonfunctions.waitForElement("UserId");
	  login.txt_box_username().sendKeys("superuser");
	  login.txt_box_password().sendKeys("12345");
	  login.button_login().click();
	  //Thread.sleep(1000);
	  /*
	  expPass.textBoxNewPassword().sendKeys("12345");
	  Thread.sleep(1000);
	  expPass.textBoxConfirmPassword().sendKeys("12345");
	  Thread.sleep(2000);
	  expPass.btnOK().click();
	  */
	  commonfunctions.waitForElement("userLogin_cmdButton");
	  systemManagerMainMenu.button_LoginSettings().click();
	  commonfunctions.waitForElement("lstPasswordExpiration");
	  loginsettingspagefunctions.selectForceChangePassword("Never");
	  logset.btnConfirm().click();
	  commonfunctions.waitForElement("Users_cmdButton");
	  systemManagerMainMenu.button_Users().click();
	  commonfunctions.waitForElement("dlUsers__ctl33_editLink");
	  userPage.editSuperuser().click();
	  commonfunctions.waitForElement("txtPassword");
	  userPage.textBoxPassword().clear();
	  userPage.textBoxPassword().sendKeys("123");
	  userPage.textReenterPassword().clear();
	  userPage.textReenterPassword().sendKeys("123");
	  userPage.btnConfirm().click();
	  commonfunctions.waitForElement("header_cmdLogout");
	  systemManagerMainMenu.linkLogout().click();
	  iedriver.close();
	  
  }
 
}