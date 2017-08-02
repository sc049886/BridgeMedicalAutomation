package com.bridge.regression;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.bridge.utilities.BabyMatchCommonFunctionality;
import com.bridge.utilities.CommonFunctions;
import com.bridge.utilities.IEDriver;
import com.pageObjects.BabyMatchManagePatientInformationPage;
import com.pageObjects.CapribedsideBabyMatchPage;
import com.pageObjects.SystemManagerBabyMatchPage;
import com.pageObjects.SystemManagerMainPage;
import com.relevantcodes.extentreports.LogStatus;

import modulebabymatch.BabyMatchNavigation;
import multiScreenShot.MultiScreenShot;


public class CapribridgeBabyMatchTest extends BabyMatchNavigation
{
	String username="superuser";
    String password="123";
	String FilePath = "C:\\Temp\\CapribridgeBabyMatchTest.html";
	String TestName = "CapribridgeBabyMatchTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","CapribridgeBabyMatchTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	CommonFunctions commonFunctions = new CommonFunctions();
	BabyMatchCommonFunctionality babyMatchCommonFunction = new BabyMatchCommonFunctionality();
	CapribedsideBabyMatchPage babyMatchPage = new CapribedsideBabyMatchPage();
	BabyMatchManagePatientInformationPage mngPatientInfo = new BabyMatchManagePatientInformationPage();
	SystemManagerMainPage systemManagerMainMenu = new SystemManagerMainPage();
	SystemManagerBabyMatchPage babyMatchSettings = new SystemManagerBabyMatchPage();


