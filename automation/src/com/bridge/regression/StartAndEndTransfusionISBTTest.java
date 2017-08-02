package com.bridge.regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.BloodTransfusionCommonFunctionality;
import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.pageObject.Functions.CapribedsideStartTransfusionPageFunctions;
import com.pageObjects.CapribedsideChangeBloodTypePage;
import com.pageObjects.CapribedsideEndTransfusionPage;
import com.pageObjects.CapribedsideLoginPage;
import com.pageObjects.CapribedsidePatientMainPage;
import com.pageObjects.CapribedsideRapidStartTransfusionPage;
import com.pageObjects.CapribedsideStartTransfusionPage;
import com.pageObjects.SystemManagerBloodProductPage;
import com.pageObjects.SystemManagerBloodProductSubstitutionChartPage;
import com.pageObjects.SystemManagerEditBloodProductPage;
import com.pageObjects.SystemManagerEditBloodProductSubstitutionChartPage;
import com.pageObjects.SystemManagerEditPocPage;
import com.pageObjects.SystemManagerEditRolePage;
import com.pageObjects.SystemManagerMainPage;
import com.pageObjects.SystemManagerPointsOfCarePage;
import com.pageObjects.SystemManagerRolesPage;
import com.pageObjects.SystemManagerTransfusionSettingsPage;

import multiScreenShot.MultiScreenShot;

