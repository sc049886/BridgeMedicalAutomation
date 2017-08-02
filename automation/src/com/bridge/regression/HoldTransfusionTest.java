package com.bridge.regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.BloodTransfusionCommonFunctionality;
import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.pageObject.Functions.CapribedsideHoldTransfusionPageFunctions;
import com.pageObjects.CapribedsideAdministerDerivativesPage;
import com.pageObjects.CapribedsideBrowseTransfusionHistoryPage;
import com.pageObjects.CapribedsideEndTransfusionPage;
import com.pageObjects.CapribedsideHoldTransfusionPage;
import com.pageObjects.CapribedsideLoginPage;
import com.pageObjects.CapribedsidePatientMainPage;
import com.pageObjects.CapribedsideStartTransfusionPage;
import com.pageObjects.SystemManagerEditRolePage;
import com.pageObjects.SystemManagerMainPage;
import com.pageObjects.SystemManagerRolesPage;
import com.pageObjects.SystemManagerTransfusionSettingsPage;

import multiScreenShot.MultiScreenShot;

public class HoldTransfusionTest 
{
	String FilePath = "C:\\Temp\\HoldTransfusionTest.html";
	String TestName = "HoldTransfusionTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","HoldTransfusionTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName);
	CapribedsideLoginPage login = new CapribedsideLoginPage();
	SystemManagerMainPage sysManagerMainPage = new SystemManagerMainPage();
	CommonFunctions common = new CommonFunctions();
	CapribedsidePatientMainPage patientMenu = new  CapribedsidePatientMainPage();
	
