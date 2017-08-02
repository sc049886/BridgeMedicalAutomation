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
import com.pageObject.Functions.CapribedsideStartTransfusionPageFunctions;
import com.pageObject.Functions.SystemManagerEditBloodProductPageFunctions;
import com.pageObject.Functions.SystemManagerEditPocPageFunctions;
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
import com.relevantcodes.extentreports.LogStatus;

import multiScreenShot.MultiScreenShot;

public class StartTransfusionISBTConcatenatedBarcodeTest 
{
	String FilePath = "C:\\Temp\\StartTransfusionISBTConcatenatedBarcodeTest.html";
	String TestName = "StartTransfusionISBTConcatenatedBarcodeTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","StartTransfusionISBTConcatenatedBarcodeTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	CapribedsideLoginPage login = new CapribedsideLoginPage();
	SystemManagerMainPage sysManagerMainPage = new SystemManagerMainPage();
	CommonFunctions common = new CommonFunctions();
	CapribedsidePatientMainPage patientMenu = new  CapribedsidePatientMainPage();
	CapribedsideStartTransfusionPage stTransPage = new CapribedsideStartTransfusionPage();
	BloodTransfusionCommonFunctionality transfusionCommonFunctionalities = new BloodTransfusionCommonFunctionality();
	SystemManagerRolesPage roles = new SystemManagerRolesPage();
	SystemManagerEditRolePage editRole = new SystemManagerEditRolePage();
	SystemManagerTransfusionSettingsPage transSettings = new SystemManagerTransfusionSettingsPage();
	BloodTransfusionCommonFunctionality bloodTransCommnon = new  BloodTransfusionCommonFunctionality();
	SystemManagerPointsOfCarePage selectPoc = new SystemManagerPointsOfCarePage();
	SystemManagerEditPocPage editPoc = new SystemManagerEditPocPage();
	SystemManagerEditPocPageFunctions editpocpagefunctions = new SystemManagerEditPocPageFunctions();
	SystemManagerBloodProductPage bloodProduct = new SystemManagerBloodProductPage();
	SystemManagerEditBloodProductPage systemManagerEditBloodProductPage = new SystemManagerEditBloodProductPage();
	SystemManagerEditBloodProductPageFunctions editbloodprodpage = new SystemManagerEditBloodProductPageFunctions();
	CapribedsideRapidStartTransfusionPage rapidTransfusion = new CapribedsideRapidStartTransfusionPage();
	CapribedsideStartTransfusionPageFunctions starttranspagefunctions = new CapribedsideStartTransfusionPageFunctions();
	CapribedsideStartTransfusionPage startTransfusion = new CapribedsideStartTransfusionPage();
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedside = "http://10.162.106.174/TransSpec2016010410/CapriBedside/Login.aspx";
	String superuser = "Superuser";
	String password = "123";
	String patientA = "635201";
	String patientB = "1010123";
	String bloodOpos = "O pos";
	String bloodProductISBT = "=<E0053";
	String bloodProductISBT1 = "=<E0053VA0";
	String Yes = "Yes";
	String No = "No";
	String unitNo= common.uniqueNumber(-1);
	String unitNo2 = common.uniqueNumber(0);
    String nextDate = common.currentDate("MM/dd/yyyy" ,+2);
    
