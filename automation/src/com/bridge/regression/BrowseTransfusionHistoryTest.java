package com.bridge.regression;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bridge.utilities.BloodTransfusionCommonFunctionality;
import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.pageObject.Functions.CapribedsideAdministerDerivativesPageFunctions;
import com.pageObject.Functions.CapribedsideBrowseTransfusionHistoryPageFunctions;
import com.pageObject.Functions.CapribedsideEndTransfusionPageFunctions;
import com.pageObject.Functions.CapribedsideHoldTransfusionPageFunctions;
import com.pageObject.Functions.SystemManagerEditPocPageFunctions;
import com.pageObjects.CapribedsideAdministerDerivativesPage;
import com.pageObjects.CapribedsideBrowseTransfusionHistoryPage;
import com.pageObjects.CapribedsideEndTransfusionPage;
import com.pageObjects.CapribedsideHoldTransfusionPage;
import com.pageObjects.CapribedsideLoginPage;
import com.pageObjects.CapribedsidePatientMainPage;
import com.pageObjects.CapribedsideStartTransfusionPage;
import com.pageObjects.SystemManagerEditPocPage;
import com.pageObjects.SystemManagerEditRolePage;
import com.pageObjects.SystemManagerMainPage;
import com.pageObjects.SystemManagerPointsOfCarePage;
import com.pageObjects.SystemManagerRolesPage;

import multiScreenShot.MultiScreenShot;