	CapribedsideStartTransfusionPage stTransPage = new CapribedsideStartTransfusionPage();
	BloodTransfusionCommonFunctionality transfusionCommonFunctionalities = new BloodTransfusionCommonFunctionality();
	SystemManagerTransfusionSettingsPage transfusionSettings = new SystemManagerTransfusionSettingsPage();
	CapribedsideHoldTransfusionPage holdTransPage = new CapribedsideHoldTransfusionPage();
	CapribedsideEndTransfusionPage endTrans = new CapribedsideEndTransfusionPage();
	CapribedsideBrowseTransfusionHistoryPage browseTransHistory = new CapribedsideBrowseTransfusionHistoryPage();
	CapribedsideHoldTransfusionPageFunctions holdtransfunctions = new  CapribedsideHoldTransfusionPageFunctions();
	CapribedsideAdministerDerivativesPage administerDerivative = new CapribedsideAdministerDerivativesPage();
	SystemManagerRolesPage roles = new SystemManagerRolesPage();
	SystemManagerEditRolePage editRole = new SystemManagerEditRolePage();
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedside = "http://10.162.106.174/TransSpec2016010410/CapriBedside/Login.aspx";
	String superuser = "Superuser";
	String user1 = "rohan";
	String password = "123";
	String patientA = "635201";
	String racipientPatientID ="*635201";
	String patientName ="TIMMONS, BABY BOY";
	String unitNo= common.uniqueNumber(-1);
	String unitNo2 = common.uniqueNumber(0);
	String nextDate = common.currentDate("MM/dd/yyyy HH:mm",+2);
	@BeforeTest
	public void systemManagerPreSettingTest() throws InterruptedException
	{
		
		  iedriver.callDriver(sysmanUrl);
		  Thread.sleep(1000);
		  login.txt_box_username().sendKeys(superuser);
		  Thread.sleep(1000);
		  login.txt_box_password().sendKeys(password);
		  Thread.sleep(1000);
		  login.button_login().click();
		  Thread.sleep(1000);
		  sysManagerMainPage.button_TransfusionSettings().click();
		  Thread.sleep(2000);
		  transfusionSettings.displayPreviouslyStartedUnitsInHoldAndEndWithinTheLast().clear();
		  Thread.sleep(1000);
		  transfusionSettings.displayPreviouslyStartedUnitsInHoldAndEndWithinTheLast().sendKeys("2");
		  Thread.sleep(2000);
		  transfusionSettings.buttonConfirm().click();
		  Thread.sleep(2000);
		  sysManagerMainPage.button_Roles().click();
		  Thread.sleep(2000);
		  roles.editStudentTransfusionist().click();
		  Thread.sleep(2000);
		  boolean b1 = editRole.checkBoxAccessBrowseTransfusionHistory().isSelected();
		  if(!b1)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxAccessBrowseTransfusionHistory().click(); 
		  }
		  Thread.sleep(1000);
		  boolean b2 = editRole.checkBoxMayStartTransfusionWithoutCosignature().isSelected();
		  if(!b2)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxMayStartTransfusionWithoutCosignature().click();
		  }
		  Thread.sleep(1000);
		  
		  boolean b3 = editRole.checkBoxHoldTransfusion().isSelected();
		  if(b3)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxHoldTransfusion().click();
		  }
		  Thread.sleep(1000);
		  editRole.buttonConfirm().click();
		  Thread.sleep(2000);
		  
		  iedriver.close();
		
	}
  @Test
  public void mainTest() throws Throwable 
  {
	  //Step 1
	  iedriver.callDriver(capribedside);
	  
	  Thread.sleep(1000);
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
	  transfusionCommonFunctionalities.startTransfusion(unitNo,racipientPatientID,patientName);
	  Thread.sleep(6000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 3
	  
	  //Hold T1
	  holdTransPage.holdTransfusion(unitNo);
	  /*
	     patientMenu.holdTransfusionButton().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //step 4
		 holdTransPage.editboxUnitNumber().sendKeys(unitNo,Keys.ENTER);
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 5
		 holdTransPage.selectBlodProduct(4);
		 Thread.sleep(1000);
		 holdTransPage.buttonContinue().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 /*
		 //Step 6
		 holdTransPage.buttonExitHold().click();
		 Thread.sleep(1000);
		 holdTransPage.buttonYesExitHoldPopup().click();
		 //Step 7
		 mainPage.holdTransfusionButton().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 holdTransPage.editboxUnitNumber().sendKeys(unitNo,Keys.ENTER);
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 holdTransPage.selectBlodProduct(4);
		 Thread.sleep(1000);
		 holdTransPage.buttonContinue().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 */
	    /*
		 //Step 8
		 String currentDate = common.currentDate();
		 holdTransPage.startHoldDateAndTime().sendKeys(currentDate,Keys.ENTER);
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 9
		 holdTransPage.selectReasonForHold(1);
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //STep 10
		 //holdTransPage.endHoldDateAndTime().sendKeys(nextDate);
		 //Thread.sleep(1000);
		 holdTransPage.textboxComment().sendKeys("Testing");
		 Thread.sleep(2000);
		 holdTransPage.buttonContinueHold().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 11
		 holdTransPage.buttonCancel().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 12
		 */
		 patientMenu.browseTransfusinHistoryButton().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo+"')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 browseTransHistory.buttonHold().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 browseTransHistory.buttonBackInfoPage().click();
		 Thread.sleep(2000);
		 browseTransHistory.buttonBackBrowseTransfusionHistory().click();
		 Thread.sleep(2000);
		/* 
		 //Step 13
		 holdTransPage.holdTransfusion(unitNo);
		 
		 //Step 14
		 patientMenu.browseTransfusinHistoryButton().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo+"')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 browseTransHistory.buttonHold().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 browseTransHistory.buttonBackInfoPage().click();
		 Thread.sleep(2000);
		 browseTransHistory.buttonBackBrowseTransfusionHistory().click();
		 Thread.sleep(2000);
		 */
		 //Step 15
		 patientMenu.holdTransfusionButton().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 
		 holdTransPage.editboxUnitNumber().sendKeys(unitNo,Keys.ENTER);
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 holdtransfunctions.selectBlodProduct(4);
		 Thread.sleep(1000);
		 holdTransPage.buttonContinue().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 /*
		 String currentDate = common.currentDate();
		 holdTransPage.startHoldDateAndTime().sendKeys(currentDate,Keys.ENTER);
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 holdTransPage.selectReasonForHold(1);
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 */
		 //Step 16
		 holdTransPage.endHoldDateAndTime().sendKeys(nextDate);
		 Thread.sleep(2000);
		 holdTransPage.textboxComment().sendKeys("Testing03");
		 Thread.sleep(2000);
		 holdTransPage.buttonContinueHold().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 17
		 holdTransPage.buttonCancel().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 18
		 patientMenu.browseTransfusinHistoryButton().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo+"')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 browseTransHistory.buttonHold().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 browseTransHistory.buttonBackInfoPage().click();
		 Thread.sleep(4000);
		 browseTransHistory.buttonBackBrowseTransfusionHistory().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 
		 // Step 19
		 patientMenu.button_logout().click();
		 Thread.sleep(2000);
		 login.txt_box_username().sendKeys(user1);	
		 Thread.sleep(2000);
		 login.txt_box_password().sendKeys(password);
		 Thread.sleep(2000);
		 login.button_login().click();
		 Thread.sleep(2000);
		 iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 common.scanpatientid(patientA);
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 20
		 transfusionCommonFunctionalities.startTransfusion(unitNo2,racipientPatientID,patientName);
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 iedriver.driver.close();
		 
	  
  }
  @AfterTest
  public void systemManagerPostSettingTest() throws InterruptedException
	{
		
		  iedriver.callDriver(sysmanUrl);
		  Thread.sleep(1000);
		  login.txt_box_username().sendKeys(superuser);
		  Thread.sleep(1000);
		  login.txt_box_password().sendKeys(password);
		  Thread.sleep(1000);
		  login.button_login().click();
		  Thread.sleep(1000);
		  sysManagerMainPage.button_TransfusionSettings().click();
		  Thread.sleep(2000);
		  transfusionSettings.displayPreviouslyStartedUnitsInHoldAndEndWithinTheLast().clear();
		  Thread.sleep(1000);
		  transfusionSettings.displayPreviouslyStartedUnitsInHoldAndEndWithinTheLast().sendKeys("0");
		  Thread.sleep(2000);
		  transfusionSettings.buttonConfirm().click();
		  Thread.sleep(2000);
		  sysManagerMainPage.button_Roles().click();
		  Thread.sleep(2000);
		  roles.editStudentTransfusionist().click();
		  Thread.sleep(2000);
		  boolean b1 = editRole.checkBoxAccessBrowseTransfusionHistory().isSelected();
		  if(b1)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxAccessBrowseTransfusionHistory().click(); 
		  }
		  Thread.sleep(1000);
		  boolean b2 = editRole.checkBoxMayStartTransfusionWithoutCosignature().isSelected();
		  if(b2)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxMayStartTransfusionWithoutCosignature().click();
		  }
		  Thread.sleep(1000);
		  
		  boolean b3 = editRole.checkBoxHoldTransfusion().isSelected();
		  if(!b3)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxHoldTransfusion().click();
		  }
		  Thread.sleep(1000);
		  editRole.buttonConfirm().click();
		  Thread.sleep(2000);
		  
		  iedriver.close();
		
	}
}
