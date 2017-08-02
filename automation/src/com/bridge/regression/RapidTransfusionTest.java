package com.bridge.regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.BloodTransfusionCommonFunctionality;
import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.pageObject.Functions.CapribedsideRapidStartTransfusionPageFunctions;
import com.pageObject.Functions.SystemManagerEditBloodProductPageFunctions;
import com.pageObject.Functions.SystemManagerEditPocPageFunctions;
import com.pageObject.Functions.SystemManagerTransfusionSettingsPageFunctions;
import com.pageObjects.CapribedsideLoginPage;
import com.pageObjects.CapribedsidePatientMainPage;
import com.pageObjects.CapribedsideRapidStartTransfusionPage;
import com.pageObjects.CapribedsideStartTransfusionPage;
import com.pageObjects.SystemManagerBloodProductPage;
import com.pageObjects.SystemManagerEditBloodProductPage;
import com.pageObjects.SystemManagerEditPocPage;
import com.pageObjects.SystemManagerEditRolePage;
import com.pageObjects.SystemManagerMainPage;
import com.pageObjects.SystemManagerPointsOfCarePage;
import com.pageObjects.SystemManagerRolesPage;
import com.pageObjects.SystemManagerTransfusionSettingsPage;

import multiScreenShot.MultiScreenShot;

public class RapidTransfusionTest 
{
	String FilePath = "C:\\Temp\\RapidTransfusionTest.html";
	String TestName = "RapidTransfusionTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","RapidTransfusionTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	CapribedsideLoginPage login = new CapribedsideLoginPage();
	SystemManagerMainPage sysManagerMainPage = new SystemManagerMainPage();
	CommonFunctions common = new CommonFunctions();
	CapribedsidePatientMainPage patientMenu = new  CapribedsidePatientMainPage();
	CapribedsideStartTransfusionPage stTransPage = new CapribedsideStartTransfusionPage();
	CapribedsideRapidStartTransfusionPageFunctions rapidtranspagefunctions = new CapribedsideRapidStartTransfusionPageFunctions();
	BloodTransfusionCommonFunctionality transCommon = new BloodTransfusionCommonFunctionality();
	SystemManagerRolesPage roles = new SystemManagerRolesPage();
	SystemManagerEditRolePage editRole = new SystemManagerEditRolePage();
	SystemManagerTransfusionSettingsPage transSettings = new SystemManagerTransfusionSettingsPage();
	SystemManagerTransfusionSettingsPageFunctions transfusionsettingsfunctions = new SystemManagerTransfusionSettingsPageFunctions();
	BloodTransfusionCommonFunctionality bloodTransCommnon = new  BloodTransfusionCommonFunctionality();
	SystemManagerPointsOfCarePage selectPoc = new SystemManagerPointsOfCarePage();
	SystemManagerEditPocPage editPoc = new SystemManagerEditPocPage();
	SystemManagerEditPocPageFunctions editpocpagefunctions = new SystemManagerEditPocPageFunctions();
	SystemManagerBloodProductPage bloodProduct = new SystemManagerBloodProductPage();
	SystemManagerEditBloodProductPage systemManagerEditBloodProductPage = new SystemManagerEditBloodProductPage();
	SystemManagerEditBloodProductPageFunctions editbloodprodpage = new SystemManagerEditBloodProductPageFunctions();
	CapribedsideRapidStartTransfusionPage rapidTransfusion = new CapribedsideRapidStartTransfusionPage();
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedside = "http://10.162.106.174/TransSpec2016010410/CapriBedside/Login.aspx";
	String superuser = "Superuser";
	String user2 = "jj";
	String password = "123";
	String patientA = "635201";
	String patientB = "1010123";
	String user3 = "rohan";
	String bloodOpos = "O pos";
	String Yes = "Yes";
	String No = "No";
	String unitNo= common.uniqueNumber(-1);
	String unitNo2 = common.uniqueNumber(0);
	//String unitNo3 = common.uniqueNumber3();
    String nextDate = common.currentDate("MM/dd/yyyy" ,+2);
    