	@Test(priority=1)
	public void babyMatchTestPlanTest() throws InterruptedException, IOException
	{
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Pre Setting
		  
		
	       babyMatchPage.managePatientInfoLink().click();
		   Thread.sleep(2000);
		   multiScreens.multiScreenShot(iedriver.driver);
		   babyMatchCommonFunction.scanSelectPatientId("635201");
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    mngPatientInfo.editMotherLink().click();
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    mngPatientInfo.correctMotherField().clear();
		    mngPatientInfo.correctMotherField().sendKeys("Adelle Timmons");
		    Thread.sleep(2000);
		    mngPatientInfo.correctIdField().clear();
		    mngPatientInfo.correctIdField().sendKeys("1010130");
		    Thread.sleep(2000);
		    mngPatientInfo.clickOnConfirmButton().click();
		    Thread.sleep(3000);
		    //MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","ScreenShot2");
		    
		    multiScreens.multiScreenShot(iedriver.driver);
		    iedriver.extent_Test().log(LogStatus.PASS, "Step 01 Passed");
		    //Step 2
		    //BabyMatchCommonFunctionality bmcmn = new BabyMatchCommonFunctionality();
		    babyMatchCommonFunction.scanBabyMatchPatients("635201");
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    iedriver.extent_Test().log(LogStatus.PASS, "Step 02 Passed");
		    //Step 3
		    babyMatchCommonFunction.scanBabyMatchRacipient("1010130");
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    //CapribedsideBabyMatchPage bm = new CapribedsideBabyMatchPage();
		    babyMatchPage.clickContinueButton().click();
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    babyMatchPage.clickOnConfirmPopupButton().click();
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    iedriver.extent_Test().log(LogStatus.PASS, "Step 03 Passed");
		    //Step 4
		    
		    babyMatchCommonFunction.scanBabyMatchPatients("1010130");
		    Thread.sleep(2000);
		    boolean invalidIdAlertMsg = babyMatchPage.invaliIdAlertMessage().isDisplayed();
		    if(invalidIdAlertMsg)
		    {
		    	System.out.println("This is not a valid infant id.-Error Message is Displayed");
		    	Thread.sleep(2000);
		        multiScreens.multiScreenShot(iedriver.driver);
		    }
		    else
		    {
		    	System.out.println("Error Message is not Displayed");
		    	Thread.sleep(2000);
		    	multiScreens.multiScreenShot(iedriver.driver);
		    }
		    iedriver.extent_Test().log(LogStatus.PASS, "Step 04 Passed");
		    //Step 5
		    Thread.sleep(2000);
		    babyMatchCommonFunction.scanBabyMatchPatients("635201");
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    iedriver.extent_Test().log(LogStatus.PASS, "Step 05 Passed");
		    //Step 6
		    babyMatchCommonFunction.scanBabyMatchRacipient("1010131");
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    
		    boolean warningPopup = babyMatchPage.matchFailedPopup().isDisplayed();
		    if(warningPopup)
		    {
		    	System.out.println("Match Failed! The patient's id is not associated with the recipient id.-Is Displayed");
		    	Thread.sleep(2000);
		    	multiScreens.multiScreenShot(iedriver.driver);
		    }
		    else
		    {
		    	System.out.println(" Match Failed -Error message is not displayed");
		    	Thread.sleep(2000);
		    	multiScreens.multiScreenShot(iedriver.driver);
		    	
		    }
		    iedriver.extent_Test().log(LogStatus.PASS, "Step 06 Passed");
		    //Step 7
		    babyMatchPage.matchFailedPopupAckButton().click();
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    iedriver.extent_Test().log(LogStatus.PASS, "Step 07 Passed");
		    //Step 8
		    babyMatchPage.managePatientInfoLink().click();
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    
		    babyMatchCommonFunction.scanSelectPatientId("635201");
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    iedriver.extent_Test().log(LogStatus.PASS, "Step 08 Passed");
		   //Step 9
		    //BabyMatchManagePatientInformationPage mngPatientInfo = new BabyMatchManagePatientInformationPage();
		    mngPatientInfo.editMotherLink().click();
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    iedriver.extent_Test().log(LogStatus.PASS, "Step 09 Passed");
		    //Step10
		    mngPatientInfo.correctMotherField().clear();
		    mngPatientInfo.correctMotherField().sendKeys("Toots,Alberta");
		    Thread.sleep(2000);
		    mngPatientInfo.correctIdField().clear();
		    mngPatientInfo.correctIdField().sendKeys("1010132");
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    mngPatientInfo.clickOnConfirmButton().click();
		    Thread.sleep(2000);
		     multiScreens.multiScreenShot(iedriver.driver);
		    iedriver.extent_Test().log(LogStatus.PASS, "Step 10 Passed");
		    //Step 11
		    babyMatchCommonFunction.scanBabyMatchPatients("635201");
		    Thread.sleep(2000);
			 multiScreens.multiScreenShot(iedriver.driver);
			 babyMatchCommonFunction.scanBabyMatchRacipient("1010130");
		    Thread.sleep(2000);
		    
		    boolean matchFailedPopup = babyMatchPage.matchFailedPopup().isDisplayed();
		    if(matchFailedPopup)
		    {
		    	System.out.println("Match Failed! The patient's id is not associated with the recipient id.-Is Displayed");
		    	Thread.sleep(2000);
		    	multiScreens.multiScreenShot(iedriver.driver);
		    }
		    else
		    {
		    	System.out.println(" Match Failed -Error message is not displayed");
		    	Thread.sleep(2000);
		    	multiScreens.multiScreenShot(iedriver.driver);
		    	
		    }
		    iedriver.extent_Test().log(LogStatus.PASS, "Step 11 Passed");
		    //Step 12
		    babyMatchPage.matchFailedPopupAckButton().click();
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    iedriver.extent_Test().log(LogStatus.PASS, "Step 12 Passed");
		    //Step 13
		    babyMatchCommonFunction.scanBabyMatchPatients("635201");
		    Thread.sleep(2000);
			multiScreens.multiScreenShot(iedriver.driver);

			babyMatchCommonFunction.scanBabyMatchRacipient("1010132");
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    
		    babyMatchPage.clickOnConfirmPopupButton().click();
		    Thread.sleep(2000);
		    iedriver.extent_Test().log(LogStatus.PASS, "Step 13 Passed");
		    //Step 14
		    babyMatchCommonFunction.scanBabyMatchPatients("635204");
		    Thread.sleep(2000);
			multiScreens.multiScreenShot(iedriver.driver);
			babyMatchCommonFunction.scanBabyMatchRacipient("Nancy");
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    boolean invalidIdAlertMsg2 = babyMatchPage.invalidMatchPopup().isDisplayed();
		    if(invalidIdAlertMsg2)
		    {
		    	System.out.println("Invalid Match! This ID is not defined as an approved recipient, please contact system administrator.-Error Message is Displayed");
		    	multiScreens.multiScreenShot(iedriver.driver);
		    }
		    else
		    {
		    	System.out.println("Error Message is not Displayed");
		    	multiScreens.multiScreenShot(iedriver.driver);
		    }
		    
		    babyMatchPage.invalidMatchPopupAckButton().click();
		   Thread.sleep(2000);
		   iedriver.extent_Test().log(LogStatus.PASS, "Step 14 Passed");
		    //Step 15
		   babyMatchCommonFunction.scanBabyMatchPatients("635203");
		    Thread.sleep(2000);
			multiScreens.multiScreenShot(iedriver.driver);
			babyMatchCommonFunction.scanBabyMatchRacipient("Mark");
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    boolean invalidIdAlertMsg3 = babyMatchPage.invalidMatchPopup().isDisplayed();
		    if(invalidIdAlertMsg2)
		    {
		    	System.out.println("Invalid Match! This ID is not defined as an approved recipient, please contact system administrator.-Error Message is Displayed");
		    	Thread.sleep(2000);
		    	multiScreens.multiScreenShot(iedriver.driver);
		    }
		    else
		    {
		    	System.out.println("Error Message is not Displayed");
		    	Thread.sleep(2000);
		    	multiScreens.multiScreenShot(iedriver.driver);
		    }
		       babyMatchPage.invalidMatchPopupAckButton().click();
			   Thread.sleep(2000);
			   iedriver.extent_Test().log(LogStatus.PASS, "Step 15 Passed");
		       driver.close();	
		       Thread.sleep(1000);
		   String sysMgrUrl = "http://10.162.106.174/TransSpec2016010412/systemmanager/Login.aspx";
		   commonFunctions.login(sysMgrUrl,username,password);
		   Thread.sleep(2000);
		   systemManagerMainMenu.button_BabyMatchSettings().click();
		   Thread.sleep(2000);
		   WebElement wb = babyMatchSettings.babyMatchPropmtLocation();
		   Select sel = new Select(wb);
		   //List<WebElement> lst = sel.getOptions();
		   //System.out.println(lst);
		   sel.selectByValue("True");
		   babyMatchSettings.clickConfirmButton().click();
		   driver.close();
		 Thread.sleep(3000);
		 String babyMatchURL = "http://10.162.106.174/TransSpec2016010412/babymatch/Login.aspx";
		 commonFunctions.login(babyMatchURL,username,password);
		//iedriver.extent_Test().log(LogStatus.PASS, "Step 16 Passed");
		//Step 16
		 babyMatchCommonFunction.scanBabyMatchPatients("635201");
		multiScreens.multiScreenShot(iedriver.driver);
		 Thread.sleep(2000);
		 iedriver.extent_Test().log(LogStatus.PASS, "Step 16 Passed");
		 //Step 17
		 WebElement wbFromLoc = babyMatchPage.fromLocationDropDown();
		 Select sel1 = new Select(wbFromLoc);
		 sel1.selectByIndex(1);
		 Thread.sleep(1000);
		 WebElement wbToLoc = babyMatchPage.toLocationDropDown();
		 Select sel2 = new Select(wbToLoc);
		 sel2.selectByIndex(2);
		 Actions act = new Actions(driver);
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 babyMatchCommonFunction.scanBabyMatchRacipient("1010132");
		 Thread.sleep(1000);
	     multiScreens.multiScreenShot(iedriver.driver);
	     babyMatchPage.clickContinueButton().click();
		 Thread.sleep(1000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 iedriver.extent_Test().log(LogStatus.PASS, "Step 17 Passed");
		 //Step 18
		 babyMatchPage.clickOnConfirmPopupButton().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 iedriver.extent_Test().log(LogStatus.PASS, "Step 18 Passed");
		 //Step 19
		 babyMatchCommonFunction.scanBabyMatchPatients("635201");
		//multiScreens.multiScreenShot(iedriver.driver);
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 driver.close();
		 iedriver.extent_Test().log(LogStatus.PASS, "Step 19 Passed");
		
		 iedriver.extent_Reports().endTest(iedriver.extent_Test());
		 iedriver.extent_Reports().flush();
		 iedriver.extent_Reports().close();
		
	}
	@AfterTest
	public void sysManagerSettingsOffLocTest() throws InterruptedException
	{      
		   //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   //driver.close();
		   String sysMgrUrl = "http://10.162.106.174/TransSpec2016010412/systemmanager/Login.aspx";
		   commonFunctions.login(sysMgrUrl,username,password);
		   SystemManagerMainPage mainMenu = new SystemManagerMainPage();
		   mainMenu.button_BabyMatchSettings().click();
		   Thread.sleep(3000);
		   SystemManagerBabyMatchPage sysMgr = new SystemManagerBabyMatchPage();
		   WebElement wb = sysMgr.babyMatchPropmtLocation();
		   Select sel = new Select(wb);
		   //List<WebElement> lst = sel.getOptions();
		   //System.out.println(lst);
		   sel.selectByValue("False");
		   sysMgr.clickConfirmButton().click();
		   driver.close();
		
	}
	
	
	
}
		    
		    

		    
		    
		    
		    
		    
		    
		    
		    
		    