public class BrowseTransfusionHistoryTest 
{
	String FilePath = "C:\\Temp\\BrowseTransfusionHistoryTest.html";
	String TestName = "BrowseTransfusionHistoryTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","BrowseTransfusionHistoryTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	CapribedsideLoginPage login = new CapribedsideLoginPage();
	SystemManagerMainPage sysManagerMainPage = new SystemManagerMainPage();
	CommonFunctions common = new CommonFunctions();
	CapribedsidePatientMainPage patientMenu = new  CapribedsidePatientMainPage();
	CapribedsidePatientMainPage mainPage = new CapribedsidePatientMainPage();
	CapribedsideStartTransfusionPage stTransPage = new CapribedsideStartTransfusionPage();
	BloodTransfusionCommonFunctionality transfusionCommonFunctionalities = new BloodTransfusionCommonFunctionality();
	SystemManagerRolesPage roles = new SystemManagerRolesPage();
	SystemManagerEditRolePage editRole = new SystemManagerEditRolePage();
	CapribedsideHoldTransfusionPage holdTransPage = new CapribedsideHoldTransfusionPage();
	CapribedsideEndTransfusionPage endTrans = new CapribedsideEndTransfusionPage();
	CapribedsideEndTransfusionPageFunctions endtranpagefunctions = new CapribedsideEndTransfusionPageFunctions();
	CapribedsideHoldTransfusionPageFunctions holdtransfunctions = new  CapribedsideHoldTransfusionPageFunctions();
	CapribedsideBrowseTransfusionHistoryPage browseTransHistory = new CapribedsideBrowseTransfusionHistoryPage();
	CapribedsideBrowseTransfusionHistoryPageFunctions browsetranshistoryfunctions = new CapribedsideBrowseTransfusionHistoryPageFunctions();
	CapribedsideAdministerDerivativesPage administerDerivative = new CapribedsideAdministerDerivativesPage();
	SystemManagerEditPocPage editPoc = new SystemManagerEditPocPage();
	SystemManagerEditPocPageFunctions editpocpagefunctions = new SystemManagerEditPocPageFunctions();
	SystemManagerPointsOfCarePage selectPoc = new SystemManagerPointsOfCarePage();
	CapribedsideAdministerDerivativesPageFunctions capribedsideadminsterdirpagefunctions = new CapribedsideAdministerDerivativesPageFunctions();
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedside = "http://10.162.106.174/TransSpec2016010410/CapriBedside/Login.aspx";
	String superuser = "Superuser";
	String user2 = "cerner";
	String password = "123";
	String user1 = "rohan";
	String patientA = "635201";
	String racipientPatientID ="*635201";
	String patientName ="TIMMONS, BABY BOY";
	String unitNo= common.uniqueNumber(-1);
	String unitNo2 = common.uniqueNumber(0);
	String unitNo3 = common.uniqueNumber(1);
    String nextDate = common.currentDate("MM/dd/yyyy HH:mm",+2);
    String Yes = "Yes";
	String No = "No";
    String secondaryIdentifierOptionNone = "None";
	
	
	@BeforeTest
	public void systemManagerPreSettingTest() throws Throwable
	{
		
		  iedriver.callDriver(sysmanUrl);
	  	  Thread.sleep(1000);
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
  	      boolean b4 = editPoc.checkboxCheckTheOriginalTransfusionOrder().isSelected();
  		  if(b4)
  		 {
  			 editPoc.checkboxCheckTheOriginalTransfusionOrder().click();
  			 Thread.sleep(2000);
  		 }
  	      editPoc.linkBackModifyChecksTransfusionSettings().click();
  	      Thread.sleep(2000);
		  
  	    editpocpagefunctions.selectYesOrNoForCheckCenterCode(Yes);
	  	  Thread.sleep(2000);
	  	editpocpagefunctions.selectOptionForCheckPatientName(Yes);
	      Thread.sleep(2000);
	     
	      editpocpagefunctions.selectUtilizeSecondaryIdentifier(secondaryIdentifierOptionNone);
	  	  Thread.sleep(2000);
	  	  //editPoc.secondaryIdName().clear();
	  	  //editPoc.secondaryIdName().sendKeys("MRN");
	  	  //Thread.sleep(2000);
	  	  //editPoc.secondaryIdFormat().clear();
	  	 // Thread.sleep(1000);
	  	  //editPoc.secondaryIdFormat().sendKeys("CCC");
	  	  //Thread.sleep(2000);
	  	editpocpagefunctions.selectOptionForTurnOffSecondaryIdCheckForTxWristband(Yes);
	  	  Thread.sleep(2000);
	  	editpocpagefunctions.selectOptionForDisplayCommentsInStartTransfusion(Yes);
	  	  Thread.sleep(2000);
	  	editpocpagefunctions.selectOptionPromptForVolume(Yes);
	  	  Thread.sleep(1000);
	  	  editPoc.buttonConfirm().click();
	  	  Thread.sleep(2000);
	  	  selectPoc.button_Back().click();
	  	  Thread.sleep(2000);
		  sysManagerMainPage.button_Roles().click();
		  Thread.sleep(2000);
		  roles.editStudentTransfusionist().click();
		  Thread.sleep(2000);
		  boolean b0 = editRole.checkBoxMayAccessChangeBloodTypeWithCosignature().isSelected();
		  if(b0)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxMayAccessChangeBloodTypeWithCosignature().click(); 
		  }
		  Thread.sleep(2000);
		  boolean b1 = editRole.checkBoxMayStartTransfusionWithoutCosignature().isSelected();
		  if(b1)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxMayStartTransfusionWithoutCosignature().click(); 
		  }
		  Thread.sleep(2000);
		  boolean b2 = editRole.checkBoxAccessBrowseTransfusionHistory().isSelected();
		  if(b2)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxAccessBrowseTransfusionHistory().click(); 
		  }
		  else
		  {
			  Thread.sleep(1000);
		  }
		 
		  boolean b3 = editRole.checkBoxMayCorrectTransfusion().isSelected();
		  if(b3)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxMayCorrectTransfusion().click();
		  }
		  Thread.sleep(1000);
		  editRole.buttonConfirm().click();
		  Thread.sleep(2000);
		  roles.editSystemAdminister().click();
		  Thread.sleep(2000);
		  boolean b5 = editRole.checkBoxHoldTransfusion().isSelected();
		  if(!b5)
		  {
			  editRole.checkBoxHoldTransfusion().click();
			  Thread.sleep(1000);
		  }
		  boolean b6 = editRole.checkBoxMayEndTransfusion().isSelected();
		  if(!b6)
		  {
			  editRole.checkBoxMayEndTransfusion().click();
			  Thread.sleep(1000);
		  }
		  editRole.buttonConfirm().click();
		  Thread.sleep(1000);
		  iedriver.close();
		  
		  
		  
		
	}

  @Test
  public void BrowseTransfusionHistoryTest() throws InterruptedException, IOException
  {
	  
	  //Step 1
	
	 
	  iedriver.callDriver(capribedside);
	  Thread.sleep(1000);
	 
	  //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  login.txt_box_username().sendKeys(user1);
	  Thread.sleep(1000);
	  login.txt_box_password().sendKeys(password);
	  Thread.sleep(1000);
	  login.button_login().click();
	  Thread.sleep(1000);
	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  common.scanpatientid(patientA);
	  Thread.sleep(2000);
	  Assert.assertEquals(patientMenu.buttonDitheredRrowseTransfusinHistory().isEnabled(),true);
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  patientMenu.button_logout().click();
	  Thread.sleep(1000);
	  //Step 2
	  login.txt_box_username().sendKeys(superuser);
	  Thread.sleep(1000);
	  login.txt_box_password().sendKeys(password);
	  Thread.sleep(1000);
	  login.button_login().click();
	  Thread.sleep(1000);
	  common.scanpatientid(patientA);
	  Thread.sleep(2000);
	  Assert.assertEquals(patientMenu.browseTransfusinHistoryButton().isDisplayed(),true);
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 3
	  
	  //Transfusion 1
	
	
	     transfusionCommonFunctionalities.startTransfusion(unitNo,racipientPatientID,patientName);
	     Thread.sleep(1000);
		 //Transfusion 2
	     transfusionCommonFunctionalities.startTransfusion(unitNo2,racipientPatientID,patientName);
	     Thread.sleep(1000);
	     
		 //Transfusion 3
	     transfusionCommonFunctionalities.startTransfusion(unitNo3,racipientPatientID,patientName);
	     Thread.sleep(1000);
	    
		 
		 //Hold T1
		 mainPage.holdTransfusionButton().click();
		 Thread.sleep(1000);
		 holdTransPage.editboxUnitNumber().sendKeys(unitNo,Keys.ENTER);
		 Thread.sleep(1000);
		 holdtransfunctions.selectBlodProduct(4);
		 Thread.sleep(1000);
		 holdTransPage.buttonContinue().click();
		 Thread.sleep(1000);
		 String currentDate = common.currentDate("MM/dd/yyyy HH:mm",0);
		 holdTransPage.startHoldDateAndTime().sendKeys(currentDate,Keys.ENTER);
		 Thread.sleep(1000);
		 holdtransfunctions.selectReasonForHold(1);
		 Thread.sleep(1000);
		 holdTransPage.endHoldDateAndTime().sendKeys(nextDate);
		 Thread.sleep(1000);
		 holdTransPage.buttonContinueHold().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 holdTransPage.buttonCancel().click();
		 Thread.sleep(2000);
		 
		 //End Transfusion t2
		 mainPage.endTransfusionButton().click();
		 Thread.sleep(2000);
		 endTrans.unitNumber().sendKeys(unitNo2,Keys.ENTER);
		 Thread.sleep(2000);
		 endtranpagefunctions.selectBlodProduct(4);
		 Thread.sleep(1000);
		 endTrans.buttonContinueUnitProductSection().click();
		 Thread.sleep(1000);
		 endTrans.volumeTransferred().sendKeys("50");
		 Thread.sleep(1000);
		 endtranpagefunctions.selectTransfusionReactionAnswer("No");
		 Thread.sleep(1000);
		 endTrans.buttonContinueVolumeSection().click();
		 Thread.sleep(1000);
		 endTrans.vitalsTempTextBoxFar().clear();
		 Thread.sleep(1000);	
		 endTrans.vitalsTempTextBoxFar().sendKeys("95");
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
		 endTrans.vitalsContinueButton().click();
		 Thread.sleep(2000);
		 endTrans.vitalsContinueButton().click();
		 Thread.sleep(2000);
		 endTrans.buttonCancelPrint().click();
		 Thread.sleep(2000);
		 
		 //End Transfusion T4
		  //Actions act = new Actions(iedriver.driver);
		 String unitNo4 = common.uniqueNumber(-1);
		 //Thread.sleep(2000);
		 mainPage.endTransfusionButton().click();
		 Thread.sleep(2000);
		 endTrans.unitNumber().sendKeys(unitNo4,Keys.ENTER);
		 Thread.sleep(2000);
		 endTrans.buttonYesUnitNumberDoesNotMatchRecordedTrans().click();
		 Thread.sleep(2000);
		 endtranpagefunctions.selectBlodProduct(4);
		 Thread.sleep(1000);
		 endTrans.buttonContinueUnitProductSection().click();
		 Thread.sleep(1000);
		 endTrans.buttonYesBloodProdDoesNotMatchRecordedTrans().click();
		 Thread.sleep(1000);
		 endTrans.volumeTransferred().sendKeys("50");
		 Thread.sleep(1000);
		 endtranpagefunctions.selectTransfusionReactionAnswer("No");
		 Thread.sleep(1000);
		 endTrans.buttonContinueVolumeSection().click();
		 Thread.sleep(1000);
		 /*
		 endTrans.vitalsTempTextBoxFar().clear();
		 Thread.sleep(1000);
		 endTrans.vitalsTempTextBoxFar().sendKeys("95");
		 Thread.sleep(4000);
		 */
		 /*
		 endTrans.selectVitalsTempSite(2);
		 Thread.sleep(3000);
		 endTrans.vitalsHeartRateTextBox().clear();
		 Thread.sleep(1000);
		 endTrans.vitalsHeartRateTextBox().sendKeys("82");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(4000);
		 endTrans.vitalsSystolicBloodPressureTextBox().clear();
		 Thread.sleep(1000);
		 endTrans.vitalsSystolicBloodPressureTextBox().sendKeys("120");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 endTrans.vitalsDiastolicBloodPressureTextBox().clear();
		 Thread.sleep(1000);
		 endTrans.vitalsDiastolicBloodPressureTextBox().sendKeys("83");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(4000);
		 endTrans.vitalsRespirationTextBox().clear();
		 Thread.sleep(1000);
		 endTrans.vitalsRespirationTextBox().sendKeys("18");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(4000);
		 */
		 endTrans.vitalsOxygenSaturationTextBox().clear();
		 Thread.sleep(1000);
		 endTrans.vitalsOxygenSaturationTextBox().sendKeys("92");
		 Thread.sleep(3000);
		 //act.sendKeys(Keys.ENTER).perform();
		 //Thread.sleep(5000);
		 endTrans.vitalsContinueButton().click();
		 Thread.sleep(3000);
		 endTrans.vitalsContinueButton().click();
		 Thread.sleep(2000);
		 endTrans.buttonCancelPrint().click();
		 Thread.sleep(2000);
		 
		 //Administer Derivatives...
		 mainPage.administerDerivativeButton().click();
		 Thread.sleep(1000);
		 capribedsideadminsterdirpagefunctions.selectBloodPlasmaDerivative("Test01");
		 Thread.sleep(2000);
		 administerDerivative.buttonContinue().click();
		 Thread.sleep(2000);
		 mainPage.browseTransfusinHistoryButton().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 4
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo+"')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 5
		 browseTransHistory.buttonReaction().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 6
		 browseTransHistory.buttonVitals().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 7
		 browseTransHistory.buttonChecks().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 8
		 browseTransHistory.buttonHold().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 9
		 browseTransHistory.buttonBackInfoPage().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo3+"')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 
		 //Step 10
		 browseTransHistory.buttonReaction().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 11
		 browseTransHistory.buttonVitals().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 12
		 browseTransHistory.buttonChecks().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 13
		 browseTransHistory.buttonHold().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 14
		 browseTransHistory.buttonBackInfoPage().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo2+"')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 15
		 browseTransHistory.buttonReaction().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 16
		 browseTransHistory.buttonVitals().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 17
		 browseTransHistory.buttonChecks().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 18
		 browseTransHistory.buttonHold().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 19
		 browseTransHistory.buttonBackInfoPage().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[1][td[contains(text(),'Test01')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 20
		 browseTransHistory.buttonBackInfoPage().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 21
		 browseTransHistory.buttonReaction().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 22
		 browseTransHistory.buttonVitals().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 23
		 browseTransHistory.buttonChecks().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 24
		 browseTransHistory.buttonHold().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 25
		 browseTransHistory.buttonBackInfoPage().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td/a[@class='icon-pencil icon-large']")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 26
		 String currentDate1 = common.currentDate("MM/dd/yyyy HH:mm",0);
		 browseTransHistory.endTransfusionDate().clear();
		 Thread.sleep(1000);
		 browseTransHistory.endTransfusionDate().sendKeys(currentDate1);
		 Thread.sleep(2000);
		 browseTransHistory.volumeTransfused().clear();
		 Thread.sleep(1000);
		 browseTransHistory.volumeTransfused().sendKeys("100");
		 Thread.sleep(2000);
		 browseTransHistory.buttonConfirEditTransm().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 27
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td[4]/Span/a")).click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td[6]/Span/a")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 28
		 
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 29
		 browseTransHistory.buttonBackInfoPage().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[2][td[contains(text(),'Test01')]]/td[1]/a")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 30
		 String currentDate2 = common.currentDate("MM/dd/yyyy HH:mm",0);
		 Thread.sleep(1000);
		 browseTransHistory.administerDateTime().clear();
		 Thread.sleep(1000);
		 browseTransHistory.administerDateTime().sendKeys(currentDate2);
		 Thread.sleep(2000);
		 browseTransHistory.buttonConfirmEditBloodPlasmaDerivative().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 31
		 iedriver.driver.findElement(By.xpath("//tr[1][td[contains(text(),'Test01')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 32
		 
		 
		 browseTransHistory.linkLogout().click();
		 Thread.sleep(1000);
		 login.txt_box_username().sendKeys(user2);
		 Thread.sleep(2000);
		 login.txt_box_password().sendKeys(password);
		 Thread.sleep(2000);
		 login.button_login().click();
		 Thread.sleep(2000);
		 common.scanpatientid(patientA);
		 Thread.sleep(2000);
		  //Assert.assertEquals(patientMenu.browseTransfusinHistoryButton().isDisplayed(),true);
		 Thread.sleep(1000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 mainPage.browseTransfusinHistoryButton().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td/a[@class='icon-pencil icon-large']")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 33
		 String currentDate3 = common.currentDate("MM/dd/yyyy HH:mm",0);
		 browseTransHistory.endTransfusionDate().clear();
		 Thread.sleep(1000);
		 browseTransHistory.endTransfusionDate().sendKeys(currentDate3);
		 Thread.sleep(2000);
		 Thread.sleep(2000);
		 browsetranshistoryfunctions.selectBloodProductEditTrans(5);
		 Thread.sleep(2000);
		 browseTransHistory.volumeTransfused().clear();
		 Thread.sleep(1000);
		 browseTransHistory.volumeTransfused().sendKeys("75");
		 Thread.sleep(2000);
		 browseTransHistory.buttonConfirEditTransm().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 34
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td[4]/Span/a")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 35
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td[5]/Span/a")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 36
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo2+"')]]/td[7]/a")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 37
		 browseTransHistory.checkboxAnaphylaxis().click();
		 Thread.sleep(1000);
		 browseTransHistory.checkboxDyspneaNausea().click();
		 Thread.sleep(1000);
		 browseTransHistory.buttonConfirmPostTransfusion().click();
		 Thread.sleep(2000);
		 Assert.assertEquals(browseTransHistory.headerReactionInstruction().isEnabled(),true);
		 Thread.sleep(1000);
		 // Step 38
		 browseTransHistory.buttonConfirmReactionInstruction().click();
		 Thread.sleep(2000);
		 endTrans.vitalsOxygenSaturationTextBox().clear();
		 Thread.sleep(1000);
		 endTrans.vitalsOxygenSaturationTextBox().sendKeys("92");
		 Thread.sleep(3000);
		 //act.sendKeys(Keys.ENTER).perform();
		 //Thread.sleep(5000);
		 endTrans.vitalsContinueButton().click();
		 Thread.sleep(3000);
		 endTrans.vitalsContinueButton().click();
		 Thread.sleep(2000);
		 browseTransHistory.buttonCancelPostTransfusionReport().click();
		 Thread.sleep(2000);
		 //Step 39
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo2+"')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 
		 browseTransHistory.buttonReaction().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 
		 iedriver.driver.close();
  }
}