	@BeforeTest
	public void systemManagerPreSettingTest() throws Throwable
	{
		
		  iedriver.callDriver(sysmanUrl);
		  Thread.sleep(1000);
		  common.login(sysmanUrl,superuser, password);
		  Thread.sleep(2000);
		  sysManagerMainPage.button_PointsOfCare().click();
		  Thread.sleep(2000);
		  selectPoc.editPocPeds().click();
		  Thread.sleep(2000);
		  editpocpagefunctions.selectYesOrNoForCheckCenterCode(Yes);
		  Thread.sleep(2000);
		  editpocpagefunctions.selectOptionForRequireCosignature(Yes);
		  Thread.sleep(2000);
		  editpocpagefunctions.selectYesOrNoFordDisplayCommentsInRapidStartTransfusion(Yes);
		  Thread.sleep(2000);
		  editPoc.buttonConfirm().click();
		  Thread.sleep(2000);
		  selectPoc.editPocGenMed().click();
		  Thread.sleep(2000);
		  editpocpagefunctions.selectYesOrNoForCheckCenterCode(No);
		  Thread.sleep(2000);
		  //editPoc.selectYesOrNoForRequireCosignature(Yes);
		  //Thread.sleep(2000);
		  editpocpagefunctions.selectYesOrNoFordDisplayCommentsInRapidStartTransfusion(Yes);
		  Thread.sleep(2000);
		  editPoc.buttonConfirm().click();
		  Thread.sleep(2000);
		  selectPoc.button_Back().click();
		  Thread.sleep(2000);
		  sysManagerMainPage.button_TransfusionSettings().click();
		  Thread.sleep(2000);
		  transSettings.linkBloodProducts().click();
		  Thread.sleep(2000);
		  bloodProduct.editLinkForCRT().click();
		  Thread.sleep(2000);
		  editbloodprodpage.selectOptionForExpirationCheck("2");
		  Thread.sleep(2000);
		  editbloodprodpage.selectOptionForCompareBloodType(Yes);
		  Thread.sleep(2000);
		  editbloodprodpage.selectOptionForISBT_128_BloodProduct(No);
		  Thread.sleep(2000);
		  systemManagerEditBloodProductPage.linkBloodProductAttributes().click();
		  Thread.sleep(2000);
		
		 boolean b1 = systemManagerEditBloodProductPage.checkboxAntiCMVNegative().isEnabled();
		 if(!b1)
		 {
			 systemManagerEditBloodProductPage.checkboxAntiCMVNegative().click();
			 Thread.sleep(2000);
		 }
		 else
		 {
			 Thread.sleep(1000);
		 }
		 boolean b = systemManagerEditBloodProductPage.checkboxIrradiated().isEnabled();
		 if(!b)
		 {
			 systemManagerEditBloodProductPage.checkboxIrradiated().click();
			 Thread.sleep(2000);
		 }
		 else
		 {
			 Thread.sleep(1000);
		 }
		 systemManagerEditBloodProductPage.linkBack().click();
		 Thread.sleep(2000);
		 systemManagerEditBloodProductPage.buttonConfirm().click();
		 Thread.sleep(2000);
		  //bloodProduct.editLinkForISBTWB().click();
		  bloodProduct.editLinkForWB().click();
		  Thread.sleep(2000);
		  editbloodprodpage.selectOptionForExpirationCheck("2");
		  Thread.sleep(2000);
		  editbloodprodpage.selectOptionForCompareBloodType(Yes);
		  Thread.sleep(2000);
		  editbloodprodpage.selectOptionForISBT_128_BloodProduct(No);
		  Thread.sleep(2000);
		  systemManagerEditBloodProductPage.linkBloodProductAttributes().click();
		  Thread.sleep(2000);
		 boolean b3 = systemManagerEditBloodProductPage.checkboxAntiCMVNegative().isEnabled();
		 if(!b3)
		 {
			 systemManagerEditBloodProductPage.checkboxAntiCMVNegative().click();
			 Thread.sleep(2000);
		 }
		 else
		 {
			 Thread.sleep(1000);
		 }
		 boolean b2 = systemManagerEditBloodProductPage.checkboxIrradiated().isEnabled();
		 if(!b2)
		 {
			 systemManagerEditBloodProductPage.checkboxIrradiated().click();
			 Thread.sleep(2000);
		 }
		 else
		 {
			 Thread.sleep(1000);
		 }
		 systemManagerEditBloodProductPage.linkBack().click();
		 Thread.sleep(2000);
		 systemManagerEditBloodProductPage.buttonConfirm().click();
		 Thread.sleep(2000);
		 bloodProduct.linkBack().click();
		 Thread.sleep(2000);
		 transfusionsettingsfunctions.selectOptionForDisplayBloodTypeMismatchQuestion("BOTH");
		 Thread.sleep(2000);
		 transfusionsettingsfunctions.selectOptionForPropmtForPatientBloodType(Yes);
		 Thread.sleep(2000);
		 transfusionsettingsfunctions.selectOptionForExpirationMessage("Stop");
	     Thread.sleep(2000);
		 transSettings.buttonConfirm().click();
		 Thread.sleep(2000);
	     sysManagerMainPage.button_Roles().click();
		  Thread.sleep(2000);
		  roles.editTransfusionist().click();
		  Thread.sleep(2000);
		  boolean b4 = editRole.checkBoxMayStartRapidTransfusionWithCosignature().isSelected();
		  if(!b4)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxMayStartRapidTransfusionWithCosignature().click(); 
		  }
		  else
		 {
				 Thread.sleep(2000);
		 }
		  Thread.sleep(2000);
		  editRole.buttonConfirm().click();
		  Thread.sleep(2000);
		  roles.editStudentTransfusionist().click();
		  Thread.sleep(2000);
		  boolean b5 = editRole.checkBoxMayStartRapidTransfusionWithCosignature().isSelected();
		  if(b5)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxMayStartRapidTransfusionWithCosignature().click(); 
		  }
		  else
		 {
				 Thread.sleep(1000);
		 }
		  boolean b6 = editRole.checkBoxMayStartRapidTransfusionWithoutCosignature().isSelected();
		  if(b6)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxMayStartRapidTransfusionWithoutCosignature().click(); 
		  }
		  else
		 {
				 Thread.sleep(1000);
		 }
		  editRole.buttonConfirm().click();
		  Thread.sleep(2000);
		  roles.editSystemAdminister().click();
		  Thread.sleep(2000);
		  boolean b7 = editRole.checkBoxMayStartRapidTransfusionWithoutCosignature().isSelected();
		  if(!b7)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxMayStartRapidTransfusionWithoutCosignature().click(); 
			  Thread.sleep(1000);
		  }
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
	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  common.login(capribedside,superuser, password);
	  Thread.sleep(2000);
	  common.scanpatientid(patientA);
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 2
	  patientMenu.rapidStartTransfusionButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 3
	  Actions act = new Actions(iedriver.driver);
	  transCommon.rapidStartDonorCenterCode(3);
	  act.sendKeys(Keys.ENTER).perform();
	  //Step 4
	  Thread.sleep(2000);
	  rapidTransfusion.donorUnitNumber().sendKeys(unitNo,Keys.ENTER);
	  Thread.sleep(2000);
	  //Step 5
	  
	  transCommon.rapidStartDonorBloodProduct(5);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  Assert.assertEquals(rapidTransfusion.bloodProductAttribute().isDisplayed(),true);
	  //Step 6
	  rapidTransfusion.checkBoxBloodProductAttributeAntiCMVNegative().click();
	  Thread.sleep(2000);
	  rapidTransfusion.checkBoxBloodProductAttributeIrradiated().click();
	  Thread.sleep(2000);
	  rapidTransfusion.buttonSaveBloodAttribute().click();
	  Thread.sleep(2000);
	  //Step 7
	  rapidTransfusion.donorBloodProductExipreDate().sendKeys(nextDate,Keys.ENTER);
	  Thread.sleep(2000);
	  //Step 8
	  rapidtranspagefunctions.selectDonorBloodType(bloodOpos);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 9
	  rapidTransfusion.donorComments().sendKeys("Test Comment");
	  Thread.sleep(2000);
	  //Step 10
	  rapidTransfusion.donorContinueButton().click();
	  Thread.sleep(2000);
	  
	  //Step 11
	  rapidTransfusion.buttonStartRapidTransfusion().click();
	  Thread.sleep(2000);
	  //Step 12
	  rapidTransfusion.buttonCancelRapidTransfusionReport().click();
	  Thread.sleep(2000);
	  //Step 13
	  rapidTransfusion.logoutRapidTransfusion();
	  Thread.sleep(2000);
	  common.login(capribedside,user2, password);
	  Thread.sleep(2000);
	  common.scanpatientid(patientB);
	  //Step 14
	  patientMenu.rapidStartTransfusionButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 15
	  /*
	  transCommon.rapidStartDonorCenterCode(3);
	  act.sendKeys(Keys.ENTER).perform();
	  */
	  Thread.sleep(2000);
	  rapidTransfusion.donorUnitNumber().sendKeys(unitNo,Keys.ENTER);
	  Thread.sleep(2000);
	  //Step 16
	  transCommon.rapidStartDonorBloodProduct(7);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  Assert.assertEquals(rapidTransfusion.bloodProductAttribute().isDisplayed(),true);
	  //Step 17
	  rapidTransfusion.checkBoxBloodProductAttributeAntiCMVNegative().click();
	  Thread.sleep(2000);
	  rapidTransfusion.checkBoxBloodProductAttributeIrradiated().click();
	  Thread.sleep(2000);
	  rapidTransfusion.buttonSaveBloodAttribute().click();
	  Thread.sleep(2000);
	  //Step 18
	  //Step 19
	  rapidTransfusion.donorBloodProductExipreDate().sendKeys(nextDate,Keys.ENTER);
	  Thread.sleep(2000);
	  //Step 20
	  rapidtranspagefunctions.selectDonorBloodType(bloodOpos);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 21
	  rapidTransfusion.donorComments().sendKeys("Test Comment");
	  Thread.sleep(2000);
	  //Step 22
	  rapidTransfusion.donorContinueButton().click();
	  Thread.sleep(2000);
	  //Step 23
	  rapidTransfusion.cosignUserIdTextBox().sendKeys(superuser);
	  Thread.sleep(2000);
	  rapidTransfusion.cosignPasswordTextBox().sendKeys(password);
	  Thread.sleep(2000);
	  rapidTransfusion.btnCosignContinue().click();
	  Thread.sleep(2000);
	  //Step 24
	  rapidTransfusion.buttonStartRapidTransfusion().click();
	  Thread.sleep(2000);
	  //Step 25
	  rapidTransfusion.buttonCancelRapidTransfusionReport().click();
	  Thread.sleep(2000);
	  //Step 26
	  rapidTransfusion.logoutRapidTransfusion();
	  Thread.sleep(2000);
	  common.login(capribedside,user3, password);
	  Thread.sleep(2000);
	  common.scanpatientid(patientB);
	  Thread.sleep(4000);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