public class StartAndEndTransfusionISBTTest 
{
	String FilePath = "C:\\Temp\\StartTransfusionISBTConcatenatedBarcodeTest.html";
	String TestName = "StartTransfusionISBTConcatenatedBarcodeTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","StartTransfusionISBTConcatenatedBarcodeTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	CapribedsideLoginPage login = new CapribedsideLoginPage();
	SystemManagerMainPage sysManagerMainPage = new SystemManagerMainPage();
	CommonFunctions common = new CommonFunctions();
	CapribedsidePatientMainPage patientMenu = new  CapribedsidePatientMainPage();
	BloodTransfusionCommonFunctionality transCommon = new BloodTransfusionCommonFunctionality();
	SystemManagerRolesPage roles = new SystemManagerRolesPage();
	SystemManagerEditRolePage editRole = new SystemManagerEditRolePage();
	SystemManagerTransfusionSettingsPage transfusionSettings = new SystemManagerTransfusionSettingsPage();
	BloodTransfusionCommonFunctionality bloodTransCommnon = new  BloodTransfusionCommonFunctionality();
	SystemManagerPointsOfCarePage selectPoc = new SystemManagerPointsOfCarePage();
	SystemManagerEditPocPage editPoc = new SystemManagerEditPocPage();
	SystemManagerBloodProductPage bloodProduct = new SystemManagerBloodProductPage();
	SystemManagerEditBloodProductPage systemManagerEditBloodProductPage = new SystemManagerEditBloodProductPage();
	CapribedsideRapidStartTransfusionPage rapidTransfusion = new CapribedsideRapidStartTransfusionPage();
	CapribedsideStartTransfusionPage startTransfusion = new CapribedsideStartTransfusionPage();
	CapribedsideStartTransfusionPageFunctions starttranspagefunctions = new CapribedsideStartTransfusionPageFunctions();
	CapribedsideEndTransfusionPage endTransfusion = new CapribedsideEndTransfusionPage();
	SystemManagerBloodProductSubstitutionChartPage bloodProductSubstitutionChart = new SystemManagerBloodProductSubstitutionChartPage();
	SystemManagerEditBloodProductSubstitutionChartPage editBloodProductSubstitutionChart = new SystemManagerEditBloodProductSubstitutionChartPage();
	CapribedsideChangeBloodTypePage changeBT = new CapribedsideChangeBloodTypePage();
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedside = "http://10.162.106.174/TransSpec2016010410/CapriBedside/Login.aspx";
	String user2 = "Superuser";
	String user1 = "jj";
	String password = "123";
	String patientA = "635204";
	String patientName = "TOOTS, BABY GIRL B";
	String patientB = "1010123";
	String user3 = "rohan";
	String bloodOpos = "O pos";
	String bloodProductISBT = "=<E0053";
	String bloodProductISBT1 = "=<E0053VA0";
     String bloodOneg = "O neg";
    String bloodGroupBPooledRh = "Group B, Pooled Rh";
	String Yes = "Yes";
	String No = "No";
	String support = common.isbtSupportNumber();
	String isbtUnitNumber = "A1234"+support;
	String isbtFinalNumber = "="+isbtUnitNumber+"P";
	String unitNo= common.uniqueNumber(-1);
	//String unitNo2 = common.uniqueNumber2();
	String nextDate = common.currentDate("MM/dd/yyyy HH:mm",+2);
	String currentDate = common.currentDate("MM/dd/yyyy HH:mm",0);
    String secondaryIdentifierOption = "Transfusion Only";
    String mrn = "132";
    String scanMrn = "S"+mrn+"R";
/*
    @BeforeTest
    public void preSettingTest() throws Throwable
    {
    	  iedriver.callDriver(sysmanUrl);
    	  Thread.sleep(1000);
    	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	  login.login(user2, password);
    	  Thread.sleep(2000);
    	  sysManagerMainPage.button_PointsOfCare().click();
    	  Thread.sleep(2000);
    	  selectPoc.editPocPeds().click();
  	      Thread.sleep(2000);
  	      editPoc.linkModifyChecksTransfusionSettings().click();
  	      Thread.sleep(2000);
  	      boolean b1 = editPoc.checkboxCheckTheOriginalTransfusionOrder().isSelected();
  		  if(!b1)
  		 {
  			 editPoc.checkboxCheckTheOriginalTransfusionOrder().click();
  			 Thread.sleep(2000);
  		 }
  		 else
  		 {
  			 Thread.sleep(1000);
  		 }
  		 
  	      editPoc.linkBackModifyChecksTransfusionSettings().click();
  	      Thread.sleep(2000);
  	      editPoc.selectYesOrNoForCheckCenterCode(Yes);
    	  Thread.sleep(2000);
    	  editPoc.selectOptionForCheckPatientName(Yes);
      	  Thread.sleep(2000);
      	  editPoc.selectOptionRequireScanningInEndTransfusion(Yes);
      	  Thread.sleep(2000);
      	  editPoc.selectOptionForRequireCosignature(Yes);
    	  Thread.sleep(2000);
    	  editPoc.selectOptionForRequireCosignOnBloodTypeMismatch(Yes);
    	  Thread.sleep(2000);
    	  editPoc.selectOptionPromptForVolume(Yes);
    	  Thread.sleep(2000);
    	  editPoc.selectUtilizeSecondaryIdentifier(secondaryIdentifierOption);
    	  Thread.sleep(2000);
    	  editPoc.secondaryIdName().clear();
    	  editPoc.secondaryIdName().sendKeys("MRN");
    	  Thread.sleep(2000);
    	  editPoc.secondaryIdFormat().clear();
    	  Thread.sleep(1000);
    	  editPoc.secondaryIdFormat().sendKeys("CCC");
    	  Thread.sleep(2000);
    	  editPoc.selectOptionForTurnOffSecondaryIdCheckForTxWristband(No);
    	  Thread.sleep(2000);
    	  editPoc.selectOptionForDisplayCommentsInStartTransfusion(Yes);
    	  Thread.sleep(2000);
    	  editPoc.selectOptionForCollectVitalSignsOnStartTransfusion(Yes);
    	  Thread.sleep(2000);
    	  editPoc.selectOptionForCollectVitalSignsOnEndTransfusion(Yes);
    	  Thread.sleep(2000);
    	  editPoc.buttonConfirm().click();
    	  Thread.sleep(2000);
    	  selectPoc.button_Back().click();
    	  Thread.sleep(2000);
    	  sysManagerMainPage.button_TransfusionSettings().click();
    	  Thread.sleep(2000);
    	  transfusionSettings.linkBloodProducts().click();
    	  Thread.sleep(2000);
    	  
    	  bloodProduct.editLinkForISBTWB().click();
		  //bloodProduct.editLinkForWB().click();
		  Thread.sleep(2000);
		  editBloodProduct.selectOptionForExpirationCheck("2");//By Date
		  Thread.sleep(2000);
		  editBloodProduct.selectOptionForCompareBloodType(Yes);
		  Thread.sleep(2000);
		  editBloodProduct.selectOptionForISBT_128_BloodProduct(Yes);
		  Thread.sleep(2000);
		  editBloodProduct.linkBloodProductAttributes().click();
		  Thread.sleep(2000);
		 boolean b3 = editBloodProduct.checkboxAntiCMVNegative().isEnabled();
		 if(!b3)
		 {
			 editBloodProduct.checkboxAntiCMVNegative().click();
			 Thread.sleep(2000);
		 }
		 else
		 {
			 Thread.sleep(1000);
		 }
		 boolean b2 = editBloodProduct.checkboxIrradiated().isEnabled();
		 if(!b2)
		 {
			 editBloodProduct.checkboxIrradiated().click();
			 Thread.sleep(2000);
		 }
		 else
		 {
			 Thread.sleep(1000);
		 }
		 editBloodProduct.linkBack().click();
		 Thread.sleep(2000);
		 editBloodProduct.buttonConfirm().click();
		 Thread.sleep(2000);
		 bloodProduct.linkBack().click();
		 Thread.sleep(2000);
		 transfusionSettings.selectOptionForDisplayBloodTypeMismatchQuestion("BOTH");
		 transfusionSettings.selectOptionForPropmtForPatientBloodType(Yes);
		 Thread.sleep(2000);
		 transfusionSettings.displayPreviouslyStartedUnitsInHoldAndEndWithinTheLast().clear();
		 Thread.sleep(2000);
		 transfusionSettings.displayPreviouslyStartedUnitsInHoldAndEndWithinTheLast().sendKeys("2");
	     Thread.sleep(2000);
		 transfusionSettings.buttonConfirm().click();
	     Thread.sleep(2000);
	     sysManagerMainPage.button_Roles().click();
	     Thread.sleep(2000);
	     roles.editTransfusionist().click();
	     Thread.sleep(2000);
	     boolean b4 = editRole.checkBoxStartTransfusionWithCosignature().isSelected();
	     if(!b4)
	     {
	    	 editRole.checkBoxStartTransfusionWithCosignature().click();
	    	 Thread.sleep(2000);
	     }
	     else
	  	 {
	  		 Thread.sleep(1000);
	  	 }
	     boolean b7 =editRole.checkBoxMayEndTransfusion().isSelected();
	     if(!b7)
	     {
	    	 editRole.checkBoxMayEndTransfusion().click();
	    	 Thread.sleep(2000);
	     }
	     else
	  	 {
	  		 Thread.sleep(1000);
	  	 }
	  	  
	     editRole.buttonConfirm().click();
	     Thread.sleep(2000);
	     iedriver.close();
    }
    */
  @Test
  public void mainTest() throws Throwable 
  {
	  //Step 1
	  iedriver.callDriver(capribedside);
  	  Thread.sleep(1000);
      iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      common.login(capribedside,user1, password);
  	  Thread.sleep(2000);
	  common.scanpatientid(patientA);
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  patientMenu.changeBloodTypeButton().click();
	  Thread.sleep(1000);
	  Actions act = new Actions(iedriver.driver);
	  String currentBloodTypeNow = changeBT.currentBloodType().getText();
	  if(currentBloodTypeNow.equals(bloodOneg))
	  {
		  Thread.sleep(2000);
		  changeBT.btnExit().click();  
	  }
	  else
	  {
		  bloodTransCommnon.changeBTNewBloodType(bloodOneg);
	 	  Thread.sleep(1000);
	 	  bloodTransCommnon.changeBTConfirmNewBloodType(bloodOneg);
	 	  Thread.sleep(1000);
	 	  bloodTransCommnon.changeBTReasonForBloodTypeChange(2);
	 	  Thread.sleep(1000);
	 	 
	 	  changeBT.textBoxUserID().sendKeys(user2);
	 	  act.sendKeys(Keys.ENTER).perform();
	 	  Thread.sleep(3000);
	 	  changeBT.textBoxPassword().sendKeys(password);
	 	  Thread.sleep(1000);
	 	  changeBT.btnConfirm().click();
	 	  Thread.sleep(2000);
	 	  multiScreens.multiScreenShot(iedriver.driver);
		  
	  }
	  //Step 2
	  patientMenu.startTransfusionButton().click();
	  Thread.sleep(2000);
	  //Step 3
	  startTransfusion.mrnID().sendKeys(mrn);
	  Thread.sleep(2000);
	  startTransfusion.mrnContinue().click();
	  Thread.sleep(2000);
	  //Step 4
	  startTransfusion.preCheck_CheckTheOriginalTransfusionOrder().click();
	  Thread.sleep(2000);
	  startTransfusion.preCheckContinueButton().click();
	  Thread.sleep(3000);
	  //Step 5
	  transCommon.scanRacipientPatientID("*"+patientA);
	  Thread.sleep(2000);
	  //Step 6
	  startTransfusion.textboxRacipientMRN().sendKeys(mrn,Keys.ENTER);
	  //startTransfusion.scanRacipientMRN(scanMrn);
	  Thread.sleep(2000);
	  //Step 7
	  startTransfusion.scanRacipientPatientName().sendKeys(patientName,Keys.ENTER);
	  Thread.sleep(2000);
	  //Step 8
	  System.out.println(isbtUnitNumber);
	  startTransfusion.scanRacipientUnitNumber().sendKeys(isbtUnitNumber,Keys.ENTER);
	  //startTransfusion.scanRacipientISBTUnitNumber("="+isbtUnitNumber+"P");
	  Thread.sleep(2000);
	  //act.sendKeys(Keys.ENTER).perform();
	  //Step 9
	  transCommon.selectPatientBloodTypeVisibleText(bloodOneg);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 10
	  startTransfusion.racipientCommentTextBox().sendKeys("Test Transfusion");
	  Thread.sleep(2000);
	  startTransfusion.racipientContinueButton().click();
   	  Thread.sleep(2000);
   	  //transCommon.donorCenterCodeDropDown(2);
	  //act.sendKeys(Keys.ENTER).perform();
	 // Thread.sleep(2000);
	  //Step 13
   	 System.out.println(isbtUnitNumber);
   	 String donorUnitNumber = "="+isbtUnitNumber;
   	
   	starttranspagefunctions.scanDonorUnitNumber(donorUnitNumber);
	 // StartTransfusionPage.donorScanUnitNumber().sendKeys(isbtUnitNumber);
	  //act.sendKeys(Keys.ENTER).perform();
	  multiScreens.multiScreenShot(iedriver.driver);
	 //iedriver.extent_Test().log(LogStatus.PASS, "Step 03 Passed");
	  Thread.sleep(2000);
	  //Step 14
	  //startTransfusion.donorUnitDivision().sendKeys("10");
	  //act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  
  }
  /*
  @AfterTest
  public void postSettingText() throws Throwable
  {
	  iedriver.callDriver(sysmanUrl);
	  Thread.sleep(1000);
	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  login.login(user2, password);
	  Thread.sleep(2000);
	  sysManagerMainPage.button_PointsOfCare().click();
	  Thread.sleep(2000);
	  selectPoc.editPocPeds().click();
	  Thread.sleep(2000);
	  editPoc.linkModifyChecksTransfusionSettings().click();
	      Thread.sleep(2000);
	      boolean b1 = editPoc.checkboxCheckTheOriginalTransfusionOrder().isSelected();
		  if(b1)
		 {
			 editPoc.checkboxCheckTheOriginalTransfusionOrder().click();
			 Thread.sleep(2000);
		 }
		 else
		 {
			 Thread.sleep(1000);
		 }
		 
	      editPoc.linkBackModifyChecksTransfusionSettings().click();
	      Thread.sleep(2000);
      editPoc.selectOptionRequireScanningInEndTransfusion(No);
      Thread.sleep(2000);
      editPoc.selectOptionForRequireCosignOnBloodTypeMismatch(No);
	  Thread.sleep(2000);
	  editPoc.selectUtilizeSecondaryIdentifier("None");
	  Thread.sleep(2000);
	  /*
	  editPoc.secondaryIdName().clear();
	  editPoc.secondaryIdName().sendKeys("MRN");
	  Thread.sleep(2000);
	  editPoc.secondaryIdFormat().clear();
	  Thread.sleep(1000);
	  editPoc.secondaryIdFormat().sendKeys("CCC");
	  Thread.sleep(2000);
	  
	  editPoc.selectOptionForTurnOffSecondaryIdCheckForTxWristband(No);
	  Thread.sleep(2000);
	  editPoc.selectOptionForDisplayCommentsInStartTransfusion(Yes);
	  Thread.sleep(2000);
	  */
 /* 
	  editPoc.buttonConfirm().click();
	  Thread.sleep(2000);
  }
*/
}
