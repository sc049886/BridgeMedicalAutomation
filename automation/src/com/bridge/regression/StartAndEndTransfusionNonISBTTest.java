package com.bridge.regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.BloodTransfusionCommonFunctionality;
import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.pageObject.Functions.CapribedsideEndTransfusionPageFunctions;
import com.pageObject.Functions.CapribedsideStartTransfusionPageFunctions;
import com.pageObject.Functions.SystemManagerEditBloodProductPageFunctions;
import com.pageObject.Functions.SystemManagerEditPocPageFunctions;
import com.pageObject.Functions.SystemManagerTransfusionSettingsPageFunctions;
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

public class StartAndEndTransfusionNonISBTTest
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
	SystemManagerTransfusionSettingsPageFunctions transfusionsettingsfunctions = new SystemManagerTransfusionSettingsPageFunctions();
	BloodTransfusionCommonFunctionality transfusionCommonFunctionalities = new  BloodTransfusionCommonFunctionality();
	SystemManagerPointsOfCarePage selectPoc = new SystemManagerPointsOfCarePage();
	SystemManagerEditPocPage editPoc = new SystemManagerEditPocPage();
	SystemManagerEditPocPageFunctions editpocpagefunctions = new SystemManagerEditPocPageFunctions();
	SystemManagerBloodProductPage bloodProduct = new SystemManagerBloodProductPage();
	SystemManagerEditBloodProductPage systemManagerEditBloodProductPage = new SystemManagerEditBloodProductPage();
	CapribedsideRapidStartTransfusionPage rapidTransfusion = new CapribedsideRapidStartTransfusionPage();
	CapribedsideStartTransfusionPage startTransfusion = new CapribedsideStartTransfusionPage();
	CapribedsideStartTransfusionPageFunctions starttranspagefunctions = new CapribedsideStartTransfusionPageFunctions();
	CapribedsideEndTransfusionPage endTransfusion = new CapribedsideEndTransfusionPage();
	CapribedsideEndTransfusionPageFunctions endtranpagefunctions = new CapribedsideEndTransfusionPageFunctions();
	SystemManagerBloodProductSubstitutionChartPage bloodProductSubstitutionChart = new SystemManagerBloodProductSubstitutionChartPage();
	SystemManagerEditBloodProductSubstitutionChartPage editBloodProductSubstitutionChart = new SystemManagerEditBloodProductSubstitutionChartPage();
	SystemManagerEditBloodProductPageFunctions editbloodprodpage = new SystemManagerEditBloodProductPageFunctions();
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
     String bloodABneg = "AB neg";
    String bloodGroupBPooledRh = "Group B, Pooled Rh";
	String Yes = "Yes";
	String No = "No";
	String unitNo= common.uniqueNumber(-1);
	//String unitNo2 = common.uniqueNumber2();
	String nextDate = common.currentDate("MM/dd/yyyy HH:mm",+2);
	String currentDate = common.currentDate("MM/dd/yyyy HH:mm",0);
    String secondaryIdentifierOption = "Transfusion Only";
    String mrn = "132";
    String scanMrn = "S"+mrn+"R";
 
  @BeforeTest
  public void preSettingTest() throws Throwable
  {
	  iedriver.callDriver(sysmanUrl);
  	  Thread.sleep(1000);
  	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  	common.login(sysmanUrl,user2, password);
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
	  editpocpagefunctions.selectYesOrNoForCheckCenterCode(Yes);
  	  Thread.sleep(2000);
  	editpocpagefunctions.selectOptionPromptForUnitNumberDivisionField(Yes);
  	  Thread.sleep(2000);
  	editpocpagefunctions.selectOptionForCheckPatientName(Yes);
  	  Thread.sleep(2000);
  	editpocpagefunctions.selectOptionForRequireCosignature(Yes);
	  Thread.sleep(2000);
	  editpocpagefunctions.selectOptionPromptForVolume(Yes);
	  Thread.sleep(2000);
	  editpocpagefunctions.selectUtilizeSecondaryIdentifier(secondaryIdentifierOption);
	  Thread.sleep(2000);
	  editPoc.secondaryIdName().clear();
	  editPoc.secondaryIdName().sendKeys("MRN");
	  Thread.sleep(2000);
	  editPoc.secondaryIdFormat().clear();
	  Thread.sleep(1000);
	  editPoc.secondaryIdFormat().sendKeys("CCC");
	  Thread.sleep(2000);
	  editpocpagefunctions.selectOptionForTurnOffSecondaryIdCheckForTxWristband(No);
	  Thread.sleep(2000);
	  editpocpagefunctions.selectOptionForDisplayCommentsInStartTransfusion(Yes);
	  Thread.sleep(2000);
	  editpocpagefunctions.selectYesOrNoFordDisplayCommentsInRapidStartTransfusion(Yes);
	  Thread.sleep(2000);
	  editpocpagefunctions.selectOptionForCollectVitalSignsOnStartTransfusion(Yes);
	  Thread.sleep(2000);
	  editpocpagefunctions.selectOptionForCollectVitalSignsOnEndTransfusion(Yes);
	  Thread.sleep(2000);
	  editpocpagefunctions.selectOptionForDisplayHeartRateSite(No);
	  Thread.sleep(2000);
	  editpocpagefunctions.selectOptionForDisplayBloodPressureMethod(No);
	  Thread.sleep(2000);
	  editpocpagefunctions.selectOptionForDisplayBothCelsiusAndFahrenheitFieldsForTemperature(Yes);
	  Thread.sleep(2000);
	  editPoc.buttonConfirm().click();
	  Thread.sleep(2000);
	  selectPoc.button_Back().click();
	  Thread.sleep(2000);
	  sysManagerMainPage.button_TransfusionSettings().click();
	  Thread.sleep(2000);
	  transfusionSettings.linkBloodProducts().click();
	  Thread.sleep(2000);
	  bloodProduct.editLinkForCRT().click();
	  Thread.sleep(2000);
	  editbloodprodpage.selectOptionForExpirationCheck("3");
	  Thread.sleep(2000);
	  editbloodprodpage.selectOptionForCompareBloodType(Yes);
	  Thread.sleep(2000);
	  editbloodprodpage.selectOptionForISBT_128_BloodProduct(No);
	  Thread.sleep(2000);
	  systemManagerEditBloodProductPage.linkBloodProductAttributes().click();
	  Thread.sleep(2000);
	
	 boolean b2 = systemManagerEditBloodProductPage.checkboxAntiCMVNegative().isSelected();
	 if(!b2)
	 {
		 systemManagerEditBloodProductPage.checkboxAntiCMVNegative().click();
		 Thread.sleep(2000);
	 }
	 else
	 {
		 Thread.sleep(1000);
	 }
	 boolean b3 = systemManagerEditBloodProductPage.checkboxIrradiated().isSelected();
	 if(!b3)
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
	 transfusionSettings.linkBloodProductSubstitutionChart().click();
	  Thread.sleep(2000);
	 bloodProductSubstitutionChart.editCryoprecipitates().click();
	  Thread.sleep(2000);
	  editBloodProductSubstitutionChart.textboxABNegGroupBPooledRh().clear();
	  Thread.sleep(1000);
	 editBloodProductSubstitutionChart.textboxABNegGroupBPooledRh().sendKeys("2");
	  Thread.sleep(2000);
	 editBloodProductSubstitutionChart.buttonConfirm().click();
	  Thread.sleep(2000);
	 bloodProductSubstitutionChart.linkBackCreateBloodProductSubstitutionChart().click();
	  Thread.sleep(2000);
	  transfusionsettingsfunctions.selectOptionForPropmtForPatientBloodType(Yes);
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
     boolean b4 = editRole.checkBoxMayStartTransfusionWithCosignature().isSelected();
     if(!b4)
     {
    	 editRole.checkBoxMayStartTransfusionWithCosignature().click();
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
     iedriver.driver.close();
  }
   
  @Test
  public void mainTest() throws Throwable
  {
	  CapribedsideStartTransfusionPageFunctions starttranspagefunction = new CapribedsideStartTransfusionPageFunctions();
	  //Step 1
	  iedriver.callDriver(capribedside);
  	  Thread.sleep(1000);
      iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      common.login(capribedside,user1, password);
  	  Thread.sleep(2000);
	  common.scanpatientid(patientA);
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
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
	  Actions act = new Actions(iedriver.driver);
	  startTransfusion.scanRacipientUnitNumber().sendKeys(unitNo);
	  act.sendKeys(Keys.ENTER).perform();
	  //Step 9
	  startTransfusion.racipientUnitDivisionNumber().sendKeys("10");
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 10
	  transCommon.selectPatientBloodTypeVisibleText(bloodABneg);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 11
	  startTransfusion.racipientCommentTextBox().sendKeys("Test Transfusion");
	  Thread.sleep(2000);
	  startTransfusion.racipientContinueButton().click();
   	  Thread.sleep(2000);
   	  //Step 12
   	  transCommon.donorCenterCodeDropDown(2);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 13
	  startTransfusion.donorScanUnitNumber().sendKeys(unitNo);
	  act.sendKeys(Keys.ENTER).perform();
	  multiScreens.multiScreenShot(iedriver.driver);
	 //iedriver.extent_Test().log(LogStatus.PASS, "Step 03 Passed");
	  Thread.sleep(2000);
	  //Step 14
	  startTransfusion.donorUnitDivision().sendKeys("10");
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 15
	  starttranspagefunction.selectDonorBloodProduct("CRT");
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 16
	  startTransfusion.checkBoxBloodProductAttributeAntiCMVNegative().click();
	  Thread.sleep(2000);
	  startTransfusion.checkBoxBloodProductAttributeIrradiated().click();
	  Thread.sleep(2000);
	  startTransfusion.buttonSaveBloodAttribute().click();
	  //Step 17
	  startTransfusion.donorBloodProductExipreDate().sendKeys(nextDate,Keys.ENTER);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 18
	  starttranspagefunctions.selectDonorBloodType(bloodGroupBPooledRh);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 19
	  startTransfusion.btnYesDonorBloodTypeMissMatchPopup().click();
	  Thread.sleep(2000);
	  //Step 20
	  transCommon.cosignBloodBankPermission(Yes);
	  Thread.sleep(2000);
	  transCommon.cosignAgreeBloodTypeSubtitution(Yes);
	  Thread.sleep(2000);
	  transCommon.cosignReasonForBloodTypeSubtitution(2);
	  Thread.sleep(2000);
	  startTransfusion.cosignUserIdTextBox().sendKeys(user2);
	  Thread.sleep(2000);
	  startTransfusion.cosignPasswordTextBox().sendKeys(password);
	  Thread.sleep(2000);
	  startTransfusion.btnCosignContinue().click();
	  Thread.sleep(2000);
	  //Step 21-24
	  transfusionCommonFunctionalities.vitalsAndConfirmActionMethod();
	  Thread.sleep(3000);
	  //Step 25
	  patientMenu.endTransfusionButton().click();
	  Thread.sleep(4000);
	  //Step 26
	  
		
	  endTransfusion.unitNumber().sendKeys(unitNo,Keys.ENTER);
	  Thread.sleep(4000);
	  endTransfusion.unitNumberDivision().sendKeys("10");
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(5000);
	  endtranpagefunctions.selectBlodProduct(5);
	  Thread.sleep(4000);
	  //Step 27
   	  endTransfusion.buttonContinueUnitProductSection().click();
	  Thread.sleep(4000);
	  //Step 28
	  //Step 31
	  endTransfusion.linkChangeEndTransfusionDateTimeVolumePage().click();
	  Thread.sleep(3000);
	  //Step 32
	  endTransfusion.textboxEndTransfusionDateTimeVolumePage().click();
	  Thread.sleep(4000);
	  //Step 33
	  endTransfusion.textboxEndTransfusionDateTimeVolumePage().clear();
	  Thread.sleep(3000);
	  String currentDate = common.currentDate("MM/dd/yyyy HH:mm",0);
	  endTransfusion.textboxEndTransfusionDateTimeVolumePage().sendKeys(currentDate,Keys.ENTER);
	  Thread.sleep(3000);
	  //Step 34
   	  endTransfusion.volumeTransferred().sendKeys("50");
	  Thread.sleep(4000);
	  //Step 35
	  endtranpagefunctions.selectTransfusionReactionAnswer(Yes);
	  Thread.sleep(4000);
	  //Step 36
	  endTransfusion.textboxEndTransfusionCommentVolumePage().sendKeys("End Transfusion with reaction");
	  Thread.sleep(4000);
	  endTransfusion.buttonContinueVolumeSection().click();
	  Thread.sleep(1000);
	  //Step 37
	  endTransfusion.checkboxAnaphylaxis().click();
	  Thread.sleep(2000);
	  endTransfusion.checkboxElevatedTemp().click();
	  Thread.sleep(2000);
	  //Step 38
	  endTransfusion.textboxCommentClinicalSignsAndSymptomsPage().sendKeys("Clinical Signs Selected");
	  Thread.sleep(2000);
	  endTransfusion.buttonContinueClinicalSignsAndSymptomsPage().click();
	  Thread.sleep(2000);
	  //Step 39
	  endTransfusion.buttonContinueReactionInstructionsPage().click();
	  Thread.sleep(2000);
	  //Step 40
	  endTransfusion.vitalsTempTextBoxFar().clear();
	  Thread.sleep(1000);	
	  endTransfusion.vitalsTempTextBoxFar().sendKeys("95");
	  Thread.sleep(2000);
		 
		 /*
		 endTrans.selectVitalsTempSite(2);
		 Thread.sleep(3000);
		 endTrans.vitalsHeartRateTextBox().sendKeys("82");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(4000);
		 endTrans.vitalsSystolicBloodPressureTextBox().sendKeys("120");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 endTrans.vitalsDiastolicBloodPressureTextBox().sendKeys("83");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(4000);
		 endTrans.vitalsRespirationTextBox().sendKeys("18");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(4000);
		 endTrans.vitalsOxygenSaturationTextBox().sendKeys("92");
		 Thread.sleep(3000);
		 */
	 
		 //act.sendKeys(Keys.ENTER).perform();
		 //Thread.sleep(5000);
		 endTransfusion.vitalsContinueButton().click();
		 Thread.sleep(2000);
		 endTransfusion.vitalsContinueButton().click();
		 Thread.sleep(2000);
		 //Step 42
		 endTransfusion.buttonCancelPrint().click();
		 Thread.sleep(2000);
	  
  }
  @AfterTest
	public void postTestSettings() throws Throwable
	{
	  iedriver.callDriver(sysmanUrl);
  	  Thread.sleep(1000);
  	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  	  common.login(sysmanUrl,user2, password);
  	  Thread.sleep(2000);
  	  sysManagerMainPage.button_PointsOfCare().click();
  	  Thread.sleep(2000);
  	  selectPoc.editPocPeds().click();
	  Thread.sleep(2000);
  	
	  
	  editpocpagefunctions.selectYesOrNoForCheckCenterCode(Yes);
  	  Thread.sleep(2000);
  	editpocpagefunctions.selectOptionPromptForUnitNumberDivisionField(No);
  	  Thread.sleep(2000);
  	editpocpagefunctions.selectOptionForCheckPatientName(Yes);
  	  Thread.sleep(2000);
  	editpocpagefunctions.selectOptionForRequireCosignature(No);
	  Thread.sleep(2000);
	  editpocpagefunctions.selectOptionPromptForVolume(No);
	  Thread.sleep(2000);
	  editpocpagefunctions.selectUtilizeSecondaryIdentifier("None");
	  Thread.sleep(2000);
	  /*
	  editPoc.secondaryIdName().clear();
	  editPoc.secondaryIdName().sendKeys("MRN");
	  Thread.sleep(2000);
	  editPoc.secondaryIdFormat().clear();
	  Thread.sleep(1000);
	  editPoc.secondaryIdFormat().sendKeys("CCC");
	  Thread.sleep(2000);
	 
	  editPoc.selectOptionForTurnOffSecondaryIdCheckForTxWristband(Yes);
	  Thread.sleep(2000);
	 
	  editPoc.selectOptionForDisplayCommentsInStartTransfusion(Yes);
	  Thread.sleep(2000);
	    
	  editPoc.selectYesOrNoFordDisplayCommentsInRapidStartTransfusion(Yes);
	  Thread.sleep(2000);
	  editPoc.selectOptionForCollectVitalSignsOnStartTransfusion(Yes);
	  Thread.sleep(2000);
	  editPoc.selectOptionForCollectVitalSignsOnEndTransfusion(Yes);
	  Thread.sleep(2000);
	 
	  editPoc.selectOptionForDisplayHeartRateSite(No);
	  Thread.sleep(2000);
	  editPoc.selectOptionForDisplayBloodPressureMethod(No);
	  Thread.sleep(2000);
	  
	  editPoc.selectOptionForDisplayBothCelsiusAndFahrenheitFieldsForTemperature(Yes);
	  Thread.sleep(2000);
	   */
	  editPoc.buttonConfirm().click();
	  Thread.sleep(2000);
	  selectPoc.button_Back().click();
	  Thread.sleep(2000);
	  sysManagerMainPage.button_TransfusionSettings().click();
	  Thread.sleep(2000);
	  /*
	  transfusionSettings.linkBloodProducts().click();
	  Thread.sleep(2000);
	  bloodProduct.editLinkForCRT().click();
	  Thread.sleep(2000);
	  editBloodProduct.selectOptionForExpirationCheck("3");
	  Thread.sleep(2000);
	  editBloodProduct.selectOptionForCompareBloodType(Yes);
	  Thread.sleep(2000);
	  editBloodProduct.selectOptionForISBT_128_BloodProduct(No);
	  Thread.sleep(2000);
	  editBloodProduct.linkBloodProductAttributes().click();
	  Thread.sleep(2000);
	
	 boolean b2 = editBloodProduct.checkboxAntiCMVNegative().isSelected();
	 if(!b2)
	 {
		 editBloodProduct.checkboxAntiCMVNegative().click();
		 Thread.sleep(2000);
	 }
	 else
	 {
		 Thread.sleep(1000);
	 }
	 boolean b3 = editBloodProduct.checkboxIrradiated().isSelected();
	 if(!b3)
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
	 transfusionSettings.linkBloodProductSubstitutionChart().click();
	  Thread.sleep(2000);
	 bloodProductSubstitutionChart.editCryoprecipitates().click();
	  Thread.sleep(2000);
	  editBloodProductSubstitutionChart.textboxABNegGroupBPooledRh().clear();
	  Thread.sleep(1000);
	 editBloodProductSubstitutionChart.textboxABNegGroupBPooledRh().sendKeys("2");
	  Thread.sleep(2000);
	 editBloodProductSubstitutionChart.buttonConfirm().click();
	  Thread.sleep(2000);
	 bloodProductSubstitutionChart.linkBackCreateBloodProductSubstitutionChart().click();
	  Thread.sleep(2000);
	  */
	  transfusionsettingsfunctions.selectOptionForPropmtForPatientBloodType(Yes);
	  Thread.sleep(2000);
	 transfusionSettings.displayPreviouslyStartedUnitsInHoldAndEndWithinTheLast().clear();
	  Thread.sleep(2000);
	 transfusionSettings.displayPreviouslyStartedUnitsInHoldAndEndWithinTheLast().sendKeys("0");
	  Thread.sleep(2000);
	 transfusionSettings.buttonConfirm().click();
     Thread.sleep(2000);
     /*
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
     */
     iedriver.driver.close();
	  
		
	}

}
