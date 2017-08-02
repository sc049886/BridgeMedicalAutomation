package com.bridge.utilities;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.pageObjects.CapribedsideAdministerBottlesPage;
import com.pageObjects.CapribedsideCombineBottlesPage;
import com.pageObjects.CapribedsideDischargeBottlesPage;
import com.pageObjects.CapribedsideReceiveBottlesPage;
import com.pageObjects.CapribedsideSelectPatientPage;
import com.pageObjects.CapribedsideStateChangePage;
import com.relevantcodes.extentreports.LogStatus;

import multiScreenShot.MultiScreenShot;

public class MilkManagementCommonFunctionality extends IEDriver

{
	CapribedsideSelectPatientPage selectPatient;
	String FilePath = "C:\\Temp\\MilkManagementCommonFunctionality.html";
	String TestName = "PatientIdentificationErrorTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","MilkManagementCommonFunctionality");
	IEDriver iedriver = new IEDriver(FilePath, TestName);
	 
	 public void patientNotFoundErrorMsg() throws IOException
	    {
		 selectPatient = PageFactory.initElements(IEDriver.driver, CapribedsideSelectPatientPage.class );
	    	boolean wb = selectPatient.patientNotFoundErrorMsg().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("Patient not found.-Is displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	else
	    	{
	    		System.out.println("Error message for Patient not found. is not displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	
	    }
	 
	 CapribedsideReceiveBottlesPage receiveBottle;
	 public void patientNotMatchErrorMsg() throws IOException
	 {
		 receiveBottle = PageFactory.initElements(IEDriver.driver, CapribedsideReceiveBottlesPage.class );
	    	boolean wb = receiveBottle.patientNotMatchErrorMsg().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("The patient ID you entered does not match the patient ID of the current patient..-Is displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	else
	    	{
	    		System.out.println("Error message 'The patient ID you entered does not match the patient ID of the current patient'. is not displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
		 
	 }
	 public void duplicateBottleErrorMsg() throws IOException
	 {
		 receiveBottle = PageFactory.initElements(IEDriver.driver, CapribedsideReceiveBottlesPage.class );
	    	boolean wb = receiveBottle.duplicateBottleErrorMsg().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("The bottle number 'X' has already been received for this patient (no duplicates allowed).-Is displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	else
	    	{
	    		System.out.println("Error message 'The bottle number 'X' has already been received for this patient (no duplicates allowed)'. is not displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
		 
	 }
	 CapribedsideAdministerBottlesPage admBottle;
	 public void bottleConnotBeAdministerForThisPatientErrorMsg() throws IOException
	 {
		 admBottle = PageFactory.initElements(IEDriver.driver, CapribedsideAdministerBottlesPage.class );
	    	boolean wb = admBottle.bottleConnotBeAdministerForThisPatientErrorMsg().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("This bottle may not be administered to this patient.-Is displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	else
	    	{
	    		System.out.println("Error message 'This bottle may not be administered to this patient.' is not displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
		 
	 }
	 CapribedsideDischargeBottlesPage disBottlePage;
	 public void bottleMayNotBeDischargeToThisPatientErrorMsg() throws IOException
	 {
		 disBottlePage = PageFactory.initElements(IEDriver.driver, CapribedsideDischargeBottlesPage.class );
	    	boolean wb = disBottlePage.bottleMayNotBeDischargeToThisPatientErrorMsg().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("This bottle may not be discharged to this patient.-Is displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	else
	    	{
	    		System.out.println("Error message 'This bottle may not be discharged to this patient.' is not displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
		 
	 }
	 CapribedsideCombineBottlesPage cmbnPage;
	 public void bottleMayNotBeCombineToThisPatientWarningMsg() throws IOException
	 {
		 cmbnPage = PageFactory.initElements(IEDriver.driver, CapribedsideCombineBottlesPage.class );
	    	boolean wb = cmbnPage.bottleMayNotBeCombinedForThisPatienWarnMsg().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("This bottle may not be combined for this patient.-Is displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	else
	    	{
	    		System.out.println("Error message 'This bottle may not be combined for this patient.' is not displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
		 
	 }
	 
	 CapribedsideStateChangePage scPage;
	 public void warningBottleMayNotBezChangedForThisPatient() throws IOException
	 {
		 scPage = PageFactory.initElements(IEDriver.driver, CapribedsideStateChangePage.class );
	    	boolean wb = scPage.warningBottleMayNotBezChangedForThisPatient().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("This bottle may not be changed for this patient.-Is displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	else
	    	{
	    		System.out.println("Error message 'This bottle may not be changed for this patient.' is not displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
		 
	 }
	 
	 public void manualEntryErrorMsg() throws IOException
	 {
		 receiveBottle = PageFactory.initElements(IEDriver.driver, CapribedsideReceiveBottlesPage.class );
	    	boolean wb = receiveBottle.manualEntryErrorMsg().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("Manual entry is not allowed. Scan the Patient's ID to continue.-Is displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    		iedriver.extent_Test().log(LogStatus.PASS, "Step 08 Passed");
	    	}
	    	else
	    	{
	    		System.out.println("Error message 'Manual entry is not allowed. Scan the Patient's ID to continue.'- is not displayed");
	    		multiScreens.multiScreenShot(iedriver.driver);
	    		  iedriver.extent_Test().log(LogStatus.PASS, "Step 08 Passed");
	    	}
		 
	 }
	 


}