    @BeforeTest
    public void systemManagerPreSettingTest() throws Throwable
    {
      iedriver.callDriver(sysmanUrl);
  	  Thread.sleep(1000);
  	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  	common.login(sysmanUrl,superuser, password);
  	  Thread.sleep(2000);
  	  sysManagerMainPage.button_PointsOfCare().click();
  	  Thread.sleep(2000);
  	  selectPoc.editPocPeds().click();
  	  Thread.sleep(2000);
  	  editPoc.linkModifyChecksTransfusionSettings().click();
  	  Thread.sleep(2000);
  	  boolean b5 = editPoc.checkboxCheckTheOriginalTransfusionOrder().isSelected();
  		 if(!b5)
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
  	editpocpagefunctions.selectYesOrNoForCheckCenterCode(No);
  	  Thread.sleep(2000);
  	editpocpagefunctions.selectOptionForCheckPatientName(Yes);
  	  Thread.sleep(2000);
  	editpocpagefunctions.selectOptionForDisplayCommentsInStartTransfusion(Yes);
  	  Thread.sleep(2000);
  	editpocpagefunctions.selectOptionForCollectVitalSignsOnStartTransfusion(Yes);
  	  Thread.sleep(2000);
  	  editPoc.buttonConfirm().click();
  	  Thread.sleep(2000);
  	  selectPoc.button_Back().click();
  	  Thread.sleep(2000);
  	  sysManagerMainPage.button_TransfusionSettings().click();
  	  Thread.sleep(2000);
  	  transSettings.linkBloodProducts().click();
  	  Thread.sleep(2000);
  	  bloodProduct.editLinkForISBTWB().click();
  	 // bloodProduct.editLinkForWB().click();
  	  Thread.sleep(2000);
  	  editbloodprodpage.selectOptionForExpirationCheck("2");
  	  Thread.sleep(2000);
  	  editbloodprodpage.selectOptionForCompareBloodType(Yes);
  	  Thread.sleep(2000);
  	  editbloodprodpage.selectOptionForISBT_128_BloodProduct(Yes);
  	  Thread.sleep(2000);
  	  systemManagerEditBloodProductPage.linkBloodProductAttributes().click();
  	  Thread.sleep(2000);
  	 boolean b3 = systemManagerEditBloodProductPage.checkboxAntiCMVNegative().isSelected();
  	 if(!b3)
  	 {
  		 systemManagerEditBloodProductPage.checkboxAntiCMVNegative().click();
  		 Thread.sleep(2000);
  	 }
  	 else
  	 {
  		 Thread.sleep(1000);
  	 }
  	 boolean b2 = systemManagerEditBloodProductPage.checkboxIrradiated().isSelected();
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
     transSettings.buttonConfirm().click();
     Thread.sleep(2000);
     sysManagerMainPage.button_Roles().click();
     Thread.sleep(2000);
     roles.editSystemAdminister().click();
     Thread.sleep(2000);
     
     boolean b9 =editRole.checkBoxMayStartTransfusionWithoutCosignature().isSelected();
     if(b9)
     {
    	 editRole.checkBoxMayStartTransfusionWithoutCosignature().click();
    	 Thread.sleep(2000);
     }
     else
  	 {
  		 Thread.sleep(1000);
  	 }
     
     boolean b6 = editRole.checkBoxMaySuperviseTransfusion().isSelected();
     if(b6)
     {
    	 editRole.checkBoxMaySuperviseTransfusion().click();
    	 Thread.sleep(2000);
     }
     else
  	 {
  		 Thread.sleep(1000);
  	 }
    
     boolean b7 =editRole.checkBoxMayStartTransfusionWithCosignature().isSelected();
     if(!b7)
     {
    	 editRole.checkBoxMayStartTransfusionWithCosignature().click();
    	 Thread.sleep(2000);
     }
     else
  	 {
  		 Thread.sleep(1000);
  	 }
     /*
  	  boolean b8 =editRole.checkBoxMayCosignTransfusion().isSelected();
     if(b8)
     {
    	 editRole.checkBoxMayCosignTransfusion().click();
    	 Thread.sleep(2000);
     }
     else
  	 {
  		 Thread.sleep(1000);
  	 }
  	 */
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
	  patientMenu.startTransfusionButton().click();
	  Thread.sleep(2000);
	  //Step 3
	  startTransfusion.preCheck_CheckTheOriginalTransfusionOrder().click();
	  Thread.sleep(2000);
	  startTransfusion.preCheckContinueButton().click();
	  Thread.sleep(2000);
	  //Step 4
	  transfusionCommonFunctionalities.scanRacipientPatientID("*635201!TIMMONS, BABY BOY!"+unitNo2+"!O Pos*");
	  Thread.sleep(2000);
	  //Step 5
	  startTransfusion.racipientCommentTextBox().sendKeys("Test Comment");
	  Thread.sleep(2000);
	  startTransfusion.racipientContinueButton().click();
	  Thread.sleep(2000);
	  //Step 6
	  Actions act = new Actions(iedriver.driver);
	  starttranspagefunctions.scanDonorUnitNumber("="+unitNo2);
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 7
	  starttranspagefunctions.scanDonorBloodProductLookupfield(bloodProductISBT);
	 // act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 8
	  startTransfusion.checkBoxBloodProductAttributeAntiCMVNegative().click();
	  Thread.sleep(2000);
	  startTransfusion.checkBoxBloodProductAttributeIrradiated().click();
	  Thread.sleep(2000);
	  startTransfusion.buttonSaveBloodAttribute().click();
	  Thread.sleep(2000);
	  starttranspagefunctions.selectDonorBloodProductDonationType(2);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  startTransfusion.donorBloodProductDevision().sendKeys("A");
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 9
	  startTransfusion.donorBloodProductExipreDate().sendKeys(nextDate,Keys.ENTER);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 10
	  starttranspagefunctions.selectDonorBloodType(bloodOpos);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 11
	  startTransfusion.cosignUserIdTextBox().sendKeys("Nancy");
	  Thread.sleep(2000);
	  startTransfusion.cosignPasswordTextBox().sendKeys(password);
	  Thread.sleep(2000);
	  startTransfusion.buttonNormalCosignContinue().click();
	  Thread.sleep(2000);
	  //Step 12-15
	  transfusionCommonFunctionalities.vitalsAndConfirmActionMethod();
	  
	  //Case 2
	  patientMenu.startTransfusionButton().click();
	  Thread.sleep(2000);
	  //Step 3
	  startTransfusion.preCheck_CheckTheOriginalTransfusionOrder().click();
	  Thread.sleep(2000);
	  startTransfusion.preCheckContinueButton().click();
	  Thread.sleep(3000);
	  //Step 4
	  transfusionCommonFunctionalities.scanRacipientPatientID("*635201!TIMMONS, BABY BOY!"+unitNo+"%A0!O Pos*");
	  Thread.sleep(2000);
	  //Step 5
	  startTransfusion.racipientCommentTextBox().sendKeys("Test Comment");
	  Thread.sleep(2000);
	  startTransfusion.racipientContinueButton().click();
	  Thread.sleep(2000);
	  //Step 6
	  //Actions act = new Actions(iedriver.driver);
	  starttranspagefunctions.scanDonorUnitNumber("="+unitNo);
	  Thread.sleep(2000);
	  starttranspagefunctions.scanDonorUnitDivision("A0");
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 7
	  starttranspagefunctions.scanDonorBloodProductLookupfield(bloodProductISBT);
	 // act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 8
	  startTransfusion.checkBoxBloodProductAttributeAntiCMVNegative().click();
	  Thread.sleep(2000);
	  startTransfusion.checkBoxBloodProductAttributeIrradiated().click();
	  Thread.sleep(2000);
	  startTransfusion.buttonSaveBloodAttribute().click();
	  Thread.sleep(2000);
	  starttranspagefunctions.selectDonorBloodProductDonationType(2);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  startTransfusion.donorBloodProductDevision().sendKeys("A");
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 9
	  startTransfusion.donorBloodProductExipreDate().sendKeys(nextDate,Keys.ENTER);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 10
	  starttranspagefunctions.selectDonorBloodType(bloodOpos);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 11
	  startTransfusion.cosignUserIdTextBox().sendKeys("Nancy");
	  Thread.sleep(2000);
	  startTransfusion.cosignPasswordTextBox().sendKeys(password);
	  Thread.sleep(2000);
	  startTransfusion.buttonNormalCosignContinue().click();
	  Thread.sleep(2000);
	  //Step 12-15
	  transfusionCommonFunctionalities.vitalsAndConfirmActionMethod();
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 15 Passed");
	  System.out.println("Step 18 executed Successfully");
	  iedriver.extent_Reports().endTest(iedriver.extent_Test());
 	  iedriver.extent_Reports().flush();
	  iedriver.extent_Reports().close();
	  
  }
  @AfterTest
  public void postSettingTest() throws Throwable
  {
	  iedriver.callDriver(sysmanUrl);
  	  Thread.sleep(1000);
  	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  	  common.login(sysmanUrl,superuser, password);
  	  Thread.sleep(2000);
  	Thread.sleep(2000);
    sysManagerMainPage.button_Roles().click();
    Thread.sleep(2000);
    roles.editSystemAdminister().click();
    Thread.sleep(2000);
  
    boolean b7 =editRole.checkBoxMayStartTransfusionWithCosignature().isSelected();
    if(b7)
    {
   	 editRole.checkBoxMayStartTransfusionWithCosignature().click();
   	 Thread.sleep(2000);
    }
    else
 	 {
 		 Thread.sleep(1000);
 	 }
    boolean b6 = editRole.checkBoxMaySuperviseTransfusion().isSelected();
    if(!b6)
    {
   	 editRole.checkBoxMaySuperviseTransfusion().click();
   	 Thread.sleep(2000);
    }
    else
 	 {
 		 Thread.sleep(1000);
 	 }
 	  boolean b8 =editRole.checkBoxMayCosignTransfusion().isSelected();
    if(!b8)
    {
   	 editRole.checkBoxMayCosignTransfusion().click();
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
}
 